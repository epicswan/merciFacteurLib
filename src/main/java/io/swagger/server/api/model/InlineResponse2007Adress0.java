package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * La clé de chaque adresse est l&#x27;id de cette adresse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2007Adress0   {
  private Integer id = null;

  /**
   * \\\"dest\\\" si c'est un destinataire, \\\"exp\\\" si c'est un expéditeur
   */
  public enum TypeEnum {
    DEST("dest"),
    EXP("exp");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private TypeEnum type = null;

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

  public InlineResponse2007Adress0 id(Integer id) {
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

  public InlineResponse2007Adress0 type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * \\\"dest\\\" si c'est un destinataire, \\\"exp\\\" si c'est un expéditeur
   * @return type
   **/
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public InlineResponse2007Adress0 civilite(String civilite) {
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

  public InlineResponse2007Adress0 nom(String nom) {
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

  public InlineResponse2007Adress0 prenom(String prenom) {
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

  public InlineResponse2007Adress0 societe(String societe) {
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

  public InlineResponse2007Adress0 adresse1(String adresse1) {
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

  public InlineResponse2007Adress0 adresse2(String adresse2) {
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

  public InlineResponse2007Adress0 adresse3(String adresse3) {
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

  public InlineResponse2007Adress0 cp(String cp) {
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

  public InlineResponse2007Adress0 ville(String ville) {
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

  public InlineResponse2007Adress0 pays(String pays) {
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
    InlineResponse2007Adress0 inlineResponse2007Adress0 = (InlineResponse2007Adress0) o;
    return Objects.equals(this.id, inlineResponse2007Adress0.id) &&
        Objects.equals(this.type, inlineResponse2007Adress0.type) &&
        Objects.equals(this.civilite, inlineResponse2007Adress0.civilite) &&
        Objects.equals(this.nom, inlineResponse2007Adress0.nom) &&
        Objects.equals(this.prenom, inlineResponse2007Adress0.prenom) &&
        Objects.equals(this.societe, inlineResponse2007Adress0.societe) &&
        Objects.equals(this.adresse1, inlineResponse2007Adress0.adresse1) &&
        Objects.equals(this.adresse2, inlineResponse2007Adress0.adresse2) &&
        Objects.equals(this.adresse3, inlineResponse2007Adress0.adresse3) &&
        Objects.equals(this.cp, inlineResponse2007Adress0.cp) &&
        Objects.equals(this.ville, inlineResponse2007Adress0.ville) &&
        Objects.equals(this.pays, inlineResponse2007Adress0.pays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, civilite, nom, prenom, societe, adresse1, adresse2, adresse3, cp, ville, pays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007Adress0 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
