package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20018QuotasCredit;
import io.swagger.server.api.model.InlineResponse20018QuotasPages;
import io.swagger.server.api.model.InlineResponse20018QuotasPlan;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Objet contenant les infos des quotas du compte.
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20018Quotas   {
  private InlineResponse20018QuotasPlan plan = null;

  private InlineResponse20018QuotasCredit credit = null;

  private InlineResponse20018QuotasPages pages = null;

  public InlineResponse20018Quotas plan(InlineResponse20018QuotasPlan plan) {
    this.plan = plan;
    return this;
  }

  /**
   * Get plan
   * @return plan
   **/
    public InlineResponse20018QuotasPlan getPlan() {
    return plan;
  }

  public void setPlan(InlineResponse20018QuotasPlan plan) {
    this.plan = plan;
  }

  public InlineResponse20018Quotas credit(InlineResponse20018QuotasCredit credit) {
    this.credit = credit;
    return this;
  }

  /**
   * Get credit
   * @return credit
   **/
    public InlineResponse20018QuotasCredit getCredit() {
    return credit;
  }

  public void setCredit(InlineResponse20018QuotasCredit credit) {
    this.credit = credit;
  }

  public InlineResponse20018Quotas pages(InlineResponse20018QuotasPages pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Get pages
   * @return pages
   **/
    public InlineResponse20018QuotasPages getPages() {
    return pages;
  }

  public void setPages(InlineResponse20018QuotasPages pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018Quotas inlineResponse20018Quotas = (InlineResponse20018Quotas) o;
    return Objects.equals(this.plan, inlineResponse20018Quotas.plan) &&
        Objects.equals(this.credit, inlineResponse20018Quotas.credit) &&
        Objects.equals(this.pages, inlineResponse20018Quotas.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plan, credit, pages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018Quotas {\n");
    
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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
