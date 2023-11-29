package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Objet contenant la correspondance entre chaque code d&#x27;erreur et sa signification.
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20020ListErrors   {
  private String erRORCODE1 = null;

  private String erRORCODE2 = null;

  private String erRORCODE3 = null;

  private String ETC = null;

  public InlineResponse20020ListErrors erRORCODE1(String erRORCODE1) {
    this.erRORCODE1 = erRORCODE1;
    return this;
  }

  /**
   * Sigification de ce code d'erreur
   * @return erRORCODE1
   **/
    public String getErRORCODE1() {
    return erRORCODE1;
  }

  public void setErRORCODE1(String erRORCODE1) {
    this.erRORCODE1 = erRORCODE1;
  }

  public InlineResponse20020ListErrors erRORCODE2(String erRORCODE2) {
    this.erRORCODE2 = erRORCODE2;
    return this;
  }

  /**
   * Sigification de ce code d'erreur
   * @return erRORCODE2
   **/
    public String getErRORCODE2() {
    return erRORCODE2;
  }

  public void setErRORCODE2(String erRORCODE2) {
    this.erRORCODE2 = erRORCODE2;
  }

  public InlineResponse20020ListErrors erRORCODE3(String erRORCODE3) {
    this.erRORCODE3 = erRORCODE3;
    return this;
  }

  /**
   * Sigification de ce code d'erreur
   * @return erRORCODE3
   **/
    public String getErRORCODE3() {
    return erRORCODE3;
  }

  public void setErRORCODE3(String erRORCODE3) {
    this.erRORCODE3 = erRORCODE3;
  }

  public InlineResponse20020ListErrors ETC(String ETC) {
    this.ETC = ETC;
    return this;
  }

  /**
   * etc.
   * @return ETC
   **/
    public String getETC() {
    return ETC;
  }

  public void setETC(String ETC) {
    this.ETC = ETC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20020ListErrors inlineResponse20020ListErrors = (InlineResponse20020ListErrors) o;
    return Objects.equals(this.erRORCODE1, inlineResponse20020ListErrors.erRORCODE1) &&
        Objects.equals(this.erRORCODE2, inlineResponse20020ListErrors.erRORCODE2) &&
        Objects.equals(this.erRORCODE3, inlineResponse20020ListErrors.erRORCODE3) &&
        Objects.equals(this.ETC, inlineResponse20020ListErrors.ETC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(erRORCODE1, erRORCODE2, erRORCODE3, ETC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20020ListErrors {\n");
    
    sb.append("    erRORCODE1: ").append(toIndentedString(erRORCODE1)).append("\n");
    sb.append("    erRORCODE2: ").append(toIndentedString(erRORCODE2)).append("\n");
    sb.append("    erRORCODE3: ").append(toIndentedString(erRORCODE3)).append("\n");
    sb.append("    ETC: ").append(toIndentedString(ETC)).append("\n");
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
