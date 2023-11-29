package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20011Amount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Informations générales des courriers de cet envoi
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20012General   {
  private Integer idEnvoi = null;

  private String statut = null;

  private Integer nbPage = null;

  private Integer nbDest = null;

  private String modeEnvoi = null;

  private Integer date = null;

  private Integer idExp = null;

  
  private List<Integer> idDest = null;

  
  private List<InlineResponse20011Amount> amount = null;

  public InlineResponse20012General idEnvoi(Integer idEnvoi) {
    this.idEnvoi = idEnvoi;
    return this;
  }

  /**
   * Id de l'envoi
   * @return idEnvoi
   **/
    public Integer getIdEnvoi() {
    return idEnvoi;
  }

  public void setIdEnvoi(Integer idEnvoi) {
    this.idEnvoi = idEnvoi;
  }

  public InlineResponse20012General statut(String statut) {
    this.statut = statut;
    return this;
  }

  /**
   * Statut de l'envoi
   * @return statut
   **/
    public String getStatut() {
    return statut;
  }

  public void setStatut(String statut) {
    this.statut = statut;
  }

  public InlineResponse20012General nbPage(Integer nbPage) {
    this.nbPage = nbPage;
    return this;
  }

  /**
   * Nb page de chaque courrier de l'envoi
   * @return nbPage
   **/
    public Integer getNbPage() {
    return nbPage;
  }

  public void setNbPage(Integer nbPage) {
    this.nbPage = nbPage;
  }

  public InlineResponse20012General nbDest(Integer nbDest) {
    this.nbDest = nbDest;
    return this;
  }

  /**
   * Nombre de destinataires de l'envoi (=nombre de courriers)
   * @return nbDest
   **/
    public Integer getNbDest() {
    return nbDest;
  }

  public void setNbDest(Integer nbDest) {
    this.nbDest = nbDest;
  }

  public InlineResponse20012General modeEnvoi(String modeEnvoi) {
    this.modeEnvoi = modeEnvoi;
    return this;
  }

  /**
   * Mode d'envoi (lrar, lrare, suivi, normal)
   * @return modeEnvoi
   **/
    public String getModeEnvoi() {
    return modeEnvoi;
  }

  public void setModeEnvoi(String modeEnvoi) {
    this.modeEnvoi = modeEnvoi;
  }

  public InlineResponse20012General date(Integer date) {
    this.date = date;
    return this;
  }

  /**
   * Date de l'envoi au format timestamp
   * @return date
   **/
    public Integer getDate() {
    return date;
  }

  public void setDate(Integer date) {
    this.date = date;
  }

  public InlineResponse20012General idExp(Integer idExp) {
    this.idExp = idExp;
    return this;
  }

  /**
   * adresse Id de l'adresse d'expéditeur
   * @return idExp
   **/
    public Integer getIdExp() {
    return idExp;
  }

  public void setIdExp(Integer idExp) {
    this.idExp = idExp;
  }

  public InlineResponse20012General idDest(List<Integer> idDest) {
    this.idDest = idDest;
    return this;
  }

  public InlineResponse20012General addIdDestItem(Integer idDestItem) {
    if (this.idDest == null) {
      this.idDest = new ArrayList<Integer>();
    }
    this.idDest.add(idDestItem);
    return this;
  }

  /**
   * adresse Id de/des l'adresse(s) de destinataire(s)
   * @return idDest
   **/
    public List<Integer> getIdDest() {
    return idDest;
  }

  public void setIdDest(List<Integer> idDest) {
    this.idDest = idDest;
  }

  public InlineResponse20012General amount(List<InlineResponse20011Amount> amount) {
    this.amount = amount;
    return this;
  }

  public InlineResponse20012General addAmountItem(InlineResponse20011Amount amountItem) {
    if (this.amount == null) {
      this.amount = new ArrayList<InlineResponse20011Amount>();
    }
    this.amount.add(amountItem);
    return this;
  }

  /**
   * Résumé du montant facturé par Merci facteur
   * @return amount
   **/
    public List<InlineResponse20011Amount> getAmount() {
    return amount;
  }

  public void setAmount(List<InlineResponse20011Amount> amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012General inlineResponse20012General = (InlineResponse20012General) o;
    return Objects.equals(this.idEnvoi, inlineResponse20012General.idEnvoi) &&
        Objects.equals(this.statut, inlineResponse20012General.statut) &&
        Objects.equals(this.nbPage, inlineResponse20012General.nbPage) &&
        Objects.equals(this.nbDest, inlineResponse20012General.nbDest) &&
        Objects.equals(this.modeEnvoi, inlineResponse20012General.modeEnvoi) &&
        Objects.equals(this.date, inlineResponse20012General.date) &&
        Objects.equals(this.idExp, inlineResponse20012General.idExp) &&
        Objects.equals(this.idDest, inlineResponse20012General.idDest) &&
        Objects.equals(this.amount, inlineResponse20012General.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEnvoi, statut, nbPage, nbDest, modeEnvoi, date, idExp, idDest, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012General {\n");
    
    sb.append("    idEnvoi: ").append(toIndentedString(idEnvoi)).append("\n");
    sb.append("    statut: ").append(toIndentedString(statut)).append("\n");
    sb.append("    nbPage: ").append(toIndentedString(nbPage)).append("\n");
    sb.append("    nbDest: ").append(toIndentedString(nbDest)).append("\n");
    sb.append("    modeEnvoi: ").append(toIndentedString(modeEnvoi)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    idExp: ").append(toIndentedString(idExp)).append("\n");
    sb.append("    idDest: ").append(toIndentedString(idDest)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
