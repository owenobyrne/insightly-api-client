package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ly.insight.model.APICustomField;
import ly.insight.model.APILink;
import ly.insight.model.APITag;
import java.io.Serializable;

/**
 * APIProject
 */
@ApiModel(description = "APIProject")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class Project implements Serializable {
  @SerializedName("RESPONSIBLE_USER_ID")
  private Integer RESPONSIBLE_USER_ID = null;

  @SerializedName("CATEGORY_ID")
  private Long CATEGORY_ID = null;

  @SerializedName("VISIBLE_USER_IDS")
  private String VISIBLE_USER_IDS = null;

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("STARTED_DATE")
  private Date STARTED_DATE = null;

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  @SerializedName("LINKS")
  private List<APILink> LINKS = new ArrayList<APILink>();

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("PIPELINE_ID")
  private Long PIPELINE_ID = null;

  @SerializedName("CUSTOMFIELDS")
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();

  @SerializedName("PROJECT_NAME")
  private String PROJECT_NAME = null;

  @SerializedName("VISIBLE_TEAM_ID")
  private Long VISIBLE_TEAM_ID = null;

  @SerializedName("VISIBLE_TO")
  private String VISIBLE_TO = null;

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("STATUS")
  private String STATUS = null;

  @SerializedName("PROJECT_DETAILS")
  private String PROJECT_DETAILS = null;

  @SerializedName("COMPLETED_DATE")
  private Date COMPLETED_DATE = null;

  @SerializedName("OPPORTUNITY_ID")
  private Long OPPORTUNITY_ID = null;

  @SerializedName("STAGE_ID")
  private Long STAGE_ID = null;

  @SerializedName("PROJECT_ID")
  private Long PROJECT_ID = null;

  @SerializedName("TAGS")
  private List<APITag> TAGS = new ArrayList<APITag>();

  @SerializedName("IMAGE_URL")
  private String IMAGE_URL = null;

  public Project RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
    return this;
  }

   /**
   * Responsible user ID
   * @return RESPONSIBLE_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "Responsible user ID")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }

  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  public Project CATEGORY_ID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
    return this;
  }

   /**
   * The Category ID of the Project, if it has been assigned to one.
   * @return CATEGORY_ID
  **/
  @ApiModelProperty(example = "null", value = "The Category ID of the Project, if it has been assigned to one.")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }

  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  public Project VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
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

  public Project CAN_EDIT(Boolean CAN_EDIT) {
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

  public Project STARTED_DATE(Date STARTED_DATE) {
    this.STARTED_DATE = STARTED_DATE;
    return this;
  }

   /**
   * Date Project started, in YYYY-MM-DD format
   * @return STARTED_DATE
  **/
  @ApiModelProperty(example = "null", value = "Date Project started, in YYYY-MM-DD format")
  public Date getSTARTEDDATE() {
    return STARTED_DATE;
  }

  public void setSTARTEDDATE(Date STARTED_DATE) {
    this.STARTED_DATE = STARTED_DATE;
  }

  public Project DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and time Project record updated, as Coordinated Universal Time
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Project record updated, as Coordinated Universal Time")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public Project CAN_DELETE(Boolean CAN_DELETE) {
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

  public Project LINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
    return this;
  }

  public Project addLINKSItem(APILink LINKSItem) {
    this.LINKS.add(LINKSItem);
    return this;
  }

   /**
   * Set of Links attached to the Project
   * @return LINKS
  **/
  @ApiModelProperty(example = "null", value = "Set of Links attached to the Project")
  public List<APILink> getLINKS() {
    return LINKS;
  }

  public void setLINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
  }

  public Project OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * User ID of the Project record owner. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "User ID of the Project record owner. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public Project PIPELINE_ID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
    return this;
  }

   /**
   * The Pipeline ID that the Project is in, if it has been assigned to one. Note: This is a read-only field, to update the Pipeline please use the /Projects/{id}/Pipeline endpoint.
   * @return PIPELINE_ID
  **/
  @ApiModelProperty(example = "null", value = "The Pipeline ID that the Project is in, if it has been assigned to one. Note: This is a read-only field, to update the Pipeline please use the /Projects/{id}/Pipeline endpoint.")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }

  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  public Project CUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
    return this;
  }

  public Project addCUSTOMFIELDSItem(APICustomField CUSTOMFIELDSItem) {
    this.CUSTOMFIELDS.add(CUSTOMFIELDSItem);
    return this;
  }

   /**
   * Set of Custom Fields attached to the Project
   * @return CUSTOMFIELDS
  **/
  @ApiModelProperty(example = "null", value = "Set of Custom Fields attached to the Project")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }

  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  public Project PROJECT_NAME(String PROJECT_NAME) {
    this.PROJECT_NAME = PROJECT_NAME;
    return this;
  }

   /**
   * Name of the Project (required)
   * @return PROJECT_NAME
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name of the Project (required)")
  public String getPROJECTNAME() {
    return PROJECT_NAME;
  }

  public void setPROJECTNAME(String PROJECT_NAME) {
    this.PROJECT_NAME = PROJECT_NAME;
  }

  public Project VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
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

  public Project VISIBLE_TO(String VISIBLE_TO) {
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

  public Project DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time Project record created, as Coordinated Universal Time
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Project record created, as Coordinated Universal Time")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public Project STATUS(String STATUS) {
    this.STATUS = STATUS;
    return this;
  }

   /**
   * Status: Abandoned, Cancelled, Completed, Deferred, In Progress or Not Started
   * @return STATUS
  **/
  @ApiModelProperty(example = "null", required = true, value = "Status: Abandoned, Cancelled, Completed, Deferred, In Progress or Not Started")
  public String getSTATUS() {
    return STATUS;
  }

  public void setSTATUS(String STATUS) {
    this.STATUS = STATUS;
  }

  public Project PROJECT_DETAILS(String PROJECT_DETAILS) {
    this.PROJECT_DETAILS = PROJECT_DETAILS;
    return this;
  }

   /**
   * Details of the Project
   * @return PROJECT_DETAILS
  **/
  @ApiModelProperty(example = "null", value = "Details of the Project")
  public String getPROJECTDETAILS() {
    return PROJECT_DETAILS;
  }

  public void setPROJECTDETAILS(String PROJECT_DETAILS) {
    this.PROJECT_DETAILS = PROJECT_DETAILS;
  }

  public Project COMPLETED_DATE(Date COMPLETED_DATE) {
    this.COMPLETED_DATE = COMPLETED_DATE;
    return this;
  }

   /**
   * Date Project completed, in YYYY-MM-DD format
   * @return COMPLETED_DATE
  **/
  @ApiModelProperty(example = "null", value = "Date Project completed, in YYYY-MM-DD format")
  public Date getCOMPLETEDDATE() {
    return COMPLETED_DATE;
  }

  public void setCOMPLETEDDATE(Date COMPLETED_DATE) {
    this.COMPLETED_DATE = COMPLETED_DATE;
  }

  public Project OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }

   /**
   * Unique ID for the Opportunity from which the Project may have been converted
   * @return OPPORTUNITY_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Opportunity from which the Project may have been converted")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }

  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  public Project STAGE_ID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
    return this;
  }

   /**
   * The Stage ID of the Stage the Project is in, if it has been assigned to one. Note: This is a read-only field, to update the Pipeline Stage please use the /Projects/{id}/PipelineStage endpoint.
   * @return STAGE_ID
  **/
  @ApiModelProperty(example = "null", value = "The Stage ID of the Stage the Project is in, if it has been assigned to one. Note: This is a read-only field, to update the Pipeline Stage please use the /Projects/{id}/PipelineStage endpoint.")
  public Long getSTAGEID() {
    return STAGE_ID;
  }

  public void setSTAGEID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
  }

  public Project PROJECT_ID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
    return this;
  }

   /**
   * Unique ID for the Project record
   * @return PROJECT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Project record")
  public Long getPROJECTID() {
    return PROJECT_ID;
  }

  public void setPROJECTID(Long PROJECT_ID) {
    this.PROJECT_ID = PROJECT_ID;
  }

  public Project TAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
    return this;
  }

  public Project addTAGSItem(APITag TAGSItem) {
    this.TAGS.add(TAGSItem);
    return this;
  }

   /**
   * Set of Tags attached to the Project
   * @return TAGS
  **/
  @ApiModelProperty(example = "null", value = "Set of Tags attached to the Project")
  public List<APITag> getTAGS() {
    return TAGS;
  }

  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  public Project IMAGE_URL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
    return this;
  }

   /**
   * URL of the Image for the Project
   * @return IMAGE_URL
  **/
  @ApiModelProperty(example = "null", value = "URL of the Image for the Project")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }

  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.RESPONSIBLE_USER_ID, project.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.CATEGORY_ID, project.CATEGORY_ID) &&
        Objects.equals(this.VISIBLE_USER_IDS, project.VISIBLE_USER_IDS) &&
        Objects.equals(this.CAN_EDIT, project.CAN_EDIT) &&
        Objects.equals(this.STARTED_DATE, project.STARTED_DATE) &&
        Objects.equals(this.DATE_UPDATED_UTC, project.DATE_UPDATED_UTC) &&
        Objects.equals(this.CAN_DELETE, project.CAN_DELETE) &&
        Objects.equals(this.LINKS, project.LINKS) &&
        Objects.equals(this.OWNER_USER_ID, project.OWNER_USER_ID) &&
        Objects.equals(this.PIPELINE_ID, project.PIPELINE_ID) &&
        Objects.equals(this.CUSTOMFIELDS, project.CUSTOMFIELDS) &&
        Objects.equals(this.PROJECT_NAME, project.PROJECT_NAME) &&
        Objects.equals(this.VISIBLE_TEAM_ID, project.VISIBLE_TEAM_ID) &&
        Objects.equals(this.VISIBLE_TO, project.VISIBLE_TO) &&
        Objects.equals(this.DATE_CREATED_UTC, project.DATE_CREATED_UTC) &&
        Objects.equals(this.STATUS, project.STATUS) &&
        Objects.equals(this.PROJECT_DETAILS, project.PROJECT_DETAILS) &&
        Objects.equals(this.COMPLETED_DATE, project.COMPLETED_DATE) &&
        Objects.equals(this.OPPORTUNITY_ID, project.OPPORTUNITY_ID) &&
        Objects.equals(this.STAGE_ID, project.STAGE_ID) &&
        Objects.equals(this.PROJECT_ID, project.PROJECT_ID) &&
        Objects.equals(this.TAGS, project.TAGS) &&
        Objects.equals(this.IMAGE_URL, project.IMAGE_URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(RESPONSIBLE_USER_ID, CATEGORY_ID, VISIBLE_USER_IDS, CAN_EDIT, STARTED_DATE, DATE_UPDATED_UTC, CAN_DELETE, LINKS, OWNER_USER_ID, PIPELINE_ID, CUSTOMFIELDS, PROJECT_NAME, VISIBLE_TEAM_ID, VISIBLE_TO, DATE_CREATED_UTC, STATUS, PROJECT_DETAILS, COMPLETED_DATE, OPPORTUNITY_ID, STAGE_ID, PROJECT_ID, TAGS, IMAGE_URL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    CATEGORY_ID: ").append(toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CAN_EDIT: ").append(toIndentedString(CAN_EDIT)).append("\n");
    sb.append("    STARTED_DATE: ").append(toIndentedString(STARTED_DATE)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    CAN_DELETE: ").append(toIndentedString(CAN_DELETE)).append("\n");
    sb.append("    LINKS: ").append(toIndentedString(LINKS)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    PIPELINE_ID: ").append(toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    PROJECT_NAME: ").append(toIndentedString(PROJECT_NAME)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    STATUS: ").append(toIndentedString(STATUS)).append("\n");
    sb.append("    PROJECT_DETAILS: ").append(toIndentedString(PROJECT_DETAILS)).append("\n");
    sb.append("    COMPLETED_DATE: ").append(toIndentedString(COMPLETED_DATE)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    STAGE_ID: ").append(toIndentedString(STAGE_ID)).append("\n");
    sb.append("    PROJECT_ID: ").append(toIndentedString(PROJECT_ID)).append("\n");
    sb.append("    TAGS: ").append(toIndentedString(TAGS)).append("\n");
    sb.append("    IMAGE_URL: ").append(toIndentedString(IMAGE_URL)).append("\n");
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

