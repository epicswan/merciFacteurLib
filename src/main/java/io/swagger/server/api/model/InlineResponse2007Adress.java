package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse2007Adress0;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Chaque adresse listée sous une clé correspondant à son ID
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2007Adress   {
  private InlineResponse2007Adress0 _0 = null;

  public InlineResponse2007Adress _0(InlineResponse2007Adress0 _0) {
    this._0 = _0;
    return this;
  }

  /**
   * Get _0
   * @return _0
   **/
    public InlineResponse2007Adress0 get0() {
    return _0;
  }

  public void set0(InlineResponse2007Adress0 _0) {
    this._0 = _0;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007Adress inlineResponse2007Adress = (InlineResponse2007Adress) o;
    return Objects.equals(this._0, inlineResponse2007Adress._0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007Adress {\n");
    
    sb.append("    _0: ").append(toIndentedString(_0)).append("\n");
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
