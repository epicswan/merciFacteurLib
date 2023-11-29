package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20020ListErrors;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20020
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20020   {
  private Boolean success = null;

  private String error = null;

  private InlineResponse20020ListErrors listErrors = null;

  public InlineResponse20020 success(Boolean success) {
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

  public InlineResponse20020 error(String error) {
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

  public InlineResponse20020 listErrors(InlineResponse20020ListErrors listErrors) {
    this.listErrors = listErrors;
    return this;
  }

  /**
   * Get listErrors
   * @return listErrors
   **/
    public InlineResponse20020ListErrors getListErrors() {
    return listErrors;
  }

  public void setListErrors(InlineResponse20020ListErrors listErrors) {
    this.listErrors = listErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20020 inlineResponse20020 = (InlineResponse20020) o;
    return Objects.equals(this.success, inlineResponse20020.success) &&
        Objects.equals(this.error, inlineResponse20020.error) &&
        Objects.equals(this.listErrors, inlineResponse20020.listErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, listErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20020 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    listErrors: ").append(toIndentedString(listErrors)).append("\n");
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
