package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ly.insight.model.APITeamMember;
import java.io.Serializable;

/**
 * APITeam
 */
@ApiModel(description = "APITeam")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APITeam implements Serializable {
  @SerializedName("TEAM_ID")
  private Long TEAM_ID = null;

  @SerializedName("TEAM_NAME")
  private String TEAM_NAME = null;

  @SerializedName("ANONYMOUS_TEAM")
  private Boolean ANONYMOUS_TEAM = null;

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("TEAMMEMBERS")
  private List<APITeamMember> TEAMMEMBERS = new ArrayList<APITeamMember>();

  public APITeam TEAM_ID(Long TEAM_ID) {
    this.TEAM_ID = TEAM_ID;
    return this;
  }

   /**
   * Unique ID for the Team record
   * @return TEAM_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Team record")
  public Long getTEAMID() {
    return TEAM_ID;
  }

  public void setTEAMID(Long TEAM_ID) {
    this.TEAM_ID = TEAM_ID;
  }

  public APITeam TEAM_NAME(String TEAM_NAME) {
    this.TEAM_NAME = TEAM_NAME;
    return this;
  }

   /**
   * Name of the Team, this field is required when creating a Team with ANONYMOUS_TEAM set to \"false\"
   * @return TEAM_NAME
  **/
  @ApiModelProperty(example = "null", value = "Name of the Team, this field is required when creating a Team with ANONYMOUS_TEAM set to \"false\"")
  public String getTEAMNAME() {
    return TEAM_NAME;
  }

  public void setTEAMNAME(String TEAM_NAME) {
    this.TEAM_NAME = TEAM_NAME;
  }

  public APITeam ANONYMOUS_TEAM(Boolean ANONYMOUS_TEAM) {
    this.ANONYMOUS_TEAM = ANONYMOUS_TEAM;
    return this;
  }

   /**
   * True, if this Team should not appear in the web UI
   * @return ANONYMOUS_TEAM
  **/
  @ApiModelProperty(example = "null", value = "True, if this Team should not appear in the web UI")
  public Boolean getANONYMOUSTEAM() {
    return ANONYMOUS_TEAM;
  }

  public void setANONYMOUSTEAM(Boolean ANONYMOUS_TEAM) {
    this.ANONYMOUS_TEAM = ANONYMOUS_TEAM;
  }

  public APITeam DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time Team record created, as Coorindated Universal Time
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Team record created, as Coorindated Universal Time")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public APITeam DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and time Team record updated, as Coordinated Universal Time
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Team record updated, as Coordinated Universal Time")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public APITeam TEAMMEMBERS(List<APITeamMember> TEAMMEMBERS) {
    this.TEAMMEMBERS = TEAMMEMBERS;
    return this;
  }

  public APITeam addTEAMMEMBERSItem(APITeamMember TEAMMEMBERSItem) {
    this.TEAMMEMBERS.add(TEAMMEMBERSItem);
    return this;
  }

   /**
   * Set of Team Members attached to the Team
   * @return TEAMMEMBERS
  **/
  @ApiModelProperty(example = "null", value = "Set of Team Members attached to the Team")
  public List<APITeamMember> getTEAMMEMBERS() {
    return TEAMMEMBERS;
  }

  public void setTEAMMEMBERS(List<APITeamMember> TEAMMEMBERS) {
    this.TEAMMEMBERS = TEAMMEMBERS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APITeam apITeam = (APITeam) o;
    return Objects.equals(this.TEAM_ID, apITeam.TEAM_ID) &&
        Objects.equals(this.TEAM_NAME, apITeam.TEAM_NAME) &&
        Objects.equals(this.ANONYMOUS_TEAM, apITeam.ANONYMOUS_TEAM) &&
        Objects.equals(this.DATE_CREATED_UTC, apITeam.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, apITeam.DATE_UPDATED_UTC) &&
        Objects.equals(this.TEAMMEMBERS, apITeam.TEAMMEMBERS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(TEAM_ID, TEAM_NAME, ANONYMOUS_TEAM, DATE_CREATED_UTC, DATE_UPDATED_UTC, TEAMMEMBERS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APITeam {\n");
    
    sb.append("    TEAM_ID: ").append(toIndentedString(TEAM_ID)).append("\n");
    sb.append("    TEAM_NAME: ").append(toIndentedString(TEAM_NAME)).append("\n");
    sb.append("    ANONYMOUS_TEAM: ").append(toIndentedString(ANONYMOUS_TEAM)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    TEAMMEMBERS: ").append(toIndentedString(TEAMMEMBERS)).append("\n");
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

