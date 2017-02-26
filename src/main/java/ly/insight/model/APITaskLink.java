package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APITaskLink
 */
@ApiModel(description = "APITaskLink")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APITaskLink implements Serializable {
  @SerializedName("TASK_LINK_ID")
  private Long TASK_LINK_ID = null;

  @SerializedName("TASK_ID")
  private Long TASK_ID = null;

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

  public APITaskLink TASK_LINK_ID(Long TASK_LINK_ID) {
    this.TASK_LINK_ID = TASK_LINK_ID;
    return this;
  }

   /**
   * Unique ID for the Task Link record
   * @return TASK_LINK_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Task Link record")
  public Long getTASKLINKID() {
    return TASK_LINK_ID;
  }

  public void setTASKLINKID(Long TASK_LINK_ID) {
    this.TASK_LINK_ID = TASK_LINK_ID;
  }

  public APITaskLink TASK_ID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
    return this;
  }

   /**
   * Unique ID for the Task record being linked
   * @return TASK_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Task record being linked")
  public Long getTASKID() {
    return TASK_ID;
  }

  public void setTASKID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
  }

  public APITaskLink CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }

   /**
   * Unique ID for a Contact linked to the Task
   * @return CONTACT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact linked to the Task")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }

  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  public APITaskLink ORGANISATION_ID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
    return this;
  }

   /**
   * Unique ID for an Organisation linked to the Task
   * @return ORGANISATION_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for an Organisation linked to the Task")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }

  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  public APITaskLink OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }

   /**
   * Unique ID for an Opportunity linked to the Task
   * @return OPPORTUNITY_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for an Opportunity linked to the Task")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }

  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  public APITaskLink PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }

   /**
   * Unique ID for a Project linked to the Task
   * @return PROJECT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Project linked to the Task")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }

  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  public APITaskLink LEAD_ID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
    return this;
  }

   /**
   * Unique ID for a Lead linked to the Task
   * @return LEAD_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Lead linked to the Task")
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
    APITaskLink apITaskLink = (APITaskLink) o;
    return Objects.equals(this.TASK_LINK_ID, apITaskLink.TASK_LINK_ID) &&
        Objects.equals(this.TASK_ID, apITaskLink.TASK_ID) &&
        Objects.equals(this.CONTACT_ID, apITaskLink.CONTACT_ID) &&
        Objects.equals(this.ORGANISATION_ID, apITaskLink.ORGANISATION_ID) &&
        Objects.equals(this.OPPORTUNITY_ID, apITaskLink.OPPORTUNITY_ID) &&
        Objects.equals(this.PROJECT_ID, apITaskLink.PROJECT_ID) &&
        Objects.equals(this.LEAD_ID, apITaskLink.LEAD_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(TASK_LINK_ID, TASK_ID, CONTACT_ID, ORGANISATION_ID, OPPORTUNITY_ID, PROJECT_ID, LEAD_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APITaskLink {\n");
    
    sb.append("    TASK_LINK_ID: ").append(toIndentedString(TASK_LINK_ID)).append("\n");
    sb.append("    TASK_ID: ").append(toIndentedString(TASK_ID)).append("\n");
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

