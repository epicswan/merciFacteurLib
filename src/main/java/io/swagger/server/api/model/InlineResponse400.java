package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse400Error;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse400
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse400   {
  private Boolean success = null;

  private InlineResponse400Error error = null;

  public InlineResponse400 success(Boolean success) {
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

  public InlineResponse400 error(InlineResponse400Error error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   **/
    public InlineResponse400Error getError() {
    return error;
  }

  public void setError(InlineResponse400Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400 inlineResponse400 = (InlineResponse400) o;
    return Objects.equals(this.success, inlineResponse400.success) &&
        Objects.equals(this.error, inlineResponse400.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
