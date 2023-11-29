package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Infos sur les pages envoyées
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20018QuotasPages   {
  private Integer thisMounth = null;

  private Integer maxMounth = null;

  private Integer total = null;

  public InlineResponse20018QuotasPages thisMounth(Integer thisMounth) {
    this.thisMounth = thisMounth;
    return this;
  }

  /**
   * Nombre de pages envoyées dans le mois courant
   * @return thisMounth
   **/
    public Integer getThisMounth() {
    return thisMounth;
  }

  public void setThisMounth(Integer thisMounth) {
    this.thisMounth = thisMounth;
  }

  public InlineResponse20018QuotasPages maxMounth(Integer maxMounth) {
    this.maxMounth = maxMounth;
    return this;
  }

  /**
   * Nombre maximum de pages par mois
   * @return maxMounth
   **/
    public Integer getMaxMounth() {
    return maxMounth;
  }

  public void setMaxMounth(Integer maxMounth) {
    this.maxMounth = maxMounth;
  }

  public InlineResponse20018QuotasPages total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Nombre total de pages envoyées depuis la création du compte
   * @return total
   **/
    public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018QuotasPages inlineResponse20018QuotasPages = (InlineResponse20018QuotasPages) o;
    return Objects.equals(this.thisMounth, inlineResponse20018QuotasPages.thisMounth) &&
        Objects.equals(this.maxMounth, inlineResponse20018QuotasPages.maxMounth) &&
        Objects.equals(this.total, inlineResponse20018QuotasPages.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thisMounth, maxMounth, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018QuotasPages {\n");
    
    sb.append("    thisMounth: ").append(toIndentedString(thisMounth)).append("\n");
    sb.append("    maxMounth: ").append(toIndentedString(maxMounth)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
