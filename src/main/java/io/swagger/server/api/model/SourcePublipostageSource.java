package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * URL du fichier csv/txt, sa version encodée en base64, ou le json des données.
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class SourcePublipostageSource   {
  /**
   * Type de source envoyée (\"file\" pour une URL vers un fichier CSV ou TXT, \"base64\" pour un fichier CSV ou TXT encodé en base64, ou \"json\" pour un json).
   */
  public enum TypeEnum {
    FILE("file"),
    BASE64("base64"),
    JSON("json");

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

  public SourcePublipostageSource type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type de source envoyée (\"file\" pour une URL vers un fichier CSV ou TXT, \"base64\" pour un fichier CSV ou TXT encodé en base64, ou \"json\" pour un json).
   * @return type
   **/
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SourcePublipostageSource value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Si type=\"file\", l'URL du fichier. Si type=\"base64\", la base64. Si type=\"json\", un json contenant les données sources ([{destinataire 1},{destinataire 2},etc...])
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
    SourcePublipostageSource sourcePublipostageSource = (SourcePublipostageSource) o;
    return Objects.equals(this.type, sourcePublipostageSource.type) &&
        Objects.equals(this.value, sourcePublipostageSource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourcePublipostageSource {\n");
    
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
