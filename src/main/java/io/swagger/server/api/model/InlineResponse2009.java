package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse2009Account;
import io.swagger.server.api.model.InlineResponse2009Price;
import io.swagger.server.api.model.InlineResponse2009Resume;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse2009
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2009   {
  private Boolean success = null;

  private String error = null;

  
  private List<Integer> envoiId = null;

  private InlineResponse2009Price price = null;

  private InlineResponse2009Resume resume = null;

  private InlineResponse2009Account account = null;

  public InlineResponse2009 success(Boolean success) {
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

  public InlineResponse2009 error(String error) {
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

  public InlineResponse2009 envoiId(List<Integer> envoiId) {
    this.envoiId = envoiId;
    return this;
  }

  public InlineResponse2009 addEnvoiIdItem(Integer envoiIdItem) {
    if (this.envoiId == null) {
      this.envoiId = new ArrayList<Integer>();
    }
    this.envoiId.add(envoiIdItem);
    return this;
  }

  /**
   * L'Id de cet envoi
   * @return envoiId
   **/
    public List<Integer> getEnvoiId() {
    return envoiId;
  }

  public void setEnvoiId(List<Integer> envoiId) {
    this.envoiId = envoiId;
  }

  public InlineResponse2009 price(InlineResponse2009Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
    public InlineResponse2009Price getPrice() {
    return price;
  }

  public void setPrice(InlineResponse2009Price price) {
    this.price = price;
  }

  public InlineResponse2009 resume(InlineResponse2009Resume resume) {
    this.resume = resume;
    return this;
  }

  /**
   * Get resume
   * @return resume
   **/
    public InlineResponse2009Resume getResume() {
    return resume;
  }

  public void setResume(InlineResponse2009Resume resume) {
    this.resume = resume;
  }

  public InlineResponse2009 account(InlineResponse2009Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   **/
    public InlineResponse2009Account getAccount() {
    return account;
  }

  public void setAccount(InlineResponse2009Account account) {
    this.account = account;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009 inlineResponse2009 = (InlineResponse2009) o;
    return Objects.equals(this.success, inlineResponse2009.success) &&
        Objects.equals(this.error, inlineResponse2009.error) &&
        Objects.equals(this.envoiId, inlineResponse2009.envoiId) &&
        Objects.equals(this.price, inlineResponse2009.price) &&
        Objects.equals(this.resume, inlineResponse2009.resume) &&
        Objects.equals(this.account, inlineResponse2009.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, envoiId, price, resume, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    envoiId: ").append(toIndentedString(envoiId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    resume: ").append(toIndentedString(resume)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
