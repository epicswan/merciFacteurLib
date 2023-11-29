package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20017
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20017   {
  private Boolean success = null;

  private String error = null;

  private String formatReturn = null;

  private String document = null;

  public InlineResponse20017 success(Boolean success) {
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

  public InlineResponse20017 error(String error) {
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

  public InlineResponse20017 formatReturn(String formatReturn) {
    this.formatReturn = formatReturn;
    return this;
  }

  /**
   * Le format du document (jpeg ou pdf).
   * @return formatReturn
   **/
    public String getFormatReturn() {
    return formatReturn;
  }

  public void setFormatReturn(String formatReturn) {
    this.formatReturn = formatReturn;
  }

  public InlineResponse20017 document(String document) {
    this.document = document;
    return this;
  }

  /**
   * La base64 du document retourné. Pour créer le document en local ou l'afficher, associez-y la bonne entête en fonction du \"format_return\".
   * @return document
   **/
    public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20017 inlineResponse20017 = (InlineResponse20017) o;
    return Objects.equals(this.success, inlineResponse20017.success) &&
        Objects.equals(this.error, inlineResponse20017.error) &&
        Objects.equals(this.formatReturn, inlineResponse20017.formatReturn) &&
        Objects.equals(this.document, inlineResponse20017.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, formatReturn, document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20017 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    formatReturn: ").append(toIndentedString(formatReturn)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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
