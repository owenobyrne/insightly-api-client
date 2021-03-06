package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ly.insight.model.APIEventLink;
import java.io.Serializable;

/**
 * APICalendarEvent
 */
@ApiModel(description = "APICalendarEvent")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class CalendarEvent implements Serializable {
  @SerializedName("LOCATION")
  private String LOCATION = null;

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("PUBLICLY_VISIBLE")
  private Boolean PUBLICLY_VISIBLE = null;

  @SerializedName("START_DATE_UTC")
  private Date START_DATE_UTC = null;

  @SerializedName("DETAILS")
  private String DETAILS = null;

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("REMINDER_DATE_UTC")
  private Date REMINDER_DATE_UTC = null;

  @SerializedName("EVENTLINKS")
  private List<APIEventLink> EVENTLINKS = new ArrayList<APIEventLink>();

  @SerializedName("EVENT_ID")
  private Long EVENT_ID = null;

  @SerializedName("TITLE")
  private String TITLE = null;

  @SerializedName("END_DATE_UTC")
  private Date END_DATE_UTC = null;

  @SerializedName("ALL_DAY")
  private Boolean ALL_DAY = null;

  @SerializedName("REMINDER_SENT")
  private Boolean REMINDER_SENT = null;

  public CalendarEvent LOCATION(String LOCATION) {
    this.LOCATION = LOCATION;
    return this;
  }

   /**
   * Location of the event
   * @return LOCATION
  **/
  @ApiModelProperty(example = "null", value = "Location of the event")
  public String getLOCATION() {
    return LOCATION;
  }

  public void setLOCATION(String LOCATION) {
    this.LOCATION = LOCATION;
  }

  public CalendarEvent CAN_EDIT(Boolean CAN_EDIT) {
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

  public CalendarEvent PUBLICLY_VISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
    return this;
  }

   /**
   * True, if event is visible to others
   * @return PUBLICLY_VISIBLE
  **/
  @ApiModelProperty(example = "null", value = "True, if event is visible to others")
  public Boolean getPUBLICLYVISIBLE() {
    return PUBLICLY_VISIBLE;
  }

  public void setPUBLICLYVISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
  }

  public CalendarEvent START_DATE_UTC(Date START_DATE_UTC) {
    this.START_DATE_UTC = START_DATE_UTC;
    return this;
  }

   /**
   * Start date and time of the event, as Coordinated Universal Time
   * @return START_DATE_UTC
  **/
  @ApiModelProperty(example = "null", required = true, value = "Start date and time of the event, as Coordinated Universal Time")
  public Date getSTARTDATEUTC() {
    return START_DATE_UTC;
  }

  public void setSTARTDATEUTC(Date START_DATE_UTC) {
    this.START_DATE_UTC = START_DATE_UTC;
  }

  public CalendarEvent DETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
    return this;
  }

   /**
   * Details of the event
   * @return DETAILS
  **/
  @ApiModelProperty(example = "null", value = "Details of the event")
  public String getDETAILS() {
    return DETAILS;
  }

  public void setDETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
  }

  public CalendarEvent DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and time event record updated, as Coordinated Universal Time
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time event record updated, as Coordinated Universal Time")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public CalendarEvent CAN_DELETE(Boolean CAN_DELETE) {
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

  public CalendarEvent OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * User ID of the event owner (must be a valid user ID). This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "User ID of the event owner (must be a valid user ID). This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public CalendarEvent DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time event record created, as Coordinated Universal Time
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time event record created, as Coordinated Universal Time")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public CalendarEvent REMINDER_DATE_UTC(Date REMINDER_DATE_UTC) {
    this.REMINDER_DATE_UTC = REMINDER_DATE_UTC;
    return this;
  }

   /**
   * Reminder data and time of the event, as Coordinated Universal Time
   * @return REMINDER_DATE_UTC
  **/
  @ApiModelProperty(example = "null", value = "Reminder data and time of the event, as Coordinated Universal Time")
  public Date getREMINDERDATEUTC() {
    return REMINDER_DATE_UTC;
  }

  public void setREMINDERDATEUTC(Date REMINDER_DATE_UTC) {
    this.REMINDER_DATE_UTC = REMINDER_DATE_UTC;
  }

  public CalendarEvent EVENTLINKS(List<APIEventLink> EVENTLINKS) {
    this.EVENTLINKS = EVENTLINKS;
    return this;
  }

  public CalendarEvent addEVENTLINKSItem(APIEventLink EVENTLINKSItem) {
    this.EVENTLINKS.add(EVENTLINKSItem);
    return this;
  }

   /**
   * Set of links attached to the Event
   * @return EVENTLINKS
  **/
  @ApiModelProperty(example = "null", value = "Set of links attached to the Event")
  public List<APIEventLink> getEVENTLINKS() {
    return EVENTLINKS;
  }

  public void setEVENTLINKS(List<APIEventLink> EVENTLINKS) {
    this.EVENTLINKS = EVENTLINKS;
  }

  public CalendarEvent EVENT_ID(Long EVENT_ID) {
    this.EVENT_ID = EVENT_ID;
    return this;
  }

   /**
   * Unique ID for event record
   * @return EVENT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for event record")
  public Long getEVENTID() {
    return EVENT_ID;
  }

  public void setEVENTID(Long EVENT_ID) {
    this.EVENT_ID = EVENT_ID;
  }

  public CalendarEvent TITLE(String TITLE) {
    this.TITLE = TITLE;
    return this;
  }

   /**
   * Name or title of the event (required)
   * @return TITLE
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name or title of the event (required)")
  public String getTITLE() {
    return TITLE;
  }

  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  public CalendarEvent END_DATE_UTC(Date END_DATE_UTC) {
    this.END_DATE_UTC = END_DATE_UTC;
    return this;
  }

   /**
   * End date and time of the event, as Coordinated Universal Time
   * @return END_DATE_UTC
  **/
  @ApiModelProperty(example = "null", required = true, value = "End date and time of the event, as Coordinated Universal Time")
  public Date getENDDATEUTC() {
    return END_DATE_UTC;
  }

  public void setENDDATEUTC(Date END_DATE_UTC) {
    this.END_DATE_UTC = END_DATE_UTC;
  }

  public CalendarEvent ALL_DAY(Boolean ALL_DAY) {
    this.ALL_DAY = ALL_DAY;
    return this;
  }

   /**
   * True, if event is an all-day event
   * @return ALL_DAY
  **/
  @ApiModelProperty(example = "null", value = "True, if event is an all-day event")
  public Boolean getALLDAY() {
    return ALL_DAY;
  }

  public void setALLDAY(Boolean ALL_DAY) {
    this.ALL_DAY = ALL_DAY;
  }

  public CalendarEvent REMINDER_SENT(Boolean REMINDER_SENT) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarEvent calendarEvent = (CalendarEvent) o;
    return Objects.equals(this.LOCATION, calendarEvent.LOCATION) &&
        Objects.equals(this.CAN_EDIT, calendarEvent.CAN_EDIT) &&
        Objects.equals(this.PUBLICLY_VISIBLE, calendarEvent.PUBLICLY_VISIBLE) &&
        Objects.equals(this.START_DATE_UTC, calendarEvent.START_DATE_UTC) &&
        Objects.equals(this.DETAILS, calendarEvent.DETAILS) &&
        Objects.equals(this.DATE_UPDATED_UTC, calendarEvent.DATE_UPDATED_UTC) &&
        Objects.equals(this.CAN_DELETE, calendarEvent.CAN_DELETE) &&
        Objects.equals(this.OWNER_USER_ID, calendarEvent.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, calendarEvent.DATE_CREATED_UTC) &&
        Objects.equals(this.REMINDER_DATE_UTC, calendarEvent.REMINDER_DATE_UTC) &&
        Objects.equals(this.EVENTLINKS, calendarEvent.EVENTLINKS) &&
        Objects.equals(this.EVENT_ID, calendarEvent.EVENT_ID) &&
        Objects.equals(this.TITLE, calendarEvent.TITLE) &&
        Objects.equals(this.END_DATE_UTC, calendarEvent.END_DATE_UTC) &&
        Objects.equals(this.ALL_DAY, calendarEvent.ALL_DAY) &&
        Objects.equals(this.REMINDER_SENT, calendarEvent.REMINDER_SENT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LOCATION, CAN_EDIT, PUBLICLY_VISIBLE, START_DATE_UTC, DETAILS, DATE_UPDATED_UTC, CAN_DELETE, OWNER_USER_ID, DATE_CREATED_UTC, REMINDER_DATE_UTC, EVENTLINKS, EVENT_ID, TITLE, END_DATE_UTC, ALL_DAY, REMINDER_SENT);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarEvent {\n");
    
    sb.append("    LOCATION: ").append(toIndentedString(LOCATION)).append("\n");
    sb.append("    CAN_EDIT: ").append(toIndentedString(CAN_EDIT)).append("\n");
    sb.append("    PUBLICLY_VISIBLE: ").append(toIndentedString(PUBLICLY_VISIBLE)).append("\n");
    sb.append("    START_DATE_UTC: ").append(toIndentedString(START_DATE_UTC)).append("\n");
    sb.append("    DETAILS: ").append(toIndentedString(DETAILS)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    CAN_DELETE: ").append(toIndentedString(CAN_DELETE)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    REMINDER_DATE_UTC: ").append(toIndentedString(REMINDER_DATE_UTC)).append("\n");
    sb.append("    EVENTLINKS: ").append(toIndentedString(EVENTLINKS)).append("\n");
    sb.append("    EVENT_ID: ").append(toIndentedString(EVENT_ID)).append("\n");
    sb.append("    TITLE: ").append(toIndentedString(TITLE)).append("\n");
    sb.append("    END_DATE_UTC: ").append(toIndentedString(END_DATE_UTC)).append("\n");
    sb.append("    ALL_DAY: ").append(toIndentedString(ALL_DAY)).append("\n");
    sb.append("    REMINDER_SENT: ").append(toIndentedString(REMINDER_SENT)).append("\n");
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

