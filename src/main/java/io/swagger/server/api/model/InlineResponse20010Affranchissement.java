package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20010AffranchissementPAYS;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * object avec, pour chaque pays demandé, le montant de l&#x27;affranchissement et la zone géographique
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20010Affranchissement   {
  private InlineResponse20010AffranchissementPAYS PAYS = null;

  public InlineResponse20010Affranchissement PAYS(InlineResponse20010AffranchissementPAYS PAYS) {
    this.PAYS = PAYS;
    return this;
  }

  /**
   * Get PAYS
   * @return PAYS
   **/
    public InlineResponse20010AffranchissementPAYS getPAYS() {
    return PAYS;
  }

  public void setPAYS(InlineResponse20010AffranchissementPAYS PAYS) {
    this.PAYS = PAYS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010Affranchissement inlineResponse20010Affranchissement = (InlineResponse20010Affranchissement) o;
    return Objects.equals(this.PAYS, inlineResponse20010Affranchissement.PAYS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PAYS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010Affranchissement {\n");
    
    sb.append("    PAYS: ").append(toIndentedString(PAYS)).append("\n");
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
