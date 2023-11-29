package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Résumé du contenu de l&#x27;envoi
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2009Resume   {
  private Integer nbDest = null;

  private Integer nbPage = null;

  public InlineResponse2009Resume nbDest(Integer nbDest) {
    this.nbDest = nbDest;
    return this;
  }

  /**
   * Nombre de destinataires (= nombre de courriers générés)
   * @return nbDest
   **/
    public Integer getNbDest() {
    return nbDest;
  }

  public void setNbDest(Integer nbDest) {
    this.nbDest = nbDest;
  }

  public InlineResponse2009Resume nbPage(Integer nbPage) {
    this.nbPage = nbPage;
    return this;
  }

  /**
   * Nombre de page(s) décomptées(s) par destinataire
   * @return nbPage
   **/
    public Integer getNbPage() {
    return nbPage;
  }

  public void setNbPage(Integer nbPage) {
    this.nbPage = nbPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009Resume inlineResponse2009Resume = (InlineResponse2009Resume) o;
    return Objects.equals(this.nbDest, inlineResponse2009Resume.nbDest) &&
        Objects.equals(this.nbPage, inlineResponse2009Resume.nbPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nbDest, nbPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009Resume {\n");
    
    sb.append("    nbDest: ").append(toIndentedString(nbDest)).append("\n");
    sb.append("    nbPage: ").append(toIndentedString(nbPage)).append("\n");
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
