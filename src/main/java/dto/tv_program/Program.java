
package dto.tv_program;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "external_id",
    "title",
    "category",
    "pictures",
    "start_timestamp",
    "end_timestamp",
    "id",
    "start",
    "end",
    "virtual_object_id",
    "schedule_type"
})
@Generated("jsonschema2pojo")
public class Program{

    @JsonProperty("external_id")
    private Integer externalId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("pictures")
    private Pictures__1 pictures;
    @JsonProperty("start_timestamp")
    private Integer startTimestamp;
    @JsonProperty("end_timestamp")
    private Integer endTimestamp;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("start")
    private String start;
    @JsonProperty("end")
    private String end;
    @JsonProperty("virtual_object_id")
    private String virtualObjectId;
    @JsonProperty("schedule_type")
    private String scheduleType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("external_id")
    public Integer getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(Integer externalId) {
        this.externalId = externalId;
    }

    public Program withExternalId(Integer externalId) {
        this.externalId = externalId;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Program withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    public Program withCategory(Category category) {
        this.category = category;
        return this;
    }

    @JsonProperty("pictures")
    public Pictures__1 getPictures() {
        return pictures;
    }

    @JsonProperty("pictures")
    public void setPictures(Pictures__1 pictures) {
        this.pictures = pictures;
    }

    public Program withPictures(Pictures__1 pictures) {
        this.pictures = pictures;
        return this;
    }

    @JsonProperty("start_timestamp")
    public Integer getStartTimestamp() {
        return startTimestamp;
    }

    @JsonProperty("start_timestamp")
    public void setStartTimestamp(Integer startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public Program withStartTimestamp(Integer startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    @JsonProperty("end_timestamp")
    public Integer getEndTimestamp() {
        return endTimestamp;
    }

    @JsonProperty("end_timestamp")
    public void setEndTimestamp(Integer endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public Program withEndTimestamp(Integer endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Program withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("start")
    public String getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(String start) {
        this.start = start;
    }

    public Program withStart(String start) {
        this.start = start;
        return this;
    }

    @JsonProperty("end")
    public String getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(String end) {
        this.end = end;
    }

    public Program withEnd(String end) {
        this.end = end;
        return this;
    }

    @JsonProperty("virtual_object_id")
    public String getVirtualObjectId() {
        return virtualObjectId;
    }

    @JsonProperty("virtual_object_id")
    public void setVirtualObjectId(String virtualObjectId) {
        this.virtualObjectId = virtualObjectId;
    }

    public Program withVirtualObjectId(String virtualObjectId) {
        this.virtualObjectId = virtualObjectId;
        return this;
    }

    @JsonProperty("schedule_type")
    public String getScheduleType() {
        return scheduleType;
    }

    @JsonProperty("schedule_type")
    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public Program withScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Program withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Program.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("externalId");
        sb.append('=');
        sb.append(((this.externalId == null)?"<null>":this.externalId));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("pictures");
        sb.append('=');
        sb.append(((this.pictures == null)?"<null>":this.pictures));
        sb.append(',');
        sb.append("startTimestamp");
        sb.append('=');
        sb.append(((this.startTimestamp == null)?"<null>":this.startTimestamp));
        sb.append(',');
        sb.append("endTimestamp");
        sb.append('=');
        sb.append(((this.endTimestamp == null)?"<null>":this.endTimestamp));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null)?"<null>":this.start));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null)?"<null>":this.end));
        sb.append(',');
        sb.append("virtualObjectId");
        sb.append('=');
        sb.append(((this.virtualObjectId == null)?"<null>":this.virtualObjectId));
        sb.append(',');
        sb.append("scheduleType");
        sb.append('=');
        sb.append(((this.scheduleType == null)?"<null>":this.scheduleType));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.start == null)? 0 :this.start.hashCode()));
        result = ((result* 31)+((this.externalId == null)? 0 :this.externalId.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.pictures == null)? 0 :this.pictures.hashCode()));
        result = ((result* 31)+((this.virtualObjectId == null)? 0 :this.virtualObjectId.hashCode()));
        result = ((result* 31)+((this.scheduleType == null)? 0 :this.scheduleType.hashCode()));
        result = ((result* 31)+((this.end == null)? 0 :this.end.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.endTimestamp == null)? 0 :this.endTimestamp.hashCode()));
        result = ((result* 31)+((this.startTimestamp == null)? 0 :this.startTimestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Program) == false) {
            return false;
        }
        Program rhs = ((Program) other);
        return (((((((((((((this.start == rhs.start)||((this.start!= null)&&this.start.equals(rhs.start)))&&((this.externalId == rhs.externalId)||((this.externalId!= null)&&this.externalId.equals(rhs.externalId))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.pictures == rhs.pictures)||((this.pictures!= null)&&this.pictures.equals(rhs.pictures))))&&((this.virtualObjectId == rhs.virtualObjectId)||((this.virtualObjectId!= null)&&this.virtualObjectId.equals(rhs.virtualObjectId))))&&((this.scheduleType == rhs.scheduleType)||((this.scheduleType!= null)&&this.scheduleType.equals(rhs.scheduleType))))&&((this.end == rhs.end)||((this.end!= null)&&this.end.equals(rhs.end))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.endTimestamp == rhs.endTimestamp)||((this.endTimestamp!= null)&&this.endTimestamp.equals(rhs.endTimestamp))))&&((this.startTimestamp == rhs.startTimestamp)||((this.startTimestamp!= null)&&this.startTimestamp.equals(rhs.startTimestamp))));
    }

}
