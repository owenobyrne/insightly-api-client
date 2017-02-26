package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APIOpportunityStateReason
 */
@ApiModel(description = "APIOpportunityStateReason")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIOpportunityStateReason implements Serializable {
  @SerializedName("STATE_REASON_ID")
  private Long STATE_REASON_ID = null;

  @SerializedName("STATE_REASON")
  private String STATE_REASON = null;

  @SerializedName("FOR_OPPORTUNITY_STATE")
  private String FOR_OPPORTUNITY_STATE = null;

  public APIOpportunityStateReason STATE_REASON_ID(Long STATE_REASON_ID) {
    this.STATE_REASON_ID = STATE_REASON_ID;
    return this;
  }

   /**
   * The unique ID for the State Reason
   * @return STATE_REASON_ID
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for the State Reason")
  public Long getSTATEREASONID() {
    return STATE_REASON_ID;
  }

  public void setSTATEREASONID(Long STATE_REASON_ID) {
    this.STATE_REASON_ID = STATE_REASON_ID;
  }

  public APIOpportunityStateReason STATE_REASON(String STATE_REASON) {
    this.STATE_REASON = STATE_REASON;
    return this;
  }

   /**
   * The name of the State Reason
   * @return STATE_REASON
  **/
  @ApiModelProperty(example = "null", value = "The name of the State Reason")
  public String getSTATEREASON() {
    return STATE_REASON;
  }

  public void setSTATEREASON(String STATE_REASON) {
    this.STATE_REASON = STATE_REASON;
  }

  public APIOpportunityStateReason FOR_OPPORTUNITY_STATE(String FOR_OPPORTUNITY_STATE) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIOpportunityStateReason apIOpportunityStateReason = (APIOpportunityStateReason) o;
    return Objects.equals(this.STATE_REASON_ID, apIOpportunityStateReason.STATE_REASON_ID) &&
        Objects.equals(this.STATE_REASON, apIOpportunityStateReason.STATE_REASON) &&
        Objects.equals(this.FOR_OPPORTUNITY_STATE, apIOpportunityStateReason.FOR_OPPORTUNITY_STATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(STATE_REASON_ID, STATE_REASON, FOR_OPPORTUNITY_STATE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIOpportunityStateReason {\n");
    
    sb.append("    STATE_REASON_ID: ").append(toIndentedString(STATE_REASON_ID)).append("\n");
    sb.append("    STATE_REASON: ").append(toIndentedString(STATE_REASON)).append("\n");
    sb.append("    FOR_OPPORTUNITY_STATE: ").append(toIndentedString(FOR_OPPORTUNITY_STATE)).append("\n");
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

