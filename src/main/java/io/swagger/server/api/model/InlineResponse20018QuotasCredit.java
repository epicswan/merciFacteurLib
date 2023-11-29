package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Infos sur les crédit restants
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20018QuotasCredit   {
  private String amount = null;

  private String devise = null;

  public InlineResponse20018QuotasCredit amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Montant restant sur le compte
   * @return amount
   **/
    public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public InlineResponse20018QuotasCredit devise(String devise) {
    this.devise = devise;
    return this;
  }

  /**
   * Devise du compte
   * @return devise
   **/
    public String getDevise() {
    return devise;
  }

  public void setDevise(String devise) {
    this.devise = devise;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018QuotasCredit inlineResponse20018QuotasCredit = (InlineResponse20018QuotasCredit) o;
    return Objects.equals(this.amount, inlineResponse20018QuotasCredit.amount) &&
        Objects.equals(this.devise, inlineResponse20018QuotasCredit.devise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, devise);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018QuotasCredit {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    devise: ").append(toIndentedString(devise)).append("\n");
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
