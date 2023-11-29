package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse2009PriceDetail
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2009PriceDetail   {
  private String affranchissement = null;

  private String letter = null;

  private String card = null;

  public InlineResponse2009PriceDetail affranchissement(String affranchissement) {
    this.affranchissement = affranchissement;
    return this;
  }

  /**
   * Montant total de l'affranchissement (ht, tva=0)
   * @return affranchissement
   **/
    public String getAffranchissement() {
    return affranchissement;
  }

  public void setAffranchissement(String affranchissement) {
    this.affranchissement = affranchissement;
  }

  public InlineResponse2009PriceDetail letter(String letter) {
    this.letter = letter;
    return this;
  }

  /**
   * Montant total du contenu lettres (ht, tva=tx standard)
   * @return letter
   **/
    public String getLetter() {
    return letter;
  }

  public void setLetter(String letter) {
    this.letter = letter;
  }

  public InlineResponse2009PriceDetail card(String card) {
    this.card = card;
    return this;
  }

  /**
   * Montant total du contenu cartes (ht, tva=tx standard)
   * @return card
   **/
    public String getCard() {
    return card;
  }

  public void setCard(String card) {
    this.card = card;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009PriceDetail inlineResponse2009PriceDetail = (InlineResponse2009PriceDetail) o;
    return Objects.equals(this.affranchissement, inlineResponse2009PriceDetail.affranchissement) &&
        Objects.equals(this.letter, inlineResponse2009PriceDetail.letter) &&
        Objects.equals(this.card, inlineResponse2009PriceDetail.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affranchissement, letter, card);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009PriceDetail {\n");
    
    sb.append("    affranchissement: ").append(toIndentedString(affranchissement)).append("\n");
    sb.append("    letter: ").append(toIndentedString(letter)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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
