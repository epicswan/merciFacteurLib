package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Infos du destinataire du courrier
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20012Dest   {
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

  public InlineResponse20012Dest id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Adress ID e ce destinataire
   * @return id
   **/
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InlineResponse20012Dest civilite(String civilite) {
    this.civilite = civilite;
    return this;
  }

  /**
   * Civilité de ce destinataire
   * @return civilite
   **/
    public String getCivilite() {
    return civilite;
  }

  public void setCivilite(String civilite) {
    this.civilite = civilite;
  }

  public InlineResponse20012Dest nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * Nom de ce destinataire
   * @return nom
   **/
    public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public InlineResponse20012Dest prenom(String prenom) {
    this.prenom = prenom;
    return this;
  }

  /**
   * Prénom de ce destinataire
   * @return prenom
   **/
    public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public InlineResponse20012Dest societe(String societe) {
    this.societe = societe;
    return this;
  }

  /**
   * Société de ce destinataire
   * @return societe
   **/
    public String getSociete() {
    return societe;
  }

  public void setSociete(String societe) {
    this.societe = societe;
  }

  public InlineResponse20012Dest adresse1(String adresse1) {
    this.adresse1 = adresse1;
    return this;
  }

  /**
   * Ligne 1 d'adresse de ce destinataire
   * @return adresse1
   **/
    public String getAdresse1() {
    return adresse1;
  }

  public void setAdresse1(String adresse1) {
    this.adresse1 = adresse1;
  }

  public InlineResponse20012Dest adresse2(String adresse2) {
    this.adresse2 = adresse2;
    return this;
  }

  /**
   * Ligne 2 d'adresse de ce destinataire
   * @return adresse2
   **/
    public String getAdresse2() {
    return adresse2;
  }

  public void setAdresse2(String adresse2) {
    this.adresse2 = adresse2;
  }

  public InlineResponse20012Dest adresse3(String adresse3) {
    this.adresse3 = adresse3;
    return this;
  }

  /**
   * Ligne 3 d'adresse de ce destinataire
   * @return adresse3
   **/
    public String getAdresse3() {
    return adresse3;
  }

  public void setAdresse3(String adresse3) {
    this.adresse3 = adresse3;
  }

  public InlineResponse20012Dest cp(String cp) {
    this.cp = cp;
    return this;
  }

  /**
   * Code postal de ce destinataire
   * @return cp
   **/
    public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public InlineResponse20012Dest ville(String ville) {
    this.ville = ville;
    return this;
  }

  /**
   * Ville de ce destinataire
   * @return ville
   **/
    public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public InlineResponse20012Dest pays(String pays) {
    this.pays = pays;
    return this;
  }

  /**
   * Pays de ce destinataire
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
    InlineResponse20012Dest inlineResponse20012Dest = (InlineResponse20012Dest) o;
    return Objects.equals(this.id, inlineResponse20012Dest.id) &&
        Objects.equals(this.civilite, inlineResponse20012Dest.civilite) &&
        Objects.equals(this.nom, inlineResponse20012Dest.nom) &&
        Objects.equals(this.prenom, inlineResponse20012Dest.prenom) &&
        Objects.equals(this.societe, inlineResponse20012Dest.societe) &&
        Objects.equals(this.adresse1, inlineResponse20012Dest.adresse1) &&
        Objects.equals(this.adresse2, inlineResponse20012Dest.adresse2) &&
        Objects.equals(this.adresse3, inlineResponse20012Dest.adresse3) &&
        Objects.equals(this.cp, inlineResponse20012Dest.cp) &&
        Objects.equals(this.ville, inlineResponse20012Dest.ville) &&
        Objects.equals(this.pays, inlineResponse20012Dest.pays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, civilite, nom, prenom, societe, adresse1, adresse2, adresse3, cp, ville, pays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012Dest {\n");
    
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
