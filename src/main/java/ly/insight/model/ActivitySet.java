package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import ly.insight.model.APIActivity;
import java.io.Serializable;

/**
 * APIActivitySet
 */
@ApiModel(description = "APIActivitySet")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class ActivitySet implements Serializable {
  @SerializedName("FOR_PROJECTS")
  private Boolean FOR_PROJECTS = null;

  @SerializedName("FOR_ORGANISATIONS")
  private Boolean FOR_ORGANISATIONS = null;

  @SerializedName("ACTIVITYSET_ID")
  private Long ACTIVITYSET_ID = null;

  @SerializedName("ACTIVITIES")
  private List<APIActivity> ACTIVITIES = new ArrayList<APIActivity>();

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("FOR_CONTACTS")
  private Boolean FOR_CONTACTS = null;

  @SerializedName("FOR_LEADS")
  private Boolean FOR_LEADS = null;

  @SerializedName("FOR_OPPORTUNITIES")
  private Boolean FOR_OPPORTUNITIES = null;

  @SerializedName("NAME")
  private String NAME = null;

  public ActivitySet FOR_PROJECTS(Boolean FOR_PROJECTS) {
    this.FOR_PROJECTS = FOR_PROJECTS;
    return this;
  }

   /**
   * Whether or not the Activity Set is assignable to Projects.
   * @return FOR_PROJECTS
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the Activity Set is assignable to Projects.")
  public Boolean getFORPROJECTS() {
    return FOR_PROJECTS;
  }

  public void setFORPROJECTS(Boolean FOR_PROJECTS) {
    this.FOR_PROJECTS = FOR_PROJECTS;
  }

  public ActivitySet FOR_ORGANISATIONS(Boolean FOR_ORGANISATIONS) {
    this.FOR_ORGANISATIONS = FOR_ORGANISATIONS;
    return this;
  }

   /**
   * Whether or not the Activity Set is assignable to Organisations.
   * @return FOR_ORGANISATIONS
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the Activity Set is assignable to Organisations.")
  public Boolean getFORORGANISATIONS() {
    return FOR_ORGANISATIONS;
  }

  public void setFORORGANISATIONS(Boolean FOR_ORGANISATIONS) {
    this.FOR_ORGANISATIONS = FOR_ORGANISATIONS;
  }

  public ActivitySet ACTIVITYSET_ID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
    return this;
  }

   /**
   * Unique ID for the Activity Set record.
   * @return ACTIVITYSET_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Activity Set record.")
  public Long getACTIVITYSETID() {
    return ACTIVITYSET_ID;
  }

  public void setACTIVITYSETID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
  }

  public ActivitySet ACTIVITIES(List<APIActivity> ACTIVITIES) {
    this.ACTIVITIES = ACTIVITIES;
    return this;
  }

  public ActivitySet addACTIVITIESItem(APIActivity ACTIVITIESItem) {
    this.ACTIVITIES.add(ACTIVITIESItem);
    return this;
  }

   /**
   * The list of Activities that belong to the Activity Set.
   * @return ACTIVITIES
  **/
  @ApiModelProperty(example = "null", value = "The list of Activities that belong to the Activity Set.")
  public List<APIActivity> getACTIVITIES() {
    return ACTIVITIES;
  }

  public void setACTIVITIES(List<APIActivity> ACTIVITIES) {
    this.ACTIVITIES = ACTIVITIES;
  }

  public ActivitySet OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * The unique ID for the Owner of the Activity.  This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for the Owner of the Activity.  This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public ActivitySet FOR_CONTACTS(Boolean FOR_CONTACTS) {
    this.FOR_CONTACTS = FOR_CONTACTS;
    return this;
  }

   /**
   * Whether or not the Activity Set is assignable to Contacts.
   * @return FOR_CONTACTS
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the Activity Set is assignable to Contacts.")
  public Boolean getFORCONTACTS() {
    return FOR_CONTACTS;
  }

  public void setFORCONTACTS(Boolean FOR_CONTACTS) {
    this.FOR_CONTACTS = FOR_CONTACTS;
  }

  public ActivitySet FOR_LEADS(Boolean FOR_LEADS) {
    this.FOR_LEADS = FOR_LEADS;
    return this;
  }

   /**
   * Whether or not the Activity Set is assignable to Leads.
   * @return FOR_LEADS
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the Activity Set is assignable to Leads.")
  public Boolean getFORLEADS() {
    return FOR_LEADS;
  }

  public void setFORLEADS(Boolean FOR_LEADS) {
    this.FOR_LEADS = FOR_LEADS;
  }

  public ActivitySet FOR_OPPORTUNITIES(Boolean FOR_OPPORTUNITIES) {
    this.FOR_OPPORTUNITIES = FOR_OPPORTUNITIES;
    return this;
  }

   /**
   * Whether or not the Activity Set is assignable to Opportunities.
   * @return FOR_OPPORTUNITIES
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the Activity Set is assignable to Opportunities.")
  public Boolean getFOROPPORTUNITIES() {
    return FOR_OPPORTUNITIES;
  }

  public void setFOROPPORTUNITIES(Boolean FOR_OPPORTUNITIES) {
    this.FOR_OPPORTUNITIES = FOR_OPPORTUNITIES;
  }

  public ActivitySet NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }

   /**
   * The name for the Activity Set.
   * @return NAME
  **/
  @ApiModelProperty(example = "null", value = "The name for the Activity Set.")
  public String getNAME() {
    return NAME;
  }

  public void setNAME(String NAME) {
    this.NAME = NAME;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivitySet activitySet = (ActivitySet) o;
    return Objects.equals(this.FOR_PROJECTS, activitySet.FOR_PROJECTS) &&
        Objects.equals(this.FOR_ORGANISATIONS, activitySet.FOR_ORGANISATIONS) &&
        Objects.equals(this.ACTIVITYSET_ID, activitySet.ACTIVITYSET_ID) &&
        Objects.equals(this.ACTIVITIES, activitySet.ACTIVITIES) &&
        Objects.equals(this.OWNER_USER_ID, activitySet.OWNER_USER_ID) &&
        Objects.equals(this.FOR_CONTACTS, activitySet.FOR_CONTACTS) &&
        Objects.equals(this.FOR_LEADS, activitySet.FOR_LEADS) &&
        Objects.equals(this.FOR_OPPORTUNITIES, activitySet.FOR_OPPORTUNITIES) &&
        Objects.equals(this.NAME, activitySet.NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FOR_PROJECTS, FOR_ORGANISATIONS, ACTIVITYSET_ID, ACTIVITIES, OWNER_USER_ID, FOR_CONTACTS, FOR_LEADS, FOR_OPPORTUNITIES, NAME);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivitySet {\n");
    
    sb.append("    FOR_PROJECTS: ").append(toIndentedString(FOR_PROJECTS)).append("\n");
    sb.append("    FOR_ORGANISATIONS: ").append(toIndentedString(FOR_ORGANISATIONS)).append("\n");
    sb.append("    ACTIVITYSET_ID: ").append(toIndentedString(ACTIVITYSET_ID)).append("\n");
    sb.append("    ACTIVITIES: ").append(toIndentedString(ACTIVITIES)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    FOR_CONTACTS: ").append(toIndentedString(FOR_CONTACTS)).append("\n");
    sb.append("    FOR_LEADS: ").append(toIndentedString(FOR_LEADS)).append("\n");
    sb.append("    FOR_OPPORTUNITIES: ").append(toIndentedString(FOR_OPPORTUNITIES)).append("\n");
    sb.append("    NAME: ").append(toIndentedString(NAME)).append("\n");
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

