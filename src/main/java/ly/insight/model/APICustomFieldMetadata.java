package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import ly.insight.model.APICustomFieldOption;
import java.io.Serializable;

/**
 * APICustomFieldMetadata
 */
@ApiModel(description = "APICustomFieldMetadata")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APICustomFieldMetadata implements Serializable {
  @SerializedName("CUSTOM_FIELD_ID")
  private String CUSTOM_FIELD_ID = null;

  @SerializedName("ORDER_ID")
  private Long ORDER_ID = null;

  @SerializedName("FIELD_FOR")
  private String FIELD_FOR = null;

  @SerializedName("FIELD_NAME")
  private String FIELD_NAME = null;

  @SerializedName("FIELD_TYPE")
  private String FIELD_TYPE = null;

  @SerializedName("FIELD_HELP_TEXT")
  private String FIELD_HELP_TEXT = null;

  @SerializedName("DEFAULT_VALUE")
  private Object DEFAULT_VALUE = null;

  @SerializedName("GROUP_ID")
  private Long GROUP_ID = null;

  @SerializedName("EDITABLE")
  private Boolean EDITABLE = null;

  @SerializedName("VISIBLE")
  private Boolean VISIBLE = null;

  @SerializedName("CUSTOM_FIELD_OPTIONS")
  private List<APICustomFieldOption> CUSTOM_FIELD_OPTIONS = new ArrayList<APICustomFieldOption>();

  public APICustomFieldMetadata CUSTOM_FIELD_ID(String CUSTOM_FIELD_ID) {
    this.CUSTOM_FIELD_ID = CUSTOM_FIELD_ID;
    return this;
  }

   /**
   * Unique ID for the custom field record
   * @return CUSTOM_FIELD_ID
  **/
  @ApiModelProperty(example = "null", required = true, value = "Unique ID for the custom field record")
  public String getCUSTOMFIELDID() {
    return CUSTOM_FIELD_ID;
  }

  public void setCUSTOMFIELDID(String CUSTOM_FIELD_ID) {
    this.CUSTOM_FIELD_ID = CUSTOM_FIELD_ID;
  }

  public APICustomFieldMetadata ORDER_ID(Long ORDER_ID) {
    this.ORDER_ID = ORDER_ID;
    return this;
  }

   /**
   * ORDER_ID is required
   * @return ORDER_ID
  **/
  @ApiModelProperty(example = "null", required = true, value = "ORDER_ID is required")
  public Long getORDERID() {
    return ORDER_ID;
  }

  public void setORDERID(Long ORDER_ID) {
    this.ORDER_ID = ORDER_ID;
  }

  public APICustomFieldMetadata FIELD_FOR(String FIELD_FOR) {
    this.FIELD_FOR = FIELD_FOR;
    return this;
  }

   /**
   * The type of object this custom field is for: Contact, Organisation, Project or Opportunity
   * @return FIELD_FOR
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of object this custom field is for: Contact, Organisation, Project or Opportunity")
  public String getFIELDFOR() {
    return FIELD_FOR;
  }

  public void setFIELDFOR(String FIELD_FOR) {
    this.FIELD_FOR = FIELD_FOR;
  }

  public APICustomFieldMetadata FIELD_NAME(String FIELD_NAME) {
    this.FIELD_NAME = FIELD_NAME;
    return this;
  }

   /**
   * The name of the custom field
   * @return FIELD_NAME
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the custom field")
  public String getFIELDNAME() {
    return FIELD_NAME;
  }

  public void setFIELDNAME(String FIELD_NAME) {
    this.FIELD_NAME = FIELD_NAME;
  }

  public APICustomFieldMetadata FIELD_TYPE(String FIELD_TYPE) {
    this.FIELD_TYPE = FIELD_TYPE;
    return this;
  }

   /**
   * The type of data this custom field holds: text, date or dropdown
   * @return FIELD_TYPE
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of data this custom field holds: text, date or dropdown")
  public String getFIELDTYPE() {
    return FIELD_TYPE;
  }

  public void setFIELDTYPE(String FIELD_TYPE) {
    this.FIELD_TYPE = FIELD_TYPE;
  }

  public APICustomFieldMetadata FIELD_HELP_TEXT(String FIELD_HELP_TEXT) {
    this.FIELD_HELP_TEXT = FIELD_HELP_TEXT;
    return this;
  }

   /**
   * Help text that appears next to the custom field in the UI.
   * @return FIELD_HELP_TEXT
  **/
  @ApiModelProperty(example = "null", value = "Help text that appears next to the custom field in the UI.")
  public String getFIELDHELPTEXT() {
    return FIELD_HELP_TEXT;
  }

  public void setFIELDHELPTEXT(String FIELD_HELP_TEXT) {
    this.FIELD_HELP_TEXT = FIELD_HELP_TEXT;
  }

  public APICustomFieldMetadata DEFAULT_VALUE(Object DEFAULT_VALUE) {
    this.DEFAULT_VALUE = DEFAULT_VALUE;
    return this;
  }

   /**
   * The default value of the custom field
   * @return DEFAULT_VALUE
  **/
  @ApiModelProperty(example = "null", value = "The default value of the custom field")
  public Object getDEFAULTVALUE() {
    return DEFAULT_VALUE;
  }

  public void setDEFAULTVALUE(Object DEFAULT_VALUE) {
    this.DEFAULT_VALUE = DEFAULT_VALUE;
  }

  public APICustomFieldMetadata GROUP_ID(Long GROUP_ID) {
    this.GROUP_ID = GROUP_ID;
    return this;
  }

   /**
   * Unique key of the custom field group
   * @return GROUP_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique key of the custom field group")
  public Long getGROUPID() {
    return GROUP_ID;
  }

  public void setGROUPID(Long GROUP_ID) {
    this.GROUP_ID = GROUP_ID;
  }

  public APICustomFieldMetadata EDITABLE(Boolean EDITABLE) {
    this.EDITABLE = EDITABLE;
    return this;
  }

   /**
   * Whether or not the field is editable
   * @return EDITABLE
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the field is editable")
  public Boolean getEDITABLE() {
    return EDITABLE;
  }

  public void setEDITABLE(Boolean EDITABLE) {
    this.EDITABLE = EDITABLE;
  }

  public APICustomFieldMetadata VISIBLE(Boolean VISIBLE) {
    this.VISIBLE = VISIBLE;
    return this;
  }

   /**
   * Whether or not the field is visible
   * @return VISIBLE
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the field is visible")
  public Boolean getVISIBLE() {
    return VISIBLE;
  }

  public void setVISIBLE(Boolean VISIBLE) {
    this.VISIBLE = VISIBLE;
  }

  public APICustomFieldMetadata CUSTOM_FIELD_OPTIONS(List<APICustomFieldOption> CUSTOM_FIELD_OPTIONS) {
    this.CUSTOM_FIELD_OPTIONS = CUSTOM_FIELD_OPTIONS;
    return this;
  }

  public APICustomFieldMetadata addCUSTOMFIELDOPTIONSItem(APICustomFieldOption CUSTOM_FIELD_OPTIONSItem) {
    this.CUSTOM_FIELD_OPTIONS.add(CUSTOM_FIELD_OPTIONSItem);
    return this;
  }

   /**
   * A list of option values for a dropdown Custom Field
   * @return CUSTOM_FIELD_OPTIONS
  **/
  @ApiModelProperty(example = "null", value = "A list of option values for a dropdown Custom Field")
  public List<APICustomFieldOption> getCUSTOMFIELDOPTIONS() {
    return CUSTOM_FIELD_OPTIONS;
  }

  public void setCUSTOMFIELDOPTIONS(List<APICustomFieldOption> CUSTOM_FIELD_OPTIONS) {
    this.CUSTOM_FIELD_OPTIONS = CUSTOM_FIELD_OPTIONS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICustomFieldMetadata apICustomFieldMetadata = (APICustomFieldMetadata) o;
    return Objects.equals(this.CUSTOM_FIELD_ID, apICustomFieldMetadata.CUSTOM_FIELD_ID) &&
        Objects.equals(this.ORDER_ID, apICustomFieldMetadata.ORDER_ID) &&
        Objects.equals(this.FIELD_FOR, apICustomFieldMetadata.FIELD_FOR) &&
        Objects.equals(this.FIELD_NAME, apICustomFieldMetadata.FIELD_NAME) &&
        Objects.equals(this.FIELD_TYPE, apICustomFieldMetadata.FIELD_TYPE) &&
        Objects.equals(this.FIELD_HELP_TEXT, apICustomFieldMetadata.FIELD_HELP_TEXT) &&
        Objects.equals(this.DEFAULT_VALUE, apICustomFieldMetadata.DEFAULT_VALUE) &&
        Objects.equals(this.GROUP_ID, apICustomFieldMetadata.GROUP_ID) &&
        Objects.equals(this.EDITABLE, apICustomFieldMetadata.EDITABLE) &&
        Objects.equals(this.VISIBLE, apICustomFieldMetadata.VISIBLE) &&
        Objects.equals(this.CUSTOM_FIELD_OPTIONS, apICustomFieldMetadata.CUSTOM_FIELD_OPTIONS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_FIELD_ID, ORDER_ID, FIELD_FOR, FIELD_NAME, FIELD_TYPE, FIELD_HELP_TEXT, DEFAULT_VALUE, GROUP_ID, EDITABLE, VISIBLE, CUSTOM_FIELD_OPTIONS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICustomFieldMetadata {\n");
    
    sb.append("    CUSTOM_FIELD_ID: ").append(toIndentedString(CUSTOM_FIELD_ID)).append("\n");
    sb.append("    ORDER_ID: ").append(toIndentedString(ORDER_ID)).append("\n");
    sb.append("    FIELD_FOR: ").append(toIndentedString(FIELD_FOR)).append("\n");
    sb.append("    FIELD_NAME: ").append(toIndentedString(FIELD_NAME)).append("\n");
    sb.append("    FIELD_TYPE: ").append(toIndentedString(FIELD_TYPE)).append("\n");
    sb.append("    FIELD_HELP_TEXT: ").append(toIndentedString(FIELD_HELP_TEXT)).append("\n");
    sb.append("    DEFAULT_VALUE: ").append(toIndentedString(DEFAULT_VALUE)).append("\n");
    sb.append("    GROUP_ID: ").append(toIndentedString(GROUP_ID)).append("\n");
    sb.append("    EDITABLE: ").append(toIndentedString(EDITABLE)).append("\n");
    sb.append("    VISIBLE: ").append(toIndentedString(VISIBLE)).append("\n");
    sb.append("    CUSTOM_FIELD_OPTIONS: ").append(toIndentedString(CUSTOM_FIELD_OPTIONS)).append("\n");
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

