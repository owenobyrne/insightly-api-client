package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Information about a Link between Contacts, Organisations, Opportunities, or Projects:  Two linked object IDs should be included.
 */
@ApiModel(description = "Information about a Link between Contacts, Organisations, Opportunities, or Projects:  Two linked object IDs should be included.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class Link implements Serializable {
  @SerializedName("ROLE")
  private String ROLE = null;

  @SerializedName("DETAILS")
  private String DETAILS = null;

  @SerializedName("SECOND_PROJECT_ID")
  private Long SECOND_PROJECT_ID = null;

  @SerializedName("ORGANISATION_ID")
  private Long ORGANISATION_ID = null;

  @SerializedName("LINK_ID")
  private Long LINK_ID = null;

  @SerializedName("CONTACT_ID")
  private Long CONTACT_ID = null;

  @SerializedName("SECOND_OPPORTUNITY_ID")
  private Long SECOND_OPPORTUNITY_ID = null;

  @SerializedName("OPPORTUNITY_ID")
  private Long OPPORTUNITY_ID = null;

  @SerializedName("PROJECT_ID")
  private Long PROJECT_ID = null;

  public Link ROLE(String ROLE) {
    this.ROLE = ROLE;
    return this;
  }

   /**
   * Description of the Relationship between the linked objects
   * @return ROLE
  **/
  @ApiModelProperty(example = "null", value = "Description of the Relationship between the linked objects")
  public String getROLE() {
    return ROLE;
  }

  public void setROLE(String ROLE) {
    this.ROLE = ROLE;
  }

  public Link DETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
    return this;
  }

   /**
   * Details of the Link
   * @return DETAILS
  **/
  @ApiModelProperty(example = "null", value = "Details of the Link")
  public String getDETAILS() {
    return DETAILS;
  }

  public void setDETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
  }

  public Link SECOND_PROJECT_ID(Long SECOND_PROJECT_ID) {
    this.SECOND_PROJECT_ID = SECOND_PROJECT_ID;
    return this;
  }

   /**
   * Unique ID for a second Project on one side of the Relationship
   * @return SECOND_PROJECT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a second Project on one side of the Relationship")
  public Long getSECONDPROJECTID() {
    return SECOND_PROJECT_ID;
  }

  public void setSECONDPROJECTID(Long SECOND_PROJECT_ID) {
    this.SECOND_PROJECT_ID = SECOND_PROJECT_ID;
  }

  public Link ORGANISATION_ID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
    return this;
  }

   /**
   * Unique ID for an Organisation on one side of the Relationship, must be an ORGANISATION_ID
   * @return ORGANISATION_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for an Organisation on one side of the Relationship, must be an ORGANISATION_ID")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }

  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  public Link LINK_ID(Long LINK_ID) {
    this.LINK_ID = LINK_ID;
    return this;
  }

   /**
   * Unique ID for the Link record
   * @return LINK_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Link record")
  public Long getLINKID() {
    return LINK_ID;
  }

  public void setLINKID(Long LINK_ID) {
    this.LINK_ID = LINK_ID;
  }

  public Link CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }

   /**
   * Unique ID for a Contact on one side of the Relationship, must be a CONTACT_ID
   * @return CONTACT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact on one side of the Relationship, must be a CONTACT_ID")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }

  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  public Link SECOND_OPPORTUNITY_ID(Long SECOND_OPPORTUNITY_ID) {
    this.SECOND_OPPORTUNITY_ID = SECOND_OPPORTUNITY_ID;
    return this;
  }

   /**
   * Unique ID for a second Opportunity on one side of the Relationship
   * @return SECOND_OPPORTUNITY_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a second Opportunity on one side of the Relationship")
  public Long getSECONDOPPORTUNITYID() {
    return SECOND_OPPORTUNITY_ID;
  }

  public void setSECONDOPPORTUNITYID(Long SECOND_OPPORTUNITY_ID) {
    this.SECOND_OPPORTUNITY_ID = SECOND_OPPORTUNITY_ID;
  }

  public Link OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }

   /**
   * Unique ID for an Opportunity on one side of the Relationship, must be an OPPORTUNITY_ID
   * @return OPPORTUNITY_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for an Opportunity on one side of the Relationship, must be an OPPORTUNITY_ID")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }

  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  public Link PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }

   /**
   * Unique ID for a Project on one side of the Relationship
   * @return PROJECT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Project on one side of the Relationship")
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
    Link link = (Link) o;
    return Objects.equals(this.ROLE, link.ROLE) &&
        Objects.equals(this.DETAILS, link.DETAILS) &&
        Objects.equals(this.SECOND_PROJECT_ID, link.SECOND_PROJECT_ID) &&
        Objects.equals(this.ORGANISATION_ID, link.ORGANISATION_ID) &&
        Objects.equals(this.LINK_ID, link.LINK_ID) &&
        Objects.equals(this.CONTACT_ID, link.CONTACT_ID) &&
        Objects.equals(this.SECOND_OPPORTUNITY_ID, link.SECOND_OPPORTUNITY_ID) &&
        Objects.equals(this.OPPORTUNITY_ID, link.OPPORTUNITY_ID) &&
        Objects.equals(this.PROJECT_ID, link.PROJECT_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ROLE, DETAILS, SECOND_PROJECT_ID, ORGANISATION_ID, LINK_ID, CONTACT_ID, SECOND_OPPORTUNITY_ID, OPPORTUNITY_ID, PROJECT_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    ROLE: ").append(toIndentedString(ROLE)).append("\n");
    sb.append("    DETAILS: ").append(toIndentedString(DETAILS)).append("\n");
    sb.append("    SECOND_PROJECT_ID: ").append(toIndentedString(SECOND_PROJECT_ID)).append("\n");
    sb.append("    ORGANISATION_ID: ").append(toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    LINK_ID: ").append(toIndentedString(LINK_ID)).append("\n");
    sb.append("    CONTACT_ID: ").append(toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    SECOND_OPPORTUNITY_ID: ").append(toIndentedString(SECOND_OPPORTUNITY_ID)).append("\n");
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

