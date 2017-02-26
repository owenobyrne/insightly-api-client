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
 * APIOpportunity
 */
@ApiModel(description = "APIOpportunity")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIOpportunity implements Serializable {
  @SerializedName("OPPORTUNITY_ID")
  private Long OPPORTUNITY_ID = null;

  @SerializedName("OPPORTUNITY_NAME")
  private String OPPORTUNITY_NAME = null;

  @SerializedName("OPPORTUNITY_DETAILS")
  private String OPPORTUNITY_DETAILS = null;

  @SerializedName("PROBABILITY")
  private Integer PROBABILITY = null;

  @SerializedName("BID_CURRENCY")
  private String BID_CURRENCY = null;

  @SerializedName("BID_AMOUNT")
  private Long BID_AMOUNT = null;

  @SerializedName("BID_TYPE")
  private String BID_TYPE = null;

  @SerializedName("BID_DURATION")
  private Integer BID_DURATION = null;

  @SerializedName("OPPORTUNITY_VALUE")
  private Long OPPORTUNITY_VALUE = null;

  @SerializedName("FORECAST_CLOSE_DATE")
  private Date FORECAST_CLOSE_DATE = null;

  @SerializedName("ACTUAL_CLOSE_DATE")
  private Date ACTUAL_CLOSE_DATE = null;

  @SerializedName("CATEGORY_ID")
  private Long CATEGORY_ID = null;

  @SerializedName("PIPELINE_ID")
  private Long PIPELINE_ID = null;

  @SerializedName("STAGE_ID")
  private Long STAGE_ID = null;

  @SerializedName("OPPORTUNITY_STATE")
  private String OPPORTUNITY_STATE = null;

  @SerializedName("OPPORTUNITY_STATE_REASON_ID")
  private Long OPPORTUNITY_STATE_REASON_ID = null;

  @SerializedName("IMAGE_URL")
  private String IMAGE_URL = null;

  @SerializedName("RESPONSIBLE_USER_ID")
  private Integer RESPONSIBLE_USER_ID = null;

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

  @SerializedName("CUSTOMFIELDS")
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();

  @SerializedName("TAGS")
  private List<APITag> TAGS = new ArrayList<APITag>();

  @SerializedName("LINKS")
  private List<APILink> LINKS = new ArrayList<APILink>();

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  public APIOpportunity OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
    return this;
  }

   /**
   * Unique ID for the Opportunity record
   * @return OPPORTUNITY_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Opportunity record")
  public Long getOPPORTUNITYID() {
    return OPPORTUNITY_ID;
  }

  public void setOPPORTUNITYID(Long OPPORTUNITY_ID) {
    this.OPPORTUNITY_ID = OPPORTUNITY_ID;
  }

  public APIOpportunity OPPORTUNITY_NAME(String OPPORTUNITY_NAME) {
    this.OPPORTUNITY_NAME = OPPORTUNITY_NAME;
    return this;
  }

   /**
   * Name of the Opportunity
   * @return OPPORTUNITY_NAME
  **/
  @ApiModelProperty(example = "null", value = "Name of the Opportunity")
  public String getOPPORTUNITYNAME() {
    return OPPORTUNITY_NAME;
  }

  public void setOPPORTUNITYNAME(String OPPORTUNITY_NAME) {
    this.OPPORTUNITY_NAME = OPPORTUNITY_NAME;
  }

  public APIOpportunity OPPORTUNITY_DETAILS(String OPPORTUNITY_DETAILS) {
    this.OPPORTUNITY_DETAILS = OPPORTUNITY_DETAILS;
    return this;
  }

   /**
   * Opportunity details
   * @return OPPORTUNITY_DETAILS
  **/
  @ApiModelProperty(example = "null", value = "Opportunity details")
  public String getOPPORTUNITYDETAILS() {
    return OPPORTUNITY_DETAILS;
  }

  public void setOPPORTUNITYDETAILS(String OPPORTUNITY_DETAILS) {
    this.OPPORTUNITY_DETAILS = OPPORTUNITY_DETAILS;
  }

  public APIOpportunity PROBABILITY(Integer PROBABILITY) {
    this.PROBABILITY = PROBABILITY;
    return this;
  }

   /**
   * Percentage probability of winning the Opportunity, as an integer value from 0 to 100
   * @return PROBABILITY
  **/
  @ApiModelProperty(example = "null", value = "Percentage probability of winning the Opportunity, as an integer value from 0 to 100")
  public Integer getPROBABILITY() {
    return PROBABILITY;
  }

  public void setPROBABILITY(Integer PROBABILITY) {
    this.PROBABILITY = PROBABILITY;
  }

  public APIOpportunity BID_CURRENCY(String BID_CURRENCY) {
    this.BID_CURRENCY = BID_CURRENCY;
    return this;
  }

   /**
   * Three character code for a currency
   * @return BID_CURRENCY
  **/
  @ApiModelProperty(example = "null", value = "Three character code for a currency")
  public String getBIDCURRENCY() {
    return BID_CURRENCY;
  }

  public void setBIDCURRENCY(String BID_CURRENCY) {
    this.BID_CURRENCY = BID_CURRENCY;
  }

  public APIOpportunity BID_AMOUNT(Long BID_AMOUNT) {
    this.BID_AMOUNT = BID_AMOUNT;
    return this;
  }

   /**
   * Potential value of the Opportunity, as an integer value
   * @return BID_AMOUNT
  **/
  @ApiModelProperty(example = "null", value = "Potential value of the Opportunity, as an integer value")
  public Long getBIDAMOUNT() {
    return BID_AMOUNT;
  }

  public void setBIDAMOUNT(Long BID_AMOUNT) {
    this.BID_AMOUNT = BID_AMOUNT;
  }

  public APIOpportunity BID_TYPE(String BID_TYPE) {
    this.BID_TYPE = BID_TYPE;
    return this;
  }

   /**
   * Type of bid for the Opportunity: Fixed Bid, Per Hour, Per Day, Per Week, Per Month or Per Year
   * @return BID_TYPE
  **/
  @ApiModelProperty(example = "null", value = "Type of bid for the Opportunity: Fixed Bid, Per Hour, Per Day, Per Week, Per Month or Per Year")
  public String getBIDTYPE() {
    return BID_TYPE;
  }

  public void setBIDTYPE(String BID_TYPE) {
    this.BID_TYPE = BID_TYPE;
  }

  public APIOpportunity BID_DURATION(Integer BID_DURATION) {
    this.BID_DURATION = BID_DURATION;
    return this;
  }

   /**
   * Duration of the bid of the Opportunity, if per hour/day/etc as an integer value
   * @return BID_DURATION
  **/
  @ApiModelProperty(example = "null", value = "Duration of the bid of the Opportunity, if per hour/day/etc as an integer value")
  public Integer getBIDDURATION() {
    return BID_DURATION;
  }

  public void setBIDDURATION(Integer BID_DURATION) {
    this.BID_DURATION = BID_DURATION;
  }

  public APIOpportunity OPPORTUNITY_VALUE(Long OPPORTUNITY_VALUE) {
    this.OPPORTUNITY_VALUE = OPPORTUNITY_VALUE;
    return this;
  }

   /**
   * Total value of the Opportunity, calculated based on BID_AMOUNT, BID_TYPE and BID_DURATION. This is a read-only field.
   * @return OPPORTUNITY_VALUE
  **/
  @ApiModelProperty(example = "null", value = "Total value of the Opportunity, calculated based on BID_AMOUNT, BID_TYPE and BID_DURATION. This is a read-only field.")
  public Long getOPPORTUNITYVALUE() {
    return OPPORTUNITY_VALUE;
  }

  public void setOPPORTUNITYVALUE(Long OPPORTUNITY_VALUE) {
    this.OPPORTUNITY_VALUE = OPPORTUNITY_VALUE;
  }

  public APIOpportunity FORECAST_CLOSE_DATE(Date FORECAST_CLOSE_DATE) {
    this.FORECAST_CLOSE_DATE = FORECAST_CLOSE_DATE;
    return this;
  }

   /**
   * Forecast close date of the Opportunity, in YYYY-MM-DD format
   * @return FORECAST_CLOSE_DATE
  **/
  @ApiModelProperty(example = "null", value = "Forecast close date of the Opportunity, in YYYY-MM-DD format")
  public Date getFORECASTCLOSEDATE() {
    return FORECAST_CLOSE_DATE;
  }

  public void setFORECASTCLOSEDATE(Date FORECAST_CLOSE_DATE) {
    this.FORECAST_CLOSE_DATE = FORECAST_CLOSE_DATE;
  }

  public APIOpportunity ACTUAL_CLOSE_DATE(Date ACTUAL_CLOSE_DATE) {
    this.ACTUAL_CLOSE_DATE = ACTUAL_CLOSE_DATE;
    return this;
  }

   /**
   * Actual close date of the Opportunity, in YYYY-MM-DD format
   * @return ACTUAL_CLOSE_DATE
  **/
  @ApiModelProperty(example = "null", value = "Actual close date of the Opportunity, in YYYY-MM-DD format")
  public Date getACTUALCLOSEDATE() {
    return ACTUAL_CLOSE_DATE;
  }

  public void setACTUALCLOSEDATE(Date ACTUAL_CLOSE_DATE) {
    this.ACTUAL_CLOSE_DATE = ACTUAL_CLOSE_DATE;
  }

  public APIOpportunity CATEGORY_ID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
    return this;
  }

   /**
   * The Category ID of the Opportunity, if it has been assigned to one
   * @return CATEGORY_ID
  **/
  @ApiModelProperty(example = "null", value = "The Category ID of the Opportunity, if it has been assigned to one")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }

  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  public APIOpportunity PIPELINE_ID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
    return this;
  }

   /**
   * The Pipeline ID that the Opportunity is in, if it has been assigned to one. Note: This is a read-only field, to update the Pipeline please use the /Opportunities/{id}/Pipeline endpoint.
   * @return PIPELINE_ID
  **/
  @ApiModelProperty(example = "null", value = "The Pipeline ID that the Opportunity is in, if it has been assigned to one. Note: This is a read-only field, to update the Pipeline please use the /Opportunities/{id}/Pipeline endpoint.")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }

  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  public APIOpportunity STAGE_ID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
    return this;
  }

   /**
   * The Stage ID of the Stage that the Opportunity is in, if it has been assigned to one. Note: This is a read-only field, to update the Pipeline Stage please use the /Opportunities/{id}/PipelineStage endpoint.
   * @return STAGE_ID
  **/
  @ApiModelProperty(example = "null", value = "The Stage ID of the Stage that the Opportunity is in, if it has been assigned to one. Note: This is a read-only field, to update the Pipeline Stage please use the /Opportunities/{id}/PipelineStage endpoint.")
  public Long getSTAGEID() {
    return STAGE_ID;
  }

  public void setSTAGEID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
  }

  public APIOpportunity OPPORTUNITY_STATE(String OPPORTUNITY_STATE) {
    this.OPPORTUNITY_STATE = OPPORTUNITY_STATE;
    return this;
  }

   /**
   * Opportunity State (required): Open, Abandoned, Lost, Suspended, Won
   * @return OPPORTUNITY_STATE
  **/
  @ApiModelProperty(example = "null", required = true, value = "Opportunity State (required): Open, Abandoned, Lost, Suspended, Won")
  public String getOPPORTUNITYSTATE() {
    return OPPORTUNITY_STATE;
  }

  public void setOPPORTUNITYSTATE(String OPPORTUNITY_STATE) {
    this.OPPORTUNITY_STATE = OPPORTUNITY_STATE;
  }

  public APIOpportunity OPPORTUNITY_STATE_REASON_ID(Long OPPORTUNITY_STATE_REASON_ID) {
    this.OPPORTUNITY_STATE_REASON_ID = OPPORTUNITY_STATE_REASON_ID;
    return this;
  }

   /**
   * Opportunity State Reason ID. Optional, if specified this field must have a valid State Reason ID.
   * @return OPPORTUNITY_STATE_REASON_ID
  **/
  @ApiModelProperty(example = "null", value = "Opportunity State Reason ID. Optional, if specified this field must have a valid State Reason ID.")
  public Long getOPPORTUNITYSTATEREASONID() {
    return OPPORTUNITY_STATE_REASON_ID;
  }

  public void setOPPORTUNITYSTATEREASONID(Long OPPORTUNITY_STATE_REASON_ID) {
    this.OPPORTUNITY_STATE_REASON_ID = OPPORTUNITY_STATE_REASON_ID;
  }

  public APIOpportunity IMAGE_URL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
    return this;
  }

   /**
   * URL of the Image for the Opportunity
   * @return IMAGE_URL
  **/
  @ApiModelProperty(example = "null", value = "URL of the Image for the Opportunity")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }

  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }

  public APIOpportunity RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
    return this;
  }

   /**
   * ID of the responsible user for the Opportunity
   * @return RESPONSIBLE_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the responsible user for the Opportunity")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }

  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  public APIOpportunity OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * User ID of the record owner. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "User ID of the record owner. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public APIOpportunity DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time Opportunity record created, as Coordinated Universal Time
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Opportunity record created, as Coordinated Universal Time")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public APIOpportunity DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and time Opportunity record updated, as Coordinated Universal Time
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Opportunity record updated, as Coordinated Universal Time")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public APIOpportunity VISIBLE_TO(String VISIBLE_TO) {
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

  public APIOpportunity VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
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

  public APIOpportunity VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
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

  public APIOpportunity CUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
    return this;
  }

  public APIOpportunity addCUSTOMFIELDSItem(APICustomField CUSTOMFIELDSItem) {
    this.CUSTOMFIELDS.add(CUSTOMFIELDSItem);
    return this;
  }

   /**
   * Set of Custom Fields attached to the Opportunity
   * @return CUSTOMFIELDS
  **/
  @ApiModelProperty(example = "null", value = "Set of Custom Fields attached to the Opportunity")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }

  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  public APIOpportunity TAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
    return this;
  }

  public APIOpportunity addTAGSItem(APITag TAGSItem) {
    this.TAGS.add(TAGSItem);
    return this;
  }

   /**
   * Set of Tags attached to the Opportunity
   * @return TAGS
  **/
  @ApiModelProperty(example = "null", value = "Set of Tags attached to the Opportunity")
  public List<APITag> getTAGS() {
    return TAGS;
  }

  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  public APIOpportunity LINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
    return this;
  }

  public APIOpportunity addLINKSItem(APILink LINKSItem) {
    this.LINKS.add(LINKSItem);
    return this;
  }

   /**
   * Set of Links attached to the Opportunity
   * @return LINKS
  **/
  @ApiModelProperty(example = "null", value = "Set of Links attached to the Opportunity")
  public List<APILink> getLINKS() {
    return LINKS;
  }

  public void setLINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
  }

  public APIOpportunity CAN_EDIT(Boolean CAN_EDIT) {
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

  public APIOpportunity CAN_DELETE(Boolean CAN_DELETE) {
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
    APIOpportunity apIOpportunity = (APIOpportunity) o;
    return Objects.equals(this.OPPORTUNITY_ID, apIOpportunity.OPPORTUNITY_ID) &&
        Objects.equals(this.OPPORTUNITY_NAME, apIOpportunity.OPPORTUNITY_NAME) &&
        Objects.equals(this.OPPORTUNITY_DETAILS, apIOpportunity.OPPORTUNITY_DETAILS) &&
        Objects.equals(this.PROBABILITY, apIOpportunity.PROBABILITY) &&
        Objects.equals(this.BID_CURRENCY, apIOpportunity.BID_CURRENCY) &&
        Objects.equals(this.BID_AMOUNT, apIOpportunity.BID_AMOUNT) &&
        Objects.equals(this.BID_TYPE, apIOpportunity.BID_TYPE) &&
        Objects.equals(this.BID_DURATION, apIOpportunity.BID_DURATION) &&
        Objects.equals(this.OPPORTUNITY_VALUE, apIOpportunity.OPPORTUNITY_VALUE) &&
        Objects.equals(this.FORECAST_CLOSE_DATE, apIOpportunity.FORECAST_CLOSE_DATE) &&
        Objects.equals(this.ACTUAL_CLOSE_DATE, apIOpportunity.ACTUAL_CLOSE_DATE) &&
        Objects.equals(this.CATEGORY_ID, apIOpportunity.CATEGORY_ID) &&
        Objects.equals(this.PIPELINE_ID, apIOpportunity.PIPELINE_ID) &&
        Objects.equals(this.STAGE_ID, apIOpportunity.STAGE_ID) &&
        Objects.equals(this.OPPORTUNITY_STATE, apIOpportunity.OPPORTUNITY_STATE) &&
        Objects.equals(this.OPPORTUNITY_STATE_REASON_ID, apIOpportunity.OPPORTUNITY_STATE_REASON_ID) &&
        Objects.equals(this.IMAGE_URL, apIOpportunity.IMAGE_URL) &&
        Objects.equals(this.RESPONSIBLE_USER_ID, apIOpportunity.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.OWNER_USER_ID, apIOpportunity.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, apIOpportunity.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, apIOpportunity.DATE_UPDATED_UTC) &&
        Objects.equals(this.VISIBLE_TO, apIOpportunity.VISIBLE_TO) &&
        Objects.equals(this.VISIBLE_TEAM_ID, apIOpportunity.VISIBLE_TEAM_ID) &&
        Objects.equals(this.VISIBLE_USER_IDS, apIOpportunity.VISIBLE_USER_IDS) &&
        Objects.equals(this.CUSTOMFIELDS, apIOpportunity.CUSTOMFIELDS) &&
        Objects.equals(this.TAGS, apIOpportunity.TAGS) &&
        Objects.equals(this.LINKS, apIOpportunity.LINKS) &&
        Objects.equals(this.CAN_EDIT, apIOpportunity.CAN_EDIT) &&
        Objects.equals(this.CAN_DELETE, apIOpportunity.CAN_DELETE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(OPPORTUNITY_ID, OPPORTUNITY_NAME, OPPORTUNITY_DETAILS, PROBABILITY, BID_CURRENCY, BID_AMOUNT, BID_TYPE, BID_DURATION, OPPORTUNITY_VALUE, FORECAST_CLOSE_DATE, ACTUAL_CLOSE_DATE, CATEGORY_ID, PIPELINE_ID, STAGE_ID, OPPORTUNITY_STATE, OPPORTUNITY_STATE_REASON_ID, IMAGE_URL, RESPONSIBLE_USER_ID, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC, VISIBLE_TO, VISIBLE_TEAM_ID, VISIBLE_USER_IDS, CUSTOMFIELDS, TAGS, LINKS, CAN_EDIT, CAN_DELETE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIOpportunity {\n");
    
    sb.append("    OPPORTUNITY_ID: ").append(toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    OPPORTUNITY_NAME: ").append(toIndentedString(OPPORTUNITY_NAME)).append("\n");
    sb.append("    OPPORTUNITY_DETAILS: ").append(toIndentedString(OPPORTUNITY_DETAILS)).append("\n");
    sb.append("    PROBABILITY: ").append(toIndentedString(PROBABILITY)).append("\n");
    sb.append("    BID_CURRENCY: ").append(toIndentedString(BID_CURRENCY)).append("\n");
    sb.append("    BID_AMOUNT: ").append(toIndentedString(BID_AMOUNT)).append("\n");
    sb.append("    BID_TYPE: ").append(toIndentedString(BID_TYPE)).append("\n");
    sb.append("    BID_DURATION: ").append(toIndentedString(BID_DURATION)).append("\n");
    sb.append("    OPPORTUNITY_VALUE: ").append(toIndentedString(OPPORTUNITY_VALUE)).append("\n");
    sb.append("    FORECAST_CLOSE_DATE: ").append(toIndentedString(FORECAST_CLOSE_DATE)).append("\n");
    sb.append("    ACTUAL_CLOSE_DATE: ").append(toIndentedString(ACTUAL_CLOSE_DATE)).append("\n");
    sb.append("    CATEGORY_ID: ").append(toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    PIPELINE_ID: ").append(toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    STAGE_ID: ").append(toIndentedString(STAGE_ID)).append("\n");
    sb.append("    OPPORTUNITY_STATE: ").append(toIndentedString(OPPORTUNITY_STATE)).append("\n");
    sb.append("    OPPORTUNITY_STATE_REASON_ID: ").append(toIndentedString(OPPORTUNITY_STATE_REASON_ID)).append("\n");
    sb.append("    IMAGE_URL: ").append(toIndentedString(IMAGE_URL)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    TAGS: ").append(toIndentedString(TAGS)).append("\n");
    sb.append("    LINKS: ").append(toIndentedString(LINKS)).append("\n");
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

