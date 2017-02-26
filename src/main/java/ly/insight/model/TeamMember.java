package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APITeamMember
 */
@ApiModel(description = "APITeamMember")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class TeamMember implements Serializable {
  @SerializedName("MEMBER_USER_ID")
  private Integer MEMBER_USER_ID = null;

  @SerializedName("PERMISSION_ID")
  private Long PERMISSION_ID = null;

  @SerializedName("TEAM_ID")
  private Long TEAM_ID = null;

  public TeamMember MEMBER_USER_ID(Integer MEMBER_USER_ID) {
    this.MEMBER_USER_ID = MEMBER_USER_ID;
    return this;
  }

   /**
   * The unique ID for the User the team membership record describes
   * @return MEMBER_USER_ID
  **/
  @ApiModelProperty(example = "null", required = true, value = "The unique ID for the User the team membership record describes")
  public Integer getMEMBERUSERID() {
    return MEMBER_USER_ID;
  }

  public void setMEMBERUSERID(Integer MEMBER_USER_ID) {
    this.MEMBER_USER_ID = MEMBER_USER_ID;
  }

  public TeamMember PERMISSION_ID(Long PERMISSION_ID) {
    this.PERMISSION_ID = PERMISSION_ID;
    return this;
  }

   /**
   * Unique ID for the Team Member record
   * @return PERMISSION_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Team Member record")
  public Long getPERMISSIONID() {
    return PERMISSION_ID;
  }

  public void setPERMISSIONID(Long PERMISSION_ID) {
    this.PERMISSION_ID = PERMISSION_ID;
  }

  public TeamMember TEAM_ID(Long TEAM_ID) {
    this.TEAM_ID = TEAM_ID;
    return this;
  }

   /**
   * The unique ID for the Team the team membership record describes
   * @return TEAM_ID
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for the Team the team membership record describes")
  public Long getTEAMID() {
    return TEAM_ID;
  }

  public void setTEAMID(Long TEAM_ID) {
    this.TEAM_ID = TEAM_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamMember teamMember = (TeamMember) o;
    return Objects.equals(this.MEMBER_USER_ID, teamMember.MEMBER_USER_ID) &&
        Objects.equals(this.PERMISSION_ID, teamMember.PERMISSION_ID) &&
        Objects.equals(this.TEAM_ID, teamMember.TEAM_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MEMBER_USER_ID, PERMISSION_ID, TEAM_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMember {\n");
    
    sb.append("    MEMBER_USER_ID: ").append(toIndentedString(MEMBER_USER_ID)).append("\n");
    sb.append("    PERMISSION_ID: ").append(toIndentedString(PERMISSION_ID)).append("\n");
    sb.append("    TEAM_ID: ").append(toIndentedString(TEAM_ID)).append("\n");
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

