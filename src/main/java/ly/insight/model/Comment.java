package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;

/**
 * APIComment
 */
@ApiModel(description = "APIComment")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class Comment implements Serializable {
  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  @SerializedName("COMMENT_ID")
  private Long COMMENT_ID = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("EMAIL_ID")
  private Long EMAIL_ID = null;

  @SerializedName("BODY")
  private String BODY = null;

  @SerializedName("NOTE_ID")
  private Long NOTE_ID = null;

  @SerializedName("TASK_ID")
  private Long TASK_ID = null;

  public Comment DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and Time Comment Created as Coordinated Universal Time.
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and Time Comment Created as Coordinated Universal Time.")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public Comment CAN_EDIT(Boolean CAN_EDIT) {
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

  public Comment DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and Time Comment Updated as Coordinated Universal Time.
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and Time Comment Updated as Coordinated Universal Time.")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public Comment CAN_DELETE(Boolean CAN_DELETE) {
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

  public Comment COMMENT_ID(Long COMMENT_ID) {
    this.COMMENT_ID = COMMENT_ID;
    return this;
  }

   /**
   * Unique ID for the Comment record.
   * @return COMMENT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Comment record.")
  public Long getCOMMENTID() {
    return COMMENT_ID;
  }

  public void setCOMMENTID(Long COMMENT_ID) {
    this.COMMENT_ID = COMMENT_ID;
  }

  public Comment OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * User ID of the Owner of the Comment. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "User ID of the Owner of the Comment. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public Comment EMAIL_ID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
    return this;
  }

   /**
   * ID of the email the comment belongs to.
   * @return EMAIL_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the email the comment belongs to.")
  public Long getEMAILID() {
    return EMAIL_ID;
  }

  public void setEMAILID(Long EMAIL_ID) {
    this.EMAIL_ID = EMAIL_ID;
  }

  public Comment BODY(String BODY) {
    this.BODY = BODY;
    return this;
  }

   /**
   * Text of the Comment.
   * @return BODY
  **/
  @ApiModelProperty(example = "null", value = "Text of the Comment.")
  public String getBODY() {
    return BODY;
  }

  public void setBODY(String BODY) {
    this.BODY = BODY;
  }

  public Comment NOTE_ID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
    return this;
  }

   /**
   * ID of the note the comment belongs to.
   * @return NOTE_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the note the comment belongs to.")
  public Long getNOTEID() {
    return NOTE_ID;
  }

  public void setNOTEID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
  }

  public Comment TASK_ID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
    return this;
  }

   /**
   * ID of the task the comment belongs to.
   * @return TASK_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the task the comment belongs to.")
  public Long getTASKID() {
    return TASK_ID;
  }

  public void setTASKID(Long TASK_ID) {
    this.TASK_ID = TASK_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.DATE_CREATED_UTC, comment.DATE_CREATED_UTC) &&
        Objects.equals(this.CAN_EDIT, comment.CAN_EDIT) &&
        Objects.equals(this.DATE_UPDATED_UTC, comment.DATE_UPDATED_UTC) &&
        Objects.equals(this.CAN_DELETE, comment.CAN_DELETE) &&
        Objects.equals(this.COMMENT_ID, comment.COMMENT_ID) &&
        Objects.equals(this.OWNER_USER_ID, comment.OWNER_USER_ID) &&
        Objects.equals(this.EMAIL_ID, comment.EMAIL_ID) &&
        Objects.equals(this.BODY, comment.BODY) &&
        Objects.equals(this.NOTE_ID, comment.NOTE_ID) &&
        Objects.equals(this.TASK_ID, comment.TASK_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DATE_CREATED_UTC, CAN_EDIT, DATE_UPDATED_UTC, CAN_DELETE, COMMENT_ID, OWNER_USER_ID, EMAIL_ID, BODY, NOTE_ID, TASK_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    CAN_EDIT: ").append(toIndentedString(CAN_EDIT)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    CAN_DELETE: ").append(toIndentedString(CAN_DELETE)).append("\n");
    sb.append("    COMMENT_ID: ").append(toIndentedString(COMMENT_ID)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    EMAIL_ID: ").append(toIndentedString(EMAIL_ID)).append("\n");
    sb.append("    BODY: ").append(toIndentedString(BODY)).append("\n");
    sb.append("    NOTE_ID: ").append(toIndentedString(NOTE_ID)).append("\n");
    sb.append("    TASK_ID: ").append(toIndentedString(TASK_ID)).append("\n");
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

