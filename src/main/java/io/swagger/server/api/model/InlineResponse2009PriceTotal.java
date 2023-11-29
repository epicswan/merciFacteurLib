package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse2009PriceTotal
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2009PriceTotal   {
  private String ht = null;

  private String ttc = null;

  public InlineResponse2009PriceTotal ht(String ht) {
    this.ht = ht;
    return this;
  }

  /**
   * Montant total HT
   * @return ht
   **/
    public String getHt() {
    return ht;
  }

  public void setHt(String ht) {
    this.ht = ht;
  }

  public InlineResponse2009PriceTotal ttc(String ttc) {
    this.ttc = ttc;
    return this;
  }

  /**
   * Montant total TTC
   * @return ttc
   **/
    public String getTtc() {
    return ttc;
  }

  public void setTtc(String ttc) {
    this.ttc = ttc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009PriceTotal inlineResponse2009PriceTotal = (InlineResponse2009PriceTotal) o;
    return Objects.equals(this.ht, inlineResponse2009PriceTotal.ht) &&
        Objects.equals(this.ttc, inlineResponse2009PriceTotal.ttc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ht, ttc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009PriceTotal {\n");
    
    sb.append("    ht: ").append(toIndentedString(ht)).append("\n");
    sb.append("    ttc: ").append(toIndentedString(ttc)).append("\n");
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
