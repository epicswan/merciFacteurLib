package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.AdressInfosAdress;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * AdressInfos
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class AdressInfos   {
  private AdressInfosAdress adress = null;

  public AdressInfos adress(AdressInfosAdress adress) {
    this.adress = adress;
    return this;
  }

  /**
   * Get adress
   * @return adress
   **/
    public AdressInfosAdress getAdress() {
    return adress;
  }

  public void setAdress(AdressInfosAdress adress) {
    this.adress = adress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdressInfos adressInfos = (AdressInfos) o;
    return Objects.equals(this.adress, adressInfos.adress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdressInfos {\n");
    
    sb.append("    adress: ").append(toIndentedString(adress)).append("\n");
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
