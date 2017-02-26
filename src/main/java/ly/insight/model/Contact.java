package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ly.insight.model.APIAddress;
import ly.insight.model.APIContactDate;
import ly.insight.model.APIContactInfo;
import ly.insight.model.APIContactLink;
import ly.insight.model.APICustomField;
import ly.insight.model.APILink;
import ly.insight.model.APITag;
import java.io.Serializable;

/**
 * APIContact
 */
@ApiModel(description = "APIContact")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class Contact implements Serializable {
  @SerializedName("SOCIAL_TWITTER")
  private String SOCIAL_TWITTER = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  @SerializedName("LINKS")
  private List<APILink> LINKS = new ArrayList<APILink>();

  @SerializedName("DEFAULT_LINKED_ORGANISATION")
  private Long DEFAULT_LINKED_ORGANISATION = null;

  @SerializedName("SOCIAL_FACEBOOK")
  private String SOCIAL_FACEBOOK = null;

  @SerializedName("LAST_NAME")
  private String LAST_NAME = null;

  @SerializedName("FIRST_NAME")
  private String FIRST_NAME = null;

  @SerializedName("VISIBLE_TEAM_ID")
  private Long VISIBLE_TEAM_ID = null;

  @SerializedName("VISIBLE_TO")
  private String VISIBLE_TO = null;

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("SALUTATION")
  private String SALUTATION = null;

  @SerializedName("IMAGE_URL")
  private String IMAGE_URL = null;

  @SerializedName("VISIBLE_USER_IDS")
  private String VISIBLE_USER_IDS = null;

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("CONTACTLINKS")
  private List<APIContactLink> CONTACTLINKS = new ArrayList<APIContactLink>();

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("BACKGROUND")
  private String BACKGROUND = null;

  @SerializedName("CUSTOMFIELDS")
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();

  @SerializedName("CONTACTINFOS")
  private List<APIContactInfo> CONTACTINFOS = new ArrayList<APIContactInfo>();

  @SerializedName("SOCIAL_LINKEDIN")
  private String SOCIAL_LINKEDIN = null;

  @SerializedName("DATES")
  private List<APIContactDate> DATES = new ArrayList<APIContactDate>();

  @SerializedName("CONTACT_ID")
  private Long CONTACT_ID = null;

  @SerializedName("ADDRESSES")
  private List<APIAddress> ADDRESSES = new ArrayList<APIAddress>();

  @SerializedName("TAGS")
  private List<APITag> TAGS = new ArrayList<APITag>();

  public Contact SOCIAL_TWITTER(String SOCIAL_TWITTER) {
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

  public Contact CAN_DELETE(Boolean CAN_DELETE) {
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

  public Contact LINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
    return this;
  }

  public Contact addLINKSItem(APILink LINKSItem) {
    this.LINKS.add(LINKSItem);
    return this;
  }

   /**
   * Set of links attached to the Contact
   * @return LINKS
  **/
  @ApiModelProperty(example = "null", value = "Set of links attached to the Contact")
  public List<APILink> getLINKS() {
    return LINKS;
  }

  public void setLINKS(List<APILink> LINKS) {
    this.LINKS = LINKS;
  }

  public Contact DEFAULT_LINKED_ORGANISATION(Long DEFAULT_LINKED_ORGANISATION) {
    this.DEFAULT_LINKED_ORGANISATION = DEFAULT_LINKED_ORGANISATION;
    return this;
  }

   /**
   * Select an organization defined in the Links field to be marked as default.              If empty, or is not included in Links, or is not a valid ORGANISATION_ID, the first organization link will be set as default.
   * @return DEFAULT_LINKED_ORGANISATION
  **/
  @ApiModelProperty(example = "null", value = "Select an organization defined in the Links field to be marked as default.              If empty, or is not included in Links, or is not a valid ORGANISATION_ID, the first organization link will be set as default.")
  public Long getDEFAULTLINKEDORGANISATION() {
    return DEFAULT_LINKED_ORGANISATION;
  }

  public void setDEFAULTLINKEDORGANISATION(Long DEFAULT_LINKED_ORGANISATION) {
    this.DEFAULT_LINKED_ORGANISATION = DEFAULT_LINKED_ORGANISATION;
  }

  public Contact SOCIAL_FACEBOOK(String SOCIAL_FACEBOOK) {
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

  public Contact LAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
    return this;
  }

   /**
   * Last/Family/Surname of the Contact
   * @return LAST_NAME
  **/
  @ApiModelProperty(example = "null", value = "Last/Family/Surname of the Contact")
  public String getLASTNAME() {
    return LAST_NAME;
  }

  public void setLASTNAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }

  public Contact FIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
    return this;
  }

   /**
   * First/Given Name
   * @return FIRST_NAME
  **/
  @ApiModelProperty(example = "null", value = "First/Given Name")
  public String getFIRSTNAME() {
    return FIRST_NAME;
  }

  public void setFIRSTNAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }

  public Contact VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
    return this;
  }

   /**
   * If VISIBLE_TO is 'Team', then this should be a TEAM_ID
   * @return VISIBLE_TEAM_ID
  **/
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Team', then this should be a TEAM_ID")
  public Long getVISIBLETEAMID() {
    return VISIBLE_TEAM_ID;
  }

  public void setVISIBLETEAMID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
  }

  public Contact VISIBLE_TO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
    return this;
  }

   /**
   * Visible To
   * @return VISIBLE_TO
  **/
  @ApiModelProperty(example = "null", value = "Visible To")
  public String getVISIBLETO() {
    return VISIBLE_TO;
  }

  public void setVISIBLETO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
  }

  public Contact DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time Contact record created, as Coordinated Universal Time
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Contact record created, as Coordinated Universal Time")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public Contact SALUTATION(String SALUTATION) {
    this.SALUTATION = SALUTATION;
    return this;
  }

   /**
   * Salutation
   * @return SALUTATION
  **/
  @ApiModelProperty(example = "null", value = "Salutation")
  public String getSALUTATION() {
    return SALUTATION;
  }

  public void setSALUTATION(String SALUTATION) {
    this.SALUTATION = SALUTATION;
  }

  public Contact IMAGE_URL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
    return this;
  }

   /**
   * URL of the Image for the Contact.
   * @return IMAGE_URL
  **/
  @ApiModelProperty(example = "null", value = "URL of the Image for the Contact.")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }

  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }

  public Contact VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
    return this;
  }

   /**
   * If VISIBLE_TO is 'Individuals, this should be a comma separated list of user IDs
   * @return VISIBLE_USER_IDS
  **/
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Individuals, this should be a comma separated list of user IDs")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }

  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  public Contact CAN_EDIT(Boolean CAN_EDIT) {
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

  public Contact CONTACTLINKS(List<APIContactLink> CONTACTLINKS) {
    this.CONTACTLINKS = CONTACTLINKS;
    return this;
  }

  public Contact addCONTACTLINKSItem(APIContactLink CONTACTLINKSItem) {
    this.CONTACTLINKS.add(CONTACTLINKSItem);
    return this;
  }

   /**
   * Set of links to other contacts attached to the Contact
   * @return CONTACTLINKS
  **/
  @ApiModelProperty(example = "null", value = "Set of links to other contacts attached to the Contact")
  public List<APIContactLink> getCONTACTLINKS() {
    return CONTACTLINKS;
  }

  public void setCONTACTLINKS(List<APIContactLink> CONTACTLINKS) {
    this.CONTACTLINKS = CONTACTLINKS;
  }

  public Contact DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and time Contact record updated, as Coordinated Universal Time
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Contact record updated, as Coordinated Universal Time")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public Contact OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * User ID of the Contact owner. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "User ID of the Contact owner. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public Contact BACKGROUND(String BACKGROUND) {
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

  public Contact CUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
    return this;
  }

  public Contact addCUSTOMFIELDSItem(APICustomField CUSTOMFIELDSItem) {
    this.CUSTOMFIELDS.add(CUSTOMFIELDSItem);
    return this;
  }

   /**
   * Set of custom fields attached to the Contact
   * @return CUSTOMFIELDS
  **/
  @ApiModelProperty(example = "null", value = "Set of custom fields attached to the Contact")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }

  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  public Contact CONTACTINFOS(List<APIContactInfo> CONTACTINFOS) {
    this.CONTACTINFOS = CONTACTINFOS;
    return this;
  }

  public Contact addCONTACTINFOSItem(APIContactInfo CONTACTINFOSItem) {
    this.CONTACTINFOS.add(CONTACTINFOSItem);
    return this;
  }

   /**
   * Set of contact infos attached to the Contact
   * @return CONTACTINFOS
  **/
  @ApiModelProperty(example = "null", value = "Set of contact infos attached to the Contact")
  public List<APIContactInfo> getCONTACTINFOS() {
    return CONTACTINFOS;
  }

  public void setCONTACTINFOS(List<APIContactInfo> CONTACTINFOS) {
    this.CONTACTINFOS = CONTACTINFOS;
  }

  public Contact SOCIAL_LINKEDIN(String SOCIAL_LINKEDIN) {
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

  public Contact DATES(List<APIContactDate> DATES) {
    this.DATES = DATES;
    return this;
  }

  public Contact addDATESItem(APIContactDate DATESItem) {
    this.DATES.add(DATESItem);
    return this;
  }

   /**
   * Set of dates to remember attached to the Contact
   * @return DATES
  **/
  @ApiModelProperty(example = "null", value = "Set of dates to remember attached to the Contact")
  public List<APIContactDate> getDATES() {
    return DATES;
  }

  public void setDATES(List<APIContactDate> DATES) {
    this.DATES = DATES;
  }

  public Contact CONTACT_ID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }

   /**
   * Unique ID for the Contact record
   * @return CONTACT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Contact record")
  public Long getCONTACTID() {
    return CONTACT_ID;
  }

  public void setCONTACTID(Long CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }

  public Contact ADDRESSES(List<APIAddress> ADDRESSES) {
    this.ADDRESSES = ADDRESSES;
    return this;
  }

  public Contact addADDRESSESItem(APIAddress ADDRESSESItem) {
    this.ADDRESSES.add(ADDRESSESItem);
    return this;
  }

   /**
   * Set of addresses attached to the Contact
   * @return ADDRESSES
  **/
  @ApiModelProperty(example = "null", value = "Set of addresses attached to the Contact")
  public List<APIAddress> getADDRESSES() {
    return ADDRESSES;
  }

  public void setADDRESSES(List<APIAddress> ADDRESSES) {
    this.ADDRESSES = ADDRESSES;
  }

  public Contact TAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
    return this;
  }

  public Contact addTAGSItem(APITag TAGSItem) {
    this.TAGS.add(TAGSItem);
    return this;
  }

   /**
   * Set of tags attached to the Contact
   * @return TAGS
  **/
  @ApiModelProperty(example = "null", value = "Set of tags attached to the Contact")
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
    Contact contact = (Contact) o;
    return Objects.equals(this.SOCIAL_TWITTER, contact.SOCIAL_TWITTER) &&
        Objects.equals(this.CAN_DELETE, contact.CAN_DELETE) &&
        Objects.equals(this.LINKS, contact.LINKS) &&
        Objects.equals(this.DEFAULT_LINKED_ORGANISATION, contact.DEFAULT_LINKED_ORGANISATION) &&
        Objects.equals(this.SOCIAL_FACEBOOK, contact.SOCIAL_FACEBOOK) &&
        Objects.equals(this.LAST_NAME, contact.LAST_NAME) &&
        Objects.equals(this.FIRST_NAME, contact.FIRST_NAME) &&
        Objects.equals(this.VISIBLE_TEAM_ID, contact.VISIBLE_TEAM_ID) &&
        Objects.equals(this.VISIBLE_TO, contact.VISIBLE_TO) &&
        Objects.equals(this.DATE_CREATED_UTC, contact.DATE_CREATED_UTC) &&
        Objects.equals(this.SALUTATION, contact.SALUTATION) &&
        Objects.equals(this.IMAGE_URL, contact.IMAGE_URL) &&
        Objects.equals(this.VISIBLE_USER_IDS, contact.VISIBLE_USER_IDS) &&
        Objects.equals(this.CAN_EDIT, contact.CAN_EDIT) &&
        Objects.equals(this.CONTACTLINKS, contact.CONTACTLINKS) &&
        Objects.equals(this.DATE_UPDATED_UTC, contact.DATE_UPDATED_UTC) &&
        Objects.equals(this.OWNER_USER_ID, contact.OWNER_USER_ID) &&
        Objects.equals(this.BACKGROUND, contact.BACKGROUND) &&
        Objects.equals(this.CUSTOMFIELDS, contact.CUSTOMFIELDS) &&
        Objects.equals(this.CONTACTINFOS, contact.CONTACTINFOS) &&
        Objects.equals(this.SOCIAL_LINKEDIN, contact.SOCIAL_LINKEDIN) &&
        Objects.equals(this.DATES, contact.DATES) &&
        Objects.equals(this.CONTACT_ID, contact.CONTACT_ID) &&
        Objects.equals(this.ADDRESSES, contact.ADDRESSES) &&
        Objects.equals(this.TAGS, contact.TAGS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(SOCIAL_TWITTER, CAN_DELETE, LINKS, DEFAULT_LINKED_ORGANISATION, SOCIAL_FACEBOOK, LAST_NAME, FIRST_NAME, VISIBLE_TEAM_ID, VISIBLE_TO, DATE_CREATED_UTC, SALUTATION, IMAGE_URL, VISIBLE_USER_IDS, CAN_EDIT, CONTACTLINKS, DATE_UPDATED_UTC, OWNER_USER_ID, BACKGROUND, CUSTOMFIELDS, CONTACTINFOS, SOCIAL_LINKEDIN, DATES, CONTACT_ID, ADDRESSES, TAGS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    SOCIAL_TWITTER: ").append(toIndentedString(SOCIAL_TWITTER)).append("\n");
    sb.append("    CAN_DELETE: ").append(toIndentedString(CAN_DELETE)).append("\n");
    sb.append("    LINKS: ").append(toIndentedString(LINKS)).append("\n");
    sb.append("    DEFAULT_LINKED_ORGANISATION: ").append(toIndentedString(DEFAULT_LINKED_ORGANISATION)).append("\n");
    sb.append("    SOCIAL_FACEBOOK: ").append(toIndentedString(SOCIAL_FACEBOOK)).append("\n");
    sb.append("    LAST_NAME: ").append(toIndentedString(LAST_NAME)).append("\n");
    sb.append("    FIRST_NAME: ").append(toIndentedString(FIRST_NAME)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    SALUTATION: ").append(toIndentedString(SALUTATION)).append("\n");
    sb.append("    IMAGE_URL: ").append(toIndentedString(IMAGE_URL)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CAN_EDIT: ").append(toIndentedString(CAN_EDIT)).append("\n");
    sb.append("    CONTACTLINKS: ").append(toIndentedString(CONTACTLINKS)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    BACKGROUND: ").append(toIndentedString(BACKGROUND)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    CONTACTINFOS: ").append(toIndentedString(CONTACTINFOS)).append("\n");
    sb.append("    SOCIAL_LINKEDIN: ").append(toIndentedString(SOCIAL_LINKEDIN)).append("\n");
    sb.append("    DATES: ").append(toIndentedString(DATES)).append("\n");
    sb.append("    CONTACT_ID: ").append(toIndentedString(CONTACT_ID)).append("\n");
    sb.append("    ADDRESSES: ").append(toIndentedString(ADDRESSES)).append("\n");
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

