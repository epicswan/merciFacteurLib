package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Nombre de pages envoyées dans le mois
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2009AccountPages   {
  private Integer thisMonth = null;

  private Integer maxMonth = null;

  public InlineResponse2009AccountPages thisMonth(Integer thisMonth) {
    this.thisMonth = thisMonth;
    return this;
  }

  /**
   * Nombre de pages envoyées ce mois-ci.
   * @return thisMonth
   **/
    public Integer getThisMonth() {
    return thisMonth;
  }

  public void setThisMonth(Integer thisMonth) {
    this.thisMonth = thisMonth;
  }

  public InlineResponse2009AccountPages maxMonth(Integer maxMonth) {
    this.maxMonth = maxMonth;
    return this;
  }

  /**
   * Nombre maximum de pages que vous pouvez envoyer ce mois-ci.
   * @return maxMonth
   **/
    public Integer getMaxMonth() {
    return maxMonth;
  }

  public void setMaxMonth(Integer maxMonth) {
    this.maxMonth = maxMonth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009AccountPages inlineResponse2009AccountPages = (InlineResponse2009AccountPages) o;
    return Objects.equals(this.thisMonth, inlineResponse2009AccountPages.thisMonth) &&
        Objects.equals(this.maxMonth, inlineResponse2009AccountPages.maxMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thisMonth, maxMonth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009AccountPages {\n");
    
    sb.append("    thisMonth: ").append(toIndentedString(thisMonth)).append("\n");
    sb.append("    maxMonth: ").append(toIndentedString(maxMonth)).append("\n");
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
