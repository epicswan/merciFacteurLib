package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20012Envoi;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20012
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20012   {
  private Boolean success = null;

  private String error = null;

  
  private List<InlineResponse20012Envoi> envoi = null;

  public InlineResponse20012 success(Boolean success) {
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

  public InlineResponse20012 error(String error) {
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

  public InlineResponse20012 envoi(List<InlineResponse20012Envoi> envoi) {
    this.envoi = envoi;
    return this;
  }

  public InlineResponse20012 addEnvoiItem(InlineResponse20012Envoi envoiItem) {
    if (this.envoi == null) {
      this.envoi = new ArrayList<InlineResponse20012Envoi>();
    }
    this.envoi.add(envoiItem);
    return this;
  }

  /**
   * Get envoi
   * @return envoi
   **/
    public List<InlineResponse20012Envoi> getEnvoi() {
    return envoi;
  }

  public void setEnvoi(List<InlineResponse20012Envoi> envoi) {
    this.envoi = envoi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012 inlineResponse20012 = (InlineResponse20012) o;
    return Objects.equals(this.success, inlineResponse20012.success) &&
        Objects.equals(this.error, inlineResponse20012.error) &&
        Objects.equals(this.envoi, inlineResponse20012.envoi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, envoi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    envoi: ").append(toIndentedString(envoi)).append("\n");
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
