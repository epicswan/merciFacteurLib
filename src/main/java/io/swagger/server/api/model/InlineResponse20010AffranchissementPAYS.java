package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Object contenant le montant d&#x27;affranchissement pour ce pays ainsi que la zone géographique.
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20010AffranchissementPAYS   {
  private String amount = null;

  private String zone = null;

  public InlineResponse20010AffranchissementPAYS amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * montant HT de l'affranchissement
   * @return amount
   **/
    public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public InlineResponse20010AffranchissementPAYS zone(String zone) {
    this.zone = zone;
    return this;
  }

  /**
   * Zone géographique du pays (fr, z1, z2, om1, om2)
   * @return zone
   **/
    public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010AffranchissementPAYS inlineResponse20010AffranchissementPAYS = (InlineResponse20010AffranchissementPAYS) o;
    return Objects.equals(this.amount, inlineResponse20010AffranchissementPAYS.amount) &&
        Objects.equals(this.zone, inlineResponse20010AffranchissementPAYS.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, zone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010AffranchissementPAYS {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
