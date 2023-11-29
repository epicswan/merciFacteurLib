package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Infos sur le plan souscrit
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20018QuotasPlan   {
  private String name = null;

  private String expire = null;

  public InlineResponse20018QuotasPlan name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nom du plan actuellement souscrit
   * @return name
   **/
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse20018QuotasPlan expire(String expire) {
    this.expire = expire;
    return this;
  }

  /**
   * date d'expiration au format Y-m-d H:i:s
   * @return expire
   **/
    public String getExpire() {
    return expire;
  }

  public void setExpire(String expire) {
    this.expire = expire;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20018QuotasPlan inlineResponse20018QuotasPlan = (InlineResponse20018QuotasPlan) o;
    return Objects.equals(this.name, inlineResponse20018QuotasPlan.name) &&
        Objects.equals(this.expire, inlineResponse20018QuotasPlan.expire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, expire);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20018QuotasPlan {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
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
