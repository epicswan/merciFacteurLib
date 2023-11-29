package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * UpdateUserBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class UpdateUserBody   {
  private String emailUser = null;

  private String firstName = null;

  private String lastName = null;

  public UpdateUserBody emailUser(String emailUser) {
    this.emailUser = emailUser;
    return this;
  }

  /**
   * Email de l'utilisateur. Peut être fictif mais doit être unique et vous permettre d'identifier l'utilisateur.
   * @return emailUser
   **/
    public String getEmailUser() {
    return emailUser;
  }

  public void setEmailUser(String emailUser) {
    this.emailUser = emailUser;
  }

  public UpdateUserBody firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Prénom de l'utilisateur, vous permet de savoir qui est tel utilisateur.
   * @return firstName
   **/
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UpdateUserBody lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Nom de l'utilisateur, vous permet de savoir qui est tel utilisateur.
   * @return lastName
   **/
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserBody updateUserBody = (UpdateUserBody) o;
    return Objects.equals(this.emailUser, updateUserBody.emailUser) &&
        Objects.equals(this.firstName, updateUserBody.firstName) &&
        Objects.equals(this.lastName, updateUserBody.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailUser, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserBody {\n");
    
    sb.append("    emailUser: ").append(toIndentedString(emailUser)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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
