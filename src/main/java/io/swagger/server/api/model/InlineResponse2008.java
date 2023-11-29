package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse2008
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2008   {
  private Boolean success = null;

  private String error = null;

  private String token = null;

  private String nbFiles = null;

  public InlineResponse2008 success(Boolean success) {
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

  public InlineResponse2008 error(String error) {
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

  public InlineResponse2008 token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Le token contenant le fichier envoyé (et les éventuels autres fichiers)
   * @return token
   **/
    public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public InlineResponse2008 nbFiles(String nbFiles) {
    this.nbFiles = nbFiles;
    return this;
  }

  /**
   * Le nombre de fichiers contenus dans ce token
   * @return nbFiles
   **/
    public String getNbFiles() {
    return nbFiles;
  }

  public void setNbFiles(String nbFiles) {
    this.nbFiles = nbFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008 inlineResponse2008 = (InlineResponse2008) o;
    return Objects.equals(this.success, inlineResponse2008.success) &&
        Objects.equals(this.error, inlineResponse2008.error) &&
        Objects.equals(this.token, inlineResponse2008.token) &&
        Objects.equals(this.nbFiles, inlineResponse2008.nbFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, token, nbFiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    nbFiles: ").append(toIndentedString(nbFiles)).append("\n");
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
