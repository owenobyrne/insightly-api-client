package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;

/**
 * Project milestone API object.
 */
@ApiModel(description = "Project milestone API object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class Milestone implements Serializable {
  @SerializedName("RESPONSIBLE_USER_ID")
  private Integer RESPONSIBLE_USER_ID = null;

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("COMPLETED")
  private Boolean COMPLETED = null;

  @SerializedName("DUE_DATE")
  private Date DUE_DATE = null;

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("MILESTONE_ID")
  private Long MILESTONE_ID = null;

  @SerializedName("TITLE")
  private String TITLE = null;

  @SerializedName("COMPLETED_DATE_UTC")
  private Date COMPLETED_DATE_UTC = null;

  @SerializedName("PROJECT_ID")
  private Long PROJECT_ID = null;

  public Milestone RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
    return this;
  }

   /**
   * ID of the user that is responsible for the milestone.
   * @return RESPONSIBLE_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the user that is responsible for the milestone.")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }

  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  public Milestone DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time the Milestone record was created, as Coordinated Universal Time
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time the Milestone record was created, as Coordinated Universal Time")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public Milestone COMPLETED(Boolean COMPLETED) {
    this.COMPLETED = COMPLETED;
    return this;
  }

   /**
   * True if milestone is completed.
   * @return COMPLETED
  **/
  @ApiModelProperty(example = "null", value = "True if milestone is completed.")
  public Boolean getCOMPLETED() {
    return COMPLETED;
  }

  public void setCOMPLETED(Boolean COMPLETED) {
    this.COMPLETED = COMPLETED;
  }

  public Milestone DUE_DATE(Date DUE_DATE) {
    this.DUE_DATE = DUE_DATE;
    return this;
  }

   /**
   * Date when milestone is due.
   * @return DUE_DATE
  **/
  @ApiModelProperty(example = "null", value = "Date when milestone is due.")
  public Date getDUEDATE() {
    return DUE_DATE;
  }

  public void setDUEDATE(Date DUE_DATE) {
    this.DUE_DATE = DUE_DATE;
  }

  public Milestone DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and time the Milestone record was updated, as Coordinated Universal Time
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time the Milestone record was updated, as Coordinated Universal Time")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public Milestone MILESTONE_ID(Long MILESTONE_ID) {
    this.MILESTONE_ID = MILESTONE_ID;
    return this;
  }

   /**
   * Unique ID for the Milestone record.
   * @return MILESTONE_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Milestone record.")
  public Long getMILESTONEID() {
    return MILESTONE_ID;
  }

  public void setMILESTONEID(Long MILESTONE_ID) {
    this.MILESTONE_ID = MILESTONE_ID;
  }

  public Milestone TITLE(String TITLE) {
    this.TITLE = TITLE;
    return this;
  }

   /**
   * Title of the milestone.
   * @return TITLE
  **/
  @ApiModelProperty(example = "null", value = "Title of the milestone.")
  public String getTITLE() {
    return TITLE;
  }

  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  public Milestone COMPLETED_DATE_UTC(Date COMPLETED_DATE_UTC) {
    this.COMPLETED_DATE_UTC = COMPLETED_DATE_UTC;
    return this;
  }

   /**
   * Date and time when the milestone was completed (Coordinated Universal Time).
   * @return COMPLETED_DATE_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time when the milestone was completed (Coordinated Universal Time).")
  public Date getCOMPLETEDDATEUTC() {
    return COMPLETED_DATE_UTC;
  }

  public void setCOMPLETEDDATEUTC(Date COMPLETED_DATE_UTC) {
    this.COMPLETED_DATE_UTC = COMPLETED_DATE_UTC;
  }

  public Milestone PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }

   /**
   * Unique ID for the Project record the milestone is assigned to.
   * @return PROJECT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Project record the milestone is assigned to.")
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
    Milestone milestone = (Milestone) o;
    return Objects.equals(this.RESPONSIBLE_USER_ID, milestone.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, milestone.DATE_CREATED_UTC) &&
        Objects.equals(this.COMPLETED, milestone.COMPLETED) &&
        Objects.equals(this.DUE_DATE, milestone.DUE_DATE) &&
        Objects.equals(this.DATE_UPDATED_UTC, milestone.DATE_UPDATED_UTC) &&
        Objects.equals(this.MILESTONE_ID, milestone.MILESTONE_ID) &&
        Objects.equals(this.TITLE, milestone.TITLE) &&
        Objects.equals(this.COMPLETED_DATE_UTC, milestone.COMPLETED_DATE_UTC) &&
        Objects.equals(this.PROJECT_ID, milestone.PROJECT_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(RESPONSIBLE_USER_ID, DATE_CREATED_UTC, COMPLETED, DUE_DATE, DATE_UPDATED_UTC, MILESTONE_ID, TITLE, COMPLETED_DATE_UTC, PROJECT_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Milestone {\n");
    
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    COMPLETED: ").append(toIndentedString(COMPLETED)).append("\n");
    sb.append("    DUE_DATE: ").append(toIndentedString(DUE_DATE)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    MILESTONE_ID: ").append(toIndentedString(MILESTONE_ID)).append("\n");
    sb.append("    TITLE: ").append(toIndentedString(TITLE)).append("\n");
    sb.append("    COMPLETED_DATE_UTC: ").append(toIndentedString(COMPLETED_DATE_UTC)).append("\n");
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

