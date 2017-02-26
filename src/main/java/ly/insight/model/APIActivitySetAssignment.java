package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ly.insight.model.APIActivityAssignment;
import java.io.Serializable;

/**
 * APIActivitySetAssignment
 */
@ApiModel(description = "APIActivitySetAssignment")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIActivitySetAssignment implements Serializable {
  @SerializedName("ACTIVITYSET_ID")
  private Long ACTIVITYSET_ID = null;

  @SerializedName("START_DATE")
  private Date START_DATE = null;

  @SerializedName("END_DATE")
  private Date END_DATE = null;

  @SerializedName("ACTIVITY_ASSIGNMENTS")
  private List<APIActivityAssignment> ACTIVITY_ASSIGNMENTS = new ArrayList<APIActivityAssignment>();

  public APIActivitySetAssignment ACTIVITYSET_ID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
    return this;
  }

   /**
   * Unique ID for the Activity Set
   * @return ACTIVITYSET_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Activity Set")
  public Long getACTIVITYSETID() {
    return ACTIVITYSET_ID;
  }

  public void setACTIVITYSETID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
  }

  public APIActivitySetAssignment START_DATE(Date START_DATE) {
    this.START_DATE = START_DATE;
    return this;
  }

   /**
   * Start Date for the Activity Set
   * @return START_DATE
  **/
  @ApiModelProperty(example = "null", value = "Start Date for the Activity Set")
  public Date getSTARTDATE() {
    return START_DATE;
  }

  public void setSTARTDATE(Date START_DATE) {
    this.START_DATE = START_DATE;
  }

  public APIActivitySetAssignment END_DATE(Date END_DATE) {
    this.END_DATE = END_DATE;
    return this;
  }

   /**
   * End Date for the Activity Set. If activity set contains activities with end date specification then END_DATE is required
   * @return END_DATE
  **/
  @ApiModelProperty(example = "null", value = "End Date for the Activity Set. If activity set contains activities with end date specification then END_DATE is required")
  public Date getENDDATE() {
    return END_DATE;
  }

  public void setENDDATE(Date END_DATE) {
    this.END_DATE = END_DATE;
  }

  public APIActivitySetAssignment ACTIVITY_ASSIGNMENTS(List<APIActivityAssignment> ACTIVITY_ASSIGNMENTS) {
    this.ACTIVITY_ASSIGNMENTS = ACTIVITY_ASSIGNMENTS;
    return this;
  }

  public APIActivitySetAssignment addACTIVITYASSIGNMENTSItem(APIActivityAssignment ACTIVITY_ASSIGNMENTSItem) {
    this.ACTIVITY_ASSIGNMENTS.add(ACTIVITY_ASSIGNMENTSItem);
    return this;
  }

   /**
   * List of Activity Assignments. Only needed for Task Activities that have not been pre-assigned when configuring the Activity Set.
   * @return ACTIVITY_ASSIGNMENTS
  **/
  @ApiModelProperty(example = "null", value = "List of Activity Assignments. Only needed for Task Activities that have not been pre-assigned when configuring the Activity Set.")
  public List<APIActivityAssignment> getACTIVITYASSIGNMENTS() {
    return ACTIVITY_ASSIGNMENTS;
  }

  public void setACTIVITYASSIGNMENTS(List<APIActivityAssignment> ACTIVITY_ASSIGNMENTS) {
    this.ACTIVITY_ASSIGNMENTS = ACTIVITY_ASSIGNMENTS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIActivitySetAssignment apIActivitySetAssignment = (APIActivitySetAssignment) o;
    return Objects.equals(this.ACTIVITYSET_ID, apIActivitySetAssignment.ACTIVITYSET_ID) &&
        Objects.equals(this.START_DATE, apIActivitySetAssignment.START_DATE) &&
        Objects.equals(this.END_DATE, apIActivitySetAssignment.END_DATE) &&
        Objects.equals(this.ACTIVITY_ASSIGNMENTS, apIActivitySetAssignment.ACTIVITY_ASSIGNMENTS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ACTIVITYSET_ID, START_DATE, END_DATE, ACTIVITY_ASSIGNMENTS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIActivitySetAssignment {\n");
    
    sb.append("    ACTIVITYSET_ID: ").append(toIndentedString(ACTIVITYSET_ID)).append("\n");
    sb.append("    START_DATE: ").append(toIndentedString(START_DATE)).append("\n");
    sb.append("    END_DATE: ").append(toIndentedString(END_DATE)).append("\n");
    sb.append("    ACTIVITY_ASSIGNMENTS: ").append(toIndentedString(ACTIVITY_ASSIGNMENTS)).append("\n");
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

