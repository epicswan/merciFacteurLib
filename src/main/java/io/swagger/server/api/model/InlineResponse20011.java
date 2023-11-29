package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20011Envois;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20011
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20011   {
  private Boolean success = null;

  private String error = null;

  
  private List<InlineResponse20011Envois> envois = null;

  public InlineResponse20011 success(Boolean success) {
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

  public InlineResponse20011 error(String error) {
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

  public InlineResponse20011 envois(List<InlineResponse20011Envois> envois) {
    this.envois = envois;
    return this;
  }

  public InlineResponse20011 addEnvoisItem(InlineResponse20011Envois envoisItem) {
    if (this.envois == null) {
      this.envois = new ArrayList<InlineResponse20011Envois>();
    }
    this.envois.add(envoisItem);
    return this;
  }

  /**
   * Get envois
   * @return envois
   **/
    public List<InlineResponse20011Envois> getEnvois() {
    return envois;
  }

  public void setEnvois(List<InlineResponse20011Envois> envois) {
    this.envois = envois;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011 inlineResponse20011 = (InlineResponse20011) o;
    return Objects.equals(this.success, inlineResponse20011.success) &&
        Objects.equals(this.error, inlineResponse20011.error) &&
        Objects.equals(this.envois, inlineResponse20011.envois);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, envois);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    envois: ").append(toIndentedString(envois)).append("\n");
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
