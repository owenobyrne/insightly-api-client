package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;

/**
 * APIFileAttachment
 */
@ApiModel(description = "APIFileAttachment")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIFileAttachment implements Serializable {
  @SerializedName("FILE_ID")
  private Long FILE_ID = null;

  @SerializedName("FILE_NAME")
  private String FILE_NAME = null;

  @SerializedName("CONTENT_TYPE")
  private String CONTENT_TYPE = null;

  @SerializedName("FILE_SIZE")
  private Long FILE_SIZE = null;

  @SerializedName("FILE_CATEGORY_ID")
  private Long FILE_CATEGORY_ID = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("URL")
  private String URL = null;

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  public APIFileAttachment FILE_ID(Long FILE_ID) {
    this.FILE_ID = FILE_ID;
    return this;
  }

   /**
   * Unique ID for the File Attachment record
   * @return FILE_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the File Attachment record")
  public Long getFILEID() {
    return FILE_ID;
  }

  public void setFILEID(Long FILE_ID) {
    this.FILE_ID = FILE_ID;
  }

  public APIFileAttachment FILE_NAME(String FILE_NAME) {
    this.FILE_NAME = FILE_NAME;
    return this;
  }

   /**
   * The name and extension of the File Attachment
   * @return FILE_NAME
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name and extension of the File Attachment")
  public String getFILENAME() {
    return FILE_NAME;
  }

  public void setFILENAME(String FILE_NAME) {
    this.FILE_NAME = FILE_NAME;
  }

  public APIFileAttachment CONTENT_TYPE(String CONTENT_TYPE) {
    this.CONTENT_TYPE = CONTENT_TYPE;
    return this;
  }

   /**
   * The MIME type of the File Attachment
   * @return CONTENT_TYPE
  **/
  @ApiModelProperty(example = "null", required = true, value = "The MIME type of the File Attachment")
  public String getCONTENTTYPE() {
    return CONTENT_TYPE;
  }

  public void setCONTENTTYPE(String CONTENT_TYPE) {
    this.CONTENT_TYPE = CONTENT_TYPE;
  }

  public APIFileAttachment FILE_SIZE(Long FILE_SIZE) {
    this.FILE_SIZE = FILE_SIZE;
    return this;
  }

   /**
   * The size of the File Attachment, in bytes
   * @return FILE_SIZE
  **/
  @ApiModelProperty(example = "null", value = "The size of the File Attachment, in bytes")
  public Long getFILESIZE() {
    return FILE_SIZE;
  }

  public void setFILESIZE(Long FILE_SIZE) {
    this.FILE_SIZE = FILE_SIZE;
  }

  public APIFileAttachment FILE_CATEGORY_ID(Long FILE_CATEGORY_ID) {
    this.FILE_CATEGORY_ID = FILE_CATEGORY_ID;
    return this;
  }

   /**
   * The category of the File Attachment, if it has been assigned to one
   * @return FILE_CATEGORY_ID
  **/
  @ApiModelProperty(example = "null", value = "The category of the File Attachment, if it has been assigned to one")
  public Long getFILECATEGORYID() {
    return FILE_CATEGORY_ID;
  }

  public void setFILECATEGORYID(Long FILE_CATEGORY_ID) {
    this.FILE_CATEGORY_ID = FILE_CATEGORY_ID;
  }

  public APIFileAttachment OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * The User ID of the File Attachment owner. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "The User ID of the File Attachment owner. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public APIFileAttachment DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time File Attachment record created, as Coordinated Universal Time
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time File Attachment record created, as Coordinated Universal Time")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public APIFileAttachment DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and time File Attachment record updated, as Coordinated Universal Time
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time File Attachment record updated, as Coordinated Universal Time")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public APIFileAttachment URL(String URL) {
    this.URL = URL;
    return this;
  }

   /**
   * URL of the File Attachment
   * @return URL
  **/
  @ApiModelProperty(example = "null", value = "URL of the File Attachment")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public APIFileAttachment CAN_EDIT(Boolean CAN_EDIT) {
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

  public APIFileAttachment CAN_DELETE(Boolean CAN_DELETE) {
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
    APIFileAttachment apIFileAttachment = (APIFileAttachment) o;
    return Objects.equals(this.FILE_ID, apIFileAttachment.FILE_ID) &&
        Objects.equals(this.FILE_NAME, apIFileAttachment.FILE_NAME) &&
        Objects.equals(this.CONTENT_TYPE, apIFileAttachment.CONTENT_TYPE) &&
        Objects.equals(this.FILE_SIZE, apIFileAttachment.FILE_SIZE) &&
        Objects.equals(this.FILE_CATEGORY_ID, apIFileAttachment.FILE_CATEGORY_ID) &&
        Objects.equals(this.OWNER_USER_ID, apIFileAttachment.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, apIFileAttachment.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, apIFileAttachment.DATE_UPDATED_UTC) &&
        Objects.equals(this.URL, apIFileAttachment.URL) &&
        Objects.equals(this.CAN_EDIT, apIFileAttachment.CAN_EDIT) &&
        Objects.equals(this.CAN_DELETE, apIFileAttachment.CAN_DELETE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FILE_ID, FILE_NAME, CONTENT_TYPE, FILE_SIZE, FILE_CATEGORY_ID, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC, URL, CAN_EDIT, CAN_DELETE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIFileAttachment {\n");
    
    sb.append("    FILE_ID: ").append(toIndentedString(FILE_ID)).append("\n");
    sb.append("    FILE_NAME: ").append(toIndentedString(FILE_NAME)).append("\n");
    sb.append("    CONTENT_TYPE: ").append(toIndentedString(CONTENT_TYPE)).append("\n");
    sb.append("    FILE_SIZE: ").append(toIndentedString(FILE_SIZE)).append("\n");
    sb.append("    FILE_CATEGORY_ID: ").append(toIndentedString(FILE_CATEGORY_ID)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
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

