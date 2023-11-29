package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.SourcePublipostageSource;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * SourcePublipostageBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class SourcePublipostageBody   {
  private Integer idUser = null;

  private Object templateValidation = null;

  private SourcePublipostageSource source = null;

  public SourcePublipostageBody idUser(Integer idUser) {
    this.idUser = idUser;
    return this;
  }

  /**
   * Id de l'utilisateur qui effectue l'envoi.
   * @return idUser
   **/
    public Integer getIdUser() {
    return idUser;
  }

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
  }

  public SourcePublipostageBody templateValidation(Object templateValidation) {
    this.templateValidation = templateValidation;
    return this;
  }

  /**
   * un json avec la valeur templateValidation telle qu'elle vous a été retourné lors de l'envoi du template sur /templatePublipostage.
   * @return templateValidation
   **/
    public Object getTemplateValidation() {
    return templateValidation;
  }

  public void setTemplateValidation(Object templateValidation) {
    this.templateValidation = templateValidation;
  }

  public SourcePublipostageBody source(SourcePublipostageSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
    public SourcePublipostageSource getSource() {
    return source;
  }

  public void setSource(SourcePublipostageSource source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourcePublipostageBody sourcePublipostageBody = (SourcePublipostageBody) o;
    return Objects.equals(this.idUser, sourcePublipostageBody.idUser) &&
        Objects.equals(this.templateValidation, sourcePublipostageBody.templateValidation) &&
        Objects.equals(this.source, sourcePublipostageBody.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUser, templateValidation, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourcePublipostageBody {\n");
    
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    templateValidation: ").append(toIndentedString(templateValidation)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
