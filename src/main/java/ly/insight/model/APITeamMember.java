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
public class APITeamMember implements Serializable {
  @SerializedName("PERMISSION_ID")
  private Long PERMISSION_ID = null;

  @SerializedName("TEAM_ID")
  private Long TEAM_ID = null;

  @SerializedName("MEMBER_USER_ID")
  private Integer MEMBER_USER_ID = null;

  public APITeamMember PERMISSION_ID(Long PERMISSION_ID) {
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

  public APITeamMember TEAM_ID(Long TEAM_ID) {
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

  public APITeamMember MEMBER_USER_ID(Integer MEMBER_USER_ID) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APITeamMember apITeamMember = (APITeamMember) o;
    return Objects.equals(this.PERMISSION_ID, apITeamMember.PERMISSION_ID) &&
        Objects.equals(this.TEAM_ID, apITeamMember.TEAM_ID) &&
        Objects.equals(this.MEMBER_USER_ID, apITeamMember.MEMBER_USER_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PERMISSION_ID, TEAM_ID, MEMBER_USER_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APITeamMember {\n");
    
    sb.append("    PERMISSION_ID: ").append(toIndentedString(PERMISSION_ID)).append("\n");
    sb.append("    TEAM_ID: ").append(toIndentedString(TEAM_ID)).append("\n");
    sb.append("    MEMBER_USER_ID: ").append(toIndentedString(MEMBER_USER_ID)).append("\n");
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

