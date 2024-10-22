
package dto.tv_program;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "external_id",
    "title",
    "pictures",
    "video_id",
    "programs"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("external_id")
    private Integer externalId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("pictures")
    private Pictures pictures;
    @JsonProperty("video_id")
    private Integer videoId;
    @JsonProperty("programs")
    private List<Program> programs = new ArrayList<Program>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Datum withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("external_id")
    public Integer getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(Integer externalId) {
        this.externalId = externalId;
    }

    public Datum withExternalId(Integer externalId) {
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

    public Datum withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("pictures")
    public Pictures getPictures() {
        return pictures;
    }

    @JsonProperty("pictures")
    public void setPictures(Pictures pictures) {
        this.pictures = pictures;
    }

    public Datum withPictures(Pictures pictures) {
        this.pictures = pictures;
        return this;
    }

    @JsonProperty("video_id")
    public Integer getVideoId() {
        return videoId;
    }

    @JsonProperty("video_id")
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Datum withVideoId(Integer videoId) {
        this.videoId = videoId;
        return this;
    }

    @JsonProperty("programs")
    public List<Program> getPrograms() {
        return programs;
    }

    @JsonProperty("programs")
    public void setPrograms(List<Program> programs) {
        this.programs = programs;
    }

    public Datum withPrograms(List<Program> programs) {
        this.programs = programs;
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

    public Datum withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("externalId");
        sb.append('=');
        sb.append(((this.externalId == null)?"<null>":this.externalId));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("pictures");
        sb.append('=');
        sb.append(((this.pictures == null)?"<null>":this.pictures));
        sb.append(',');
        sb.append("videoId");
        sb.append('=');
        sb.append(((this.videoId == null)?"<null>":this.videoId));
        sb.append(',');
        sb.append("programs");
        sb.append('=');
        sb.append(((this.programs == null)?"<null>":this.programs));
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
        result = ((result* 31)+((this.externalId == null)? 0 :this.externalId.hashCode()));
        result = ((result* 31)+((this.videoId == null)? 0 :this.videoId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.programs == null)? 0 :this.programs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.pictures == null)? 0 :this.pictures.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum) == false) {
            return false;
        }
        Datum rhs = ((Datum) other);
        return ((((((((this.externalId == rhs.externalId)||((this.externalId!= null)&&this.externalId.equals(rhs.externalId)))&&((this.videoId == rhs.videoId)||((this.videoId!= null)&&this.videoId.equals(rhs.videoId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.programs == rhs.programs)||((this.programs!= null)&&this.programs.equals(rhs.programs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.pictures == rhs.pictures)||((this.pictures!= null)&&this.pictures.equals(rhs.pictures))));
    }

}
