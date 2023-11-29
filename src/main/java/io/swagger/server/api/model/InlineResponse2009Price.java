package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse2009PriceDetail;
import io.swagger.server.api.model.InlineResponse2009PriceTotal;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Détail du montant facturé
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2009Price   {
  private InlineResponse2009PriceTotal total = null;

  private InlineResponse2009PriceDetail detail = null;

  public InlineResponse2009Price total(InlineResponse2009PriceTotal total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   **/
    public InlineResponse2009PriceTotal getTotal() {
    return total;
  }

  public void setTotal(InlineResponse2009PriceTotal total) {
    this.total = total;
  }

  public InlineResponse2009Price detail(InlineResponse2009PriceDetail detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
   **/
    public InlineResponse2009PriceDetail getDetail() {
    return detail;
  }

  public void setDetail(InlineResponse2009PriceDetail detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009Price inlineResponse2009Price = (InlineResponse2009Price) o;
    return Objects.equals(this.total, inlineResponse2009Price.total) &&
        Objects.equals(this.detail, inlineResponse2009Price.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009Price {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
