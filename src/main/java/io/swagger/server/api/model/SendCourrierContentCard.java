package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.server.api.model.SendCourrierContentCardText;
import io.swagger.server.api.model.SendCourrierContentCardVisuel;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Définition du contenu de la carte, envoyer une chaine vide si pas de carte dans ce courrier (&#x3D;&#x27;&#x27;)
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class SendCourrierContentCard   {
  /**
   * Format de la carte : postcard, naked-postcard, classic, folded, large, large-a4
   */
  public enum FormatEnum {
    POSTCARD("postcard"),
    NAKED_POSTCARD("naked-postcard"),
    CLASSIC("classic"),
    FOLDED("folded"),
    LARGE("large"),
    LARGE_A4("large-a4");

    private String value;

    FormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private FormatEnum format = null;

  private SendCourrierContentCardVisuel visuel = null;

  private SendCourrierContentCardText text = null;

  /**
   * Type de coins de la carte (arrondi ou carre)
   */
  public enum CoinEnum {
    ARRONDI("arrondi"),
    CARRE("carre");

    private String value;

    CoinEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CoinEnum fromValue(String value) {
      for (CoinEnum b : CoinEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private CoinEnum coin = null;

  /**
   * Type de papier de la carte (classic, nacre ou creation)
   */
  public enum PapierEnum {
    CLASSIC("classic"),
    NACRE("nacre"),
    CREATION("creation");

    private String value;

    PapierEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PapierEnum fromValue(String value) {
      for (PapierEnum b : PapierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private PapierEnum papier = null;

  public SendCourrierContentCard format(FormatEnum format) {
    this.format = format;
    return this;
  }

  /**
   * Format de la carte : postcard, naked-postcard, classic, folded, large, large-a4
   * @return format
   **/
    public FormatEnum getFormat() {
    return format;
  }

  public void setFormat(FormatEnum format) {
    this.format = format;
  }

  public SendCourrierContentCard visuel(SendCourrierContentCardVisuel visuel) {
    this.visuel = visuel;
    return this;
  }

  /**
   * Get visuel
   * @return visuel
   **/
    public SendCourrierContentCardVisuel getVisuel() {
    return visuel;
  }

  public void setVisuel(SendCourrierContentCardVisuel visuel) {
    this.visuel = visuel;
  }

  public SendCourrierContentCard text(SendCourrierContentCardText text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
   **/
    public SendCourrierContentCardText getText() {
    return text;
  }

  public void setText(SendCourrierContentCardText text) {
    this.text = text;
  }

  public SendCourrierContentCard coin(CoinEnum coin) {
    this.coin = coin;
    return this;
  }

  /**
   * Type de coins de la carte (arrondi ou carre)
   * @return coin
   **/
    public CoinEnum getCoin() {
    return coin;
  }

  public void setCoin(CoinEnum coin) {
    this.coin = coin;
  }

  public SendCourrierContentCard papier(PapierEnum papier) {
    this.papier = papier;
    return this;
  }

  /**
   * Type de papier de la carte (classic, nacre ou creation)
   * @return papier
   **/
    public PapierEnum getPapier() {
    return papier;
  }

  public void setPapier(PapierEnum papier) {
    this.papier = papier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCourrierContentCard sendCourrierContentCard = (SendCourrierContentCard) o;
    return Objects.equals(this.format, sendCourrierContentCard.format) &&
        Objects.equals(this.visuel, sendCourrierContentCard.visuel) &&
        Objects.equals(this.text, sendCourrierContentCard.text) &&
        Objects.equals(this.coin, sendCourrierContentCard.coin) &&
        Objects.equals(this.papier, sendCourrierContentCard.papier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, visuel, text, coin, papier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCourrierContentCard {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    visuel: ").append(toIndentedString(visuel)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    coin: ").append(toIndentedString(coin)).append("\n");
    sb.append("    papier: ").append(toIndentedString(papier)).append("\n");
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
