package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20015
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20015   {
  private Boolean success = null;

  private String error = null;

  private Integer savId = null;

  private String savToken = null;

  public InlineResponse20015 success(Boolean success) {
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

  public InlineResponse20015 error(String error) {
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

  public InlineResponse20015 savId(Integer savId) {
    this.savId = savId;
    return this;
  }

  /**
   * L'id du ticket SAV
   * @return savId
   **/
    public Integer getSavId() {
    return savId;
  }

  public void setSavId(Integer savId) {
    this.savId = savId;
  }

  public InlineResponse20015 savToken(String savToken) {
    this.savToken = savToken;
    return this;
  }

  /**
   * Le token du ticket SAV
   * @return savToken
   **/
    public String getSavToken() {
    return savToken;
  }

  public void setSavToken(String savToken) {
    this.savToken = savToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20015 inlineResponse20015 = (InlineResponse20015) o;
    return Objects.equals(this.success, inlineResponse20015.success) &&
        Objects.equals(this.error, inlineResponse20015.error) &&
        Objects.equals(this.savId, inlineResponse20015.savId) &&
        Objects.equals(this.savToken, inlineResponse20015.savToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, savId, savToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20015 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    savId: ").append(toIndentedString(savId)).append("\n");
    sb.append("    savToken: ").append(toIndentedString(savToken)).append("\n");
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
