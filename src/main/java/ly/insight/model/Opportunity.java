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
public class Opportunity implements Serializable {
  @SerializedName("CATEGORY_ID")
  private Long CATEGORY_ID = null;

  @SerializedName("FORECAST_CLOSE_DATE")
  private Date FORECAST_CLOSE_DATE = null;

  @SerializedName("BID_AMOUNT")
  private Long BID_AMOUNT = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  @SerializedName("LINKS")
  private List<APILink> LINKS = new ArrayList<APILink>();

  @SerializedName("PIPELINE_ID")
  private Long PIPELINE_ID = null;

  @SerializedName("OPPORTUNITY_STATE_REASON_ID")
  private Long OPPORTUNITY_STATE_REASON_ID = null;

  @SerializedName("VISIBLE_TEAM_ID")
  private Long VISIBLE_TEAM_ID = null;

  @SerializedName("VISIBLE_TO")
  private String VISIBLE_TO = null;

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("ACTUAL_CLOSE_DATE")
  private Date ACTUAL_CLOSE_DATE = null;

  @SerializedName("OPPORTUNITY_DETAILS")
  private String OPPORTUNITY_DETAILS = null;

  @SerializedName("OPPORTUNITY_NAME")
  private String OPPORTUNITY_NAME = null;

  @SerializedName("OPPORTUNITY_ID")
  private Long OPPORTUNITY_ID = null;

  @SerializedName("STAGE_ID")
  private Long STAGE_ID = null;

  @SerializedName("IMAGE_URL")
  private String IMAGE_URL = null;

  @SerializedName("RESPONSIBLE_USER_ID")
  private Integer RESPONSIBLE_USER_ID = null;

  @SerializedName("VISIBLE_USER_IDS")
  private String VISIBLE_USER_IDS = null;

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("BID_DURATION")
  private Integer BID_DURATION = null;

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("CUSTOMFIELDS")
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();

  @SerializedName("BID_CURRENCY")
  private String BID_CURRENCY = null;

  @SerializedName("PROBABILITY")
  private Integer PROBABILITY = null;

  @SerializedName("OPPORTUNITY_VALUE")
  private Long OPPORTUNITY_VALUE = null;

  @SerializedName("BID_TYPE")
  private String BID_TYPE = null;

  @SerializedName("OPPORTUNITY_STATE")
  private String OPPORTUNITY_STATE = null;

  @SerializedName("TAGS")
  private List<APITag> TAGS = new ArrayList<APITag>();

