package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20013TemplateValidation;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20013
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20013   {
  private Boolean success = null;

  private String error = null;

  private InlineResponse20013TemplateValidation templateValidation = null;

  public InlineResponse20013 success(Boolean success) {
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

  public InlineResponse20013 error(String error) {
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

  public InlineResponse20013 templateValidation(InlineResponse20013TemplateValidation templateValidation) {
    this.templateValidation = templateValidation;
    return this;
  }

  /**
   * Get templateValidation
   * @return templateValidation
   **/
    public InlineResponse20013TemplateValidation getTemplateValidation() {
    return templateValidation;
  }

  public void setTemplateValidation(InlineResponse20013TemplateValidation templateValidation) {
    this.templateValidation = templateValidation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013 inlineResponse20013 = (InlineResponse20013) o;
    return Objects.equals(this.success, inlineResponse20013.success) &&
        Objects.equals(this.error, inlineResponse20013.error) &&
        Objects.equals(this.templateValidation, inlineResponse20013.templateValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, templateValidation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    templateValidation: ").append(toIndentedString(templateValidation)).append("\n");
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
