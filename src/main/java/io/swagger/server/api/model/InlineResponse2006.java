package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse2006Adress;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse2006
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2006   {
  private Boolean success = null;

  private String error = null;

  
  private List<InlineResponse2006Adress> adress = null;

  public InlineResponse2006 success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
   **/
    public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public InlineResponse2006 error(String error) {
    this.error = error;
    return this;
  }

  /**
   * le code d'erreur en cas d'erreur
   * @return error
   **/
    public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public InlineResponse2006 adress(List<InlineResponse2006Adress> adress) {
    this.adress = adress;
    return this;
  }

  public InlineResponse2006 addAdressItem(InlineResponse2006Adress adressItem) {
    if (this.adress == null) {
      this.adress = new ArrayList<InlineResponse2006Adress>();
    }
    this.adress.add(adressItem);
    return this;
  }

  /**
   * Get adress
   * @return adress
   **/
    public List<InlineResponse2006Adress> getAdress() {
    return adress;
  }

  public void setAdress(List<InlineResponse2006Adress> adress) {
    this.adress = adress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(this.success, inlineResponse2006.success) &&
        Objects.equals(this.error, inlineResponse2006.error) &&
        Objects.equals(this.adress, inlineResponse2006.adress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, adress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    adress: ").append(toIndentedString(adress)).append("\n");
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
