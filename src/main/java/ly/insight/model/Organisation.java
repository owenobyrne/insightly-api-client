package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ly.insight.model.APIAddress;
import ly.insight.model.APIContactInfo;
import ly.insight.model.APICustomField;
import ly.insight.model.APILink;
import ly.insight.model.APIOrganisationDate;
import ly.insight.model.APIOrganisationLink;
import ly.insight.model.APITag;
import java.io.Serializable;

/**
 * APIOrganisation
 */
@ApiModel(description = "APIOrganisation")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class Organisation implements Serializable {
  @SerializedName("VISIBLE_USER_IDS")
  private String VISIBLE_USER_IDS = null;

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("SOCIAL_TWITTER")
  private String SOCIAL_TWITTER = null;

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  @SerializedName("LINKS")
  private List<APILink> LINKS = new ArrayList<APILink>();

  @SerializedName("ORGANISATION_ID")
  private Long ORGANISATION_ID = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("SOCIAL_FACEBOOK")
  private String SOCIAL_FACEBOOK = null;

  @SerializedName("BACKGROUND")
  private String BACKGROUND = null;

  @SerializedName("CUSTOMFIELDS")
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();

  @SerializedName("ORGANISATION_NAME")
  private String ORGANISATION_NAME = null;

  @SerializedName("VISIBLE_TEAM_ID")
  private Long VISIBLE_TEAM_ID = null;

  @SerializedName("VISIBLE_TO")
  private String VISIBLE_TO = null;

  @SerializedName("ORGANISATIONLINKS")
  private List<APIOrganisationLink> ORGANISATIONLINKS = new ArrayList<APIOrganisationLink>();

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("CONTACTINFOS")
  private List<APIContactInfo> CONTACTINFOS = new ArrayList<APIContactInfo>();

  @SerializedName("SOCIAL_LINKEDIN")
  private String SOCIAL_LINKEDIN = null;

  @SerializedName("DATES")
  private List<APIOrganisationDate> DATES = new ArrayList<APIOrganisationDate>();

  @SerializedName("ADDRESSES")
  private List<APIAddress> ADDRESSES = new ArrayList<APIAddress>();

  @SerializedName("TAGS")
  private List<APITag> TAGS = new ArrayList<APITag>();

  @SerializedName("IMAGE_URL")
  private String IMAGE_URL = null;

  public Organisation VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
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

  public Organisation CAN_EDIT(Boolean CAN_EDIT) {
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

  public Organisation SOCIAL_TWITTER(String SOCIAL_TWITTER) {
    this.SOCIAL_TWITTER = SOCIAL_TWITTER;
    return this;
  }

   /**
   * Twitter Profile URL. Pass an empty string to clear the value.
   * @return SOCIAL_TWITTER
  **/
  @ApiModelProperty(example = "null", value = "Twitter Profile URL. Pass an empty string to clear the value.")
  public String getSOCIALTWITTER() {
    return SOCIAL_TWITTER;
  }

  public void setSOCIALTWITTER(String SOCIAL_TWITTER) {
    this.SOCIAL_TWITTER = SOCIAL_TWITTER;
  }

  public Organisation DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and time Organisation record updated, as Coordinated Universal Time
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Organisation record updated, as Coordinated Universal Time")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public Organisation CAN_DELETE(Boolean CAN_DELETE) {
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

  public Organisation LINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
    return this;
  }

  public Organisation addLINKSItem(APILink LINKSItem) {
    this.LINKS.add(LINKSItem);
    return this;
  }

   /**
   * Set of Links attached to the Organisation
   * @return LINKS
  **/
  @ApiModelProperty(example = "null", value = "Set of Links attached to the Organisation")
  public List<APILink> getLINKS() {
    return LINKS;
  }

  public void setLINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
  }

  public Organisation ORGANISATION_ID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
    return this;
  }

   /**
   * Unique ID for the Organisation record
   * @return ORGANISATION_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Organisation record")
  public Long getORGANISATIONID() {
    return ORGANISATION_ID;
  }

  public void setORGANISATIONID(Long ORGANISATION_ID) {
    this.ORGANISATION_ID = ORGANISATION_ID;
  }

  public Organisation OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * User ID of the Organisation record owner. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "User ID of the Organisation record owner. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public Organisation SOCIAL_FACEBOOK(String SOCIAL_FACEBOOK) {
    this.SOCIAL_FACEBOOK = SOCIAL_FACEBOOK;
    return this;
  }

   /**
   * Facebook Profile URL. Pass an empty string to clear the value.
   * @return SOCIAL_FACEBOOK
  **/
  @ApiModelProperty(example = "null", value = "Facebook Profile URL. Pass an empty string to clear the value.")
  public String getSOCIALFACEBOOK() {
    return SOCIAL_FACEBOOK;
  }

  public void setSOCIALFACEBOOK(String SOCIAL_FACEBOOK) {
    this.SOCIAL_FACEBOOK = SOCIAL_FACEBOOK;
  }

  public Organisation BACKGROUND(String BACKGROUND) {
    this.BACKGROUND = BACKGROUND;
    return this;
  }

   /**
   * Additional background information
   * @return BACKGROUND
  **/
  @ApiModelProperty(example = "null", value = "Additional background information")
  public String getBACKGROUND() {
    return BACKGROUND;
  }

  public void setBACKGROUND(String BACKGROUND) {
    this.BACKGROUND = BACKGROUND;
  }

  public Organisation CUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
    return this;
  }

  public Organisation addCUSTOMFIELDSItem(APICustomField CUSTOMFIELDSItem) {
    this.CUSTOMFIELDS.add(CUSTOMFIELDSItem);
    return this;
  }

   /**
   * Set of Custom Fields atttached to the Organisation
   * @return CUSTOMFIELDS
  **/
  @ApiModelProperty(example = "null", value = "Set of Custom Fields atttached to the Organisation")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }

  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  public Organisation ORGANISATION_NAME(String ORGANISATION_NAME) {
    this.ORGANISATION_NAME = ORGANISATION_NAME;
    return this;
  }

   /**
   * Name of the Organisation (required)
   * @return ORGANISATION_NAME
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name of the Organisation (required)")
  public String getORGANISATIONNAME() {
    return ORGANISATION_NAME;
  }

  public void setORGANISATIONNAME(String ORGANISATION_NAME) {
    this.ORGANISATION_NAME = ORGANISATION_NAME;
  }

  public Organisation VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
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

  public Organisation VISIBLE_TO(String VISIBLE_TO) {
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

  public Organisation ORGANISATIONLINKS(List<APIOrganisationLink> ORGANISATIONLINKS) {
    this.ORGANISATIONLINKS = ORGANISATIONLINKS;
    return this;
  }

  public Organisation addORGANISATIONLINKSItem(APIOrganisationLink ORGANISATIONLINKSItem) {
    this.ORGANISATIONLINKS.add(ORGANISATIONLINKSItem);
    return this;
  }

   /**
   * Set of Links to other Organisations attached to the Organisation
   * @return ORGANISATIONLINKS
  **/
  @ApiModelProperty(example = "null", value = "Set of Links to other Organisations attached to the Organisation")
  public List<APIOrganisationLink> getORGANISATIONLINKS() {
    return ORGANISATIONLINKS;
  }

  public void setORGANISATIONLINKS(List<APIOrganisationLink> ORGANISATIONLINKS) {
    this.ORGANISATIONLINKS = ORGANISATIONLINKS;
  }

  public Organisation DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time Organisation record created, as Coordinated Universal Time
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Organisation record created, as Coordinated Universal Time")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public Organisation CONTACTINFOS(List<APIContactInfo> CONTACTINFOS) {
    this.CONTACTINFOS = CONTACTINFOS;
    return this;
  }

  public Organisation addCONTACTINFOSItem(APIContactInfo CONTACTINFOSItem) {
    this.CONTACTINFOS.add(CONTACTINFOSItem);
    return this;
  }

   /**
   * Set of Contact Infos attached to the Organisation
   * @return CONTACTINFOS
  **/
  @ApiModelProperty(example = "null", value = "Set of Contact Infos attached to the Organisation")
  public List<APIContactInfo> getCONTACTINFOS() {
    return CONTACTINFOS;
  }

  public void setCONTACTINFOS(List<APIContactInfo> CONTACTINFOS) {
    this.CONTACTINFOS = CONTACTINFOS;
  }

  public Organisation SOCIAL_LINKEDIN(String SOCIAL_LINKEDIN) {
    this.SOCIAL_LINKEDIN = SOCIAL_LINKEDIN;
    return this;
  }

   /**
   * LinkedIn Profile URL. Pass an empty string to clear the value.
   * @return SOCIAL_LINKEDIN
  **/
  @ApiModelProperty(example = "null", value = "LinkedIn Profile URL. Pass an empty string to clear the value.")
  public String getSOCIALLINKEDIN() {
    return SOCIAL_LINKEDIN;
  }

  public void setSOCIALLINKEDIN(String SOCIAL_LINKEDIN) {
    this.SOCIAL_LINKEDIN = SOCIAL_LINKEDIN;
  }

  public Organisation DATES(List<APIOrganisationDate> DATES) {
    this.DATES = DATES;
    return this;
  }

  public Organisation addDATESItem(APIOrganisationDate DATESItem) {
    this.DATES.add(DATESItem);
    return this;
  }

   /**
   * Set of Dates to Remember attached to the Organisation
   * @return DATES
  **/
  @ApiModelProperty(example = "null", value = "Set of Dates to Remember attached to the Organisation")
  public List<APIOrganisationDate> getDATES() {
    return DATES;
  }

  public void setDATES(List<APIOrganisationDate> DATES) {
    this.DATES = DATES;
  }

  public Organisation ADDRESSES(List<APIAddress> ADDRESSES) {
    this.ADDRESSES = ADDRESSES;
    return this;
  }

  public Organisation addADDRESSESItem(APIAddress ADDRESSESItem) {
    this.ADDRESSES.add(ADDRESSESItem);
    return this;
  }

   /**
   * Set of Addresses attached to the Organisation
   * @return ADDRESSES
  **/
  @ApiModelProperty(example = "null", value = "Set of Addresses attached to the Organisation")
  public List<APIAddress> getADDRESSES() {
    return ADDRESSES;
  }

  public void setADDRESSES(List<APIAddress> ADDRESSES) {
    this.ADDRESSES = ADDRESSES;
  }

  public Organisation TAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
    return this;
  }

  public Organisation addTAGSItem(APITag TAGSItem) {
    this.TAGS.add(TAGSItem);
    return this;
  }

   /**
   * Set of Tags attached to the Organisation
   * @return TAGS
  **/
  @ApiModelProperty(example = "null", value = "Set of Tags attached to the Organisation")
  public List<APITag> getTAGS() {
    return TAGS;
  }

  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  public Organisation IMAGE_URL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
    return this;
  }

   /**
   * URL of the Image for the Organisation
   * @return IMAGE_URL
  **/
  @ApiModelProperty(example = "null", value = "URL of the Image for the Organisation")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }

  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organisation organisation = (Organisation) o;
    return Objects.equals(this.VISIBLE_USER_IDS, organisation.VISIBLE_USER_IDS) &&
        Objects.equals(this.CAN_EDIT, organisation.CAN_EDIT) &&
        Objects.equals(this.SOCIAL_TWITTER, organisation.SOCIAL_TWITTER) &&
        Objects.equals(this.DATE_UPDATED_UTC, organisation.DATE_UPDATED_UTC) &&
        Objects.equals(this.CAN_DELETE, organisation.CAN_DELETE) &&
        Objects.equals(this.LINKS, organisation.LINKS) &&
        Objects.equals(this.ORGANISATION_ID, organisation.ORGANISATION_ID) &&
        Objects.equals(this.OWNER_USER_ID, organisation.OWNER_USER_ID) &&
        Objects.equals(this.SOCIAL_FACEBOOK, organisation.SOCIAL_FACEBOOK) &&
        Objects.equals(this.BACKGROUND, organisation.BACKGROUND) &&
        Objects.equals(this.CUSTOMFIELDS, organisation.CUSTOMFIELDS) &&
        Objects.equals(this.ORGANISATION_NAME, organisation.ORGANISATION_NAME) &&
        Objects.equals(this.VISIBLE_TEAM_ID, organisation.VISIBLE_TEAM_ID) &&
        Objects.equals(this.VISIBLE_TO, organisation.VISIBLE_TO) &&
        Objects.equals(this.ORGANISATIONLINKS, organisation.ORGANISATIONLINKS) &&
        Objects.equals(this.DATE_CREATED_UTC, organisation.DATE_CREATED_UTC) &&
        Objects.equals(this.CONTACTINFOS, organisation.CONTACTINFOS) &&
        Objects.equals(this.SOCIAL_LINKEDIN, organisation.SOCIAL_LINKEDIN) &&
        Objects.equals(this.DATES, organisation.DATES) &&
        Objects.equals(this.ADDRESSES, organisation.ADDRESSES) &&
        Objects.equals(this.TAGS, organisation.TAGS) &&
        Objects.equals(this.IMAGE_URL, organisation.IMAGE_URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(VISIBLE_USER_IDS, CAN_EDIT, SOCIAL_TWITTER, DATE_UPDATED_UTC, CAN_DELETE, LINKS, ORGANISATION_ID, OWNER_USER_ID, SOCIAL_FACEBOOK, BACKGROUND, CUSTOMFIELDS, ORGANISATION_NAME, VISIBLE_TEAM_ID, VISIBLE_TO, ORGANISATIONLINKS, DATE_CREATED_UTC, CONTACTINFOS, SOCIAL_LINKEDIN, DATES, ADDRESSES, TAGS, IMAGE_URL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisation {\n");
    
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CAN_EDIT: ").append(toIndentedString(CAN_EDIT)).append("\n");
    sb.append("    SOCIAL_TWITTER: ").append(toIndentedString(SOCIAL_TWITTER)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    CAN_DELETE: ").append(toIndentedString(CAN_DELETE)).append("\n");
    sb.append("    LINKS: ").append(toIndentedString(LINKS)).append("\n");
    sb.append("    ORGANISATION_ID: ").append(toIndentedString(ORGANISATION_ID)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    SOCIAL_FACEBOOK: ").append(toIndentedString(SOCIAL_FACEBOOK)).append("\n");
    sb.append("    BACKGROUND: ").append(toIndentedString(BACKGROUND)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    ORGANISATION_NAME: ").append(toIndentedString(ORGANISATION_NAME)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    ORGANISATIONLINKS: ").append(toIndentedString(ORGANISATIONLINKS)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    CONTACTINFOS: ").append(toIndentedString(CONTACTINFOS)).append("\n");
    sb.append("    SOCIAL_LINKEDIN: ").append(toIndentedString(SOCIAL_LINKEDIN)).append("\n");
    sb.append("    DATES: ").append(toIndentedString(DATES)).append("\n");
    sb.append("    ADDRESSES: ").append(toIndentedString(ADDRESSES)).append("\n");
    sb.append("    TAGS: ").append(toIndentedString(TAGS)).append("\n");
    sb.append("    IMAGE_URL: ").append(toIndentedString(IMAGE_URL)).append("\n");
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