  public Opportunity CATEGORY_ID(Long CATEGORY_ID) {
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

  public Opportunity FORECAST_CLOSE_DATE(Date FORECAST_CLOSE_DATE) {
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

  public Opportunity BID_AMOUNT(Long BID_AMOUNT) {
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

  public Opportunity CAN_DELETE(Boolean CAN_DELETE) {
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

  public Opportunity LINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
    return this;
  }

  public Opportunity addLINKSItem(APILink LINKSItem) {
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

  public Opportunity PIPELINE_ID(Long PIPELINE_ID) {
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

  public Opportunity OPPORTUNITY_STATE_REASON_ID(Long OPPORTUNITY_STATE_REASON_ID) {
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

  public Opportunity VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
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

  public Opportunity VISIBLE_TO(String VISIBLE_TO) {
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

  public Opportunity DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
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

  public Opportunity ACTUAL_CLOSE_DATE(Date ACTUAL_CLOSE_DATE) {
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

  public Opportunity OPPORTUNITY_DETAILS(String OPPORTUNITY_DETAILS) {
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

  public Opportunity OPPORTUNITY_NAME(String OPPORTUNITY_NAME) {
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

  public Opportunity OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
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

  public Opportunity STAGE_ID(Long STAGE_ID) {
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

  public Opportunity IMAGE_URL(String IMAGE_URL) {
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

  public Opportunity RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
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

  public Opportunity VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
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

  public Opportunity CAN_EDIT(Boolean CAN_EDIT) {
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

  public Opportunity BID_DURATION(Integer BID_DURATION) {
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

  public Opportunity DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
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

  public Opportunity OWNER_USER_ID(Integer OWNER_USER_ID) {
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

  public Opportunity CUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
    return this;
  }

  public Opportunity addCUSTOMFIELDSItem(APICustomField CUSTOMFIELDSItem) {
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

  public Opportunity BID_CURRENCY(String BID_CURRENCY) {
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

  public Opportunity PROBABILITY(Integer PROBABILITY) {
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

  public Opportunity OPPORTUNITY_VALUE(Long OPPORTUNITY_VALUE) {
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

  public Opportunity BID_TYPE(String BID_TYPE) {
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

  public Opportunity OPPORTUNITY_STATE(String OPPORTUNITY_STATE) {
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

  public Opportunity TAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
    return this;
  }

  public Opportunity addTAGSItem(APITag TAGSItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Opportunity opportunity = (Opportunity) o;
    return Objects.equals(this.CATEGORY_ID, opportunity.CATEGORY_ID) &&
        Objects.equals(this.FORECAST_CLOSE_DATE, opportunity.FORECAST_CLOSE_DATE) &&
        Objects.equals(this.BID_AMOUNT, opportunity.BID_AMOUNT) &&
        Objects.equals(this.CAN_DELETE, opportunity.CAN_DELETE) &&
        Objects.equals(this.LINKS, opportunity.LINKS) &&
        Objects.equals(this.PIPELINE_ID, opportunity.PIPELINE_ID) &&
        Objects.equals(this.OPPORTUNITY_STATE_REASON_ID, opportunity.OPPORTUNITY_STATE_REASON_ID) &&
        Objects.equals(this.VISIBLE_TEAM_ID, opportunity.VISIBLE_TEAM_ID) &&
        Objects.equals(this.VISIBLE_TO, opportunity.VISIBLE_TO) &&
        Objects.equals(this.DATE_CREATED_UTC, opportunity.DATE_CREATED_UTC) &&
        Objects.equals(this.ACTUAL_CLOSE_DATE, opportunity.ACTUAL_CLOSE_DATE) &&
        Objects.equals(this.OPPORTUNITY_DETAILS, opportunity.OPPORTUNITY_DETAILS) &&
        Objects.equals(this.OPPORTUNITY_NAME, opportunity.OPPORTUNITY_NAME) &&
        Objects.equals(this.OPPORTUNITY_ID, opportunity.OPPORTUNITY_ID) &&
        Objects.equals(this.STAGE_ID, opportunity.STAGE_ID) &&
        Objects.equals(this.IMAGE_URL, opportunity.IMAGE_URL) &&
        Objects.equals(this.RESPONSIBLE_USER_ID, opportunity.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.VISIBLE_USER_IDS, opportunity.VISIBLE_USER_IDS) &&
        Objects.equals(this.CAN_EDIT, opportunity.CAN_EDIT) &&
        Objects.equals(this.BID_DURATION, opportunity.BID_DURATION) &&
        Objects.equals(this.DATE_UPDATED_UTC, opportunity.DATE_UPDATED_UTC) &&
        Objects.equals(this.OWNER_USER_ID, opportunity.OWNER_USER_ID) &&
        Objects.equals(this.CUSTOMFIELDS, opportunity.CUSTOMFIELDS) &&
        Objects.equals(this.BID_CURRENCY, opportunity.BID_CURRENCY) &&
        Objects.equals(this.PROBABILITY, opportunity.PROBABILITY) &&
        Objects.equals(this.OPPORTUNITY_VALUE, opportunity.OPPORTUNITY_VALUE) &&
        Objects.equals(this.BID_TYPE, opportunity.BID_TYPE) &&
        Objects.equals(this.OPPORTUNITY_STATE, opportunity.OPPORTUNITY_STATE) &&
        Objects.equals(this.TAGS, opportunity.TAGS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CATEGORY_ID, FORECAST_CLOSE_DATE, BID_AMOUNT, CAN_DELETE, LINKS, PIPELINE_ID, OPPORTUNITY_STATE_REASON_ID, VISIBLE_TEAM_ID, VISIBLE_TO, DATE_CREATED_UTC, ACTUAL_CLOSE_DATE, OPPORTUNITY_DETAILS, OPPORTUNITY_NAME, OPPORTUNITY_ID, STAGE_ID, IMAGE_URL, RESPONSIBLE_USER_ID, VISIBLE_USER_IDS, CAN_EDIT, BID_DURATION, DATE_UPDATED_UTC, OWNER_USER_ID, CUSTOMFIELDS, BID_CURRENCY, PROBABILITY, OPPORTUNITY_VALUE, BID_TYPE, OPPORTUNITY_STATE, TAGS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Opportunity {\n");
    
    sb.append("    CATEGORY_ID: ").append(toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    FORECAST_CLOSE_DATE: ").append(toIndentedString(FORECAST_CLOSE_DATE)).append("\n");
    sb.append("    BID_AMOUNT: ").append(toIndentedString(BID_AMOUNT)).append("\n");
    sb.append("    CAN_DELETE: ").append(toIndentedString(CAN_DELETE)).append("\n");
    sb.append("    LINKS: ").append(toIndentedString(LINKS)).append("\n");
    sb.append("    PIPELINE_ID: ").append(toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    OPPORTUNITY_STATE_REASON_ID: ").append(toIndentedString(OPPORTUNITY_STATE_REASON_ID)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    ACTUAL_CLOSE_DATE: ").append(toIndentedString(ACTUAL_CLOSE_DATE)).append("\n");
    sb.append("    OPPORTUNITY_DETAILS: ").append(toIndentedString(OPPORTUNITY_DETAILS)).append("\n");
    sb.append("    OPPORTUNITY_NAME: ").append(toIndentedString(OPPORTUNITY_NAME)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(toIndentedString(OPPORTUNITY_ID)).append("\n");
    sb.append("    STAGE_ID: ").append(toIndentedString(STAGE_ID)).append("\n");
    sb.append("    IMAGE_URL: ").append(toIndentedString(IMAGE_URL)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CAN_EDIT: ").append(toIndentedString(CAN_EDIT)).append("\n");
    sb.append("    BID_DURATION: ").append(toIndentedString(BID_DURATION)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    BID_CURRENCY: ").append(toIndentedString(BID_CURRENCY)).append("\n");
    sb.append("    PROBABILITY: ").append(toIndentedString(PROBABILITY)).append("\n");
    sb.append("    OPPORTUNITY_VALUE: ").append(toIndentedString(OPPORTUNITY_VALUE)).append("\n");
    sb.append("    BID_TYPE: ").append(toIndentedString(BID_TYPE)).append("\n");
    sb.append("    OPPORTUNITY_STATE: ").append(toIndentedString(OPPORTUNITY_STATE)).append("\n");
    sb.append("    TAGS: ").append(toIndentedString(TAGS)).append("\n");
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

