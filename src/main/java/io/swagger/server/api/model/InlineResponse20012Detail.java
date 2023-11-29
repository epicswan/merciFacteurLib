package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20012Dest;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Détail de chaque courrier de cet envoi
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20012Detail   {
  private String refCourrier = null;

  private InlineResponse20012Dest dest = null;

  public InlineResponse20012Detail refCourrier(String refCourrier) {
    this.refCourrier = refCourrier;
    return this;
  }

  /**
   * Référence Merci facteur du courrier, si=null alors le courrier n'est pas encore généré (cf. statut de l'envoi)
   * @return refCourrier
   **/
    public String getRefCourrier() {
    return refCourrier;
  }

  public void setRefCourrier(String refCourrier) {
    this.refCourrier = refCourrier;
  }

  public InlineResponse20012Detail dest(InlineResponse20012Dest dest) {
    this.dest = dest;
    return this;
  }

  /**
   * Get dest
   * @return dest
   **/
    public InlineResponse20012Dest getDest() {
    return dest;
  }

  public void setDest(InlineResponse20012Dest dest) {
    this.dest = dest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012Detail inlineResponse20012Detail = (InlineResponse20012Detail) o;
    return Objects.equals(this.refCourrier, inlineResponse20012Detail.refCourrier) &&
        Objects.equals(this.dest, inlineResponse20012Detail.dest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refCourrier, dest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012Detail {\n");
    
    sb.append("    refCourrier: ").append(toIndentedString(refCourrier)).append("\n");
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
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
