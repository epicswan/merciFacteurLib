package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * InlineResponse200
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse200   {
  private Boolean success = null;

  private String error = null;

  private String token = null;

  private Integer expire = null;

  public InlineResponse200 success(Boolean success) {
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

  public InlineResponse200 error(String error) {
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

  public InlineResponse200 token(String token) {
    this.token = token;
    return this;
  }

  /**
   * l'access token à conserver en local tant qu'il est valide
   * @return token
   **/
    public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public InlineResponse200 expire(Integer expire) {
    this.expire = expire;
    return this;
  }

  /**
   * timestamp de la date d'expiration du token
   * @return expire
   **/
    public Integer getExpire() {
    return expire;
  }

  public void setExpire(Integer expire) {
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
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.success, inlineResponse200.success) &&
        Objects.equals(this.error, inlineResponse200.error) &&
        Objects.equals(this.token, inlineResponse200.token) &&
        Objects.equals(this.expire, inlineResponse200.expire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error, token, expire);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
