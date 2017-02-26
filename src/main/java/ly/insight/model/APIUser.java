package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;

/**
 * APIUser
 */
@ApiModel(description = "APIUser")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIUser implements Serializable {
  @SerializedName("USER_ID")
  private Long USER_ID = null;

  @SerializedName("CONTACT_ID")
  private Long CONTACT_ID = null;

  @SerializedName("FIRST_NAME")
  private String FIRST_NAME = null;

  @SerializedName("LAST_NAME")
  private String LAST_NAME = null;

  @SerializedName("TIMEZONE_ID")
  private String TIMEZONE_ID = null;

  @SerializedName("EMAIL_ADDRESS")
  private String EMAIL_ADDRESS = null;

  @SerializedName("EMAIL_DROPBOX_IDENTIFIER")
  private String EMAIL_DROPBOX_IDENTIFIER = null;

  @SerializedName("EMAIL_DROPBOX_ADDRESS")
  private String EMAIL_DROPBOX_ADDRESS = null;

  @SerializedName("ADMINISTRATOR")
  private Boolean ADMINISTRATOR = null;

  @SerializedName("ACCOUNT_OWNER")
  private Boolean ACCOUNT_OWNER = null;

  @SerializedName("ACTIVE")
  private Boolean ACTIVE = null;

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("USER_CURRENCY")
  private String USER_CURRENCY = null;

  @SerializedName("CONTACT_DISPLAY")
  private String CONTACT_DISPLAY = null;

  @SerializedName("CONTACT_ORDER")
  private String CONTACT_ORDER = null;

  @SerializedName("TASK_WEEK_START")
  private Integer TASK_WEEK_START = null;

  @SerializedName("INSTANCE_ID")
  private Long INSTANCE_ID = null;

  public APIUser USER_ID(Long USER_ID) {
    this.USER_ID = USER_ID;
    return this;
  }

   /**
   * Unique ID for the user record
   * @return USER_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the user record")
  public Long getUSERID() {
    return USER_ID;
  }

  public void setUSERID(Long USER_ID) {
    this.USER_ID = USER_ID;
  }

  public APIUser CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }

   /**
   * Unique ID for the Contact record corresponding to the User
   * @return CONTACT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Contact record corresponding to the User")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }

  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  public APIUser FIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
    return this;
  }

   /**
   * First name
   * @return FIRST_NAME
  **/
  @ApiModelProperty(example = "null", value = "First name")
  public String getFIRSTNAME() {
    return FIRST_NAME;
  }

  public void setFIRSTNAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }

  public APIUser LAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
    return this;
  }

   /**
   * Last name
   * @return LAST_NAME
  **/
  @ApiModelProperty(example = "null", value = "Last name")
  public String getLASTNAME() {
    return LAST_NAME;
  }

  public void setLASTNAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }

  public APIUser TIMEZONE_ID(String TIMEZONE_ID) {
    this.TIMEZONE_ID = TIMEZONE_ID;
    return this;
  }

   /**
   * Timezone ID as set by the User in the User's regional settings
   * @return TIMEZONE_ID
  **/
  @ApiModelProperty(example = "null", value = "Timezone ID as set by the User in the User's regional settings")
  public String getTIMEZONEID() {
    return TIMEZONE_ID;
  }

  public void setTIMEZONEID(String TIMEZONE_ID) {
    this.TIMEZONE_ID = TIMEZONE_ID;
  }

  public APIUser EMAIL_ADDRESS(String EMAIL_ADDRESS) {
    this.EMAIL_ADDRESS = EMAIL_ADDRESS;
    return this;
  }

   /**
   * User's email address
   * @return EMAIL_ADDRESS
  **/
  @ApiModelProperty(example = "null", value = "User's email address")
  public String getEMAILADDRESS() {
    return EMAIL_ADDRESS;
  }

  public void setEMAILADDRESS(String EMAIL_ADDRESS) {
    this.EMAIL_ADDRESS = EMAIL_ADDRESS;
  }

  public APIUser EMAIL_DROPBOX_IDENTIFIER(String EMAIL_DROPBOX_IDENTIFIER) {
    this.EMAIL_DROPBOX_IDENTIFIER = EMAIL_DROPBOX_IDENTIFIER;
    return this;
  }

   /**
   * Identifier for the User's Email Mailbox
   * @return EMAIL_DROPBOX_IDENTIFIER
  **/
  @ApiModelProperty(example = "null", value = "Identifier for the User's Email Mailbox")
  public String getEMAILDROPBOXIDENTIFIER() {
    return EMAIL_DROPBOX_IDENTIFIER;
  }

  public void setEMAILDROPBOXIDENTIFIER(String EMAIL_DROPBOX_IDENTIFIER) {
    this.EMAIL_DROPBOX_IDENTIFIER = EMAIL_DROPBOX_IDENTIFIER;
  }

  public APIUser EMAIL_DROPBOX_ADDRESS(String EMAIL_DROPBOX_ADDRESS) {
    this.EMAIL_DROPBOX_ADDRESS = EMAIL_DROPBOX_ADDRESS;
    return this;
  }

   /**
   * The User's Email Mailbox address. Derived from the EMAIL_DROPBOX_IDENTIFIER.
   * @return EMAIL_DROPBOX_ADDRESS
  **/
  @ApiModelProperty(example = "null", value = "The User's Email Mailbox address. Derived from the EMAIL_DROPBOX_IDENTIFIER.")
  public String getEMAILDROPBOXADDRESS() {
    return EMAIL_DROPBOX_ADDRESS;
  }

  public void setEMAILDROPBOXADDRESS(String EMAIL_DROPBOX_ADDRESS) {
    this.EMAIL_DROPBOX_ADDRESS = EMAIL_DROPBOX_ADDRESS;
  }

  public APIUser ADMINISTRATOR(Boolean ADMINISTRATOR) {
    this.ADMINISTRATOR = ADMINISTRATOR;
    return this;
  }

   /**
   * True, if the User is an Administrator for the Insightly instance
   * @return ADMINISTRATOR
  **/
  @ApiModelProperty(example = "null", value = "True, if the User is an Administrator for the Insightly instance")
  public Boolean getADMINISTRATOR() {
    return ADMINISTRATOR;
  }

  public void setADMINISTRATOR(Boolean ADMINISTRATOR) {
    this.ADMINISTRATOR = ADMINISTRATOR;
  }

  public APIUser ACCOUNT_OWNER(Boolean ACCOUNT_OWNER) {
    this.ACCOUNT_OWNER = ACCOUNT_OWNER;
    return this;
  }

   /**
   * True, if the User is the Account owner for the Insightly instance
   * @return ACCOUNT_OWNER
  **/
  @ApiModelProperty(example = "null", value = "True, if the User is the Account owner for the Insightly instance")
  public Boolean getACCOUNTOWNER() {
    return ACCOUNT_OWNER;
  }

  public void setACCOUNTOWNER(Boolean ACCOUNT_OWNER) {
    this.ACCOUNT_OWNER = ACCOUNT_OWNER;
  }

  public APIUser ACTIVE(Boolean ACTIVE) {
    this.ACTIVE = ACTIVE;
    return this;
  }

   /**
   * True, if the account is active
   * @return ACTIVE
  **/
  @ApiModelProperty(example = "null", value = "True, if the account is active")
  public Boolean getACTIVE() {
    return ACTIVE;
  }

  public void setACTIVE(Boolean ACTIVE) {
    this.ACTIVE = ACTIVE;
  }

  public APIUser DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time User record created, as Coordinated Universal Time
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time User record created, as Coordinated Universal Time")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public APIUser DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and time User record updated, as Coordinated Universal Time
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time User record updated, as Coordinated Universal Time")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public APIUser USER_CURRENCY(String USER_CURRENCY) {
    this.USER_CURRENCY = USER_CURRENCY;
    return this;
  }

   /**
   * User's regional setting for Currency
   * @return USER_CURRENCY
  **/
  @ApiModelProperty(example = "null", value = "User's regional setting for Currency")
  public String getUSERCURRENCY() {
    return USER_CURRENCY;
  }

  public void setUSERCURRENCY(String USER_CURRENCY) {
    this.USER_CURRENCY = USER_CURRENCY;
  }

  public APIUser CONTACT_DISPLAY(String CONTACT_DISPLAY) {
    this.CONTACT_DISPLAY = CONTACT_DISPLAY;
    return this;
  }

   /**
   * User's setting for Contact List display
   * @return CONTACT_DISPLAY
  **/
  @ApiModelProperty(example = "null", value = "User's setting for Contact List display")
  public String getCONTACTDISPLAY() {
    return CONTACT_DISPLAY;
  }

  public void setCONTACTDISPLAY(String CONTACT_DISPLAY) {
    this.CONTACT_DISPLAY = CONTACT_DISPLAY;
  }

  public APIUser CONTACT_ORDER(String CONTACT_ORDER) {
    this.CONTACT_ORDER = CONTACT_ORDER;
    return this;
  }

   /**
   * User's settting for Contact List order
   * @return CONTACT_ORDER
  **/
  @ApiModelProperty(example = "null", value = "User's settting for Contact List order")
  public String getCONTACTORDER() {
    return CONTACT_ORDER;
  }

  public void setCONTACTORDER(String CONTACT_ORDER) {
    this.CONTACT_ORDER = CONTACT_ORDER;
  }

  public APIUser TASK_WEEK_START(Integer TASK_WEEK_START) {
    this.TASK_WEEK_START = TASK_WEEK_START;
    return this;
  }

   /**
   * User's start day of week
   * @return TASK_WEEK_START
  **/
  @ApiModelProperty(example = "null", value = "User's start day of week")
  public Integer getTASKWEEKSTART() {
    return TASK_WEEK_START;
  }

  public void setTASKWEEKSTART(Integer TASK_WEEK_START) {
    this.TASK_WEEK_START = TASK_WEEK_START;
  }

  public APIUser INSTANCE_ID(Long INSTANCE_ID) {
    this.INSTANCE_ID = INSTANCE_ID;
    return this;
  }

   /**
   * Unique key of the Instance which this User belongs to
   * @return INSTANCE_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique key of the Instance which this User belongs to")
  public Long getINSTANCEID() {
    return INSTANCE_ID;
  }

  public void setINSTANCEID(Long INSTANCE_ID) {
    this.INSTANCE_ID = INSTANCE_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIUser apIUser = (APIUser) o;
    return Objects.equals(this.USER_ID, apIUser.USER_ID) &&
        Objects.equals(this.CONTACT_ID, apIUser.CONTACT_ID) &&
        Objects.equals(this.FIRST_NAME, apIUser.FIRST_NAME) &&
        Objects.equals(this.LAST_NAME, apIUser.LAST_NAME) &&
        Objects.equals(this.TIMEZONE_ID, apIUser.TIMEZONE_ID) &&
        Objects.equals(this.EMAIL_ADDRESS, apIUser.EMAIL_ADDRESS) &&
        Objects.equals(this.EMAIL_DROPBOX_IDENTIFIER, apIUser.EMAIL_DROPBOX_IDENTIFIER) &&
        Objects.equals(this.EMAIL_DROPBOX_ADDRESS, apIUser.EMAIL_DROPBOX_ADDRESS) &&
        Objects.equals(this.ADMINISTRATOR, apIUser.ADMINISTRATOR) &&
        Objects.equals(this.ACCOUNT_OWNER, apIUser.ACCOUNT_OWNER) &&
        Objects.equals(this.ACTIVE, apIUser.ACTIVE) &&
        Objects.equals(this.DATE_CREATED_UTC, apIUser.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, apIUser.DATE_UPDATED_UTC) &&
        Objects.equals(this.USER_CURRENCY, apIUser.USER_CURRENCY) &&
        Objects.equals(this.CONTACT_DISPLAY, apIUser.CONTACT_DISPLAY) &&
        Objects.equals(this.CONTACT_ORDER, apIUser.CONTACT_ORDER) &&
        Objects.equals(this.TASK_WEEK_START, apIUser.TASK_WEEK_START) &&
        Objects.equals(this.INSTANCE_ID, apIUser.INSTANCE_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(USER_ID, CONTACT_ID, FIRST_NAME, LAST_NAME, TIMEZONE_ID, EMAIL_ADDRESS, EMAIL_DROPBOX_IDENTIFIER, EMAIL_DROPBOX_ADDRESS, ADMINISTRATOR, ACCOUNT_OWNER, ACTIVE, DATE_CREATED_UTC, DATE_UPDATED_UTC, USER_CURRENCY, CONTACT_DISPLAY, CONTACT_ORDER, TASK_WEEK_START, INSTANCE_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIUser {\n");
    
    sb.append("    USER_ID: ").append(toIndentedString(USER_ID)).append("\n");
    sb.append("    CONTACT_ID: ").append(toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    FIRST_NAME: ").append(toIndentedString(FIRST_NAME)).append("\n");
    sb.append("    LAST_NAME: ").append(toIndentedString(LAST_NAME)).append("\n");
    sb.append("    TIMEZONE_ID: ").append(toIndentedString(TIMEZONE_ID)).append("\n");
    sb.append("    EMAIL_ADDRESS: ").append(toIndentedString(EMAIL_ADDRESS)).append("\n");
    sb.append("    EMAIL_DROPBOX_IDENTIFIER: ").append(toIndentedString(EMAIL_DROPBOX_IDENTIFIER)).append("\n");
    sb.append("    EMAIL_DROPBOX_ADDRESS: ").append(toIndentedString(EMAIL_DROPBOX_ADDRESS)).append("\n");
    sb.append("    ADMINISTRATOR: ").append(toIndentedString(ADMINISTRATOR)).append("\n");
    sb.append("    ACCOUNT_OWNER: ").append(toIndentedString(ACCOUNT_OWNER)).append("\n");
    sb.append("    ACTIVE: ").append(toIndentedString(ACTIVE)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    USER_CURRENCY: ").append(toIndentedString(USER_CURRENCY)).append("\n");
    sb.append("    CONTACT_DISPLAY: ").append(toIndentedString(CONTACT_DISPLAY)).append("\n");
    sb.append("    CONTACT_ORDER: ").append(toIndentedString(CONTACT_ORDER)).append("\n");
    sb.append("    TASK_WEEK_START: ").append(toIndentedString(TASK_WEEK_START)).append("\n");
    sb.append("    INSTANCE_ID: ").append(toIndentedString(INSTANCE_ID)).append("\n");
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

