package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APIActivityAssignment
 */
@ApiModel(description = "APIActivityAssignment")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIActivityAssignment implements Serializable {
  @SerializedName("ACTIVITY_ID")
  private Long ACTIVITY_ID = null;

  @SerializedName("RESPONSIBLE_USER_ID")
  private Integer RESPONSIBLE_USER_ID = null;

  @SerializedName("ASSIGNED_TEAM_ID")
  private Long ASSIGNED_TEAM_ID = null;

  public APIActivityAssignment ACTIVITY_ID(Long ACTIVITY_ID) {
    this.ACTIVITY_ID = ACTIVITY_ID;
    return this;
  }

   /**
   * Unique ID for the Activity
   * @return ACTIVITY_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Activity")
  public Long getACTIVITYID() {
    return ACTIVITY_ID;
  }

  public void setACTIVITYID(Long ACTIVITY_ID) {
    this.ACTIVITY_ID = ACTIVITY_ID;
  }

  public APIActivityAssignment RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
    return this;
  }

   /**
   * Responsible User ID. Either RESPONSIBLE_USER_ID or ASSIGNED_TEAM_ID is required
   * @return RESPONSIBLE_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "Responsible User ID. Either RESPONSIBLE_USER_ID or ASSIGNED_TEAM_ID is required")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }

  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  public APIActivityAssignment ASSIGNED_TEAM_ID(Long ASSIGNED_TEAM_ID) {
    this.ASSIGNED_TEAM_ID = ASSIGNED_TEAM_ID;
    return this;
  }

   /**
   * Assigned Team ID. Either ASSIGNED_TEAM_ID or RESPONSIBLE_USER_ID is required
   * @return ASSIGNED_TEAM_ID
  **/
  @ApiModelProperty(example = "null", value = "Assigned Team ID. Either ASSIGNED_TEAM_ID or RESPONSIBLE_USER_ID is required")
  public Long getASSIGNEDTEAMID() {
    return ASSIGNED_TEAM_ID;
  }

  public void setASSIGNEDTEAMID(Long ASSIGNED_TEAM_ID) {
    this.ASSIGNED_TEAM_ID = ASSIGNED_TEAM_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIActivityAssignment apIActivityAssignment = (APIActivityAssignment) o;
    return Objects.equals(this.ACTIVITY_ID, apIActivityAssignment.ACTIVITY_ID) &&
        Objects.equals(this.RESPONSIBLE_USER_ID, apIActivityAssignment.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.ASSIGNED_TEAM_ID, apIActivityAssignment.ASSIGNED_TEAM_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ACTIVITY_ID, RESPONSIBLE_USER_ID, ASSIGNED_TEAM_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIActivityAssignment {\n");
    
    sb.append("    ACTIVITY_ID: ").append(toIndentedString(ACTIVITY_ID)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    ASSIGNED_TEAM_ID: ").append(toIndentedString(ASSIGNED_TEAM_ID)).append("\n");
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

