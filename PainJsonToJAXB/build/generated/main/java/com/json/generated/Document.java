
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
    "accId",
    "@xmlns"
})
public class Document {

    @JsonProperty("accId")
    private AccId accId;
    @JsonProperty("@xmlns")
    private String xmlns;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("accId")
    public AccId getAccId() {
        return accId;
    }

    @JsonProperty("accId")
    public void setAccId(AccId accId) {
        this.accId = accId;
    }

    public Document withAccId(AccId accId) {
        this.accId = accId;
        return this;
    }

    @JsonProperty("@xmlns")
    public String getXmlns() {
        return xmlns;
    }

    @JsonProperty("@xmlns")
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public Document withXmlns(String xmlns) {
        this.xmlns = xmlns;
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

    public Document withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Document.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accId");
        sb.append('=');
        sb.append(((this.accId == null)?"<null>":this.accId));
        sb.append(',');
        sb.append("xmlns");
        sb.append('=');
        sb.append(((this.xmlns == null)?"<null>":this.xmlns));
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
        result = ((result* 31)+((this.accId == null)? 0 :this.accId.hashCode()));
        result = ((result* 31)+((this.xmlns == null)? 0 :this.xmlns.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Document) == false) {
            return false;
        }
        Document rhs = ((Document) other);
        return ((((this.accId == rhs.accId)||((this.accId!= null)&&this.accId.equals(rhs.accId)))&&((this.xmlns == rhs.xmlns)||((this.xmlns!= null)&&this.xmlns.equals(rhs.xmlns))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
