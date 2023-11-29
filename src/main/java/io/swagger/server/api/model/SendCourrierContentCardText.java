package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Informations concernant le texte de la carte
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class SendCourrierContentCardText   {
  /**
   * Type de visuel : html (code html), base64 (image), customimg (image)
   */
  public enum TypeEnum {
    HTML("html"),
    CUSTOMIMG("customimg"),
    BASE64("base64");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private TypeEnum type = null;

  private String value = null;

  public SendCourrierContentCardText type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type de visuel : html (code html), base64 (image), customimg (image)
   * @return type
   **/
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SendCourrierContentCardText value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Si type=html, alors value=html contenant le texte à imprimer sur le dos la carte. Si type=base64, alors value=une base64 contenant une image à imprimer sur le dos de la carte. Si type=customimg, alors value=une URL d'une image à imprimer sur le dos de la carte.
   * @return value
   **/
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCourrierContentCardText sendCourrierContentCardText = (SendCourrierContentCardText) o;
    return Objects.equals(this.type, sendCourrierContentCardText.type) &&
        Objects.equals(this.value, sendCourrierContentCardText.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCourrierContentCardText {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
