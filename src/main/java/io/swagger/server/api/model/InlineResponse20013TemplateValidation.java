package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.vertx.core.json.JsonObject;
import io.vertx.codegen.annotations.DataObject;
/**
 * Les informations du template. Il convient de contrôler les champs de fusion extraits pour vous assurer qu&#x27;il n&#x27;y a pas d&#x27;erreur.
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaVertXServerCodegen", date = "2023-11-23T15:20:49.976322699Z[GMT]")



public class InlineResponse20013TemplateValidation   {
  private Integer timeTemplate = null;

  private String template = null;

  
  private List<String> inputs = null;

  private String key = null;

  private Integer nbPage = null;

  public InlineResponse20013TemplateValidation timeTemplate(Integer timeTemplate) {
    this.timeTemplate = timeTemplate;
    return this;
  }

  /**
   * timestamp du template (ne pas modifier)
   * @return timeTemplate
   **/
    public Integer getTimeTemplate() {
    return timeTemplate;
  }

  public void setTimeTemplate(Integer timeTemplate) {
    this.timeTemplate = timeTemplate;
  }

  public InlineResponse20013TemplateValidation template(String template) {
    this.template = template;
    return this;
  }

  /**
   * identifiant du template (ne pas modifier)
   * @return template
   **/
    public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public InlineResponse20013TemplateValidation inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public InlineResponse20013TemplateValidation addInputsItem(String inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<String>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * champs de fusion détectés (important : à contrôler)
   * @return inputs
   **/
    public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public InlineResponse20013TemplateValidation key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Clé de validation du template (ne pas modifier)
   * @return key
   **/
    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public InlineResponse20013TemplateValidation nbPage(Integer nbPage) {
    this.nbPage = nbPage;
    return this;
  }

  /**
   * Nombre de page(s) détectée(s) dans la lettre (important : à contrôler)
   * @return nbPage
   **/
    public Integer getNbPage() {
    return nbPage;
  }

  public void setNbPage(Integer nbPage) {
    this.nbPage = nbPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013TemplateValidation inlineResponse20013TemplateValidation = (InlineResponse20013TemplateValidation) o;
    return Objects.equals(this.timeTemplate, inlineResponse20013TemplateValidation.timeTemplate) &&
        Objects.equals(this.template, inlineResponse20013TemplateValidation.template) &&
        Objects.equals(this.inputs, inlineResponse20013TemplateValidation.inputs) &&
        Objects.equals(this.key, inlineResponse20013TemplateValidation.key) &&
        Objects.equals(this.nbPage, inlineResponse20013TemplateValidation.nbPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeTemplate, template, inputs, key, nbPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013TemplateValidation {\n");
    
    sb.append("    timeTemplate: ").append(toIndentedString(timeTemplate)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    nbPage: ").append(toIndentedString(nbPage)).append("\n");
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
