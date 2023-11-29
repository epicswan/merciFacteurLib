package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * TemplatePublipostageBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class TemplatePublipostageBody   {
  /**
   * Type de template envoyé (\"file\" pour une URL vers un fichier docx, ou \"base64\" pour un fichier encodé en base64).
   */
  public enum TypeTemplateEnum {
    FILE("file"),
    BASE64("base64");

    private String value;

    TypeTemplateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeTemplateEnum fromValue(String value) {
      for (TypeTemplateEnum b : TypeTemplateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private TypeTemplateEnum typeTemplate = null;

  private String template = null;

  public TemplatePublipostageBody typeTemplate(TypeTemplateEnum typeTemplate) {
    this.typeTemplate = typeTemplate;
    return this;
  }

  /**
   * Type de template envoyé (\"file\" pour une URL vers un fichier docx, ou \"base64\" pour un fichier encodé en base64).
   * @return typeTemplate
   **/
    public TypeTemplateEnum getTypeTemplate() {
    return typeTemplate;
  }

  public void setTypeTemplate(TypeTemplateEnum typeTemplate) {
    this.typeTemplate = typeTemplate;
  }

  public TemplatePublipostageBody template(String template) {
    this.template = template;
    return this;
  }

  /**
   * URL du fichier docx, ou sa version encodée en base64.
   * @return template
   **/
    public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplatePublipostageBody templatePublipostageBody = (TemplatePublipostageBody) o;
    return Objects.equals(this.typeTemplate, templatePublipostageBody.typeTemplate) &&
        Objects.equals(this.template, templatePublipostageBody.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeTemplate, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplatePublipostageBody {\n");
    
    sb.append("    typeTemplate: ").append(toIndentedString(typeTemplate)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
