package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ly.insight.model.APITaskLink;
import java.io.Serializable;

/**
 * APITask
 */
@ApiModel(description = "APITask")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APITask implements Serializable {
  @SerializedName("TASK_ID")
  private Long TASK_ID = null;

  @SerializedName("TITLE")
  private String TITLE = null;

  @SerializedName("CATEGORY_ID")
  private Long CATEGORY_ID = null;

  @SerializedName("DUE_DATE")
  private Date DUE_DATE = null;

  @SerializedName("COMPLETED_DATE_UTC")
  private Date COMPLETED_DATE_UTC = null;

  @SerializedName("PUBLICLY_VISIBLE")
  private Boolean PUBLICLY_VISIBLE = null;

  @SerializedName("COMPLETED")
  private Boolean COMPLETED = null;

  @SerializedName("PROJECT_ID")
  private Long PROJECT_ID = null;

  @SerializedName("OPPORTUNITY_ID")
  private Long OPPORTUNITY_ID = null;

  @SerializedName("MILESTONE_ID")
  private Long MILESTONE_ID = null;

  @SerializedName("PIPELINE_ID")
  private Long PIPELINE_ID = null;

  @SerializedName("STAGE_ID")
  private Long STAGE_ID = null;

  @SerializedName("DETAILS")
  private String DETAILS = null;

  @SerializedName("STATUS")
  private String STATUS = null;

  @SerializedName("PRIORITY")
  private Integer PRIORITY = null;

  @SerializedName("PERCENT_COMPLETE")
  private Integer PERCENT_COMPLETE = null;

  @SerializedName("START_DATE")
  private Date START_DATE = null;

  @SerializedName("ASSIGNED_BY_USER_ID")
  private Integer ASSIGNED_BY_USER_ID = null;

  @SerializedName("PARENT_TASK_ID")
  private Long PARENT_TASK_ID = null;

  @SerializedName("OWNER_VISIBLE")
  private Boolean OWNER_VISIBLE = null;

  @SerializedName("RESPONSIBLE_USER_ID")
  private Integer RESPONSIBLE_USER_ID = null;

  @SerializedName("ASSIGNED_TEAM_ID")
  private Long ASSIGNED_TEAM_ID = null;

  @SerializedName("ASSIGNED_DATE_UTC")
  private Date ASSIGNED_DATE_UTC = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("REMINDER_DATE_UTC")
  private Date REMINDER_DATE_UTC = null;

  @SerializedName("REMINDER_SENT")
  private Boolean REMINDER_SENT = null;

  @SerializedName("RECURRENCE")
  private String RECURRENCE = null;

  @SerializedName("TASKLINKS")
  private List<APITaskLink> TASKLINKS = new ArrayList<APITaskLink>();

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  public APITask TASK_ID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
    return this;
  }

   /**
   * Unique key of the Task record
   * @return TASK_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique key of the Task record")
  public Long getTASKID() {
    return TASK_ID;
  }

  public void setTASKID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
  }

  public APITask TITLE(String TITLE) {
    this.TITLE = TITLE;
    return this;
  }

   /**
   * Title of the Task (required)
   * @return TITLE
  **/
  @ApiModelProperty(example = "null", required = true, value = "Title of the Task (required)")
  public String getTITLE() {
    return TITLE;
  }

  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  public APITask CATEGORY_ID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
    return this;
  }

   /**
   * The Category ID of the Task, if it has been assigned to one
   * @return CATEGORY_ID
  **/
  @ApiModelProperty(example = "null", value = "The Category ID of the Task, if it has been assigned to one")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }

  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  public APITask DUE_DATE(Date DUE_DATE) {
    this.DUE_DATE = DUE_DATE;
    return this;
  }

   /**
   * Due date of the Task, in YYYY-MM-DD format
   * @return DUE_DATE
  **/
  @ApiModelProperty(example = "null", value = "Due date of the Task, in YYYY-MM-DD format")
  public Date getDUEDATE() {
    return DUE_DATE;
  }

  public void setDUEDATE(Date DUE_DATE) {
    this.DUE_DATE = DUE_DATE;
  }

  public APITask COMPLETED_DATE_UTC(Date COMPLETED_DATE_UTC) {
    this.COMPLETED_DATE_UTC = COMPLETED_DATE_UTC;
    return this;
  }

   /**
   * Completed Date of the Task, in YYYY-MM-DD format
   * @return COMPLETED_DATE_UTC
  **/
  @ApiModelProperty(example = "null", value = "Completed Date of the Task, in YYYY-MM-DD format")
  public Date getCOMPLETEDDATEUTC() {
    return COMPLETED_DATE_UTC;
  }

  public void setCOMPLETEDDATEUTC(Date COMPLETED_DATE_UTC) {
    this.COMPLETED_DATE_UTC = COMPLETED_DATE_UTC;
  }

  public APITask PUBLICLY_VISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
    return this;
  }

   /**
   * True, if Task is visible to others
   * @return PUBLICLY_VISIBLE
  **/
  @ApiModelProperty(example = "null", required = true, value = "True, if Task is visible to others")
  public Boolean getPUBLICLYVISIBLE() {
    return PUBLICLY_VISIBLE;
  }

  public void setPUBLICLYVISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
  }

  public APITask COMPLETED(Boolean COMPLETED) {
    this.COMPLETED = COMPLETED;
    return this;
  }

   /**
   * True, if Task has been completed
   * @return COMPLETED
  **/
  @ApiModelProperty(example = "null", required = true, value = "True, if Task has been completed")
  public Boolean getCOMPLETED() {
    return COMPLETED;
  }

  public void setCOMPLETED(Boolean COMPLETED) {
    this.COMPLETED = COMPLETED;
  }

  public APITask PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }

   /**
   * ID of the project the task is related to, if applicable. Should be a valid PROJECT_ID, if set.
   * @return PROJECT_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the project the task is related to, if applicable. Should be a valid PROJECT_ID, if set.")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }

  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  public APITask OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }

   /**
   * ID of the opportunity the task is related to. Can only be set if PROJECT_ID is null.
   * @return OPPORTUNITY_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the opportunity the task is related to. Can only be set if PROJECT_ID is null.")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }

  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  public APITask MILESTONE_ID(Long MILESTONE_ID) {
    this.MILESTONE_ID = MILESTONE_ID;
    return this;
  }

   /**
   * ID of the project milestone the task is related to. Can only be set to a milestone of a project defined by PROJECT_ID.
   * @return MILESTONE_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the project milestone the task is related to. Can only be set to a milestone of a project defined by PROJECT_ID.")
  public Long getMILESTONEID() {
    return MILESTONE_ID;
  }

  public void setMILESTONEID(Long MILESTONE_ID) {
    this.MILESTONE_ID = MILESTONE_ID;
  }

  public APITask PIPELINE_ID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
    return this;
  }

   /**
   * ID of the pipeline the task is related to. Can only be set to a pipeline associated with the related project or opportunity.
   * @return PIPELINE_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the pipeline the task is related to. Can only be set to a pipeline associated with the related project or opportunity.")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }

  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  public APITask STAGE_ID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
    return this;
  }

   /**
   * ID of the pipeline stage the task is related to. Can only be set to an existing stage of a pipeline associated with related project or opportunity.
   * @return STAGE_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the pipeline stage the task is related to. Can only be set to an existing stage of a pipeline associated with related project or opportunity.")
  public Long getSTAGEID() {
    return STAGE_ID;
  }

  public void setSTAGEID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
  }

  public APITask DETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
    return this;
  }

   /**
   * Details of the Task
   * @return DETAILS
  **/
  @ApiModelProperty(example = "null", value = "Details of the Task")
  public String getDETAILS() {
    return DETAILS;
  }

  public void setDETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
  }

  public APITask STATUS(String STATUS) {
    this.STATUS = STATUS;
    return this;
  }

   /**
   * Status: Completed, Deferred, In Progress, Not Started, or Waiting
   * @return STATUS
  **/
  @ApiModelProperty(example = "null", value = "Status: Completed, Deferred, In Progress, Not Started, or Waiting")
  public String getSTATUS() {
    return STATUS;
  }

  public void setSTATUS(String STATUS) {
    this.STATUS = STATUS;
  }

  public APITask PRIORITY(Integer PRIORITY) {
    this.PRIORITY = PRIORITY;
    return this;
  }

   /**
   * Priority: 1 (Low), 2 (Normal) or 3 (High)
   * @return PRIORITY
  **/
  @ApiModelProperty(example = "null", value = "Priority: 1 (Low), 2 (Normal) or 3 (High)")
  public Integer getPRIORITY() {
    return PRIORITY;
  }

  public void setPRIORITY(Integer PRIORITY) {
    this.PRIORITY = PRIORITY;
  }

  public APITask PERCENT_COMPLETE(Integer PERCENT_COMPLETE) {
    this.PERCENT_COMPLETE = PERCENT_COMPLETE;
    return this;
  }

   /**
   * Percentage completion of the Task, integer value from 0 to 100
   * @return PERCENT_COMPLETE
  **/
  @ApiModelProperty(example = "null", value = "Percentage completion of the Task, integer value from 0 to 100")
  public Integer getPERCENTCOMPLETE() {
    return PERCENT_COMPLETE;
  }

  public void setPERCENTCOMPLETE(Integer PERCENT_COMPLETE) {
    this.PERCENT_COMPLETE = PERCENT_COMPLETE;
  }

  public APITask START_DATE(Date START_DATE) {
    this.START_DATE = START_DATE;
    return this;
  }

   /**
   * Start Date of the Task, in YYYY-MM-DD format
   * @return START_DATE
  **/
  @ApiModelProperty(example = "null", value = "Start Date of the Task, in YYYY-MM-DD format")
  public Date getSTARTDATE() {
    return START_DATE;
  }

  public void setSTARTDATE(Date START_DATE) {
    this.START_DATE = START_DATE;
  }

  public APITask ASSIGNED_BY_USER_ID(Integer ASSIGNED_BY_USER_ID) {
    this.ASSIGNED_BY_USER_ID = ASSIGNED_BY_USER_ID;
    return this;
  }

   /**
   * User ID of the User who assigned the Task to another User
   * @return ASSIGNED_BY_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "User ID of the User who assigned the Task to another User")
  public Integer getASSIGNEDBYUSERID() {
    return ASSIGNED_BY_USER_ID;
  }

  public void setASSIGNEDBYUSERID(Integer ASSIGNED_BY_USER_ID) {
    this.ASSIGNED_BY_USER_ID = ASSIGNED_BY_USER_ID;
  }

  public APITask PARENT_TASK_ID(Long PARENT_TASK_ID) {
    this.PARENT_TASK_ID = PARENT_TASK_ID;
    return this;
  }

   /**
   * Parent Task ID
   * @return PARENT_TASK_ID
  **/
  @ApiModelProperty(example = "null", value = "Parent Task ID")
  public Long getPARENTTASKID() {
    return PARENT_TASK_ID;
  }

  public void setPARENTTASKID(Long PARENT_TASK_ID) {
    this.PARENT_TASK_ID = PARENT_TASK_ID;
  }

  public APITask OWNER_VISIBLE(Boolean OWNER_VISIBLE) {
    this.OWNER_VISIBLE = OWNER_VISIBLE;
    return this;
  }

   /**
   * Used to determine if owner of assigned task wants to be kept notified of the Task
   * @return OWNER_VISIBLE
  **/
  @ApiModelProperty(example = "null", value = "Used to determine if owner of assigned task wants to be kept notified of the Task")
  public Boolean getOWNERVISIBLE() {
    return OWNER_VISIBLE;
  }

  public void setOWNERVISIBLE(Boolean OWNER_VISIBLE) {
    this.OWNER_VISIBLE = OWNER_VISIBLE;
  }

  public APITask RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
    return this;
  }

   /**
   * Responsible User ID
   * @return RESPONSIBLE_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "Responsible User ID")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }

  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  public APITask ASSIGNED_TEAM_ID(Long ASSIGNED_TEAM_ID) {
    this.ASSIGNED_TEAM_ID = ASSIGNED_TEAM_ID;
    return this;
  }

   /**
   * ID of the Team which is responsible for the Task
   * @return ASSIGNED_TEAM_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the Team which is responsible for the Task")
  public Long getASSIGNEDTEAMID() {
    return ASSIGNED_TEAM_ID;
  }

  public void setASSIGNEDTEAMID(Long ASSIGNED_TEAM_ID) {
    this.ASSIGNED_TEAM_ID = ASSIGNED_TEAM_ID;
  }

  public APITask ASSIGNED_DATE_UTC(Date ASSIGNED_DATE_UTC) {
    this.ASSIGNED_DATE_UTC = ASSIGNED_DATE_UTC;
    return this;
  }

   /**
   * Date when the Task was assigned
   * @return ASSIGNED_DATE_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date when the Task was assigned")
  public Date getASSIGNEDDATEUTC() {
    return ASSIGNED_DATE_UTC;
  }

  public void setASSIGNEDDATEUTC(Date ASSIGNED_DATE_UTC) {
    this.ASSIGNED_DATE_UTC = ASSIGNED_DATE_UTC;
  }

  public APITask OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * User ID of the Task record owner. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "User ID of the Task record owner. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public APITask DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time Task record created, as Coordinated Universal Time
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Task record created, as Coordinated Universal Time")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public APITask DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and time Task record updated, as Coordinated Universal Time
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Task record updated, as Coordinated Universal Time")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public APITask REMINDER_DATE_UTC(Date REMINDER_DATE_UTC) {
    this.REMINDER_DATE_UTC = REMINDER_DATE_UTC;
    return this;
  }

   /**
   * Reminder date and time of the Task, as Coordinated Universal Time
   * @return REMINDER_DATE_UTC
  **/
  @ApiModelProperty(example = "null", value = "Reminder date and time of the Task, as Coordinated Universal Time")
  public Date getREMINDERDATEUTC() {
    return REMINDER_DATE_UTC;
  }

  public void setREMINDERDATEUTC(Date REMINDER_DATE_UTC) {
    this.REMINDER_DATE_UTC = REMINDER_DATE_UTC;
  }

  public APITask REMINDER_SENT(Boolean REMINDER_SENT) {
    this.REMINDER_SENT = REMINDER_SENT;
    return this;
  }

   /**
   * True, if a reminder was sent
   * @return REMINDER_SENT
  **/
  @ApiModelProperty(example = "null", value = "True, if a reminder was sent")
  public Boolean getREMINDERSENT() {
    return REMINDER_SENT;
  }

  public void setREMINDERSENT(Boolean REMINDER_SENT) {
    this.REMINDER_SENT = REMINDER_SENT;
  }

  public APITask RECURRENCE(String RECURRENCE) {
    this.RECURRENCE = RECURRENCE;
    return this;
  }

   /**
   * Recurrence of the task or 'None' for the non-recurrent tasks.              Can be one of the following values: None, Daily, Weekday, Weekly, Biweekly, Monthly, Bimontly, Quaterly, Sixmonthly, Yearly.
   * @return RECURRENCE
  **/
  @ApiModelProperty(example = "null", value = "Recurrence of the task or 'None' for the non-recurrent tasks.              Can be one of the following values: None, Daily, Weekday, Weekly, Biweekly, Monthly, Bimontly, Quaterly, Sixmonthly, Yearly.")
  public String getRECURRENCE() {
    return RECURRENCE;
  }

  public void setRECURRENCE(String RECURRENCE) {
    this.RECURRENCE = RECURRENCE;
  }

  public APITask TASKLINKS(List<APITaskLink> TASKLINKS) {
    this.TASKLINKS = TASKLINKS;
    return this;
  }

  public APITask addTASKLINKSItem(APITaskLink TASKLINKSItem) {
    this.TASKLINKS.add(TASKLINKSItem);
    return this;
  }

   /**
   * Set of Links attached to the Task
   * @return TASKLINKS
  **/
  @ApiModelProperty(example = "null", value = "Set of Links attached to the Task")
  public List<APITaskLink> getTASKLINKS() {
    return TASKLINKS;
  }

  public void setTASKLINKS(List<APITaskLink> TASKLINKS) {
    this.TASKLINKS = TASKLINKS;
  }

  public APITask CAN_EDIT(Boolean CAN_EDIT) {
    this.CAN_EDIT = CAN_EDIT;
    return this;
  }

   /**
   * True, if the user retrieving this record is allowed to edit the record.
   * @return CAN_EDIT
  **/
  @ApiModelProperty(example = "null", value = "True, if the user retrieving this record is allowed to edit the record.")
  public Boolean getCANEDIT() {
    return CAN_EDIT;
  }

  public void setCANEDIT(Boolean CAN_EDIT) {
    this.CAN_EDIT = CAN_EDIT;
  }

  public APITask CAN_DELETE(Boolean CAN_DELETE) {
    this.CAN_DELETE = CAN_DELETE;
    return this;
  }

   /**
   * True, if the user retrieving this record is allowed to delete the record.
   * @return CAN_DELETE
  **/
  @ApiModelProperty(example = "null", value = "True, if the user retrieving this record is allowed to delete the record.")
  public Boolean getCANDELETE() {
    return CAN_DELETE;
  }

  public void setCANDELETE(Boolean CAN_DELETE) {
    this.CAN_DELETE = CAN_DELETE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APITask apITask = (APITask) o;
    return Objects.equals(this.TASK_ID, apITask.TASK_ID) &&
        Objects.equals(this.TITLE, apITask.TITLE) &&
        Objects.equals(this.CATEGORY_ID, apITask.CATEGORY_ID) &&
        Objects.equals(this.DUE_DATE, apITask.DUE_DATE) &&
        Objects.equals(this.COMPLETED_DATE_UTC, apITask.COMPLETED_DATE_UTC) &&
        Objects.equals(this.PUBLICLY_VISIBLE, apITask.PUBLICLY_VISIBLE) &&
        Objects.equals(this.COMPLETED, apITask.COMPLETED) &&
        Objects.equals(this.PROJECT_ID, apITask.PROJECT_ID) &&
        Objects.equals(this.OPPORTUNITY_ID, apITask.OPPORTUNITY_ID) &&
        Objects.equals(this.MILESTONE_ID, apITask.MILESTONE_ID) &&
        Objects.equals(this.PIPELINE_ID, apITask.PIPELINE_ID) &&
        Objects.equals(this.STAGE_ID, apITask.STAGE_ID) &&
        Objects.equals(this.DETAILS, apITask.DETAILS) &&
        Objects.equals(this.STATUS, apITask.STATUS) &&
        Objects.equals(this.PRIORITY, apITask.PRIORITY) &&
        Objects.equals(this.PERCENT_COMPLETE, apITask.PERCENT_COMPLETE) &&
        Objects.equals(this.START_DATE, apITask.START_DATE) &&
        Objects.equals(this.ASSIGNED_BY_USER_ID, apITask.ASSIGNED_BY_USER_ID) &&
        Objects.equals(this.PARENT_TASK_ID, apITask.PARENT_TASK_ID) &&
        Objects.equals(this.OWNER_VISIBLE, apITask.OWNER_VISIBLE) &&
        Objects.equals(this.RESPONSIBLE_USER_ID, apITask.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.ASSIGNED_TEAM_ID, apITask.ASSIGNED_TEAM_ID) &&
        Objects.equals(this.ASSIGNED_DATE_UTC, apITask.ASSIGNED_DATE_UTC) &&
        Objects.equals(this.OWNER_USER_ID, apITask.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, apITask.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, apITask.DATE_UPDATED_UTC) &&
        Objects.equals(this.REMINDER_DATE_UTC, apITask.REMINDER_DATE_UTC) &&
        Objects.equals(this.REMINDER_SENT, apITask.REMINDER_SENT) &&
        Objects.equals(this.RECURRENCE, apITask.RECURRENCE) &&
        Objects.equals(this.TASKLINKS, apITask.TASKLINKS) &&
        Objects.equals(this.CAN_EDIT, apITask.CAN_EDIT) &&
        Objects.equals(this.CAN_DELETE, apITask.CAN_DELETE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(TASK_ID, TITLE, CATEGORY_ID, DUE_DATE, COMPLETED_DATE_UTC, PUBLICLY_VISIBLE, COMPLETED, PROJECT_ID, OPPORTUNITY_ID, MILESTONE_ID, PIPELINE_ID, STAGE_ID, DETAILS, STATUS, PRIORITY, PERCENT_COMPLETE, START_DATE, ASSIGNED_BY_USER_ID, PARENT_TASK_ID, OWNER_VISIBLE, RESPONSIBLE_USER_ID, ASSIGNED_TEAM_ID, ASSIGNED_DATE_UTC, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC, REMINDER_DATE_UTC, REMINDER_SENT, RECURRENCE, TASKLINKS, CAN_EDIT, CAN_DELETE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APITask {\n");
    
    sb.append("    TASK_ID: ").append(toIndentedString(TASK_ID)).append("\n");
    sb.append("    TITLE: ").append(toIndentedString(TITLE)).append("\n");
    sb.append("    CATEGORY_ID: ").append(toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    DUE_DATE: ").append(toIndentedString(DUE_DATE)).append("\n");
    sb.append("    COMPLETED_DATE_UTC: ").append(toIndentedString(COMPLETED_DATE_UTC)).append("\n");
    sb.append("    PUBLICLY_VISIBLE: ").append(toIndentedString(PUBLICLY_VISIBLE)).append("\n");
    sb.append("    COMPLETED: ").append(toIndentedString(COMPLETED)).append("\n");
    sb.append("    PROJECT_ID: ").append(toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    MILESTONE_ID: ").append(toIndentedString(MILESTONE_ID)).append("\n");
    sb.append("    PIPELINE_ID: ").append(toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    STAGE_ID: ").append(toIndentedString(STAGE_ID)).append("\n");
    sb.append("    DETAILS: ").append(toIndentedString(DETAILS)).append("\n");
    sb.append("    STATUS: ").append(toIndentedString(STATUS)).append("\n");
    sb.append("    PRIORITY: ").append(toIndentedString(PRIORITY)).append("\n");
    sb.append("    PERCENT_COMPLETE: ").append(toIndentedString(PERCENT_COMPLETE)).append("\n");
    sb.append("    START_DATE: ").append(toIndentedString(START_DATE)).append("\n");
    sb.append("    ASSIGNED_BY_USER_ID: ").append(toIndentedString(ASSIGNED_BY_USER_ID)).append("\n");
    sb.append("    PARENT_TASK_ID: ").append(toIndentedString(PARENT_TASK_ID)).append("\n");
    sb.append("    OWNER_VISIBLE: ").append(toIndentedString(OWNER_VISIBLE)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    ASSIGNED_TEAM_ID: ").append(toIndentedString(ASSIGNED_TEAM_ID)).append("\n");
    sb.append("    ASSIGNED_DATE_UTC: ").append(toIndentedString(ASSIGNED_DATE_UTC)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    REMINDER_DATE_UTC: ").append(toIndentedString(REMINDER_DATE_UTC)).append("\n");
    sb.append("    REMINDER_SENT: ").append(toIndentedString(REMINDER_SENT)).append("\n");
    sb.append("    RECURRENCE: ").append(toIndentedString(RECURRENCE)).append("\n");
    sb.append("    TASKLINKS: ").append(toIndentedString(TASKLINKS)).append("\n");
    sb.append("    CAN_EDIT: ").append(toIndentedString(CAN_EDIT)).append("\n");
    sb.append("    CAN_DELETE: ").append(toIndentedString(CAN_DELETE)).append("\n");
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

