package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20018Quotas;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20018
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20018   {
  private Boolean success = null;

  private String error = null;

  private InlineResponse20018Quotas quotas = null;

  public InlineResponse20018 success(Boolean success) {
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

  public InlineResponse20018 error(String error) {
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

  public InlineResponse20018 quotas(InlineResponse20018Quotas quotas) {
    this.quotas = quotas;
    return this;
  }

  /**
   * Get quotas
   * @return quotas
   **/
    public InlineResponse20018Quotas getQuotas() {
    return quotas;
  }

  public void setQuotas(InlineResponse20018Quotas quotas) {
    this.quotas = quotas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018 inlineResponse20018 = (InlineResponse20018) o;
    return Objects.equals(this.success, inlineResponse20018.success) &&
        Objects.equals(this.error, inlineResponse20018.error) &&
        Objects.equals(this.quotas, inlineResponse20018.quotas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, quotas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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
