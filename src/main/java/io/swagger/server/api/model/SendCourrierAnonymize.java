package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Facultatif, permet de demander la suppression d\\&#x27;éléments du courrier un certain délai (en nombre de jours) après l\\&#x27;impression du courrier. A utiliser si vous ne souhaitez pas que les données des courriers soient conservées sur les serveurs de Merci Facteur. Exemple de valeur : {\&quot;delay\&quot;:15,\&quot;target\&quot;:[\&quot;content\&quot;,\&quot;exp\&quot;,\&quot;dest\&quot;]} (plus d\\&#x27;infos ici : https://github.com/MerciFacteur/Merci-facteur-API/#anonymisation)
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class SendCourrierAnonymize   {
  private Integer delay = 10;

  /**
   * Gets or Sets target
   */
  public enum TargetEnum {
    EXP("exp"),
    DEST("dest"),
    CONTENT("content");

    private String value;

    TargetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TargetEnum fromValue(String value) {
      for (TargetEnum b : TargetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  
  private List<TargetEnum> target = null;

  public SendCourrierAnonymize delay(Integer delay) {
    this.delay = delay;
    return this;
  }

  /**
   * Délai en nombre de jours (min. 1, max. 400) à compter de l'impression, après lesquels vous souhaitez que l'anonymisation ai lieu.
   * @return delay
   **/
    public Integer getDelay() {
    return delay;
  }

  public void setDelay(Integer delay) {
    this.delay = delay;
  }

  public SendCourrierAnonymize target(List<TargetEnum> target) {
    this.target = target;
    return this;
  }

  public SendCourrierAnonymize addTargetItem(TargetEnum targetItem) {
    if (this.target == null) {
      this.target = new ArrayList<TargetEnum>();
    }
    this.target.add(targetItem);
    return this;
  }

  /**
   * Délai en nombre de jours (min. 1, max. 400) à compter de l'impression, après lesquels vous souhaitez que l'anonymisation ai lieu.
   * @return target
   **/
    public List<TargetEnum> getTarget() {
    return target;
  }

  public void setTarget(List<TargetEnum> target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCourrierAnonymize sendCourrierAnonymize = (SendCourrierAnonymize) o;
    return Objects.equals(this.delay, sendCourrierAnonymize.delay) &&
        Objects.equals(this.target, sendCourrierAnonymize.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delay, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCourrierAnonymize {\n");
    
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
