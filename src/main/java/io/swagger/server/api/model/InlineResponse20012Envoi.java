package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse20012Detail;
import io.swagger.server.api.model.InlineResponse20012General;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse20012Envoi
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20012Envoi   {
  
  private List<InlineResponse20012General> general = null;

  
  private List<InlineResponse20012Detail> detail = null;

  public InlineResponse20012Envoi general(List<InlineResponse20012General> general) {
    this.general = general;
    return this;
  }

  public InlineResponse20012Envoi addGeneralItem(InlineResponse20012General generalItem) {
    if (this.general == null) {
      this.general = new ArrayList<InlineResponse20012General>();
    }
    this.general.add(generalItem);
    return this;
  }

  /**
   * Get general
   * @return general
   **/
    public List<InlineResponse20012General> getGeneral() {
    return general;
  }

  public void setGeneral(List<InlineResponse20012General> general) {
    this.general = general;
  }

  public InlineResponse20012Envoi detail(List<InlineResponse20012Detail> detail) {
    this.detail = detail;
    return this;
  }

  public InlineResponse20012Envoi addDetailItem(InlineResponse20012Detail detailItem) {
    if (this.detail == null) {
      this.detail = new ArrayList<InlineResponse20012Detail>();
    }
    this.detail.add(detailItem);
    return this;
  }

  /**
   * Get detail
   * @return detail
   **/
    public List<InlineResponse20012Detail> getDetail() {
    return detail;
  }

  public void setDetail(List<InlineResponse20012Detail> detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012Envoi inlineResponse20012Envoi = (InlineResponse20012Envoi) o;
    return Objects.equals(this.general, inlineResponse20012Envoi.general) &&
        Objects.equals(this.detail, inlineResponse20012Envoi.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(general, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012Envoi {\n");
    
    sb.append("    general: ").append(toIndentedString(general)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
