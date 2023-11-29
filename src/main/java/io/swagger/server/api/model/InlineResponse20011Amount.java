package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20011Contenu;
import io.swagger.server.api.model.InlineResponse20011Total;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20011Amount
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20011Amount   {
  
  private List<InlineResponse20011Contenu> contenu = null;

  private String affranchissement = null;

  
  private List<InlineResponse20011Total> total = null;

  public InlineResponse20011Amount contenu(List<InlineResponse20011Contenu> contenu) {
    this.contenu = contenu;
    return this;
  }

  public InlineResponse20011Amount addContenuItem(InlineResponse20011Contenu contenuItem) {
    if (this.contenu == null) {
      this.contenu = new ArrayList<InlineResponse20011Contenu>();
    }
    this.contenu.add(contenuItem);
    return this;
  }

  /**
   * Get contenu
   * @return contenu
   **/
    public List<InlineResponse20011Contenu> getContenu() {
    return contenu;
  }

  public void setContenu(List<InlineResponse20011Contenu> contenu) {
    this.contenu = contenu;
  }

  public InlineResponse20011Amount affranchissement(String affranchissement) {
    this.affranchissement = affranchissement;
    return this;
  }

  /**
   * Sous-total de l'affranchissement
   * @return affranchissement
   **/
    public String getAffranchissement() {
    return affranchissement;
  }

  public void setAffranchissement(String affranchissement) {
    this.affranchissement = affranchissement;
  }

  public InlineResponse20011Amount total(List<InlineResponse20011Total> total) {
    this.total = total;
    return this;
  }

  public InlineResponse20011Amount addTotalItem(InlineResponse20011Total totalItem) {
    if (this.total == null) {
      this.total = new ArrayList<InlineResponse20011Total>();
    }
    this.total.add(totalItem);
    return this;
  }

  /**
   * Montant total facturé
   * @return total
   **/
    public List<InlineResponse20011Total> getTotal() {
    return total;
  }

  public void setTotal(List<InlineResponse20011Total> total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011Amount inlineResponse20011Amount = (InlineResponse20011Amount) o;
    return Objects.equals(this.contenu, inlineResponse20011Amount.contenu) &&
        Objects.equals(this.affranchissement, inlineResponse20011Amount.affranchissement) &&
        Objects.equals(this.total, inlineResponse20011Amount.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contenu, affranchissement, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011Amount {\n");
    
    sb.append("    contenu: ").append(toIndentedString(contenu)).append("\n");
    sb.append("    affranchissement: ").append(toIndentedString(affranchissement)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
