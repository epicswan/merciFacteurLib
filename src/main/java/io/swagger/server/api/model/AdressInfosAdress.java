package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * AdressInfosAdress
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class AdressInfosAdress   {
  private String logo = null;

  private String civilite = null;

  private String nom = null;

  private String prenom = null;

  private String societe = null;

  private String adresse1 = null;

  private String adresse2 = null;

  private String adresse3 = null;

  private String cp = null;

  private String ville = null;

  private String pays = null;

  private String phone = null;

  private String email = null;

  private Integer consent = null;

  public AdressInfosAdress logo(String logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Url du logo (uniquement pour les expéditeurs)
   * @return logo
   **/
    public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public AdressInfosAdress civilite(String civilite) {
    this.civilite = civilite;
    return this;
  }

  /**
   * Civilité du contact
   * @return civilite
   **/
    public String getCivilite() {
    return civilite;
  }

  public void setCivilite(String civilite) {
    this.civilite = civilite;
  }

  public AdressInfosAdress nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * Nom du contact (doit être rempli si societe est vide)
   * @return nom
   **/
    public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public AdressInfosAdress prenom(String prenom) {
    this.prenom = prenom;
    return this;
  }

  /**
   * Prénom du contact
   * @return prenom
   **/
    public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public AdressInfosAdress societe(String societe) {
    this.societe = societe;
    return this;
  }

  /**
   * Société du contact (doit être rempli si le nom est vide)
   * @return societe
   **/
    public String getSociete() {
    return societe;
  }

  public void setSociete(String societe) {
    this.societe = societe;
  }

  public AdressInfosAdress adresse1(String adresse1) {
    this.adresse1 = adresse1;
    return this;
  }

  /**
   * Première ligne de l'adresse (exemple : la rue)
   * @return adresse1
   **/
    public String getAdresse1() {
    return adresse1;
  }

  public void setAdresse1(String adresse1) {
    this.adresse1 = adresse1;
  }

  public AdressInfosAdress adresse2(String adresse2) {
    this.adresse2 = adresse2;
    return this;
  }

  /**
   * Seconde ligne de l'adresse (exemple : le lieu-dit)
   * @return adresse2
   **/
    public String getAdresse2() {
    return adresse2;
  }

  public void setAdresse2(String adresse2) {
    this.adresse2 = adresse2;
  }

  public AdressInfosAdress adresse3(String adresse3) {
    this.adresse3 = adresse3;
    return this;
  }

  /**
   * Troisième ligne de l'adresse (exemple : la boite postale)
   * @return adresse3
   **/
    public String getAdresse3() {
    return adresse3;
  }

  public void setAdresse3(String adresse3) {
    this.adresse3 = adresse3;
  }

  public AdressInfosAdress cp(String cp) {
    this.cp = cp;
    return this;
  }

  /**
   * Code postal de l'adresse
   * @return cp
   **/
    public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public AdressInfosAdress ville(String ville) {
    this.ville = ville;
    return this;
  }

  /**
   * Ville de l'adresse
   * @return ville
   **/
    public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public AdressInfosAdress pays(String pays) {
    this.pays = pays;
    return this;
  }

  /**
   * Pays avec une orthographe conforme (cf. getCountry)
   * @return pays
   **/
    public String getPays() {
    return pays;
  }

  public void setPays(String pays) {
    this.pays = pays;
  }

  public AdressInfosAdress phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Le téléphone mobile du destinataire en cas d'envoi de recommandé électronique avec OTP SMS (format +33628749452)
   * @return phone
   **/
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AdressInfosAdress email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Adesse email du destinataire ou de l'expéditeur en cas d'envoi de recommandé électronique
   * @return email
   **/
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AdressInfosAdress consent(Integer consent) {
    this.consent = consent;
    return this;
  }

  /**
   * Pour le destinataire dans le cas d'un envoi de recommandé électronique, il s'agit du consentement donné par le destinataire (doit être =1 pour permettre l'envoi d'un recommandé électronique)
   * @return consent
   **/
    public Integer getConsent() {
    return consent;
  }

  public void setConsent(Integer consent) {
    this.consent = consent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdressInfosAdress adressInfosAdress = (AdressInfosAdress) o;
    return Objects.equals(this.logo, adressInfosAdress.logo) &&
        Objects.equals(this.civilite, adressInfosAdress.civilite) &&
        Objects.equals(this.nom, adressInfosAdress.nom) &&
        Objects.equals(this.prenom, adressInfosAdress.prenom) &&
        Objects.equals(this.societe, adressInfosAdress.societe) &&
        Objects.equals(this.adresse1, adressInfosAdress.adresse1) &&
        Objects.equals(this.adresse2, adressInfosAdress.adresse2) &&
        Objects.equals(this.adresse3, adressInfosAdress.adresse3) &&
        Objects.equals(this.cp, adressInfosAdress.cp) &&
        Objects.equals(this.ville, adressInfosAdress.ville) &&
        Objects.equals(this.pays, adressInfosAdress.pays) &&
        Objects.equals(this.phone, adressInfosAdress.phone) &&
        Objects.equals(this.email, adressInfosAdress.email) &&
        Objects.equals(this.consent, adressInfosAdress.consent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logo, civilite, nom, prenom, societe, adresse1, adresse2, adresse3, cp, ville, pays, phone, email, consent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdressInfosAdress {\n");
    
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    civilite: ").append(toIndentedString(civilite)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    prenom: ").append(toIndentedString(prenom)).append("\n");
    sb.append("    societe: ").append(toIndentedString(societe)).append("\n");
    sb.append("    adresse1: ").append(toIndentedString(adresse1)).append("\n");
    sb.append("    adresse2: ").append(toIndentedString(adresse2)).append("\n");
    sb.append("    adresse3: ").append(toIndentedString(adresse3)).append("\n");
    sb.append("    cp: ").append(toIndentedString(cp)).append("\n");
    sb.append("    ville: ").append(toIndentedString(ville)).append("\n");
    sb.append("    pays: ").append(toIndentedString(pays)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
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
