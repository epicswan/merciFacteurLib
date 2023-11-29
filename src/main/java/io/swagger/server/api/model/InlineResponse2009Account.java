package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.server.api.model.InlineResponse2009AccountPages;
import io.swagger.v3.oas.annotations.media.Schema;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Etat de votre compte après cet envoi
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse2009Account   {
  private InlineResponse2009AccountPages pages = null;

  public InlineResponse2009Account pages(InlineResponse2009AccountPages pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Get pages
   * @return pages
   **/
    public InlineResponse2009AccountPages getPages() {
    return pages;
  }

  public void setPages(InlineResponse2009AccountPages pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009Account inlineResponse2009Account = (InlineResponse2009Account) o;
    return Objects.equals(this.pages, inlineResponse2009Account.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009Account {\n");
    
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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
