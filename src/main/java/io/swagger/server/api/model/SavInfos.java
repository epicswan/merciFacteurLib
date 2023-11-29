package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Les informations nécessaires à l&#x27;ouverture d&#x27;un ticket auprès du service après vente de Merci facteur
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class SavInfos   {
  private String yourServiceName = null;

  private String email = null;

  private String referenceCourrier = null;

  private String sujet = null;

  private String messageTexte = null;

  public SavInfos yourServiceName(String yourServiceName) {
    this.yourServiceName = yourServiceName;
    return this;
  }

  /**
   * Nom de votre service, tel qu'il est connu par la personne qui ouvre le ticket SAV (le SAV de Merci facteur se présentera comme traitant la demande pour vous).
   * @return yourServiceName
   **/
    public String getYourServiceName() {
    return yourServiceName;
  }

  public void setYourServiceName(String yourServiceName) {
    this.yourServiceName = yourServiceName;
  }

  public SavInfos email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Adresse email de la personne qui ouvre ce ticket SAV (les réponses du SAV seront envoyées sur cette adresse)
   * @return email
   **/
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SavInfos referenceCourrier(String referenceCourrier) {
    this.referenceCourrier = referenceCourrier;
    return this;
  }

  /**
   * Si connue, la référence du courrier concerné par ce ticet SAV.
   * @return referenceCourrier
   **/
    public String getReferenceCourrier() {
    return referenceCourrier;
  }

  public void setReferenceCourrier(String referenceCourrier) {
    this.referenceCourrier = referenceCourrier;
  }

  public SavInfos sujet(String sujet) {
    this.sujet = sujet;
    return this;
  }

  /**
   * Sujet de la demande.
   * @return sujet
   **/
    public String getSujet() {
    return sujet;
  }

  public void setSujet(String sujet) {
    this.sujet = sujet;
  }

  public SavInfos messageTexte(String messageTexte) {
    this.messageTexte = messageTexte;
    return this;
  }

  /**
   * Texte de la demande.
   * @return messageTexte
   **/
    public String getMessageTexte() {
    return messageTexte;
  }

  public void setMessageTexte(String messageTexte) {
    this.messageTexte = messageTexte;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavInfos savInfos = (SavInfos) o;
    return Objects.equals(this.yourServiceName, savInfos.yourServiceName) &&
        Objects.equals(this.email, savInfos.email) &&
        Objects.equals(this.referenceCourrier, savInfos.referenceCourrier) &&
        Objects.equals(this.sujet, savInfos.sujet) &&
        Objects.equals(this.messageTexte, savInfos.messageTexte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yourServiceName, email, referenceCourrier, sujet, messageTexte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavInfos {\n");
    
    sb.append("    yourServiceName: ").append(toIndentedString(yourServiceName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    referenceCourrier: ").append(toIndentedString(referenceCourrier)).append("\n");
    sb.append("    sujet: ").append(toIndentedString(sujet)).append("\n");
    sb.append("    messageTexte: ").append(toIndentedString(messageTexte)).append("\n");
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
