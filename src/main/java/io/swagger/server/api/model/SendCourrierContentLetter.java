package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.server.api.model.Base64FilesSendCourrier;
import io.swagger.server.api.model.FilesSendCourrier;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Définition du contenu de la lettre, envoyer une chaine vide si pas de lettre dans ce courrier (&#x3D;&#x27;&#x27;)
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class SendCourrierContentLetter   {
  private FilesSendCourrier files = null;

  private Base64FilesSendCourrier base64files = null;

  private String finalFilename = null;

  /**
   * rectoverso si vous souhaitez une impression recto/verso, ou recto si vous souhaitez une impression recto simple, ou distinctrectoverso si vous souhaitez une impression recto/verso et que nous insérions une page blanche après les fichiers au nombre de pages impair.
   */
  public enum PrintSidesEnum {
    RECTO("recto"),
    RECTOVERSO("rectoverso"),
    DISTINCTRECTOVERSO("distinctrectoverso");

    private String value;

    PrintSidesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrintSidesEnum fromValue(String value) {
      for (PrintSidesEnum b : PrintSidesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private PrintSidesEnum printSides = null;

  public SendCourrierContentLetter files(FilesSendCourrier files) {
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

  public SendCourrierContentLetter base64files(Base64FilesSendCourrier base64files) {
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

  public SendCourrierContentLetter finalFilename(String finalFilename) {
    this.finalFilename = finalFilename;
    return this;
  }

  /**
   * Facultatif, maximum 50 caractères, vous pouvez spécifier le nom de fichier que vous souhaitez pour votre lettre. Ne mettez pas d''extension, '.pdf' sera ajouté à la fin. Il sera visible dans votre interface Merci facteur Pro pour faciliter vos recherches. Dans le cas d'envois recommandés électroniques (ERE), ce nom de fichier sera visible par le destinataire.
   * @return finalFilename
   **/
    public String getFinalFilename() {
    return finalFilename;
  }

  public void setFinalFilename(String finalFilename) {
    this.finalFilename = finalFilename;
  }

  public SendCourrierContentLetter printSides(PrintSidesEnum printSides) {
    this.printSides = printSides;
    return this;
  }

  /**
   * rectoverso si vous souhaitez une impression recto/verso, ou recto si vous souhaitez une impression recto simple, ou distinctrectoverso si vous souhaitez une impression recto/verso et que nous insérions une page blanche après les fichiers au nombre de pages impair.
   * @return printSides
   **/
    public PrintSidesEnum getPrintSides() {
    return printSides;
  }

  public void setPrintSides(PrintSidesEnum printSides) {
    this.printSides = printSides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCourrierContentLetter sendCourrierContentLetter = (SendCourrierContentLetter) o;
    return Objects.equals(this.files, sendCourrierContentLetter.files) &&
        Objects.equals(this.base64files, sendCourrierContentLetter.base64files) &&
        Objects.equals(this.finalFilename, sendCourrierContentLetter.finalFilename) &&
        Objects.equals(this.printSides, sendCourrierContentLetter.printSides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, base64files, finalFilename, printSides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCourrierContentLetter {\n");
    
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    base64files: ").append(toIndentedString(base64files)).append("\n");
    sb.append("    finalFilename: ").append(toIndentedString(finalFilename)).append("\n");
    sb.append("    printSides: ").append(toIndentedString(printSides)).append("\n");
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
