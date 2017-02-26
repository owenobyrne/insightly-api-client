package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Information about a Link between an Event and a Contact, Organisation, Opportunity, or Project:  One linked object ID should be included.\&quot;
 */
@ApiModel(description = "Information about a Link between an Event and a Contact, Organisation, Opportunity, or Project:  One linked object ID should be included.\"")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class EventLink implements Serializable {
  @SerializedName("LEAD_ID")
  private Long LEAD_ID = null;

  @SerializedName("ORGANISATION_ID")
  private Long ORGANISATION_ID = null;

  @SerializedName("EVENT_LINK_ID")
  private Long EVENT_LINK_ID = null;

  @SerializedName("EVENT_ID")
  private Long EVENT_ID = null;

  @SerializedName("CONTACT_ID")
  private Long CONTACT_ID = null;

  @SerializedName("OPPORTUNITY_ID")
  private Long OPPORTUNITY_ID = null;

  @SerializedName("PROJECT_ID")
  private Long PROJECT_ID = null;

  public EventLink LEAD_ID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
    return this;
  }

   /**
   * Unique ID for a Lead linked to the Event
   * @return LEAD_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Lead linked to the Event")
  public Long getLEADID() {
    return LEAD_ID;
  }

  public void setLEADID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
  }

  public EventLink ORGANISATION_ID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
    return this;
  }

   /**
   * Unique ID for an Organisation linked to the Event
   * @return ORGANISATION_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for an Organisation linked to the Event")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }

  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  public EventLink EVENT_LINK_ID(Long EVENT_LINK_ID) {
    this.EVENT_LINK_ID = EVENT_LINK_ID;
    return this;
  }

   /**
   * Unique ID for the Event Link record
   * @return EVENT_LINK_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Event Link record")
  public Long getEVENTLINKID() {
    return EVENT_LINK_ID;
  }

  public void setEVENTLINKID(Long EVENT_LINK_ID) {
    this.EVENT_LINK_ID = EVENT_LINK_ID;
  }

  public EventLink EVENT_ID(Long EVENT_ID) {
    this.EVENT_ID = EVENT_ID;
    return this;
  }

   /**
   * Unique ID for the Event record being linked
   * @return EVENT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Event record being linked")
  public Long getEVENTID() {
    return EVENT_ID;
  }

  public void setEVENTID(Long EVENT_ID) {
    this.EVENT_ID = EVENT_ID;
  }

  public EventLink CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }

   /**
   * Unique ID for a Contact linked to the Event
   * @return CONTACT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact linked to the Event")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }

  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  public EventLink OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }

   /**
   * Unique ID for an Opportunity linked to the Event
   * @return OPPORTUNITY_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for an Opportunity linked to the Event")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }

  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  public EventLink PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }

   /**
   * Unique ID for a Project linked to the Event
   * @return PROJECT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Project linked to the Event")
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
    EventLink eventLink = (EventLink) o;
    return Objects.equals(this.LEAD_ID, eventLink.LEAD_ID) &&
        Objects.equals(this.ORGANISATION_ID, eventLink.ORGANISATION_ID) &&
        Objects.equals(this.EVENT_LINK_ID, eventLink.EVENT_LINK_ID) &&
        Objects.equals(this.EVENT_ID, eventLink.EVENT_ID) &&
        Objects.equals(this.CONTACT_ID, eventLink.CONTACT_ID) &&
        Objects.equals(this.OPPORTUNITY_ID, eventLink.OPPORTUNITY_ID) &&
        Objects.equals(this.PROJECT_ID, eventLink.PROJECT_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LEAD_ID, ORGANISATION_ID, EVENT_LINK_ID, EVENT_ID, CONTACT_ID, OPPORTUNITY_ID, PROJECT_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventLink {\n");
    
    sb.append("    LEAD_ID: ").append(toIndentedString(LEAD_ID)).append("\n");
    sb.append("    ORGANISATION_ID: ").append(toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    EVENT_LINK_ID: ").append(toIndentedString(EVENT_LINK_ID)).append("\n");
    sb.append("    EVENT_ID: ").append(toIndentedString(EVENT_ID)).append("\n");
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

