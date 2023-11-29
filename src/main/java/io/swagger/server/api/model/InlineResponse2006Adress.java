package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse2006Adress
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2006Adress   {
  private Integer id = null;

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

  public InlineResponse2006Adress id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Id de l'adresse
   * @return id
   **/
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InlineResponse2006Adress civilite(String civilite) {
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

  public InlineResponse2006Adress nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * Nom du contact
   * @return nom
   **/
    public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public InlineResponse2006Adress prenom(String prenom) {
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

  public InlineResponse2006Adress societe(String societe) {
    this.societe = societe;
    return this;
  }

  /**
   * Société du contact
   * @return societe
   **/
    public String getSociete() {
    return societe;
  }

  public void setSociete(String societe) {
    this.societe = societe;
  }

  public InlineResponse2006Adress adresse1(String adresse1) {
    this.adresse1 = adresse1;
    return this;
  }

  /**
   * Adresse ligne 1 du contact
   * @return adresse1
   **/
    public String getAdresse1() {
    return adresse1;
  }

  public void setAdresse1(String adresse1) {
    this.adresse1 = adresse1;
  }

  public InlineResponse2006Adress adresse2(String adresse2) {
    this.adresse2 = adresse2;
    return this;
  }

  /**
   * Adresse ligne 2 du contact
   * @return adresse2
   **/
    public String getAdresse2() {
    return adresse2;
  }

  public void setAdresse2(String adresse2) {
    this.adresse2 = adresse2;
  }

  public InlineResponse2006Adress adresse3(String adresse3) {
    this.adresse3 = adresse3;
    return this;
  }

  /**
   * Adresse ligne 3 du contact
   * @return adresse3
   **/
    public String getAdresse3() {
    return adresse3;
  }

  public void setAdresse3(String adresse3) {
    this.adresse3 = adresse3;
  }

  public InlineResponse2006Adress cp(String cp) {
    this.cp = cp;
    return this;
  }

  /**
   * Code postal du contact
   * @return cp
   **/
    public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public InlineResponse2006Adress ville(String ville) {
    this.ville = ville;
    return this;
  }

  /**
   * Ville du contact
   * @return ville
   **/
    public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public InlineResponse2006Adress pays(String pays) {
    this.pays = pays;
    return this;
  }

  /**
   * Pays du contact
   * @return pays
   **/
    public String getPays() {
    return pays;
  }

  public void setPays(String pays) {
    this.pays = pays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006Adress inlineResponse2006Adress = (InlineResponse2006Adress) o;
    return Objects.equals(this.id, inlineResponse2006Adress.id) &&
        Objects.equals(this.civilite, inlineResponse2006Adress.civilite) &&
        Objects.equals(this.nom, inlineResponse2006Adress.nom) &&
        Objects.equals(this.prenom, inlineResponse2006Adress.prenom) &&
        Objects.equals(this.societe, inlineResponse2006Adress.societe) &&
        Objects.equals(this.adresse1, inlineResponse2006Adress.adresse1) &&
        Objects.equals(this.adresse2, inlineResponse2006Adress.adresse2) &&
        Objects.equals(this.adresse3, inlineResponse2006Adress.adresse3) &&
        Objects.equals(this.cp, inlineResponse2006Adress.cp) &&
        Objects.equals(this.ville, inlineResponse2006Adress.ville) &&
        Objects.equals(this.pays, inlineResponse2006Adress.pays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, civilite, nom, prenom, societe, adresse1, adresse2, adresse3, cp, ville, pays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006Adress {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
