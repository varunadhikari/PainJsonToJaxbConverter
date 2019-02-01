
package com.json.generated;

import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "IBAN",
    "cur"
})
public class AccId {

    @JsonProperty("IBAN")
    private String iban;
    @JsonProperty("cur")
    private Cur cur;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("IBAN")
    public String getIban() {
        return iban;
    }

    @JsonProperty("IBAN")
    public void setIban(String iban) {
        this.iban = iban;
    }

    public AccId withIban(String iban) {
        this.iban = iban;
        return this;
    }

    @JsonProperty("cur")
    public Cur getCur() {
        return cur;
    }

    @JsonProperty("cur")
    public void setCur(Cur cur) {
        this.cur = cur;
    }

    public AccId withCur(Cur cur) {
        this.cur = cur;
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

    public AccId withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccId.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("iban");
        sb.append('=');
        sb.append(((this.iban == null)?"<null>":this.iban));
        sb.append(',');
        sb.append("cur");
        sb.append('=');
        sb.append(((this.cur == null)?"<null>":this.cur));
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
        result = ((result* 31)+((this.cur == null)? 0 :this.cur.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.iban == null)? 0 :this.iban.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccId) == false) {
            return false;
        }
        AccId rhs = ((AccId) other);
        return ((((this.cur == rhs.cur)||((this.cur!= null)&&this.cur.equals(rhs.cur)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.iban == rhs.iban)||((this.iban!= null)&&this.iban.equals(rhs.iban))));
    }

}
