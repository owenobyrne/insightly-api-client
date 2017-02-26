package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;

/**
 * APIOpportunityState
 */
@ApiModel(description = "APIOpportunityState")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class OpportunityState implements Serializable {
  @SerializedName("DATE_CHANGED_UTC")
  private Date DATE_CHANGED_UTC = null;

  @SerializedName("STATE_REASON")
  private String STATE_REASON = null;

  @SerializedName("STATE_REASON_ID")
  private Long STATE_REASON_ID = null;

  @SerializedName("FOR_OPPORTUNITY_STATE")
  private String FOR_OPPORTUNITY_STATE = null;

  @SerializedName("OPPORTUNITY_ID")
  private Long OPPORTUNITY_ID = null;

  public OpportunityState DATE_CHANGED_UTC(Date DATE_CHANGED_UTC) {
    this.DATE_CHANGED_UTC = DATE_CHANGED_UTC;
    return this;
  }

   /**
   * Date and time the Opportunity State was changed, in Coordinated Universal Time
   * @return DATE_CHANGED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time the Opportunity State was changed, in Coordinated Universal Time")
  public Date getDATECHANGEDUTC() {
    return DATE_CHANGED_UTC;
  }

  public void setDATECHANGEDUTC(Date DATE_CHANGED_UTC) {
    this.DATE_CHANGED_UTC = DATE_CHANGED_UTC;
  }

  public OpportunityState STATE_REASON(String STATE_REASON) {
    this.STATE_REASON = STATE_REASON;
    return this;
  }

   /**
   * Opportunity state change Reason corresponding to the STATE_REASON_ID
   * @return STATE_REASON
  **/
  @ApiModelProperty(example = "null", value = "Opportunity state change Reason corresponding to the STATE_REASON_ID")
  public String getSTATEREASON() {
    return STATE_REASON;
  }

  public void setSTATEREASON(String STATE_REASON) {
    this.STATE_REASON = STATE_REASON;
  }

  public OpportunityState STATE_REASON_ID(Long STATE_REASON_ID) {
    this.STATE_REASON_ID = STATE_REASON_ID;
    return this;
  }

   /**
   * The unique key of the Reason that the State was changed
   * @return STATE_REASON_ID
  **/
  @ApiModelProperty(example = "null", value = "The unique key of the Reason that the State was changed")
  public Long getSTATEREASONID() {
    return STATE_REASON_ID;
  }

  public void setSTATEREASONID(Long STATE_REASON_ID) {
    this.STATE_REASON_ID = STATE_REASON_ID;
  }

  public OpportunityState FOR_OPPORTUNITY_STATE(String FOR_OPPORTUNITY_STATE) {
    this.FOR_OPPORTUNITY_STATE = FOR_OPPORTUNITY_STATE;
    return this;
  }

   /**
   * The state of the Opportunity: Abandoned, Lost, Open, Suspended, or Won
   * @return FOR_OPPORTUNITY_STATE
  **/
  @ApiModelProperty(example = "null", value = "The state of the Opportunity: Abandoned, Lost, Open, Suspended, or Won")
  public String getFOROPPORTUNITYSTATE() {
    return FOR_OPPORTUNITY_STATE;
  }

  public void setFOROPPORTUNITYSTATE(String FOR_OPPORTUNITY_STATE) {
    this.FOR_OPPORTUNITY_STATE = FOR_OPPORTUNITY_STATE;
  }

  public OpportunityState OPPORTUNITY_ID(Long OPPORTUNITY_ID) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpportunityState opportunityState = (OpportunityState) o;
    return Objects.equals(this.DATE_CHANGED_UTC, opportunityState.DATE_CHANGED_UTC) &&
        Objects.equals(this.STATE_REASON, opportunityState.STATE_REASON) &&
        Objects.equals(this.STATE_REASON_ID, opportunityState.STATE_REASON_ID) &&
        Objects.equals(this.FOR_OPPORTUNITY_STATE, opportunityState.FOR_OPPORTUNITY_STATE) &&
        Objects.equals(this.OPPORTUNITY_ID, opportunityState.OPPORTUNITY_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DATE_CHANGED_UTC, STATE_REASON, STATE_REASON_ID, FOR_OPPORTUNITY_STATE, OPPORTUNITY_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpportunityState {\n");
    
    sb.append("    DATE_CHANGED_UTC: ").append(toIndentedString(DATE_CHANGED_UTC)).append("\n");
    sb.append("    STATE_REASON: ").append(toIndentedString(STATE_REASON)).append("\n");
    sb.append("    STATE_REASON_ID: ").append(toIndentedString(STATE_REASON_ID)).append("\n");
    sb.append("    FOR_OPPORTUNITY_STATE: ").append(toIndentedString(FOR_OPPORTUNITY_STATE)).append("\n");
    sb.append("    OPPORTUNITY_ID: ").append(toIndentedString(OPPORTUNITY_ID)).append("\n");
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

