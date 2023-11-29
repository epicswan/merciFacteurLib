package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20016SuiviCourrier
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20016SuiviCourrier   {
  private String dest = null;

  private String refCourrier = null;

  private String refTracking = null;

  private String modeEnvoi = null;

  private String lastState = null;

  private String historique = null;

  private String pnd = null;

  private String areBase64Jpeg = null;

  public InlineResponse20016SuiviCourrier dest(String dest) {
    this.dest = dest;
    return this;
  }

  /**
   * Nom et/ou société du destinataire
   * @return dest
   **/
    public String getDest() {
    return dest;
  }

  public void setDest(String dest) {
    this.dest = dest;
  }

  public InlineResponse20016SuiviCourrier refCourrier(String refCourrier) {
    this.refCourrier = refCourrier;
    return this;
  }

  /**
   * Référence Merci facteur du courrier
   * @return refCourrier
   **/
    public String getRefCourrier() {
    return refCourrier;
  }

  public void setRefCourrier(String refCourrier) {
    this.refCourrier = refCourrier;
  }

  public InlineResponse20016SuiviCourrier refTracking(String refTracking) {
    this.refTracking = refTracking;
    return this;
  }

  /**
   * Référence de suivi postal
   * @return refTracking
   **/
    public String getRefTracking() {
    return refTracking;
  }

  public void setRefTracking(String refTracking) {
    this.refTracking = refTracking;
  }

  public InlineResponse20016SuiviCourrier modeEnvoi(String modeEnvoi) {
    this.modeEnvoi = modeEnvoi;
    return this;
  }

  /**
   * Mode d'envoi du courrier (lrar, lrare, suivi ou normal)
   * @return modeEnvoi
   **/
    public String getModeEnvoi() {
    return modeEnvoi;
  }

  public void setModeEnvoi(String modeEnvoi) {
    this.modeEnvoi = modeEnvoi;
  }

  public InlineResponse20016SuiviCourrier lastState(String lastState) {
    this.lastState = lastState;
    return this;
  }

  /**
   * Dernier état connu de l'acheminement
   * @return lastState
   **/
    public String getLastState() {
    return lastState;
  }

  public void setLastState(String lastState) {
    this.lastState = lastState;
  }

  public InlineResponse20016SuiviCourrier historique(String historique) {
    this.historique = historique;
    return this;
  }

  /**
   * Historique complet de l'acheminement
   * @return historique
   **/
    public String getHistorique() {
    return historique;
  }

  public void setHistorique(String historique) {
    this.historique = historique;
  }

  public InlineResponse20016SuiviCourrier pnd(String pnd) {
    this.pnd = pnd;
    return this;
  }

  /**
   * 1 en cas de pli non distribuable, sinon 0. Est égale à null si le courrier n'a pas de suivi.
   * @return pnd
   **/
    public String getPnd() {
    return pnd;
  }

  public void setPnd(String pnd) {
    this.pnd = pnd;
  }

  public InlineResponse20016SuiviCourrier areBase64Jpeg(String areBase64Jpeg) {
    this.areBase64Jpeg = areBase64Jpeg;
    return this;
  }

  /**
   * Si vous avez envyé ce courrier en lrare, \"pending\" si l'accusé de réception n'est pas encore disponible, ou la base64 de l'AR numérisé (format jpeg) si il est disponible. Est égale à null le mode d'envoi du courrier n'est pas lrare.
   * @return areBase64Jpeg
   **/
    public String getAreBase64Jpeg() {
    return areBase64Jpeg;
  }

  public void setAreBase64Jpeg(String areBase64Jpeg) {
    this.areBase64Jpeg = areBase64Jpeg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20016SuiviCourrier inlineResponse20016SuiviCourrier = (InlineResponse20016SuiviCourrier) o;
    return Objects.equals(this.dest, inlineResponse20016SuiviCourrier.dest) &&
        Objects.equals(this.refCourrier, inlineResponse20016SuiviCourrier.refCourrier) &&
        Objects.equals(this.refTracking, inlineResponse20016SuiviCourrier.refTracking) &&
        Objects.equals(this.modeEnvoi, inlineResponse20016SuiviCourrier.modeEnvoi) &&
        Objects.equals(this.lastState, inlineResponse20016SuiviCourrier.lastState) &&
        Objects.equals(this.historique, inlineResponse20016SuiviCourrier.historique) &&
        Objects.equals(this.pnd, inlineResponse20016SuiviCourrier.pnd) &&
        Objects.equals(this.areBase64Jpeg, inlineResponse20016SuiviCourrier.areBase64Jpeg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dest, refCourrier, refTracking, modeEnvoi, lastState, historique, pnd, areBase64Jpeg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20016SuiviCourrier {\n");
    
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
    sb.append("    refCourrier: ").append(toIndentedString(refCourrier)).append("\n");
    sb.append("    refTracking: ").append(toIndentedString(refTracking)).append("\n");
    sb.append("    modeEnvoi: ").append(toIndentedString(modeEnvoi)).append("\n");
    sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
    sb.append("    historique: ").append(toIndentedString(historique)).append("\n");
    sb.append("    pnd: ").append(toIndentedString(pnd)).append("\n");
    sb.append("    areBase64Jpeg: ").append(toIndentedString(areBase64Jpeg)).append("\n");
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
