package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20011Total
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20011Total   {
  private String ht = null;

  public InlineResponse20011Total ht(String ht) {
    this.ht = ht;
    return this;
  }

  /**
   * Get ht
   * @return ht
   **/
    public String getHt() {
    return ht;
  }

  public void setHt(String ht) {
    this.ht = ht;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011Total inlineResponse20011Total = (InlineResponse20011Total) o;
    return Objects.equals(this.ht, inlineResponse20011Total.ht);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ht);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011Total {\n");
    
    sb.append("    ht: ").append(toIndentedString(ht)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
