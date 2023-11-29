package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * UploadFileBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class UploadFileBody   {
  private Integer idUser = null;

  private String token = null;

  /**
   * produit envoyé (photo).
   */
  public enum ProductEnum {
    PHOTO("photo");

    private String value;

    ProductEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProductEnum fromValue(String value) {
      for (ProductEnum b : ProductEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private ProductEnum product = null;

  /**
   * Type de fichier envoyé (url ou base64).
   */
  public enum TypeEnum {
    URL("url"),
    BASE64("base64");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

  }
  private TypeEnum type = null;

  private String file = null;

  public UploadFileBody idUser(Integer idUser) {
    this.idUser = idUser;
    return this;
  }

  /**
   * user ID de l'utilisateur qui envoi le courrier
   * @return idUser
   **/
    public Integer getIdUser() {
    return idUser;
  }

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
  }

  public UploadFileBody token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Token du groupe de fichiers à envoyer. Laisser vide lors du premier appel, un Token vous sera retourné et vous pourrez l'utiliser pour les fichiers suivants.
   * @return token
   **/
    public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public UploadFileBody product(ProductEnum product) {
    this.product = product;
    return this;
  }

  /**
   * produit envoyé (photo).
   * @return product
   **/
    public ProductEnum getProduct() {
    return product;
  }

  public void setProduct(ProductEnum product) {
    this.product = product;
  }

  public UploadFileBody type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type de fichier envoyé (url ou base64).
   * @return type
   **/
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public UploadFileBody file(String file) {
    this.file = file;
    return this;
  }

  /**
   * Le fichier à envoyer (une url ou une base64).
   * @return file
   **/
    public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadFileBody uploadFileBody = (UploadFileBody) o;
    return Objects.equals(this.idUser, uploadFileBody.idUser) &&
        Objects.equals(this.token, uploadFileBody.token) &&
        Objects.equals(this.product, uploadFileBody.product) &&
        Objects.equals(this.type, uploadFileBody.type) &&
        Objects.equals(this.file, uploadFileBody.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUser, token, product, type, file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadFileBody {\n");
    
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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
