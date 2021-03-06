package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ly.insight.model.APIEmailLink;
import ly.insight.model.APITag;
import java.io.Serializable;

/**
 * APIEmail
 */
@ApiModel(description = "APIEmail")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIEmail implements Serializable {
  @SerializedName("EMAIL_ID")
  private Long EMAIL_ID = null;

  @SerializedName("GMAIL_MESSAGE_ID")
  private String GMAIL_MESSAGE_ID = null;

  @SerializedName("EMAIL_DATE_UTC")
  private Date EMAIL_DATE_UTC = null;

  @SerializedName("EMAIL_FROM")
  private String EMAIL_FROM = null;

  @SerializedName("EMAIL_TO")
  private String EMAIL_TO = null;

  @SerializedName("EMAIL_CC")
  private String EMAIL_CC = null;

  @SerializedName("SUBJECT")
  private String SUBJECT = null;

  @SerializedName("BODY")
  private String BODY = null;

  @SerializedName("BODY_EXTRACT")
  private String BODY_EXTRACT = null;

  @SerializedName("FORMAT")
  private String FORMAT = null;

  @SerializedName("SIZE")
  private Long SIZE = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("VISIBLE_TO")
  private String VISIBLE_TO = null;

  @SerializedName("VISIBLE_TEAM_ID")
  private Long VISIBLE_TEAM_ID = null;

  @SerializedName("VISIBLE_USER_IDS")
  private String VISIBLE_USER_IDS = null;

  @SerializedName("EMAILLINKS")
  private List<APIEmailLink> EMAILLINKS = new ArrayList<APIEmailLink>();

  @SerializedName("TAGS")
  private List<APITag> TAGS = new ArrayList<APITag>();

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  public APIEmail EMAIL_ID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
    return this;
  }

   /**
   * Unique ID for the email record
   * @return EMAIL_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the email record")
  public Long getEMAILID() {
    return EMAIL_ID;
  }

  public void setEMAILID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
  }

  public APIEmail GMAIL_MESSAGE_ID(String GMAIL_MESSAGE_ID) {
    this.GMAIL_MESSAGE_ID = GMAIL_MESSAGE_ID;
    return this;
  }

   /**
   * Unique key of the Gmail message
   * @return GMAIL_MESSAGE_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique key of the Gmail message")
  public String getGMAILMESSAGEID() {
    return GMAIL_MESSAGE_ID;
  }

  public void setGMAILMESSAGEID(String GMAIL_MESSAGE_ID) {
    this.GMAIL_MESSAGE_ID = GMAIL_MESSAGE_ID;
  }

  public APIEmail EMAIL_DATE_UTC(Date EMAIL_DATE_UTC) {
    this.EMAIL_DATE_UTC = EMAIL_DATE_UTC;
    return this;
  }

   /**
   * Date and time email sent, as Coordinated Universal Time
   * @return EMAIL_DATE_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time email sent, as Coordinated Universal Time")
  public Date getEMAILDATEUTC() {
    return EMAIL_DATE_UTC;
  }

  public void setEMAILDATEUTC(Date EMAIL_DATE_UTC) {
    this.EMAIL_DATE_UTC = EMAIL_DATE_UTC;
  }

  public APIEmail EMAIL_FROM(String EMAIL_FROM) {
    this.EMAIL_FROM = EMAIL_FROM;
    return this;
  }

   /**
   * From address of the email
   * @return EMAIL_FROM
  **/
  @ApiModelProperty(example = "null", value = "From address of the email")
  public String getEMAILFROM() {
    return EMAIL_FROM;
  }

  public void setEMAILFROM(String EMAIL_FROM) {
    this.EMAIL_FROM = EMAIL_FROM;
  }

  public APIEmail EMAIL_TO(String EMAIL_TO) {
    this.EMAIL_TO = EMAIL_TO;
    return this;
  }

   /**
   * To addresses of the email
   * @return EMAIL_TO
  **/
  @ApiModelProperty(example = "null", value = "To addresses of the email")
  public String getEMAILTO() {
    return EMAIL_TO;
  }

  public void setEMAILTO(String EMAIL_TO) {
    this.EMAIL_TO = EMAIL_TO;
  }

  public APIEmail EMAIL_CC(String EMAIL_CC) {
    this.EMAIL_CC = EMAIL_CC;
    return this;
  }

   /**
   * CC addresses of the email
   * @return EMAIL_CC
  **/
  @ApiModelProperty(example = "null", value = "CC addresses of the email")
  public String getEMAILCC() {
    return EMAIL_CC;
  }

  public void setEMAILCC(String EMAIL_CC) {
    this.EMAIL_CC = EMAIL_CC;
  }

  public APIEmail SUBJECT(String SUBJECT) {
    this.SUBJECT = SUBJECT;
    return this;
  }

   /**
   * Subject of the Email
   * @return SUBJECT
  **/
  @ApiModelProperty(example = "null", value = "Subject of the Email")
  public String getSUBJECT() {
    return SUBJECT;
  }

  public void setSUBJECT(String SUBJECT) {
    this.SUBJECT = SUBJECT;
  }

  public APIEmail BODY(String BODY) {
    this.BODY = BODY;
    return this;
  }

   /**
   * The body of the Email. This field is empty on list requests.
   * @return BODY
  **/
  @ApiModelProperty(example = "null", value = "The body of the Email. This field is empty on list requests.")
  public String getBODY() {
    return BODY;
  }

  public void setBODY(String BODY) {
    this.BODY = BODY;
  }

  public APIEmail BODY_EXTRACT(String BODY_EXTRACT) {
    this.BODY_EXTRACT = BODY_EXTRACT;
    return this;
  }

   /**
   * An extract of the Email body.
   * @return BODY_EXTRACT
  **/
  @ApiModelProperty(example = "null", value = "An extract of the Email body.")
  public String getBODYEXTRACT() {
    return BODY_EXTRACT;
  }

  public void setBODYEXTRACT(String BODY_EXTRACT) {
    this.BODY_EXTRACT = BODY_EXTRACT;
  }

  public APIEmail FORMAT(String FORMAT) {
    this.FORMAT = FORMAT;
    return this;
  }

   /**
   * Format of the email: text or html
   * @return FORMAT
  **/
  @ApiModelProperty(example = "null", value = "Format of the email: text or html")
  public String getFORMAT() {
    return FORMAT;
  }

  public void setFORMAT(String FORMAT) {
    this.FORMAT = FORMAT;
  }

  public APIEmail SIZE(Long SIZE) {
    this.SIZE = SIZE;
    return this;
  }

   /**
   * The size of the email, in bytes
   * @return SIZE
  **/
  @ApiModelProperty(example = "null", value = "The size of the email, in bytes")
  public Long getSIZE() {
    return SIZE;
  }

  public void setSIZE(Long SIZE) {
    this.SIZE = SIZE;
  }

  public APIEmail OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * Insightly User ID of the email owner. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "Insightly User ID of the email owner. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public APIEmail DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time Email record created, as Coordinated Universal Time
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Email record created, as Coordinated Universal Time")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public APIEmail VISIBLE_TO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
    return this;
  }

   /**
   * Visible To: Everyone, Owner, Team or Individuals
   * @return VISIBLE_TO
  **/
  @ApiModelProperty(example = "null", value = "Visible To: Everyone, Owner, Team or Individuals")
  public String getVISIBLETO() {
    return VISIBLE_TO;
  }

  public void setVISIBLETO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
  }

  public APIEmail VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
    return this;
  }

   /**
   * If VISIBLE_TO is 'Team', the TEAM_ID
   * @return VISIBLE_TEAM_ID
  **/
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Team', the TEAM_ID")
  public Long getVISIBLETEAMID() {
    return VISIBLE_TEAM_ID;
  }

  public void setVISIBLETEAMID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
  }

  public APIEmail VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
    return this;
  }

   /**
   * If VISIBLE_TO is 'Individuals', a comma separated list of user IDs
   * @return VISIBLE_USER_IDS
  **/
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Individuals', a comma separated list of user IDs")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }

  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  public APIEmail EMAILLINKS(List<APIEmailLink> EMAILLINKS) {
    this.EMAILLINKS = EMAILLINKS;
    return this;
  }

  public APIEmail addEMAILLINKSItem(APIEmailLink EMAILLINKSItem) {
    this.EMAILLINKS.add(EMAILLINKSItem);
    return this;
  }

   /**
   * Set of links attached to the Email
   * @return EMAILLINKS
  **/
  @ApiModelProperty(example = "null", value = "Set of links attached to the Email")
  public List<APIEmailLink> getEMAILLINKS() {
    return EMAILLINKS;
  }

  public void setEMAILLINKS(List<APIEmailLink> EMAILLINKS) {
    this.EMAILLINKS = EMAILLINKS;
  }

  public APIEmail TAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
    return this;
  }

  public APIEmail addTAGSItem(APITag TAGSItem) {
    this.TAGS.add(TAGSItem);
    return this;
  }

   /**
   * Set of tags attached to the Email
   * @return TAGS
  **/
  @ApiModelProperty(example = "null", value = "Set of tags attached to the Email")
  public List<APITag> getTAGS() {
    return TAGS;
  }

  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  public APIEmail CAN_EDIT(Boolean CAN_EDIT) {
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

  public APIEmail CAN_DELETE(Boolean CAN_DELETE) {
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
    APIEmail apIEmail = (APIEmail) o;
    return Objects.equals(this.EMAIL_ID, apIEmail.EMAIL_ID) &&
        Objects.equals(this.GMAIL_MESSAGE_ID, apIEmail.GMAIL_MESSAGE_ID) &&
        Objects.equals(this.EMAIL_DATE_UTC, apIEmail.EMAIL_DATE_UTC) &&
        Objects.equals(this.EMAIL_FROM, apIEmail.EMAIL_FROM) &&
        Objects.equals(this.EMAIL_TO, apIEmail.EMAIL_TO) &&
        Objects.equals(this.EMAIL_CC, apIEmail.EMAIL_CC) &&
        Objects.equals(this.SUBJECT, apIEmail.SUBJECT) &&
        Objects.equals(this.BODY, apIEmail.BODY) &&
        Objects.equals(this.BODY_EXTRACT, apIEmail.BODY_EXTRACT) &&
        Objects.equals(this.FORMAT, apIEmail.FORMAT) &&
        Objects.equals(this.SIZE, apIEmail.SIZE) &&
        Objects.equals(this.OWNER_USER_ID, apIEmail.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, apIEmail.DATE_CREATED_UTC) &&
        Objects.equals(this.VISIBLE_TO, apIEmail.VISIBLE_TO) &&
        Objects.equals(this.VISIBLE_TEAM_ID, apIEmail.VISIBLE_TEAM_ID) &&
        Objects.equals(this.VISIBLE_USER_IDS, apIEmail.VISIBLE_USER_IDS) &&
        Objects.equals(this.EMAILLINKS, apIEmail.EMAILLINKS) &&
        Objects.equals(this.TAGS, apIEmail.TAGS) &&
        Objects.equals(this.CAN_EDIT, apIEmail.CAN_EDIT) &&
        Objects.equals(this.CAN_DELETE, apIEmail.CAN_DELETE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EMAIL_ID, GMAIL_MESSAGE_ID, EMAIL_DATE_UTC, EMAIL_FROM, EMAIL_TO, EMAIL_CC, SUBJECT, BODY, BODY_EXTRACT, FORMAT, SIZE, OWNER_USER_ID, DATE_CREATED_UTC, VISIBLE_TO, VISIBLE_TEAM_ID, VISIBLE_USER_IDS, EMAILLINKS, TAGS, CAN_EDIT, CAN_DELETE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIEmail {\n");
    
    sb.append("    EMAIL_ID: ").append(toIndentedString(EMAIL_ID)).append("\n");
    sb.append("    GMAIL_MESSAGE_ID: ").append(toIndentedString(GMAIL_MESSAGE_ID)).append("\n");
    sb.append("    EMAIL_DATE_UTC: ").append(toIndentedString(EMAIL_DATE_UTC)).append("\n");
    sb.append("    EMAIL_FROM: ").append(toIndentedString(EMAIL_FROM)).append("\n");
    sb.append("    EMAIL_TO: ").append(toIndentedString(EMAIL_TO)).append("\n");
    sb.append("    EMAIL_CC: ").append(toIndentedString(EMAIL_CC)).append("\n");
    sb.append("    SUBJECT: ").append(toIndentedString(SUBJECT)).append("\n");
    sb.append("    BODY: ").append(toIndentedString(BODY)).append("\n");
    sb.append("    BODY_EXTRACT: ").append(toIndentedString(BODY_EXTRACT)).append("\n");
    sb.append("    FORMAT: ").append(toIndentedString(FORMAT)).append("\n");
    sb.append("    SIZE: ").append(toIndentedString(SIZE)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    EMAILLINKS: ").append(toIndentedString(EMAILLINKS)).append("\n");
    sb.append("    TAGS: ").append(toIndentedString(TAGS)).append("\n");
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

