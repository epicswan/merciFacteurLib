package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * object avec, pour chaque pays demandé, le montant de l&#x27;affranchissement et la zone géographique
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20010Content   {
  private String photoHt = null;

  private String lettreHt = null;

  private String carteHt = null;

  private String totalContentHt = null;

  public InlineResponse20010Content photoHt(String photoHt) {
    this.photoHt = photoHt;
    return this;
  }

  /**
   * montant HT des photos
   * @return photoHt
   **/
    public String getPhotoHt() {
    return photoHt;
  }

  public void setPhotoHt(String photoHt) {
    this.photoHt = photoHt;
  }

  public InlineResponse20010Content lettreHt(String lettreHt) {
    this.lettreHt = lettreHt;
    return this;
  }

  /**
   * montant HT des pages de lettres
   * @return lettreHt
   **/
    public String getLettreHt() {
    return lettreHt;
  }

  public void setLettreHt(String lettreHt) {
    this.lettreHt = lettreHt;
  }

  public InlineResponse20010Content carteHt(String carteHt) {
    this.carteHt = carteHt;
    return this;
  }

  /**
   * montant HT de la carte
   * @return carteHt
   **/
    public String getCarteHt() {
    return carteHt;
  }

  public void setCarteHt(String carteHt) {
    this.carteHt = carteHt;
  }

  public InlineResponse20010Content totalContentHt(String totalContentHt) {
    this.totalContentHt = totalContentHt;
    return this;
  }

  /**
   * montant HT du contenu du courrier
   * @return totalContentHt
   **/
    public String getTotalContentHt() {
    return totalContentHt;
  }

  public void setTotalContentHt(String totalContentHt) {
    this.totalContentHt = totalContentHt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010Content inlineResponse20010Content = (InlineResponse20010Content) o;
    return Objects.equals(this.photoHt, inlineResponse20010Content.photoHt) &&
        Objects.equals(this.lettreHt, inlineResponse20010Content.lettreHt) &&
        Objects.equals(this.carteHt, inlineResponse20010Content.carteHt) &&
        Objects.equals(this.totalContentHt, inlineResponse20010Content.totalContentHt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(photoHt, lettreHt, carteHt, totalContentHt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010Content {\n");
    
    sb.append("    photoHt: ").append(toIndentedString(photoHt)).append("\n");
    sb.append("    lettreHt: ").append(toIndentedString(lettreHt)).append("\n");
    sb.append("    carteHt: ").append(toIndentedString(carteHt)).append("\n");
    sb.append("    totalContentHt: ").append(toIndentedString(totalContentHt)).append("\n");
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
