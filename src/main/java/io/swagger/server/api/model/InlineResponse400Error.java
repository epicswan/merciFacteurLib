package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse400Error
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse400Error   {
  private String code = null;

  private String text = null;

  public InlineResponse400Error code(String code) {
    this.code = code;
    return this;
  }

  /**
   * le code d'erreur en cas d'erreur
   * @return code
   **/
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public InlineResponse400Error text(String text) {
    this.text = text;
    return this;
  }

  /**
   * le message d'erreur correspondant
   * @return text
   **/
    public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400Error inlineResponse400Error = (InlineResponse400Error) o;
    return Objects.equals(this.code, inlineResponse400Error.code) &&
        Objects.equals(this.text, inlineResponse400Error.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
