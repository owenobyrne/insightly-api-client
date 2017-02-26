package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ly.insight.model.APINoteLink;
import java.io.Serializable;

/**
 * APINote
 */
@ApiModel(description = "APINote")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APINote implements Serializable {
  @SerializedName("NOTE_ID")
  private Long NOTE_ID = null;

  @SerializedName("TITLE")
  private String TITLE = null;

  @SerializedName("BODY")
  private String BODY = null;

  @SerializedName("LINK_SUBJECT_ID")
  private Long LINK_SUBJECT_ID = null;

  @SerializedName("LINK_SUBJECT_TYPE")
  private String LINK_SUBJECT_TYPE = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("VISIBLE_TO")
  private String VISIBLE_TO = null;

  @SerializedName("VISIBLE_TEAM_ID")
  private Long VISIBLE_TEAM_ID = null;

  @SerializedName("VISIBLE_USER_IDS")
  private String VISIBLE_USER_IDS = null;

  @SerializedName("NOTELINKS")
  private List<APINoteLink> NOTELINKS = new ArrayList<APINoteLink>();

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  public APINote NOTE_ID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
    return this;
  }

   /**
   * Unique ID for the Note record
   * @return NOTE_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Note record")
  public Long getNOTEID() {
    return NOTE_ID;
  }

  public void setNOTEID(Long NOTE_ID) {
    this.NOTE_ID = NOTE_ID;
  }

  public APINote TITLE(String TITLE) {
    this.TITLE = TITLE;
    return this;
  }

   /**
   * Title of the Note (required)
   * @return TITLE
  **/
  @ApiModelProperty(example = "null", required = true, value = "Title of the Note (required)")
  public String getTITLE() {
    return TITLE;
  }

  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  public APINote BODY(String BODY) {
    this.BODY = BODY;
    return this;
  }

   /**
   * Body of the Note
   * @return BODY
  **/
  @ApiModelProperty(example = "null", value = "Body of the Note")
  public String getBODY() {
    return BODY;
  }

  public void setBODY(String BODY) {
    this.BODY = BODY;
  }

  public APINote LINK_SUBJECT_ID(Long LINK_SUBJECT_ID) {
    this.LINK_SUBJECT_ID = LINK_SUBJECT_ID;
    return this;
  }

   /**
   * ID of the Contact, Organisation, Opportunity or Project the Note is linked to
   * @return LINK_SUBJECT_ID
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID of the Contact, Organisation, Opportunity or Project the Note is linked to")
  public Long getLINKSUBJECTID() {
    return LINK_SUBJECT_ID;
  }

  public void setLINKSUBJECTID(Long LINK_SUBJECT_ID) {
    this.LINK_SUBJECT_ID = LINK_SUBJECT_ID;
  }

  public APINote LINK_SUBJECT_TYPE(String LINK_SUBJECT_TYPE) {
    this.LINK_SUBJECT_TYPE = LINK_SUBJECT_TYPE;
    return this;
  }

   /**
   * Link subject type: CONTACT, ORGANISATION, OPPORTUNITY or PROJECT
   * @return LINK_SUBJECT_TYPE
  **/
  @ApiModelProperty(example = "null", required = true, value = "Link subject type: CONTACT, ORGANISATION, OPPORTUNITY or PROJECT")
  public String getLINKSUBJECTTYPE() {
    return LINK_SUBJECT_TYPE;
  }

  public void setLINKSUBJECTTYPE(String LINK_SUBJECT_TYPE) {
    this.LINK_SUBJECT_TYPE = LINK_SUBJECT_TYPE;
  }

  public APINote OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * User ID of the Note owner. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "User ID of the Note owner. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public APINote DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time Note record created, as Coordinated Universal Time
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Note record created, as Coordinated Universal Time")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public APINote DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and time Note record updated, as Coordinated Universal Time
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Note record updated, as Coordinated Universal Time")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public APINote VISIBLE_TO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
    return this;
  }

   /**
   * Visible To: Everyone, Team, Owner or Individuals
   * @return VISIBLE_TO
  **/
  @ApiModelProperty(example = "null", value = "Visible To: Everyone, Team, Owner or Individuals")
  public String getVISIBLETO() {
    return VISIBLE_TO;
  }

  public void setVISIBLETO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
  }

  public APINote VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
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

  public APINote VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
    return this;
  }

   /**
   * If VISIBLE_TO is 'Individuals', a comma separated list of User IDs
   * @return VISIBLE_USER_IDS
  **/
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Individuals', a comma separated list of User IDs")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }

  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  public APINote NOTELINKS(List<APINoteLink> NOTELINKS) {
    this.NOTELINKS = NOTELINKS;
    return this;
  }

  public APINote addNOTELINKSItem(APINoteLink NOTELINKSItem) {
    this.NOTELINKS.add(NOTELINKSItem);
    return this;
  }

   /**
   * Set of Links attached to the Note
   * @return NOTELINKS
  **/
  @ApiModelProperty(example = "null", value = "Set of Links attached to the Note")
  public List<APINoteLink> getNOTELINKS() {
    return NOTELINKS;
  }

  public void setNOTELINKS(List<APINoteLink> NOTELINKS) {
    this.NOTELINKS = NOTELINKS;
  }

  public APINote CAN_EDIT(Boolean CAN_EDIT) {
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

  public APINote CAN_DELETE(Boolean CAN_DELETE) {
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
    APINote apINote = (APINote) o;
    return Objects.equals(this.NOTE_ID, apINote.NOTE_ID) &&
        Objects.equals(this.TITLE, apINote.TITLE) &&
        Objects.equals(this.BODY, apINote.BODY) &&
        Objects.equals(this.LINK_SUBJECT_ID, apINote.LINK_SUBJECT_ID) &&
        Objects.equals(this.LINK_SUBJECT_TYPE, apINote.LINK_SUBJECT_TYPE) &&
        Objects.equals(this.OWNER_USER_ID, apINote.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, apINote.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, apINote.DATE_UPDATED_UTC) &&
        Objects.equals(this.VISIBLE_TO, apINote.VISIBLE_TO) &&
        Objects.equals(this.VISIBLE_TEAM_ID, apINote.VISIBLE_TEAM_ID) &&
        Objects.equals(this.VISIBLE_USER_IDS, apINote.VISIBLE_USER_IDS) &&
        Objects.equals(this.NOTELINKS, apINote.NOTELINKS) &&
        Objects.equals(this.CAN_EDIT, apINote.CAN_EDIT) &&
        Objects.equals(this.CAN_DELETE, apINote.CAN_DELETE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NOTE_ID, TITLE, BODY, LINK_SUBJECT_ID, LINK_SUBJECT_TYPE, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC, VISIBLE_TO, VISIBLE_TEAM_ID, VISIBLE_USER_IDS, NOTELINKS, CAN_EDIT, CAN_DELETE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APINote {\n");
    
    sb.append("    NOTE_ID: ").append(toIndentedString(NOTE_ID)).append("\n");
    sb.append("    TITLE: ").append(toIndentedString(TITLE)).append("\n");
    sb.append("    BODY: ").append(toIndentedString(BODY)).append("\n");
    sb.append("    LINK_SUBJECT_ID: ").append(toIndentedString(LINK_SUBJECT_ID)).append("\n");
    sb.append("    LINK_SUBJECT_TYPE: ").append(toIndentedString(LINK_SUBJECT_TYPE)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    NOTELINKS: ").append(toIndentedString(NOTELINKS)).append("\n");
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

