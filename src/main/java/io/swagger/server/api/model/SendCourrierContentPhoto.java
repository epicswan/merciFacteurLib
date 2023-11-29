package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.Base64FilesSendCourrier;
import io.swagger.server.api.model.FilesSendCourrier;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Définition de photos, envoyer une chaine vide si pas de photo dans ce courrier (&#x3D;&#x27;&#x27;)
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class SendCourrierContentPhoto   {
  private FilesSendCourrier files = null;

  private Base64FilesSendCourrier base64files = null;

  private String tokenLibrary = null;

  public SendCourrierContentPhoto files(FilesSendCourrier files) {
    this.files = files;
    return this;
  }

  /**
   * Get files
   * @return files
   **/
    public FilesSendCourrier getFiles() {
    return files;
  }

  public void setFiles(FilesSendCourrier files) {
    this.files = files;
  }

  public SendCourrierContentPhoto base64files(Base64FilesSendCourrier base64files) {
    this.base64files = base64files;
    return this;
  }

  /**
   * Get base64files
   * @return base64files
   **/
    public Base64FilesSendCourrier getBase64files() {
    return base64files;
  }

  public void setBase64files(Base64FilesSendCourrier base64files) {
    this.base64files = base64files;
  }

  public SendCourrierContentPhoto tokenLibrary(String tokenLibrary) {
    this.tokenLibrary = tokenLibrary;
    return this;
  }

  /**
   * vide, ou token contenant les photos à envoyer (token retourné par /uploadFile)
   * @return tokenLibrary
   **/
    public String getTokenLibrary() {
    return tokenLibrary;
  }

  public void setTokenLibrary(String tokenLibrary) {
    this.tokenLibrary = tokenLibrary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCourrierContentPhoto sendCourrierContentPhoto = (SendCourrierContentPhoto) o;
    return Objects.equals(this.files, sendCourrierContentPhoto.files) &&
        Objects.equals(this.base64files, sendCourrierContentPhoto.base64files) &&
        Objects.equals(this.tokenLibrary, sendCourrierContentPhoto.tokenLibrary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, base64files, tokenLibrary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCourrierContentPhoto {\n");
    
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    base64files: ").append(toIndentedString(base64files)).append("\n");
    sb.append("    tokenLibrary: ").append(toIndentedString(tokenLibrary)).append("\n");
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
