package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse2005
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2005   {
  private Boolean success = null;

  private String error = null;

  private Integer adressId = null;

  public InlineResponse2005 success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
   **/
    public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public InlineResponse2005 error(String error) {
    this.error = error;
    return this;
  }

  /**
   * le code d'erreur en cas d'erreur
   * @return error
   **/
    public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public InlineResponse2005 adressId(Integer adressId) {
    this.adressId = adressId;
    return this;
  }

  /**
   * L'id de l'adresse, à sauvegarder en local pour plus de confort
   * @return adressId
   **/
    public Integer getAdressId() {
    return adressId;
  }

  public void setAdressId(Integer adressId) {
    this.adressId = adressId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
    return Objects.equals(this.success, inlineResponse2005.success) &&
        Objects.equals(this.error, inlineResponse2005.error) &&
        Objects.equals(this.adressId, inlineResponse2005.adressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, adressId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    adressId: ").append(toIndentedString(adressId)).append("\n");
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
