package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Information about a Link between an Email and a Contact, Organisation, Opportunity, or Project:  One linked object ID should be included.
 */
@ApiModel(description = "Information about a Link between an Email and a Contact, Organisation, Opportunity, or Project:  One linked object ID should be included.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class EmailLink implements Serializable {
  @SerializedName("EMAIL_LINK_ID")
  private Long EMAIL_LINK_ID = null;

  @SerializedName("LEAD_ID")
  private Long LEAD_ID = null;

  @SerializedName("ORGANISATION_ID")
  private Long ORGANISATION_ID = null;

  @SerializedName("EMAIL_ID")
  private Long EMAIL_ID = null;

  @SerializedName("CONTACT_ID")
  private Long CONTACT_ID = null;

  @SerializedName("OPPORTUNITY_ID")
  private Long OPPORTUNITY_ID = null;

  @SerializedName("PROJECT_ID")
  private Long PROJECT_ID = null;

  public EmailLink EMAIL_LINK_ID(Long EMAIL_LINK_ID) {
    this.EMAIL_LINK_ID = EMAIL_LINK_ID;
    return this;
  }

   /**
   * UniqueID for the Email Link record
   * @return EMAIL_LINK_ID
  **/
  @ApiModelProperty(example = "null", value = "UniqueID for the Email Link record")
  public Long getEMAILLINKID() {
    return EMAIL_LINK_ID;
  }

  public void setEMAILLINKID(Long EMAIL_LINK_ID) {
    this.EMAIL_LINK_ID = EMAIL_LINK_ID;
  }

  public EmailLink LEAD_ID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
    return this;
  }

   /**
   * Unique ID for a Lead linked to the Email
   * @return LEAD_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Lead linked to the Email")
  public Long getLEADID() {
    return LEAD_ID;
  }

  public void setLEADID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
  }

  public EmailLink ORGANISATION_ID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
    return this;
  }

   /**
   * Unique ID for an Organisation linked to the Email
   * @return ORGANISATION_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for an Organisation linked to the Email")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }

  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  public EmailLink EMAIL_ID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
    return this;
  }

   /**
   * Unique ID for the Email record being linked
   * @return EMAIL_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Email record being linked")
  public Long getEMAILID() {
    return EMAIL_ID;
  }

  public void setEMAILID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
  }

  public EmailLink CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }

   /**
   * Unique ID for a Contact linked to the Email
   * @return CONTACT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact linked to the Email")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }

  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  public EmailLink OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }

   /**
   * Unique ID for an Opportunity linked to the Email
   * @return OPPORTUNITY_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for an Opportunity linked to the Email")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }

  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  public EmailLink PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }

   /**
   * Unique ID for a Project linked to the Email
   * @return PROJECT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Project linked to the Email")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }

  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailLink emailLink = (EmailLink) o;
    return Objects.equals(this.EMAIL_LINK_ID, emailLink.EMAIL_LINK_ID) &&
        Objects.equals(this.LEAD_ID, emailLink.LEAD_ID) &&
        Objects.equals(this.ORGANISATION_ID, emailLink.ORGANISATION_ID) &&
        Objects.equals(this.EMAIL_ID, emailLink.EMAIL_ID) &&
        Objects.equals(this.CONTACT_ID, emailLink.CONTACT_ID) &&
        Objects.equals(this.OPPORTUNITY_ID, emailLink.OPPORTUNITY_ID) &&
        Objects.equals(this.PROJECT_ID, emailLink.PROJECT_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EMAIL_LINK_ID, LEAD_ID, ORGANISATION_ID, EMAIL_ID, CONTACT_ID, OPPORTUNITY_ID, PROJECT_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailLink {\n");
    
    sb.append("    EMAIL_LINK_ID: ").append(toIndentedString(EMAIL_LINK_ID)).append("\n");
    sb.append("    LEAD_ID: ").append(toIndentedString(LEAD_ID)).append("\n");
    sb.append("    ORGANISATION_ID: ").append(toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    EMAIL_ID: ").append(toIndentedString(EMAIL_ID)).append("\n");
    sb.append("    CONTACT_ID: ").append(toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    PROJECT_ID: ").append(toIndentedString(PROJECT_ID)).append("\n");
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

