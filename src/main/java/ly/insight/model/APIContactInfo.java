package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APIContactInfo
 */
@ApiModel(description = "APIContactInfo")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIContactInfo implements Serializable {
  @SerializedName("CONTACT_INFO_ID")
  private Long CONTACT_INFO_ID = null;

  @SerializedName("TYPE")
  private String TYPE = null;

  @SerializedName("SUBTYPE")
  private String SUBTYPE = null;

  @SerializedName("LABEL")
  private String LABEL = null;

  @SerializedName("DETAIL")
  private String DETAIL = null;

  public APIContactInfo CONTACT_INFO_ID(Long CONTACT_INFO_ID) {
    this.CONTACT_INFO_ID = CONTACT_INFO_ID;
    return this;
  }

   /**
   * Unique key of the Contact Info record
   * @return CONTACT_INFO_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique key of the Contact Info record")
  public Long getCONTACTINFOID() {
    return CONTACT_INFO_ID;
  }

  public void setCONTACTINFOID(Long CONTACT_INFO_ID) {
    this.CONTACT_INFO_ID = CONTACT_INFO_ID;
  }

  public APIContactInfo TYPE(String TYPE) {
    this.TYPE = TYPE;
    return this;
  }

   /**
   * Type of Contact Info<br />              For Contacts, must be 'Phone', 'Email', or 'Website'.<br />              For Organizations, must be 'EmailDomain', 'Phone', 'Email' or 'Website'.
   * @return TYPE
  **/
  @ApiModelProperty(example = "null", required = true, value = "Type of Contact Info<br />              For Contacts, must be 'Phone', 'Email', or 'Website'.<br />              For Organizations, must be 'EmailDomain', 'Phone', 'Email' or 'Website'.")
  public String getTYPE() {
    return TYPE;
  }

  public void setTYPE(String TYPE) {
    this.TYPE = TYPE;
  }

  public APIContactInfo SUBTYPE(String SUBTYPE) {
    this.SUBTYPE = SUBTYPE;
    return this;
  }

   /**
   * Subtype of Contact Info
   * @return SUBTYPE
  **/
  @ApiModelProperty(example = "null", value = "Subtype of Contact Info")
  public String getSUBTYPE() {
    return SUBTYPE;
  }

  public void setSUBTYPE(String SUBTYPE) {
    this.SUBTYPE = SUBTYPE;
  }

  public APIContactInfo LABEL(String LABEL) {
    this.LABEL = LABEL;
    return this;
  }

   /**
   * Label<br />              If TYPE is 'Website', LABEL can be one of the following values: 'Work', 'Personal', 'Blog', or 'Other'.<br />              If TYPE is 'Phone', LABEL can be one of the following values: 'Work', 'Mobile', 'Fax', 'Pager', 'Home', 'Skype', 'Y! Messenger' (or 'Yahoo'), 'SIP', 'Other'.<br />              If TYPE is 'Email', LABEL can be one of the following values: 'Work', 'Personal', 'Other'.<br />              For Organizations, if TYPE is 'EmailDomain', LABEL should be empty.
   * @return LABEL
  **/
  @ApiModelProperty(example = "null", value = "Label<br />              If TYPE is 'Website', LABEL can be one of the following values: 'Work', 'Personal', 'Blog', or 'Other'.<br />              If TYPE is 'Phone', LABEL can be one of the following values: 'Work', 'Mobile', 'Fax', 'Pager', 'Home', 'Skype', 'Y! Messenger' (or 'Yahoo'), 'SIP', 'Other'.<br />              If TYPE is 'Email', LABEL can be one of the following values: 'Work', 'Personal', 'Other'.<br />              For Organizations, if TYPE is 'EmailDomain', LABEL should be empty.")
  public String getLABEL() {
    return LABEL;
  }

  public void setLABEL(String LABEL) {
    this.LABEL = LABEL;
  }

  public APIContactInfo DETAIL(String DETAIL) {
    this.DETAIL = DETAIL;
    return this;
  }

   /**
   * Detail of the Contact Info
   * @return DETAIL
  **/
  @ApiModelProperty(example = "null", required = true, value = "Detail of the Contact Info")
  public String getDETAIL() {
    return DETAIL;
  }

  public void setDETAIL(String DETAIL) {
    this.DETAIL = DETAIL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIContactInfo apIContactInfo = (APIContactInfo) o;
    return Objects.equals(this.CONTACT_INFO_ID, apIContactInfo.CONTACT_INFO_ID) &&
        Objects.equals(this.TYPE, apIContactInfo.TYPE) &&
        Objects.equals(this.SUBTYPE, apIContactInfo.SUBTYPE) &&
        Objects.equals(this.LABEL, apIContactInfo.LABEL) &&
        Objects.equals(this.DETAIL, apIContactInfo.DETAIL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CONTACT_INFO_ID, TYPE, SUBTYPE, LABEL, DETAIL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIContactInfo {\n");
    
    sb.append("    CONTACT_INFO_ID: ").append(toIndentedString(CONTACT_INFO_ID)).append("\n");
    sb.append("    TYPE: ").append(toIndentedString(TYPE)).append("\n");
    sb.append("    SUBTYPE: ").append(toIndentedString(SUBTYPE)).append("\n");
    sb.append("    LABEL: ").append(toIndentedString(LABEL)).append("\n");
    sb.append("    DETAIL: ").append(toIndentedString(DETAIL)).append("\n");
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

