
package dto.tv_program;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "original",
    "105x85",
    "150x85",
    "980x560",
    "105x60",
    "125x70",
    "480x330",
    "1600x520",
    "230x130"
})
@Generated("jsonschema2pojo")
public class Pictures__1 {

    @JsonProperty("original")
    private String original;
    @JsonProperty("105x85")
    private String _105x85;
    @JsonProperty("150x85")
    private String _150x85;
    @JsonProperty("980x560")
    private String _980x560;
    @JsonProperty("105x60")
    private String _105x60;
    @JsonProperty("125x70")
    private String _125x70;
    @JsonProperty("480x330")
    private String _480x330;
    @JsonProperty("1600x520")
    private String _1600x520;
    @JsonProperty("230x130")
    private String _230x130;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("original")
    public String getOriginal() {
        return original;
    }

    @JsonProperty("original")
    public void setOriginal(String original) {
        this.original = original;
    }

    public Pictures__1 withOriginal(String original) {
        this.original = original;
        return this;
    }

    @JsonProperty("105x85")
    public String get105x85() {
        return _105x85;
    }

    @JsonProperty("105x85")
    public void set105x85(String _105x85) {
        this._105x85 = _105x85;
    }

    public Pictures__1 with105x85(String _105x85) {
        this._105x85 = _105x85;
        return this;
    }

    @JsonProperty("150x85")
    public String get150x85() {
        return _150x85;
    }

    @JsonProperty("150x85")
    public void set150x85(String _150x85) {
        this._150x85 = _150x85;
    }

    public Pictures__1 with150x85(String _150x85) {
        this._150x85 = _150x85;
        return this;
    }

    @JsonProperty("980x560")
    public String get980x560() {
        return _980x560;
    }

    @JsonProperty("980x560")
    public void set980x560(String _980x560) {
        this._980x560 = _980x560;
    }

    public Pictures__1 with980x560(String _980x560) {
        this._980x560 = _980x560;
        return this;
    }

    @JsonProperty("105x60")
    public String get105x60() {
        return _105x60;
    }

    @JsonProperty("105x60")
    public void set105x60(String _105x60) {
        this._105x60 = _105x60;
    }

    public Pictures__1 with105x60(String _105x60) {
        this._105x60 = _105x60;
        return this;
    }

    @JsonProperty("125x70")
    public String get125x70() {
        return _125x70;
    }

    @JsonProperty("125x70")
    public void set125x70(String _125x70) {
        this._125x70 = _125x70;
    }

    public Pictures__1 with125x70(String _125x70) {
        this._125x70 = _125x70;
        return this;
    }

    @JsonProperty("480x330")
    public String get480x330() {
        return _480x330;
    }

    @JsonProperty("480x330")
    public void set480x330(String _480x330) {
        this._480x330 = _480x330;
    }

    public Pictures__1 with480x330(String _480x330) {
        this._480x330 = _480x330;
        return this;
    }

    @JsonProperty("1600x520")
    public String get1600x520() {
        return _1600x520;
    }

    @JsonProperty("1600x520")
    public void set1600x520(String _1600x520) {
        this._1600x520 = _1600x520;
    }

    public Pictures__1 with1600x520(String _1600x520) {
        this._1600x520 = _1600x520;
        return this;
    }

    @JsonProperty("230x130")
    public String get230x130() {
        return _230x130;
    }

    @JsonProperty("230x130")
    public void set230x130(String _230x130) {
        this._230x130 = _230x130;
    }

    public Pictures__1 with230x130(String _230x130) {
        this._230x130 = _230x130;
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

    public Pictures__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pictures__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("original");
        sb.append('=');
        sb.append(((this.original == null)?"<null>":this.original));
        sb.append(',');
        sb.append("_105x85");
        sb.append('=');
        sb.append(((this._105x85 == null)?"<null>":this._105x85));
        sb.append(',');
        sb.append("_150x85");
        sb.append('=');
        sb.append(((this._150x85 == null)?"<null>":this._150x85));
        sb.append(',');
        sb.append("_980x560");
        sb.append('=');
        sb.append(((this._980x560 == null)?"<null>":this._980x560));
        sb.append(',');
        sb.append("_105x60");
        sb.append('=');
        sb.append(((this._105x60 == null)?"<null>":this._105x60));
        sb.append(',');
        sb.append("_125x70");
        sb.append('=');
        sb.append(((this._125x70 == null)?"<null>":this._125x70));
        sb.append(',');
        sb.append("_480x330");
        sb.append('=');
        sb.append(((this._480x330 == null)?"<null>":this._480x330));
        sb.append(',');
        sb.append("_1600x520");
        sb.append('=');
        sb.append(((this._1600x520 == null)?"<null>":this._1600x520));
        sb.append(',');
        sb.append("_230x130");
        sb.append('=');
        sb.append(((this._230x130 == null)?"<null>":this._230x130));
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
        result = ((result* 31)+((this._105x60 == null)? 0 :this._105x60 .hashCode()));
        result = ((result* 31)+((this.original == null)? 0 :this.original.hashCode()));
        result = ((result* 31)+((this._980x560 == null)? 0 :this._980x560 .hashCode()));
        result = ((result* 31)+((this._105x85 == null)? 0 :this._105x85 .hashCode()));
        result = ((result* 31)+((this._150x85 == null)? 0 :this._150x85 .hashCode()));
        result = ((result* 31)+((this._125x70 == null)? 0 :this._125x70 .hashCode()));
        result = ((result* 31)+((this._480x330 == null)? 0 :this._480x330 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._1600x520 == null)? 0 :this._1600x520 .hashCode()));
        result = ((result* 31)+((this._230x130 == null)? 0 :this._230x130 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pictures__1) == false) {
            return false;
        }
        Pictures__1 rhs = ((Pictures__1) other);
        return (((((((((((this._105x60 == rhs._105x60)||((this._105x60 != null)&&this._105x60 .equals(rhs._105x60)))&&((this.original == rhs.original)||((this.original!= null)&&this.original.equals(rhs.original))))&&((this._980x560 == rhs._980x560)||((this._980x560 != null)&&this._980x560 .equals(rhs._980x560))))&&((this._105x85 == rhs._105x85)||((this._105x85 != null)&&this._105x85 .equals(rhs._105x85))))&&((this._150x85 == rhs._150x85)||((this._150x85 != null)&&this._150x85 .equals(rhs._150x85))))&&((this._125x70 == rhs._125x70)||((this._125x70 != null)&&this._125x70 .equals(rhs._125x70))))&&((this._480x330 == rhs._480x330)||((this._480x330 != null)&&this._480x330 .equals(rhs._480x330))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._1600x520 == rhs._1600x520)||((this._1600x520 != null)&&this._1600x520 .equals(rhs._1600x520))))&&((this._230x130 == rhs._230x130)||((this._230x130 != null)&&this._230x130 .equals(rhs._230x130))));
    }

}
