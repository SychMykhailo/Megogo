import dto.date.Time;
import dto.tv_program.Program;
import dto.tv_program.TvProgram;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
@Execution(ExecutionMode.CONCURRENT)
public class MegogoTimeTest {

    @Test
    public void currentTimeTest() {
        var currentTime = RestAssured.get("https://epg.megogo.net/time").as(Time.class).getData().getTimestamp();
        assertThat(BigDecimal.valueOf(currentTs()), Matchers.closeTo(BigDecimal.valueOf(currentTime),BigDecimal.ONE));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1639111","1585681","1639231"})
    public void tvProgramSortTest(String id) {
        var tvProgramDto = getProgramById(id);
        var timeStampList = programStream(tvProgramDto)
                .map(Program::getStartTimestamp)
                .toList();
        var isSorted = IntStream.range(1, timeStampList.size())
                .allMatch(i -> isSorted(timeStampList.get(i - 1), timeStampList.get(i)));
        assertThat(isSorted, Matchers.is(true));
    }

    @ParameterizedTest
    @ValueSource(strings = {"1639111","1585681","1639231"})
    public void currentTimeProgramExistTest(String id) {
        var tvProgramDto = getProgramById(id);
        var currentProgram = programStream(tvProgramDto)
                .filter(prog -> prog.getStartTimestamp() < currentTs() && prog.getEndTimestamp() > currentTs()).collect(Collectors.toList());
        assertThat(currentProgram, Matchers.hasSize(1));

    }

    @ParameterizedTest
    @ValueSource(strings = {"1639111","1585681","1639231"})
    public void noIncorrectTimeInProgram(String id) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("MMM dd, yyyy hh:mm:ss a");
        DateTime todayTime = DateTime.now().withTimeAtStartOfDay();
        var tvProgramDto = getProgramById(id);
        var programs = programStream(tvProgramDto).toList();
        var firstShowTime = DateTime.parse(programs.get(0).getStart(), dateTimeFormatter);
        var lastShowTime = DateTime.parse(programs.get(programs.size()-1).getStart(),dateTimeFormatter);
        Assertions.assertTrue(firstShowTime.isAfter(todayTime));
        /**
         * Не розумію від чого рахувати +24 години
         */
//       assertThat(lastShowTime,Matchers.is(firstShowTime.plusDays(1)));
//       Assertions.assertTrue(lastShowTime.isBefore(firstShowTime.plusDays(1)));
        Assertions.assertTrue(lastShowTime.isBefore(DateTime.now().plusDays(1)));
    }

    private Stream<Program> programStream(TvProgram tvProgramDto){
        return tvProgramDto
                .getData()
                .stream()
                .flatMap(p -> p.getPrograms().stream());
    }

    private TvProgram getProgramById(String id){
        return RestAssured.get("https://epg.megogo.net/channel?video_ids=" + id).as(TvProgram.class);
    }

    private boolean isSorted(Integer first, Integer second) {
        return first < second;
    }

    private Long currentTs() {
        return System.currentTimeMillis() / 1000;
    }
}
