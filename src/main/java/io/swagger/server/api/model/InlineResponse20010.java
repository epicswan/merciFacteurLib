package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20010Affranchissement;
import io.swagger.server.api.model.InlineResponse20010Content;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20010
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20010   {
  private Boolean success = null;

  private String error = null;

  private String poids = null;

  private InlineResponse20010Affranchissement affranchissement = null;

  private InlineResponse20010Content content = null;

  public InlineResponse20010 success(Boolean success) {
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

  public InlineResponse20010 error(String error) {
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

  public InlineResponse20010 poids(String poids) {
    this.poids = poids;
    return this;
  }

  /**
   * Le poids du courrier en grammes
   * @return poids
   **/
    public String getPoids() {
    return poids;
  }

  public void setPoids(String poids) {
    this.poids = poids;
  }

  public InlineResponse20010 affranchissement(InlineResponse20010Affranchissement affranchissement) {
    this.affranchissement = affranchissement;
    return this;
  }

  /**
   * Get affranchissement
   * @return affranchissement
   **/
    public InlineResponse20010Affranchissement getAffranchissement() {
    return affranchissement;
  }

  public void setAffranchissement(InlineResponse20010Affranchissement affranchissement) {
    this.affranchissement = affranchissement;
  }

  public InlineResponse20010 content(InlineResponse20010Content content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
    public InlineResponse20010Content getContent() {
    return content;
  }

  public void setContent(InlineResponse20010Content content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010 inlineResponse20010 = (InlineResponse20010) o;
    return Objects.equals(this.success, inlineResponse20010.success) &&
        Objects.equals(this.error, inlineResponse20010.error) &&
        Objects.equals(this.poids, inlineResponse20010.poids) &&
        Objects.equals(this.affranchissement, inlineResponse20010.affranchissement) &&
        Objects.equals(this.content, inlineResponse20010.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, poids, affranchissement, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    poids: ").append(toIndentedString(poids)).append("\n");
    sb.append("    affranchissement: ").append(toIndentedString(affranchissement)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
