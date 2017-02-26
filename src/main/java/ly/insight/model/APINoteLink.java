package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Information about a Link between a Note and a Contact, Organisation, Opportunity, or Project:  One linked object ID should be included.
 */
@ApiModel(description = "Information about a Link between a Note and a Contact, Organisation, Opportunity, or Project:  One linked object ID should be included.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APINoteLink implements Serializable {
  @SerializedName("NOTE_LINK_ID")
  private Long NOTE_LINK_ID = null;

  @SerializedName("NOTE_ID")
  private Long NOTE_ID = null;

  @SerializedName("CONTACT_ID")
  private Long CONTACT_ID = null;

  @SerializedName("ORGANISATION_ID")
  private Long ORGANISATION_ID = null;

  @SerializedName("OPPORTUNITY_ID")
  private Long OPPORTUNITY_ID = null;

  @SerializedName("PROJECT_ID")
  private Long PROJECT_ID = null;

  @SerializedName("LEAD_ID")
  private Long LEAD_ID = null;

  public APINoteLink NOTE_LINK_ID(Long NOTE_LINK_ID) {
    this.NOTE_LINK_ID = NOTE_LINK_ID;
    return this;
  }

   /**
   * Unique ID for the Note Link record
   * @return NOTE_LINK_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Note Link record")
  public Long getNOTELINKID() {
    return NOTE_LINK_ID;
  }

  public void setNOTELINKID(Long NOTE_LINK_ID) {
    this.NOTE_LINK_ID = NOTE_LINK_ID;
  }

  public APINoteLink NOTE_ID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
    return this;
  }

   /**
   * Unique ID of the Note record being linked
   * @return NOTE_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID of the Note record being linked")
  public Long getNOTEID() {
    return NOTE_ID;
  }

  public void setNOTEID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
  }

  public APINoteLink CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }

   /**
   * Unique ID for a Contact linked to the Note
   * @return CONTACT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact linked to the Note")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }

  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  public APINoteLink ORGANISATION_ID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
    return this;
  }

   /**
   * Unique ID for an Organisation linked to the Note
   * @return ORGANISATION_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for an Organisation linked to the Note")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }

  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  public APINoteLink OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }

   /**
   * Unique ID for an Opportunity linked to the Note
   * @return OPPORTUNITY_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for an Opportunity linked to the Note")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }

  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  public APINoteLink PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }

   /**
   * Unique ID for a Project linked to the Note
   * @return PROJECT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Project linked to the Note")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }

  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  public APINoteLink LEAD_ID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
    return this;
  }

   /**
   * Unique ID for a Lead linked to the Note
   * @return LEAD_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Lead linked to the Note")
  public Long getLEADID() {
    return LEAD_ID;
  }

  public void setLEADID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APINoteLink apINoteLink = (APINoteLink) o;
    return Objects.equals(this.NOTE_LINK_ID, apINoteLink.NOTE_LINK_ID) &&
        Objects.equals(this.NOTE_ID, apINoteLink.NOTE_ID) &&
        Objects.equals(this.CONTACT_ID, apINoteLink.CONTACT_ID) &&
        Objects.equals(this.ORGANISATION_ID, apINoteLink.ORGANISATION_ID) &&
        Objects.equals(this.OPPORTUNITY_ID, apINoteLink.OPPORTUNITY_ID) &&
        Objects.equals(this.PROJECT_ID, apINoteLink.PROJECT_ID) &&
        Objects.equals(this.LEAD_ID, apINoteLink.LEAD_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NOTE_LINK_ID, NOTE_ID, CONTACT_ID, ORGANISATION_ID, OPPORTUNITY_ID, PROJECT_ID, LEAD_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APINoteLink {\n");
    
    sb.append("    NOTE_LINK_ID: ").append(toIndentedString(NOTE_LINK_ID)).append("\n");
    sb.append("    NOTE_ID: ").append(toIndentedString(NOTE_ID)).append("\n");
    sb.append("    CONTACT_ID: ").append(toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    ORGANISATION_ID: ").append(toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    PROJECT_ID: ").append(toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    LEAD_ID: ").append(toIndentedString(LEAD_ID)).append("\n");
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

