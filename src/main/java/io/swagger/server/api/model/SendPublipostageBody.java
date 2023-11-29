package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.server.api.model.SendCourrierAnonymize;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * SendPublipostageBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class SendPublipostageBody   {
  private Integer idEnvoi = null;

  private Integer idExp = null;

  private String jsonExp = null;

  /**
   * Mode d'envoi du courrier : suivi, lrar, lrare, ou normal
   */
  public enum ModeEnvoiEnum {
    NORMAL("normal"),
    SUIVI("suivi"),
    LRAR("lrar"),
    LRARE("lrare");

    private String value;

    ModeEnvoiEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnvoiEnum fromValue(String value) {
      for (ModeEnvoiEnum b : ModeEnvoiEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private ModeEnvoiEnum modeEnvoi = null;

  private SendCourrierAnonymize anonymize = null;

  public SendPublipostageBody idEnvoi(Integer idEnvoi) {
    this.idEnvoi = idEnvoi;
    return this;
  }

  /**
   * Identifiant de l'envoi qui vous a été retourné par \\sourcePublipostage
   * @return idEnvoi
   **/
    public Integer getIdEnvoi() {
    return idEnvoi;
  }

  public void setIdEnvoi(Integer idEnvoi) {
    this.idEnvoi = idEnvoi;
  }

  public SendPublipostageBody idExp(Integer idExp) {
    this.idExp = idExp;
    return this;
  }

  /**
   * Id de l'adresse d'expéditeur (créée auparavant avec /setNewAdress) - si vous utilisez \"idExp\", laissez vide \"jsonExp\".
   * @return idExp
   **/
    public Integer getIdExp() {
    return idExp;
  }

  public void setIdExp(Integer idExp) {
    this.idExp = idExp;
  }

  public SendPublipostageBody jsonExp(String jsonExp) {
    this.jsonExp = jsonExp;
    return this;
  }

  /**
   * json contenant l'adresse d'expéditeur (si vous ne souhaitez pas créer l'adresse auparavant avec /setNewAdress) - si vous utilisez \"jsonExp\", laissez vide \"idExp\".
   * @return jsonExp
   **/
    public String getJsonExp() {
    return jsonExp;
  }

  public void setJsonExp(String jsonExp) {
    this.jsonExp = jsonExp;
  }

  public SendPublipostageBody modeEnvoi(ModeEnvoiEnum modeEnvoi) {
    this.modeEnvoi = modeEnvoi;
    return this;
  }

  /**
   * Mode d'envoi du courrier : suivi, lrar, lrare, ou normal
   * @return modeEnvoi
   **/
    public ModeEnvoiEnum getModeEnvoi() {
    return modeEnvoi;
  }

  public void setModeEnvoi(ModeEnvoiEnum modeEnvoi) {
    this.modeEnvoi = modeEnvoi;
  }

  public SendPublipostageBody anonymize(SendCourrierAnonymize anonymize) {
    this.anonymize = anonymize;
    return this;
  }

  /**
   * Get anonymize
   * @return anonymize
   **/
    public SendCourrierAnonymize getAnonymize() {
    return anonymize;
  }

  public void setAnonymize(SendCourrierAnonymize anonymize) {
    this.anonymize = anonymize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendPublipostageBody sendPublipostageBody = (SendPublipostageBody) o;
    return Objects.equals(this.idEnvoi, sendPublipostageBody.idEnvoi) &&
        Objects.equals(this.idExp, sendPublipostageBody.idExp) &&
        Objects.equals(this.jsonExp, sendPublipostageBody.jsonExp) &&
        Objects.equals(this.modeEnvoi, sendPublipostageBody.modeEnvoi) &&
        Objects.equals(this.anonymize, sendPublipostageBody.anonymize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEnvoi, idExp, jsonExp, modeEnvoi, anonymize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendPublipostageBody {\n");
    
    sb.append("    idEnvoi: ").append(toIndentedString(idEnvoi)).append("\n");
    sb.append("    idExp: ").append(toIndentedString(idExp)).append("\n");
    sb.append("    jsonExp: ").append(toIndentedString(jsonExp)).append("\n");
    sb.append("    modeEnvoi: ").append(toIndentedString(modeEnvoi)).append("\n");
    sb.append("    anonymize: ").append(toIndentedString(anonymize)).append("\n");
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
