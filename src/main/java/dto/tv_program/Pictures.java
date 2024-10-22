
package dto.tv_program;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "original",
    "105x85",
    "180x180",
    "980x560",
    "88x65",
    "88x88",
    "105x105",
    "40x40",
    "150x150",
    "1600x520"
})
@Generated("jsonschema2pojo")
public class Pictures {

    @JsonProperty("original")
    private String original;
    @JsonProperty("105x85")
    private String _105x85;
    @JsonProperty("180x180")
    private String _180x180;
    @JsonProperty("980x560")
    private String _980x560;
    @JsonProperty("88x65")
    private String _88x65;
    @JsonProperty("88x88")
    private String _88x88;
    @JsonProperty("105x105")
    private String _105x105;
    @JsonProperty("40x40")
    private String _40x40;
    @JsonProperty("150x150")
    private String _150x150;
    @JsonProperty("1600x520")
    private String _1600x520;
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

    public Pictures withOriginal(String original) {
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

    public Pictures with105x85(String _105x85) {
        this._105x85 = _105x85;
        return this;
    }

    @JsonProperty("180x180")
    public String get180x180() {
        return _180x180;
    }

    @JsonProperty("180x180")
    public void set180x180(String _180x180) {
        this._180x180 = _180x180;
    }

    public Pictures with180x180(String _180x180) {
        this._180x180 = _180x180;
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

    public Pictures with980x560(String _980x560) {
        this._980x560 = _980x560;
        return this;
    }

    @JsonProperty("88x65")
    public String get88x65() {
        return _88x65;
    }

    @JsonProperty("88x65")
    public void set88x65(String _88x65) {
        this._88x65 = _88x65;
    }

    public Pictures with88x65(String _88x65) {
        this._88x65 = _88x65;
        return this;
    }

    @JsonProperty("88x88")
    public String get88x88() {
        return _88x88;
    }

    @JsonProperty("88x88")
    public void set88x88(String _88x88) {
        this._88x88 = _88x88;
    }

    public Pictures with88x88(String _88x88) {
        this._88x88 = _88x88;
        return this;
    }

    @JsonProperty("105x105")
    public String get105x105() {
        return _105x105;
    }

    @JsonProperty("105x105")
    public void set105x105(String _105x105) {
        this._105x105 = _105x105;
    }

    public Pictures with105x105(String _105x105) {
        this._105x105 = _105x105;
        return this;
    }

    @JsonProperty("40x40")
    public String get40x40() {
        return _40x40;
    }

    @JsonProperty("40x40")
    public void set40x40(String _40x40) {
        this._40x40 = _40x40;
    }

    public Pictures with40x40(String _40x40) {
        this._40x40 = _40x40;
        return this;
    }

    @JsonProperty("150x150")
    public String get150x150() {
        return _150x150;
    }

    @JsonProperty("150x150")
    public void set150x150(String _150x150) {
        this._150x150 = _150x150;
    }

    public Pictures with150x150(String _150x150) {
        this._150x150 = _150x150;
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

    public Pictures with1600x520(String _1600x520) {
        this._1600x520 = _1600x520;
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

    public Pictures withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pictures.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("original");
        sb.append('=');
        sb.append(((this.original == null)?"<null>":this.original));
        sb.append(',');
        sb.append("_105x85");
        sb.append('=');
        sb.append(((this._105x85 == null)?"<null>":this._105x85));
        sb.append(',');
        sb.append("_180x180");
        sb.append('=');
        sb.append(((this._180x180 == null)?"<null>":this._180x180));
        sb.append(',');
        sb.append("_980x560");
        sb.append('=');
        sb.append(((this._980x560 == null)?"<null>":this._980x560));
        sb.append(',');
        sb.append("_88x65");
        sb.append('=');
        sb.append(((this._88x65 == null)?"<null>":this._88x65));
        sb.append(',');
        sb.append("_88x88");
        sb.append('=');
        sb.append(((this._88x88 == null)?"<null>":this._88x88));
        sb.append(',');
        sb.append("_105x105");
        sb.append('=');
        sb.append(((this._105x105 == null)?"<null>":this._105x105));
        sb.append(',');
        sb.append("_40x40");
        sb.append('=');
        sb.append(((this._40x40 == null)?"<null>":this._40x40));
        sb.append(',');
        sb.append("_150x150");
        sb.append('=');
        sb.append(((this._150x150 == null)?"<null>":this._150x150));
        sb.append(',');
        sb.append("_1600x520");
        sb.append('=');
        sb.append(((this._1600x520 == null)?"<null>":this._1600x520));
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
        result = ((result* 31)+((this.original == null)? 0 :this.original.hashCode()));
        result = ((result* 31)+((this._980x560 == null)? 0 :this._980x560 .hashCode()));
        result = ((result* 31)+((this._88x65 == null)? 0 :this._88x65 .hashCode()));
        result = ((result* 31)+((this._105x85 == null)? 0 :this._105x85 .hashCode()));
        result = ((result* 31)+((this._88x88 == null)? 0 :this._88x88 .hashCode()));
        result = ((result* 31)+((this._180x180 == null)? 0 :this._180x180 .hashCode()));
        result = ((result* 31)+((this._40x40 == null)? 0 :this._40x40 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._150x150 == null)? 0 :this._150x150 .hashCode()));
        result = ((result* 31)+((this._1600x520 == null)? 0 :this._1600x520 .hashCode()));
        result = ((result* 31)+((this._105x105 == null)? 0 :this._105x105 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pictures) == false) {
            return false;
        }
        Pictures rhs = ((Pictures) other);
        return ((((((((((((this.original == rhs.original)||((this.original!= null)&&this.original.equals(rhs.original)))&&((this._980x560 == rhs._980x560)||((this._980x560 != null)&&this._980x560 .equals(rhs._980x560))))&&((this._88x65 == rhs._88x65)||((this._88x65 != null)&&this._88x65 .equals(rhs._88x65))))&&((this._105x85 == rhs._105x85)||((this._105x85 != null)&&this._105x85 .equals(rhs._105x85))))&&((this._88x88 == rhs._88x88)||((this._88x88 != null)&&this._88x88 .equals(rhs._88x88))))&&((this._180x180 == rhs._180x180)||((this._180x180 != null)&&this._180x180 .equals(rhs._180x180))))&&((this._40x40 == rhs._40x40)||((this._40x40 != null)&&this._40x40 .equals(rhs._40x40))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._150x150 == rhs._150x150)||((this._150x150 != null)&&this._150x150 .equals(rhs._150x150))))&&((this._1600x520 == rhs._1600x520)||((this._1600x520 != null)&&this._1600x520 .equals(rhs._1600x520))))&&((this._105x105 == rhs._105x105)||((this._105x105 != null)&&this._105x105 .equals(rhs._105x105))));
    }

}
