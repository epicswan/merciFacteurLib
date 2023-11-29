package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.server.api.model.AdressSendCourrier;
import io.swagger.server.api.model.SendCourrierAnonymize;
import io.swagger.server.api.model.SendCourrierContent;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * SendCourrierBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class SendCourrierBody   {
  private Integer idUser = null;

  /**
   * Mode d'envoi du courrier : suivi, lrar, lrare, ou normal pour les envois papier. ere_otp_mail ou ere_otp_sms pour les recommandés électroniques.
   */
  public enum ModeEnvoiEnum {
    NORMAL("normal"),
    SUIVI("suivi"),
    LRAR("lrar"),
    LRARE("lrare"),
    ERE_OTP_MAIL("ere_otp_mail"),
    ERE_OTP_SMS("ere_otp_sms");

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

  private AdressSendCourrier adress = null;

  private String dateEnvoi = null;

  private String designation = null;

  private SendCourrierAnonymize anonymize = null;

  private SendCourrierContent content = null;

  public SendCourrierBody idUser(Integer idUser) {
    this.idUser = idUser;
    return this;
  }

  /**
   * user ID de l'utilisateur qui envoi le courrier
   * @return idUser
   **/
    public Integer getIdUser() {
    return idUser;
  }

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
  }

  public SendCourrierBody modeEnvoi(ModeEnvoiEnum modeEnvoi) {
    this.modeEnvoi = modeEnvoi;
    return this;
  }

  /**
   * Mode d'envoi du courrier : suivi, lrar, lrare, ou normal pour les envois papier. ere_otp_mail ou ere_otp_sms pour les recommandés électroniques.
   * @return modeEnvoi
   **/
    public ModeEnvoiEnum getModeEnvoi() {
    return modeEnvoi;
  }

  public void setModeEnvoi(ModeEnvoiEnum modeEnvoi) {
    this.modeEnvoi = modeEnvoi;
  }

  public SendCourrierBody adress(AdressSendCourrier adress) {
    this.adress = adress;
    return this;
  }

  /**
   * Get adress
   * @return adress
   **/
    public AdressSendCourrier getAdress() {
    return adress;
  }

  public void setAdress(AdressSendCourrier adress) {
    this.adress = adress;
  }

  public SendCourrierBody dateEnvoi(String dateEnvoi) {
    this.dateEnvoi = dateEnvoi;
    return this;
  }

  /**
   * Date d'envoi souhaitée du courrier. Si vide ou non spécifié, l'envoi sera fait le jour même (ou le jour ouvrable suivant). Doit être au format AAAA-MM-JJ et doit être une date non passée.
   * @return dateEnvoi
   **/
    public String getDateEnvoi() {
    return dateEnvoi;
  }

  public void setDateEnvoi(String dateEnvoi) {
    this.dateEnvoi = dateEnvoi;
  }

  public SendCourrierBody designation(String designation) {
    this.designation = designation;
    return this;
  }

  /**
   * Facultatif, 50 caractères maximum, la designation sera reprise sur votre interface Merci facteur pro dans le listing de vos courriers afin de faciliter vos recherches. Pour les envois recommandés élécroniques (ERE) la designation sera présente dans l'email envoyé à votre destinataire
   * @return designation
   **/
    public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public SendCourrierBody anonymize(SendCourrierAnonymize anonymize) {
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

  public SendCourrierBody content(SendCourrierContent content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
    public SendCourrierContent getContent() {
    return content;
  }

  public void setContent(SendCourrierContent content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCourrierBody sendCourrierBody = (SendCourrierBody) o;
    return Objects.equals(this.idUser, sendCourrierBody.idUser) &&
        Objects.equals(this.modeEnvoi, sendCourrierBody.modeEnvoi) &&
        Objects.equals(this.adress, sendCourrierBody.adress) &&
        Objects.equals(this.dateEnvoi, sendCourrierBody.dateEnvoi) &&
        Objects.equals(this.designation, sendCourrierBody.designation) &&
        Objects.equals(this.anonymize, sendCourrierBody.anonymize) &&
        Objects.equals(this.content, sendCourrierBody.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUser, modeEnvoi, adress, dateEnvoi, designation, anonymize, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCourrierBody {\n");
    
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    modeEnvoi: ").append(toIndentedString(modeEnvoi)).append("\n");
    sb.append("    adress: ").append(toIndentedString(adress)).append("\n");
    sb.append("    dateEnvoi: ").append(toIndentedString(dateEnvoi)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    anonymize: ").append(toIndentedString(anonymize)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
