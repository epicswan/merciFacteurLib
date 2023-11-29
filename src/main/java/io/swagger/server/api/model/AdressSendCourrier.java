package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Les Id des adresses d&#x27;expéditeur et de destinataire (1 expéditeur, 1 ou plusieurs destinataires). OU directement les adresses dans un objet si vous ne souhaitez pas utiliser le carnet d&#x27;adresses (plus d&#x27;infos ici : https://github.com/MerciFacteur/Merci-facteur-API#format-des-adresses-lors-de-lenvoi-dun-courrier-).
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class AdressSendCourrier   {
  private String exp = null;

  
  private List<String> dest = null;

  public AdressSendCourrier exp(String exp) {
    this.exp = exp;
    return this;
  }

  /**
   * Indiquez ici l'id de l'expéditeur OU un object contenant directement l'adresse de l'expéditeur.
   * @return exp
   **/
    public String getExp() {
    return exp;
  }

  public void setExp(String exp) {
    this.exp = exp;
  }

  public AdressSendCourrier dest(List<String> dest) {
    this.dest = dest;
    return this;
  }

  public AdressSendCourrier addDestItem(String destItem) {
    if (this.dest == null) {
      this.dest = new ArrayList<String>();
    }
    this.dest.add(destItem);
    return this;
  }

  /**
   * Indiquez ici un tableau avec les ID des destinataires OU un tableau d'objects contenant directement les adresses des destinataires.
   * @return dest
   **/
    public List<String> getDest() {
    return dest;
  }

  public void setDest(List<String> dest) {
    this.dest = dest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdressSendCourrier adressSendCourrier = (AdressSendCourrier) o;
    return Objects.equals(this.exp, adressSendCourrier.exp) &&
        Objects.equals(this.dest, adressSendCourrier.dest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exp, dest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdressSendCourrier {\n");
    
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
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
