package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20014
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20014   {
  private Boolean success = null;

  private String error = null;

  private Integer idEnvoi = null;

  private Object sourceValidation = null;

  public InlineResponse20014 success(Boolean success) {
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

  public InlineResponse20014 error(String error) {
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

  public InlineResponse20014 idEnvoi(Integer idEnvoi) {
    this.idEnvoi = idEnvoi;
    return this;
  }

  /**
   * Identifiant de l'envoi pour procéder à sa validation
   * @return idEnvoi
   **/
    public Integer getIdEnvoi() {
    return idEnvoi;
  }

  public void setIdEnvoi(Integer idEnvoi) {
    this.idEnvoi = idEnvoi;
  }

  public InlineResponse20014 sourceValidation(Object sourceValidation) {
    this.sourceValidation = sourceValidation;
    return this;
  }

  /**
   * Les champs de fusion avec un éventuel retraitement, tels qu'ils seront utilisés lors de la fusion pour créer les lettres finales.
   * @return sourceValidation
   **/
    public Object getSourceValidation() {
    return sourceValidation;
  }

  public void setSourceValidation(Object sourceValidation) {
    this.sourceValidation = sourceValidation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014 inlineResponse20014 = (InlineResponse20014) o;
    return Objects.equals(this.success, inlineResponse20014.success) &&
        Objects.equals(this.error, inlineResponse20014.error) &&
        Objects.equals(this.idEnvoi, inlineResponse20014.idEnvoi) &&
        Objects.equals(this.sourceValidation, inlineResponse20014.sourceValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, idEnvoi, sourceValidation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    idEnvoi: ").append(toIndentedString(idEnvoi)).append("\n");
    sb.append("    sourceValidation: ").append(toIndentedString(sourceValidation)).append("\n");
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
