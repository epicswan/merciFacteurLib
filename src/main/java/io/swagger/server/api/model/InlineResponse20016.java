package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20016SuiviCourrier;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20016
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20016   {
  private Boolean success = null;

  private String error = null;

  private String statutPrintEnvoi = null;

  
  private List<InlineResponse20016SuiviCourrier> suiviCourrier = null;

  public InlineResponse20016 success(Boolean success) {
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

  public InlineResponse20016 error(String error) {
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

  public InlineResponse20016 statutPrintEnvoi(String statutPrintEnvoi) {
    this.statutPrintEnvoi = statutPrintEnvoi;
    return this;
  }

  /**
   * Le statut de l'impression des courriers (exemples \"Traitement en attente\",\"Génération des courriers en cours\", \"Préparation en cours\", \"Impression en attente\", \"Impression en cours\", \"Impression terminée\")
   * @return statutPrintEnvoi
   **/
    public String getStatutPrintEnvoi() {
    return statutPrintEnvoi;
  }

  public void setStatutPrintEnvoi(String statutPrintEnvoi) {
    this.statutPrintEnvoi = statutPrintEnvoi;
  }

  public InlineResponse20016 suiviCourrier(List<InlineResponse20016SuiviCourrier> suiviCourrier) {
    this.suiviCourrier = suiviCourrier;
    return this;
  }

  public InlineResponse20016 addSuiviCourrierItem(InlineResponse20016SuiviCourrier suiviCourrierItem) {
    if (this.suiviCourrier == null) {
      this.suiviCourrier = new ArrayList<InlineResponse20016SuiviCourrier>();
    }
    this.suiviCourrier.add(suiviCourrierItem);
    return this;
  }

  /**
   * Les infos de suivi de chaque courrier constituant cet envoi
   * @return suiviCourrier
   **/
    public List<InlineResponse20016SuiviCourrier> getSuiviCourrier() {
    return suiviCourrier;
  }

  public void setSuiviCourrier(List<InlineResponse20016SuiviCourrier> suiviCourrier) {
    this.suiviCourrier = suiviCourrier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20016 inlineResponse20016 = (InlineResponse20016) o;
    return Objects.equals(this.success, inlineResponse20016.success) &&
        Objects.equals(this.error, inlineResponse20016.error) &&
        Objects.equals(this.statutPrintEnvoi, inlineResponse20016.statutPrintEnvoi) &&
        Objects.equals(this.suiviCourrier, inlineResponse20016.suiviCourrier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, statutPrintEnvoi, suiviCourrier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20016 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    statutPrintEnvoi: ").append(toIndentedString(statutPrintEnvoi)).append("\n");
    sb.append("    suiviCourrier: ").append(toIndentedString(suiviCourrier)).append("\n");
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
