package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APIActivity
 */
@ApiModel(description = "APIActivity")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIActivity implements Serializable {
  @SerializedName("ACTIVITY_ID")
  private Long ACTIVITY_ID = null;

  @SerializedName("ACTIVITYSET_ID")
  private Long ACTIVITYSET_ID = null;

  @SerializedName("ACTIVITY_NAME")
  private String ACTIVITY_NAME = null;

  @SerializedName("ACTIVITY_DETAILS")
  private String ACTIVITY_DETAILS = null;

  @SerializedName("ACTIVITY_TYPE")
  private String ACTIVITY_TYPE = null;

  @SerializedName("CATEGORY_ID")
  private Long CATEGORY_ID = null;

  @SerializedName("REMINDER")
  private Boolean REMINDER = null;

  @SerializedName("REMINDER_DAYS_BEFORE_DUE")
  private Integer REMINDER_DAYS_BEFORE_DUE = null;

  @SerializedName("REMINDER_TIME")
  private String REMINDER_TIME = null;

  @SerializedName("PUBLICLY_VISIBLE")
  private Boolean PUBLICLY_VISIBLE = null;

  @SerializedName("OWNER_VISIBLE")
  private Boolean OWNER_VISIBLE = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("RESPONSIBLE_USER_ID")
  private Integer RESPONSIBLE_USER_ID = null;

  @SerializedName("ASSIGNED_TEAM_ID")
  private Long ASSIGNED_TEAM_ID = null;

  @SerializedName("SKIP_SUN")
  private Boolean SKIP_SUN = null;

  @SerializedName("SKIP_MON")
  private Boolean SKIP_MON = null;

  @SerializedName("SKIP_TUE")
  private Boolean SKIP_TUE = null;

  @SerializedName("SKIP_WED")
  private Boolean SKIP_WED = null;

  @SerializedName("SKIP_THU")
  private Boolean SKIP_THU = null;

  @SerializedName("SKIP_FRI")
  private Boolean SKIP_FRI = null;

  @SerializedName("SKIP_SAT")
  private Boolean SKIP_SAT = null;

  @SerializedName("DUE_DAYS_AFTER_START")
  private Integer DUE_DAYS_AFTER_START = null;

  @SerializedName("DUE_DAYS_BEFORE_END")
  private Integer DUE_DAYS_BEFORE_END = null;

  @SerializedName("EVENT_DAYS_AFTER_START")
  private Integer EVENT_DAYS_AFTER_START = null;

  @SerializedName("EVENT_DAYS_BEFORE_END")
  private Integer EVENT_DAYS_BEFORE_END = null;

  @SerializedName("EVENT_TIME")
  private String EVENT_TIME = null;

  @SerializedName("ALL_DAY")
  private Boolean ALL_DAY = null;

  @SerializedName("DURATION")
  private Integer DURATION = null;

  public APIActivity ACTIVITY_ID(Long ACTIVITY_ID) {
    this.ACTIVITY_ID = ACTIVITY_ID;
    return this;
  }

   /**
   * Unique ID for the Activity
   * @return ACTIVITY_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Activity")
  public Long getACTIVITYID() {
    return ACTIVITY_ID;
  }

  public void setACTIVITYID(Long ACTIVITY_ID) {
    this.ACTIVITY_ID = ACTIVITY_ID;
  }

  public APIActivity ACTIVITYSET_ID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
    return this;
  }

   /**
   * Unique ID for the Activity Set record that this Activity belongs to
   * @return ACTIVITYSET_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Activity Set record that this Activity belongs to")
  public Long getACTIVITYSETID() {
    return ACTIVITYSET_ID;
  }

  public void setACTIVITYSETID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
  }

  public APIActivity ACTIVITY_NAME(String ACTIVITY_NAME) {
    this.ACTIVITY_NAME = ACTIVITY_NAME;
    return this;
  }

   /**
   * The name for the Activity
   * @return ACTIVITY_NAME
  **/
  @ApiModelProperty(example = "null", value = "The name for the Activity")
  public String getACTIVITYNAME() {
    return ACTIVITY_NAME;
  }

  public void setACTIVITYNAME(String ACTIVITY_NAME) {
    this.ACTIVITY_NAME = ACTIVITY_NAME;
  }

  public APIActivity ACTIVITY_DETAILS(String ACTIVITY_DETAILS) {
    this.ACTIVITY_DETAILS = ACTIVITY_DETAILS;
    return this;
  }

   /**
   * The details for the Activity
   * @return ACTIVITY_DETAILS
  **/
  @ApiModelProperty(example = "null", value = "The details for the Activity")
  public String getACTIVITYDETAILS() {
    return ACTIVITY_DETAILS;
  }

  public void setACTIVITYDETAILS(String ACTIVITY_DETAILS) {
    this.ACTIVITY_DETAILS = ACTIVITY_DETAILS;
  }

  public APIActivity ACTIVITY_TYPE(String ACTIVITY_TYPE) {
    this.ACTIVITY_TYPE = ACTIVITY_TYPE;
    return this;
  }

   /**
   * The type of Activity
   * @return ACTIVITY_TYPE
  **/
  @ApiModelProperty(example = "null", value = "The type of Activity")
  public String getACTIVITYTYPE() {
    return ACTIVITY_TYPE;
  }

  public void setACTIVITYTYPE(String ACTIVITY_TYPE) {
    this.ACTIVITY_TYPE = ACTIVITY_TYPE;
  }

  public APIActivity CATEGORY_ID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
    return this;
  }

   /**
   * The unique ID for the category associated with the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   * @return CATEGORY_ID
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for the category associated with the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }

  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  public APIActivity REMINDER(Boolean REMINDER) {
    this.REMINDER = REMINDER;
    return this;
  }

   /**
   * Whether or not a reminder is set on the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   * @return REMINDER
  **/
  @ApiModelProperty(example = "null", value = "Whether or not a reminder is set on the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  public Boolean getREMINDER() {
    return REMINDER;
  }

  public void setREMINDER(Boolean REMINDER) {
    this.REMINDER = REMINDER;
  }

  public APIActivity REMINDER_DAYS_BEFORE_DUE(Integer REMINDER_DAYS_BEFORE_DUE) {
    this.REMINDER_DAYS_BEFORE_DUE = REMINDER_DAYS_BEFORE_DUE;
    return this;
  }

   /**
   * Number of days before due date of the Activity a reminder will be sent out. Only applicable if the ACTIVITY_TYPE is set to TASK.
   * @return REMINDER_DAYS_BEFORE_DUE
  **/
  @ApiModelProperty(example = "null", value = "Number of days before due date of the Activity a reminder will be sent out. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  public Integer getREMINDERDAYSBEFOREDUE() {
    return REMINDER_DAYS_BEFORE_DUE;
  }

  public void setREMINDERDAYSBEFOREDUE(Integer REMINDER_DAYS_BEFORE_DUE) {
    this.REMINDER_DAYS_BEFORE_DUE = REMINDER_DAYS_BEFORE_DUE;
  }

  public APIActivity REMINDER_TIME(String REMINDER_TIME) {
    this.REMINDER_TIME = REMINDER_TIME;
    return this;
  }

   /**
   * The time when a reminder will be sent out for the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   * @return REMINDER_TIME
  **/
  @ApiModelProperty(example = "null", value = "The time when a reminder will be sent out for the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  public String getREMINDERTIME() {
    return REMINDER_TIME;
  }

  public void setREMINDERTIME(String REMINDER_TIME) {
    this.REMINDER_TIME = REMINDER_TIME;
  }

  public APIActivity PUBLICLY_VISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
    return this;
  }

   /**
   * Whether the Activity is publicly visible.
   * @return PUBLICLY_VISIBLE
  **/
  @ApiModelProperty(example = "null", value = "Whether the Activity is publicly visible.")
  public Boolean getPUBLICLYVISIBLE() {
    return PUBLICLY_VISIBLE;
  }

  public void setPUBLICLYVISIBLE(Boolean PUBLICLY_VISIBLE) {
    this.PUBLICLY_VISIBLE = PUBLICLY_VISIBLE;
  }

  public APIActivity OWNER_VISIBLE(Boolean OWNER_VISIBLE) {
    this.OWNER_VISIBLE = OWNER_VISIBLE;
    return this;
  }

   /**
   * Whether the Activity is visible to the Owner.
   * @return OWNER_VISIBLE
  **/
  @ApiModelProperty(example = "null", value = "Whether the Activity is visible to the Owner.")
  public Boolean getOWNERVISIBLE() {
    return OWNER_VISIBLE;
  }

  public void setOWNERVISIBLE(Boolean OWNER_VISIBLE) {
    this.OWNER_VISIBLE = OWNER_VISIBLE;
  }

  public APIActivity OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * The unique ID for the Owner of the Activity. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for the Owner of the Activity. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public APIActivity RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
    return this;
  }

   /**
   * The unique ID for the Responsible User of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   * @return RESPONSIBLE_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for the Responsible User of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }

  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  public APIActivity ASSIGNED_TEAM_ID(Long ASSIGNED_TEAM_ID) {
    this.ASSIGNED_TEAM_ID = ASSIGNED_TEAM_ID;
    return this;
  }

   /**
   * The unique ID for the Responsible Team of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.
   * @return ASSIGNED_TEAM_ID
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for the Responsible Team of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  public Long getASSIGNEDTEAMID() {
    return ASSIGNED_TEAM_ID;
  }

  public void setASSIGNEDTEAMID(Long ASSIGNED_TEAM_ID) {
    this.ASSIGNED_TEAM_ID = ASSIGNED_TEAM_ID;
  }

  public APIActivity SKIP_SUN(Boolean SKIP_SUN) {
    this.SKIP_SUN = SKIP_SUN;
    return this;
  }

   /**
   * Whether or not to skip scheduling of this Activity on a Sunday.
   * @return SKIP_SUN
  **/
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Sunday.")
  public Boolean getSKIPSUN() {
    return SKIP_SUN;
  }

  public void setSKIPSUN(Boolean SKIP_SUN) {
    this.SKIP_SUN = SKIP_SUN;
  }

  public APIActivity SKIP_MON(Boolean SKIP_MON) {
    this.SKIP_MON = SKIP_MON;
    return this;
  }

   /**
   * Whether or not to skip scheduling of this Activity on a Monday.
   * @return SKIP_MON
  **/
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Monday.")
  public Boolean getSKIPMON() {
    return SKIP_MON;
  }

  public void setSKIPMON(Boolean SKIP_MON) {
    this.SKIP_MON = SKIP_MON;
  }

  public APIActivity SKIP_TUE(Boolean SKIP_TUE) {
    this.SKIP_TUE = SKIP_TUE;
    return this;
  }

   /**
   * Whether or not to skip scheduling of this Activity on a Tuesday.
   * @return SKIP_TUE
  **/
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Tuesday.")
  public Boolean getSKIPTUE() {
    return SKIP_TUE;
  }

  public void setSKIPTUE(Boolean SKIP_TUE) {
    this.SKIP_TUE = SKIP_TUE;
  }

  public APIActivity SKIP_WED(Boolean SKIP_WED) {
    this.SKIP_WED = SKIP_WED;
    return this;
  }

   /**
   * Whether or not to skip scheduling of this Activity on a Wednesday.
   * @return SKIP_WED
  **/
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Wednesday.")
  public Boolean getSKIPWED() {
    return SKIP_WED;
  }

  public void setSKIPWED(Boolean SKIP_WED) {
    this.SKIP_WED = SKIP_WED;
  }

  public APIActivity SKIP_THU(Boolean SKIP_THU) {
    this.SKIP_THU = SKIP_THU;
    return this;
  }

   /**
   * Whether or not to skip scheduling of this Activity on a Thursday.
   * @return SKIP_THU
  **/
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Thursday.")
  public Boolean getSKIPTHU() {
    return SKIP_THU;
  }

  public void setSKIPTHU(Boolean SKIP_THU) {
    this.SKIP_THU = SKIP_THU;
  }

  public APIActivity SKIP_FRI(Boolean SKIP_FRI) {
    this.SKIP_FRI = SKIP_FRI;
    return this;
  }

   /**
   * Whether or not to skip scheduling of this Activity on a Friday.
   * @return SKIP_FRI
  **/
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Friday.")
  public Boolean getSKIPFRI() {
    return SKIP_FRI;
  }

  public void setSKIPFRI(Boolean SKIP_FRI) {
    this.SKIP_FRI = SKIP_FRI;
  }

  public APIActivity SKIP_SAT(Boolean SKIP_SAT) {
    this.SKIP_SAT = SKIP_SAT;
    return this;
  }

   /**
   * Whether or not to skip scheduling of this Activity on a Saturday.
   * @return SKIP_SAT
  **/
  @ApiModelProperty(example = "null", value = "Whether or not to skip scheduling of this Activity on a Saturday.")
  public Boolean getSKIPSAT() {
    return SKIP_SAT;
  }

  public void setSKIPSAT(Boolean SKIP_SAT) {
    this.SKIP_SAT = SKIP_SAT;
  }

  public APIActivity DUE_DAYS_AFTER_START(Integer DUE_DAYS_AFTER_START) {
    this.DUE_DAYS_AFTER_START = DUE_DAYS_AFTER_START;
    return this;
  }

   /**
   * Determines the due date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to TASK.
   * @return DUE_DAYS_AFTER_START
  **/
  @ApiModelProperty(example = "null", value = "Determines the due date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  public Integer getDUEDAYSAFTERSTART() {
    return DUE_DAYS_AFTER_START;
  }

  public void setDUEDAYSAFTERSTART(Integer DUE_DAYS_AFTER_START) {
    this.DUE_DAYS_AFTER_START = DUE_DAYS_AFTER_START;
  }

  public APIActivity DUE_DAYS_BEFORE_END(Integer DUE_DAYS_BEFORE_END) {
    this.DUE_DAYS_BEFORE_END = DUE_DAYS_BEFORE_END;
    return this;
  }

   /**
   * Determines the due date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to TASK.
   * @return DUE_DAYS_BEFORE_END
  **/
  @ApiModelProperty(example = "null", value = "Determines the due date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to TASK.")
  public Integer getDUEDAYSBEFOREEND() {
    return DUE_DAYS_BEFORE_END;
  }

  public void setDUEDAYSBEFOREEND(Integer DUE_DAYS_BEFORE_END) {
    this.DUE_DAYS_BEFORE_END = DUE_DAYS_BEFORE_END;
  }

  public APIActivity EVENT_DAYS_AFTER_START(Integer EVENT_DAYS_AFTER_START) {
    this.EVENT_DAYS_AFTER_START = EVENT_DAYS_AFTER_START;
    return this;
  }

   /**
   * Determines the event date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   * @return EVENT_DAYS_AFTER_START
  **/
  @ApiModelProperty(example = "null", value = "Determines the event date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  public Integer getEVENTDAYSAFTERSTART() {
    return EVENT_DAYS_AFTER_START;
  }

  public void setEVENTDAYSAFTERSTART(Integer EVENT_DAYS_AFTER_START) {
    this.EVENT_DAYS_AFTER_START = EVENT_DAYS_AFTER_START;
  }

  public APIActivity EVENT_DAYS_BEFORE_END(Integer EVENT_DAYS_BEFORE_END) {
    this.EVENT_DAYS_BEFORE_END = EVENT_DAYS_BEFORE_END;
    return this;
  }

   /**
   * Determines the event date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   * @return EVENT_DAYS_BEFORE_END
  **/
  @ApiModelProperty(example = "null", value = "Determines the event date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  public Integer getEVENTDAYSBEFOREEND() {
    return EVENT_DAYS_BEFORE_END;
  }

  public void setEVENTDAYSBEFOREEND(Integer EVENT_DAYS_BEFORE_END) {
    this.EVENT_DAYS_BEFORE_END = EVENT_DAYS_BEFORE_END;
  }

  public APIActivity EVENT_TIME(String EVENT_TIME) {
    this.EVENT_TIME = EVENT_TIME;
    return this;
  }

   /**
   * The time of the event. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   * @return EVENT_TIME
  **/
  @ApiModelProperty(example = "null", value = "The time of the event. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  public String getEVENTTIME() {
    return EVENT_TIME;
  }

  public void setEVENTTIME(String EVENT_TIME) {
    this.EVENT_TIME = EVENT_TIME;
  }

  public APIActivity ALL_DAY(Boolean ALL_DAY) {
    this.ALL_DAY = ALL_DAY;
    return this;
  }

   /**
   * Whether or not the event is an all day event. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   * @return ALL_DAY
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the event is an all day event. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  public Boolean getALLDAY() {
    return ALL_DAY;
  }

  public void setALLDAY(Boolean ALL_DAY) {
    this.ALL_DAY = ALL_DAY;
  }

  public APIActivity DURATION(Integer DURATION) {
    this.DURATION = DURATION;
    return this;
  }

   /**
   * Duration of the event in hours. Only applicable if the ACTIVITY_TYPE is set to EVENT.
   * @return DURATION
  **/
  @ApiModelProperty(example = "null", value = "Duration of the event in hours. Only applicable if the ACTIVITY_TYPE is set to EVENT.")
  public Integer getDURATION() {
    return DURATION;
  }

  public void setDURATION(Integer DURATION) {
    this.DURATION = DURATION;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIActivity apIActivity = (APIActivity) o;
    return Objects.equals(this.ACTIVITY_ID, apIActivity.ACTIVITY_ID) &&
        Objects.equals(this.ACTIVITYSET_ID, apIActivity.ACTIVITYSET_ID) &&
        Objects.equals(this.ACTIVITY_NAME, apIActivity.ACTIVITY_NAME) &&
        Objects.equals(this.ACTIVITY_DETAILS, apIActivity.ACTIVITY_DETAILS) &&
        Objects.equals(this.ACTIVITY_TYPE, apIActivity.ACTIVITY_TYPE) &&
        Objects.equals(this.CATEGORY_ID, apIActivity.CATEGORY_ID) &&
        Objects.equals(this.REMINDER, apIActivity.REMINDER) &&
        Objects.equals(this.REMINDER_DAYS_BEFORE_DUE, apIActivity.REMINDER_DAYS_BEFORE_DUE) &&
        Objects.equals(this.REMINDER_TIME, apIActivity.REMINDER_TIME) &&
        Objects.equals(this.PUBLICLY_VISIBLE, apIActivity.PUBLICLY_VISIBLE) &&
        Objects.equals(this.OWNER_VISIBLE, apIActivity.OWNER_VISIBLE) &&
        Objects.equals(this.OWNER_USER_ID, apIActivity.OWNER_USER_ID) &&
        Objects.equals(this.RESPONSIBLE_USER_ID, apIActivity.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.ASSIGNED_TEAM_ID, apIActivity.ASSIGNED_TEAM_ID) &&
        Objects.equals(this.SKIP_SUN, apIActivity.SKIP_SUN) &&
        Objects.equals(this.SKIP_MON, apIActivity.SKIP_MON) &&
        Objects.equals(this.SKIP_TUE, apIActivity.SKIP_TUE) &&
        Objects.equals(this.SKIP_WED, apIActivity.SKIP_WED) &&
        Objects.equals(this.SKIP_THU, apIActivity.SKIP_THU) &&
        Objects.equals(this.SKIP_FRI, apIActivity.SKIP_FRI) &&
        Objects.equals(this.SKIP_SAT, apIActivity.SKIP_SAT) &&
        Objects.equals(this.DUE_DAYS_AFTER_START, apIActivity.DUE_DAYS_AFTER_START) &&
        Objects.equals(this.DUE_DAYS_BEFORE_END, apIActivity.DUE_DAYS_BEFORE_END) &&
        Objects.equals(this.EVENT_DAYS_AFTER_START, apIActivity.EVENT_DAYS_AFTER_START) &&
        Objects.equals(this.EVENT_DAYS_BEFORE_END, apIActivity.EVENT_DAYS_BEFORE_END) &&
        Objects.equals(this.EVENT_TIME, apIActivity.EVENT_TIME) &&
        Objects.equals(this.ALL_DAY, apIActivity.ALL_DAY) &&
        Objects.equals(this.DURATION, apIActivity.DURATION);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ACTIVITY_ID, ACTIVITYSET_ID, ACTIVITY_NAME, ACTIVITY_DETAILS, ACTIVITY_TYPE, CATEGORY_ID, REMINDER, REMINDER_DAYS_BEFORE_DUE, REMINDER_TIME, PUBLICLY_VISIBLE, OWNER_VISIBLE, OWNER_USER_ID, RESPONSIBLE_USER_ID, ASSIGNED_TEAM_ID, SKIP_SUN, SKIP_MON, SKIP_TUE, SKIP_WED, SKIP_THU, SKIP_FRI, SKIP_SAT, DUE_DAYS_AFTER_START, DUE_DAYS_BEFORE_END, EVENT_DAYS_AFTER_START, EVENT_DAYS_BEFORE_END, EVENT_TIME, ALL_DAY, DURATION);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIActivity {\n");
    
    sb.append("    ACTIVITY_ID: ").append(toIndentedString(ACTIVITY_ID)).append("\n");
    sb.append("    ACTIVITYSET_ID: ").append(toIndentedString(ACTIVITYSET_ID)).append("\n");
    sb.append("    ACTIVITY_NAME: ").append(toIndentedString(ACTIVITY_NAME)).append("\n");
    sb.append("    ACTIVITY_DETAILS: ").append(toIndentedString(ACTIVITY_DETAILS)).append("\n");
    sb.append("    ACTIVITY_TYPE: ").append(toIndentedString(ACTIVITY_TYPE)).append("\n");
    sb.append("    CATEGORY_ID: ").append(toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    REMINDER: ").append(toIndentedString(REMINDER)).append("\n");
    sb.append("    REMINDER_DAYS_BEFORE_DUE: ").append(toIndentedString(REMINDER_DAYS_BEFORE_DUE)).append("\n");
    sb.append("    REMINDER_TIME: ").append(toIndentedString(REMINDER_TIME)).append("\n");
    sb.append("    PUBLICLY_VISIBLE: ").append(toIndentedString(PUBLICLY_VISIBLE)).append("\n");
    sb.append("    OWNER_VISIBLE: ").append(toIndentedString(OWNER_VISIBLE)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    ASSIGNED_TEAM_ID: ").append(toIndentedString(ASSIGNED_TEAM_ID)).append("\n");
    sb.append("    SKIP_SUN: ").append(toIndentedString(SKIP_SUN)).append("\n");
    sb.append("    SKIP_MON: ").append(toIndentedString(SKIP_MON)).append("\n");
    sb.append("    SKIP_TUE: ").append(toIndentedString(SKIP_TUE)).append("\n");
    sb.append("    SKIP_WED: ").append(toIndentedString(SKIP_WED)).append("\n");
    sb.append("    SKIP_THU: ").append(toIndentedString(SKIP_THU)).append("\n");
    sb.append("    SKIP_FRI: ").append(toIndentedString(SKIP_FRI)).append("\n");
    sb.append("    SKIP_SAT: ").append(toIndentedString(SKIP_SAT)).append("\n");
    sb.append("    DUE_DAYS_AFTER_START: ").append(toIndentedString(DUE_DAYS_AFTER_START)).append("\n");
    sb.append("    DUE_DAYS_BEFORE_END: ").append(toIndentedString(DUE_DAYS_BEFORE_END)).append("\n");
    sb.append("    EVENT_DAYS_AFTER_START: ").append(toIndentedString(EVENT_DAYS_AFTER_START)).append("\n");
    sb.append("    EVENT_DAYS_BEFORE_END: ").append(toIndentedString(EVENT_DAYS_BEFORE_END)).append("\n");
    sb.append("    EVENT_TIME: ").append(toIndentedString(EVENT_TIME)).append("\n");
    sb.append("    ALL_DAY: ").append(toIndentedString(ALL_DAY)).append("\n");
    sb.append("    DURATION: ").append(toIndentedString(DURATION)).append("\n");
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

