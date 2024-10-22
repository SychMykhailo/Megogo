
package dto.date;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "utc_offset",
    "timestamp_gmt",
    "timestamp_local",
    "timezone",
    "timestamp",
    "time_local"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("utc_offset")
    private Integer utcOffset;
    @JsonProperty("timestamp_gmt")
    private Long timestampGmt;
    @JsonProperty("timestamp_local")
    private Long timestampLocal;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("timestamp")
    private Long timestamp;
    @JsonProperty("time_local")
    private String timeLocal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("utc_offset")
    public Integer getUtcOffset() {
        return utcOffset;
    }

    @JsonProperty("utc_offset")
    public void setUtcOffset(Integer utcOffset) {
        this.utcOffset = utcOffset;
    }

    public Data withUtcOffset(Integer utcOffset) {
        this.utcOffset = utcOffset;
        return this;
    }

    @JsonProperty("timestamp_gmt")
    public Long getTimestampGmt() {
        return timestampGmt;
    }

    @JsonProperty("timestamp_gmt")
    public void setTimestampGmt(Long timestampGmt) {
        this.timestampGmt = timestampGmt;
    }

    public Data withTimestampGmt(Long timestampGmt) {
        this.timestampGmt = timestampGmt;
        return this;
    }

    @JsonProperty("timestamp_local")
    public Long getTimestampLocal() {
        return timestampLocal;
    }

    @JsonProperty("timestamp_local")
    public void setTimestampLocal(Long timestampLocal) {
        this.timestampLocal = timestampLocal;
    }

    public Data withTimestampLocal(Long timestampLocal) {
        this.timestampLocal = timestampLocal;
        return this;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Data withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Data withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonProperty("time_local")
    public String getTimeLocal() {
        return timeLocal;
    }

    @JsonProperty("time_local")
    public void setTimeLocal(String timeLocal) {
        this.timeLocal = timeLocal;
    }

    public Data withTimeLocal(String timeLocal) {
        this.timeLocal = timeLocal;
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

    public Data withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Long.toHexString(System.identityHashCode(this))).append('[');
        sb.append("utcOffset");
        sb.append('=');
        sb.append(((this.utcOffset == null)?"<null>":this.utcOffset));
        sb.append(',');
        sb.append("timestampGmt");
        sb.append('=');
        sb.append(((this.timestampGmt == null)?"<null>":this.timestampGmt));
        sb.append(',');
        sb.append("timestampLocal");
        sb.append('=');
        sb.append(((this.timestampLocal == null)?"<null>":this.timestampLocal));
        sb.append(',');
        sb.append("timezone");
        sb.append('=');
        sb.append(((this.timezone == null)?"<null>":this.timezone));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("timeLocal");
        sb.append('=');
        sb.append(((this.timeLocal == null)?"<null>":this.timeLocal));
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
        result = ((result* 31)+((this.utcOffset == null)? 0 :this.utcOffset.hashCode()));
        result = ((result* 31)+((this.timestampLocal == null)? 0 :this.timestampLocal.hashCode()));
        result = ((result* 31)+((this.timezone == null)? 0 :this.timezone.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.timestampGmt == null)? 0 :this.timestampGmt.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.timeLocal == null)? 0 :this.timeLocal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return ((((((((this.utcOffset == rhs.utcOffset)||((this.utcOffset!= null)&&this.utcOffset.equals(rhs.utcOffset)))&&((this.timestampLocal == rhs.timestampLocal)||((this.timestampLocal!= null)&&this.timestampLocal.equals(rhs.timestampLocal))))&&((this.timezone == rhs.timezone)||((this.timezone!= null)&&this.timezone.equals(rhs.timezone))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.timestampGmt == rhs.timestampGmt)||((this.timestampGmt!= null)&&this.timestampGmt.equals(rhs.timestampGmt))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.timeLocal == rhs.timeLocal)||((this.timeLocal!= null)&&this.timeLocal.equals(rhs.timeLocal))));
    }

}
