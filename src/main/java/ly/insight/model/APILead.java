package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ly.insight.model.APICustomField;
import ly.insight.model.APITag;
import java.io.Serializable;

/**
 * APILead
 */
@ApiModel(description = "APILead")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APILead implements Serializable {
  @SerializedName("LEAD_ID")
  private Long LEAD_ID = null;

  @SerializedName("SALUTATION")
  private String SALUTATION = null;

  @SerializedName("TITLE")
  private String TITLE = null;

  @SerializedName("FIRST_NAME")
  private String FIRST_NAME = null;

  @SerializedName("LAST_NAME")
  private String LAST_NAME = null;

  @SerializedName("ORGANIZATION_NAME")
  private String ORGANIZATION_NAME = null;

  @SerializedName("PHONE_NUMBER")
  private String PHONE_NUMBER = null;

  @SerializedName("MOBILE_PHONE_NUMBER")
  private String MOBILE_PHONE_NUMBER = null;

  @SerializedName("FAX_NUMBER")
  private String FAX_NUMBER = null;

  @SerializedName("EMAIL_ADDRESS")
  private String EMAIL_ADDRESS = null;

  @SerializedName("WEBSITE_URL")
  private String WEBSITE_URL = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("DATE_CREATED_UTC")
  private Date DATE_CREATED_UTC = null;

  @SerializedName("DATE_UPDATED_UTC")
  private Date DATE_UPDATED_UTC = null;

  @SerializedName("CONVERTED")
  private Boolean CONVERTED = null;

  @SerializedName("CONVERTED_DATE_UTC")
  private Date CONVERTED_DATE_UTC = null;

  @SerializedName("CONVERTED_CONTACT_ID")
  private Long CONVERTED_CONTACT_ID = null;

  @SerializedName("CONVERTED_ORGANIZATION_ID")
  private Long CONVERTED_ORGANIZATION_ID = null;

  @SerializedName("CONVERTED_OPPORTUNITY_ID")
  private Long CONVERTED_OPPORTUNITY_ID = null;

  @SerializedName("VISIBLE_TO")
  private String VISIBLE_TO = null;

  @SerializedName("RESPONSIBLE_USER_ID")
  private Integer RESPONSIBLE_USER_ID = null;

  @SerializedName("INDUSTRY")
  private String INDUSTRY = null;

  @SerializedName("LEAD_STATUS_ID")
  private Long LEAD_STATUS_ID = null;

  @SerializedName("LEAD_SOURCE_ID")
  private Long LEAD_SOURCE_ID = null;

  @SerializedName("VISIBLE_TEAM_ID")
  private Long VISIBLE_TEAM_ID = null;

  @SerializedName("EMPLOYEE_COUNT")
  private Integer EMPLOYEE_COUNT = null;

  @SerializedName("LEAD_RATING")
  private Integer LEAD_RATING = null;

  @SerializedName("LEAD_DESCRIPTION")
  private String LEAD_DESCRIPTION = null;

  @SerializedName("VISIBLE_USER_IDS")
  private String VISIBLE_USER_IDS = null;

  @SerializedName("CUSTOMFIELDS")
  private List<APICustomField> CUSTOMFIELDS = new ArrayList<APICustomField>();

  @SerializedName("ADDRESS_STREET")
  private String ADDRESS_STREET = null;

  @SerializedName("ADDRESS_CITY")
  private String ADDRESS_CITY = null;

  @SerializedName("ADDRESS_STATE")
  private String ADDRESS_STATE = null;

  @SerializedName("ADDRESS_POSTCODE")
  private String ADDRESS_POSTCODE = null;

  @SerializedName("ADDRESS_COUNTRY")
  private String ADDRESS_COUNTRY = null;

  @SerializedName("TAGS")
  private List<APITag> TAGS = new ArrayList<APITag>();

  @SerializedName("IMAGE_URL")
  private String IMAGE_URL = null;

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  public APILead LEAD_ID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
    return this;
  }

   /**
   * Unique ID for the Lead record
   * @return LEAD_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Lead record")
  public Long getLEADID() {
    return LEAD_ID;
  }

  public void setLEADID(Long LEAD_ID) {
    this.LEAD_ID = LEAD_ID;
  }

  public APILead SALUTATION(String SALUTATION) {
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

  public APILead TITLE(String TITLE) {
    this.TITLE = TITLE;
    return this;
  }

   /**
   * Salutation
   * @return TITLE
  **/
  @ApiModelProperty(example = "null", value = "Salutation")
  public String getTITLE() {
    return TITLE;
  }

  public void setTITLE(String TITLE) {
    this.TITLE = TITLE;
  }

  public APILead FIRST_NAME(String FIRST_NAME) {
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

  public APILead LAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
    return this;
  }

   /**
   * Last/Family/Surname of the Lead
   * @return LAST_NAME
  **/
  @ApiModelProperty(example = "null", required = true, value = "Last/Family/Surname of the Lead")
  public String getLASTNAME() {
    return LAST_NAME;
  }

  public void setLASTNAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }

  public APILead ORGANIZATION_NAME(String ORGANIZATION_NAME) {
    this.ORGANIZATION_NAME = ORGANIZATION_NAME;
    return this;
  }

   /**
   * Organisation Name
   * @return ORGANIZATION_NAME
  **/
  @ApiModelProperty(example = "null", value = "Organisation Name")
  public String getORGANIZATIONNAME() {
    return ORGANIZATION_NAME;
  }

  public void setORGANIZATIONNAME(String ORGANIZATION_NAME) {
    this.ORGANIZATION_NAME = ORGANIZATION_NAME;
  }

  public APILead PHONE_NUMBER(String PHONE_NUMBER) {
    this.PHONE_NUMBER = PHONE_NUMBER;
    return this;
  }

   /**
   * Phone Number
   * @return PHONE_NUMBER
  **/
  @ApiModelProperty(example = "null", value = "Phone Number")
  public String getPHONENUMBER() {
    return PHONE_NUMBER;
  }

  public void setPHONENUMBER(String PHONE_NUMBER) {
    this.PHONE_NUMBER = PHONE_NUMBER;
  }

  public APILead MOBILE_PHONE_NUMBER(String MOBILE_PHONE_NUMBER) {
    this.MOBILE_PHONE_NUMBER = MOBILE_PHONE_NUMBER;
    return this;
  }

   /**
   * Mobile Phone Number
   * @return MOBILE_PHONE_NUMBER
  **/
  @ApiModelProperty(example = "null", value = "Mobile Phone Number")
  public String getMOBILEPHONENUMBER() {
    return MOBILE_PHONE_NUMBER;
  }

  public void setMOBILEPHONENUMBER(String MOBILE_PHONE_NUMBER) {
    this.MOBILE_PHONE_NUMBER = MOBILE_PHONE_NUMBER;
  }

  public APILead FAX_NUMBER(String FAX_NUMBER) {
    this.FAX_NUMBER = FAX_NUMBER;
    return this;
  }

   /**
   * Fax Number
   * @return FAX_NUMBER
  **/
  @ApiModelProperty(example = "null", value = "Fax Number")
  public String getFAXNUMBER() {
    return FAX_NUMBER;
  }

  public void setFAXNUMBER(String FAX_NUMBER) {
    this.FAX_NUMBER = FAX_NUMBER;
  }

  public APILead EMAIL_ADDRESS(String EMAIL_ADDRESS) {
    this.EMAIL_ADDRESS = EMAIL_ADDRESS;
    return this;
  }

   /**
   * Email Address
   * @return EMAIL_ADDRESS
  **/
  @ApiModelProperty(example = "null", value = "Email Address")
  public String getEMAILADDRESS() {
    return EMAIL_ADDRESS;
  }

  public void setEMAILADDRESS(String EMAIL_ADDRESS) {
    this.EMAIL_ADDRESS = EMAIL_ADDRESS;
  }

  public APILead WEBSITE_URL(String WEBSITE_URL) {
    this.WEBSITE_URL = WEBSITE_URL;
    return this;
  }

   /**
   * Website URL Address
   * @return WEBSITE_URL
  **/
  @ApiModelProperty(example = "null", value = "Website URL Address")
  public String getWEBSITEURL() {
    return WEBSITE_URL;
  }

  public void setWEBSITEURL(String WEBSITE_URL) {
    this.WEBSITE_URL = WEBSITE_URL;
  }

  public APILead OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * User ID of the Lead owner. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "User ID of the Lead owner. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public APILead DATE_CREATED_UTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
    return this;
  }

   /**
   * Date and time Lead record creates, as Coordinated Universal Time (read only, automatically generated by server)
   * @return DATE_CREATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Lead record creates, as Coordinated Universal Time (read only, automatically generated by server)")
  public Date getDATECREATEDUTC() {
    return DATE_CREATED_UTC;
  }

  public void setDATECREATEDUTC(Date DATE_CREATED_UTC) {
    this.DATE_CREATED_UTC = DATE_CREATED_UTC;
  }

  public APILead DATE_UPDATED_UTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
    return this;
  }

   /**
   * Date and time Lead record updated, as Coordinated Universal Time (read only, automatically generated by server)
   * @return DATE_UPDATED_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Lead record updated, as Coordinated Universal Time (read only, automatically generated by server)")
  public Date getDATEUPDATEDUTC() {
    return DATE_UPDATED_UTC;
  }

  public void setDATEUPDATEDUTC(Date DATE_UPDATED_UTC) {
    this.DATE_UPDATED_UTC = DATE_UPDATED_UTC;
  }

  public APILead CONVERTED(Boolean CONVERTED) {
    this.CONVERTED = CONVERTED;
    return this;
  }

   /**
   * IsConverted Lead
   * @return CONVERTED
  **/
  @ApiModelProperty(example = "null", value = "IsConverted Lead")
  public Boolean getCONVERTED() {
    return CONVERTED;
  }

  public void setCONVERTED(Boolean CONVERTED) {
    this.CONVERTED = CONVERTED;
  }

  public APILead CONVERTED_DATE_UTC(Date CONVERTED_DATE_UTC) {
    this.CONVERTED_DATE_UTC = CONVERTED_DATE_UTC;
    return this;
  }

   /**
   * Date and time Lead record converted to opportunity, as Coordinated Universal Time (read only, automatically generated by server)
   * @return CONVERTED_DATE_UTC
  **/
  @ApiModelProperty(example = "null", value = "Date and time Lead record converted to opportunity, as Coordinated Universal Time (read only, automatically generated by server)")
  public Date getCONVERTEDDATEUTC() {
    return CONVERTED_DATE_UTC;
  }

  public void setCONVERTEDDATEUTC(Date CONVERTED_DATE_UTC) {
    this.CONVERTED_DATE_UTC = CONVERTED_DATE_UTC;
  }

  public APILead CONVERTED_CONTACT_ID(Long CONVERTED_CONTACT_ID) {
    this.CONVERTED_CONTACT_ID = CONVERTED_CONTACT_ID;
    return this;
  }

   /**
   * The Contact ID resulted from a Lead conversion process to Opportunity
   * @return CONVERTED_CONTACT_ID
  **/
  @ApiModelProperty(example = "null", value = "The Contact ID resulted from a Lead conversion process to Opportunity")
  public Long getCONVERTEDCONTACTID() {
    return CONVERTED_CONTACT_ID;
  }

  public void setCONVERTEDCONTACTID(Long CONVERTED_CONTACT_ID) {
    this.CONVERTED_CONTACT_ID = CONVERTED_CONTACT_ID;
  }

  public APILead CONVERTED_ORGANIZATION_ID(Long CONVERTED_ORGANIZATION_ID) {
    this.CONVERTED_ORGANIZATION_ID = CONVERTED_ORGANIZATION_ID;
    return this;
  }

   /**
   * The Opportunity ID resulted from a Lead conversion process
   * @return CONVERTED_ORGANIZATION_ID
  **/
  @ApiModelProperty(example = "null", value = "The Opportunity ID resulted from a Lead conversion process")
  public Long getCONVERTEDORGANIZATIONID() {
    return CONVERTED_ORGANIZATION_ID;
  }

  public void setCONVERTEDORGANIZATIONID(Long CONVERTED_ORGANIZATION_ID) {
    this.CONVERTED_ORGANIZATION_ID = CONVERTED_ORGANIZATION_ID;
  }

  public APILead CONVERTED_OPPORTUNITY_ID(Long CONVERTED_OPPORTUNITY_ID) {
    this.CONVERTED_OPPORTUNITY_ID = CONVERTED_OPPORTUNITY_ID;
    return this;
  }

   /**
   * The Opportunity ID resulted from a Lead conversion process
   * @return CONVERTED_OPPORTUNITY_ID
  **/
  @ApiModelProperty(example = "null", value = "The Opportunity ID resulted from a Lead conversion process")
  public Long getCONVERTEDOPPORTUNITYID() {
    return CONVERTED_OPPORTUNITY_ID;
  }

  public void setCONVERTEDOPPORTUNITYID(Long CONVERTED_OPPORTUNITY_ID) {
    this.CONVERTED_OPPORTUNITY_ID = CONVERTED_OPPORTUNITY_ID;
  }

  public APILead VISIBLE_TO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
    return this;
  }

   /**
   * This field can have one of the following values: 'Everyone' (Default), 'Owner', 'Team', or 'Individuals'.\"
   * @return VISIBLE_TO
  **/
  @ApiModelProperty(example = "null", value = "This field can have one of the following values: 'Everyone' (Default), 'Owner', 'Team', or 'Individuals'.\"")
  public String getVISIBLETO() {
    return VISIBLE_TO;
  }

  public void setVISIBLETO(String VISIBLE_TO) {
    this.VISIBLE_TO = VISIBLE_TO;
  }

  public APILead RESPONSIBLE_USER_ID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
    return this;
  }

   /**
   * Responsible User's ID.
   * @return RESPONSIBLE_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "Responsible User's ID.")
  public Integer getRESPONSIBLEUSERID() {
    return RESPONSIBLE_USER_ID;
  }

  public void setRESPONSIBLEUSERID(Integer RESPONSIBLE_USER_ID) {
    this.RESPONSIBLE_USER_ID = RESPONSIBLE_USER_ID;
  }

  public APILead INDUSTRY(String INDUSTRY) {
    this.INDUSTRY = INDUSTRY;
    return this;
  }

   /**
   * The associated Industry
   * @return INDUSTRY
  **/
  @ApiModelProperty(example = "null", value = "The associated Industry")
  public String getINDUSTRY() {
    return INDUSTRY;
  }

  public void setINDUSTRY(String INDUSTRY) {
    this.INDUSTRY = INDUSTRY;
  }

  public APILead LEAD_STATUS_ID(Long LEAD_STATUS_ID) {
    this.LEAD_STATUS_ID = LEAD_STATUS_ID;
    return this;
  }

   /**
   * Lead Statuses which will be having a value pair of (status and status type) i.e. (Contacted, OPEN) or (Converted, CLOSED)
   * @return LEAD_STATUS_ID
  **/
  @ApiModelProperty(example = "null", value = "Lead Statuses which will be having a value pair of (status and status type) i.e. (Contacted, OPEN) or (Converted, CLOSED)")
  public Long getLEADSTATUSID() {
    return LEAD_STATUS_ID;
  }

  public void setLEADSTATUSID(Long LEAD_STATUS_ID) {
    this.LEAD_STATUS_ID = LEAD_STATUS_ID;
  }

  public APILead LEAD_SOURCE_ID(Long LEAD_SOURCE_ID) {
    this.LEAD_SOURCE_ID = LEAD_SOURCE_ID;
    return this;
  }

   /**
   * Lead Source i.e. web, phone etc
   * @return LEAD_SOURCE_ID
  **/
  @ApiModelProperty(example = "null", value = "Lead Source i.e. web, phone etc")
  public Long getLEADSOURCEID() {
    return LEAD_SOURCE_ID;
  }

  public void setLEADSOURCEID(Long LEAD_SOURCE_ID) {
    this.LEAD_SOURCE_ID = LEAD_SOURCE_ID;
  }

  public APILead VISIBLE_TEAM_ID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
    return this;
  }

   /**
   * If VISIBLE_TO is 'Team', then this should be a Team ID, which must be a valid TEAM_ID record locator.
   * @return VISIBLE_TEAM_ID
  **/
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Team', then this should be a Team ID, which must be a valid TEAM_ID record locator.")
  public Long getVISIBLETEAMID() {
    return VISIBLE_TEAM_ID;
  }

  public void setVISIBLETEAMID(Long VISIBLE_TEAM_ID) {
    this.VISIBLE_TEAM_ID = VISIBLE_TEAM_ID;
  }

  public APILead EMPLOYEE_COUNT(Integer EMPLOYEE_COUNT) {
    this.EMPLOYEE_COUNT = EMPLOYEE_COUNT;
    return this;
  }

   /**
   * Employee count for the lead's organization
   * @return EMPLOYEE_COUNT
  **/
  @ApiModelProperty(example = "null", value = "Employee count for the lead's organization")
  public Integer getEMPLOYEECOUNT() {
    return EMPLOYEE_COUNT;
  }

  public void setEMPLOYEECOUNT(Integer EMPLOYEE_COUNT) {
    this.EMPLOYEE_COUNT = EMPLOYEE_COUNT;
  }

  public APILead LEAD_RATING(Integer LEAD_RATING) {
    this.LEAD_RATING = LEAD_RATING;
    return this;
  }

   /**
   * Lead's Rating
   * @return LEAD_RATING
  **/
  @ApiModelProperty(example = "null", value = "Lead's Rating")
  public Integer getLEADRATING() {
    return LEAD_RATING;
  }

  public void setLEADRATING(Integer LEAD_RATING) {
    this.LEAD_RATING = LEAD_RATING;
  }

  public APILead LEAD_DESCRIPTION(String LEAD_DESCRIPTION) {
    this.LEAD_DESCRIPTION = LEAD_DESCRIPTION;
    return this;
  }

   /**
   * Lead's Description
   * @return LEAD_DESCRIPTION
  **/
  @ApiModelProperty(example = "null", value = "Lead's Description")
  public String getLEADDESCRIPTION() {
    return LEAD_DESCRIPTION;
  }

  public void setLEADDESCRIPTION(String LEAD_DESCRIPTION) {
    this.LEAD_DESCRIPTION = LEAD_DESCRIPTION;
  }

  public APILead VISIBLE_USER_IDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
    return this;
  }

   /**
   * If VISIBLE_TO is 'Individuals', then this should be a comma-separated list of User IDs. This field is always empty in the response. Upon successful POST or PUT an anonymous team is created from the list of IDs, and the response will contain a VISIBLE_TEAM_ID.
   * @return VISIBLE_USER_IDS
  **/
  @ApiModelProperty(example = "null", value = "If VISIBLE_TO is 'Individuals', then this should be a comma-separated list of User IDs. This field is always empty in the response. Upon successful POST or PUT an anonymous team is created from the list of IDs, and the response will contain a VISIBLE_TEAM_ID.")
  public String getVISIBLEUSERIDS() {
    return VISIBLE_USER_IDS;
  }

  public void setVISIBLEUSERIDS(String VISIBLE_USER_IDS) {
    this.VISIBLE_USER_IDS = VISIBLE_USER_IDS;
  }

  public APILead CUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
    return this;
  }

  public APILead addCUSTOMFIELDSItem(APICustomField CUSTOMFIELDSItem) {
    this.CUSTOMFIELDS.add(CUSTOMFIELDSItem);
    return this;
  }

   /**
   * Set of custom fields attached to the Lead
   * @return CUSTOMFIELDS
  **/
  @ApiModelProperty(example = "null", value = "Set of custom fields attached to the Lead")
  public List<APICustomField> getCUSTOMFIELDS() {
    return CUSTOMFIELDS;
  }

  public void setCUSTOMFIELDS(List<APICustomField> CUSTOMFIELDS) {
    this.CUSTOMFIELDS = CUSTOMFIELDS;
  }

  public APILead ADDRESS_STREET(String ADDRESS_STREET) {
    this.ADDRESS_STREET = ADDRESS_STREET;
    return this;
  }

   /**
   * Set of addresses attached to the Lead
   * @return ADDRESS_STREET
  **/
  @ApiModelProperty(example = "null", value = "Set of addresses attached to the Lead")
  public String getADDRESSSTREET() {
    return ADDRESS_STREET;
  }

  public void setADDRESSSTREET(String ADDRESS_STREET) {
    this.ADDRESS_STREET = ADDRESS_STREET;
  }

  public APILead ADDRESS_CITY(String ADDRESS_CITY) {
    this.ADDRESS_CITY = ADDRESS_CITY;
    return this;
  }

   /**
   * Address street attached to the Lead
   * @return ADDRESS_CITY
  **/
  @ApiModelProperty(example = "null", value = "Address street attached to the Lead")
  public String getADDRESSCITY() {
    return ADDRESS_CITY;
  }

  public void setADDRESSCITY(String ADDRESS_CITY) {
    this.ADDRESS_CITY = ADDRESS_CITY;
  }

  public APILead ADDRESS_STATE(String ADDRESS_STATE) {
    this.ADDRESS_STATE = ADDRESS_STATE;
    return this;
  }

   /**
   * Address state attached to the Lead
   * @return ADDRESS_STATE
  **/
  @ApiModelProperty(example = "null", value = "Address state attached to the Lead")
  public String getADDRESSSTATE() {
    return ADDRESS_STATE;
  }

  public void setADDRESSSTATE(String ADDRESS_STATE) {
    this.ADDRESS_STATE = ADDRESS_STATE;
  }

  public APILead ADDRESS_POSTCODE(String ADDRESS_POSTCODE) {
    this.ADDRESS_POSTCODE = ADDRESS_POSTCODE;
    return this;
  }

   /**
   * Address postal code attached to the Lead
   * @return ADDRESS_POSTCODE
  **/
  @ApiModelProperty(example = "null", value = "Address postal code attached to the Lead")
  public String getADDRESSPOSTCODE() {
    return ADDRESS_POSTCODE;
  }

  public void setADDRESSPOSTCODE(String ADDRESS_POSTCODE) {
    this.ADDRESS_POSTCODE = ADDRESS_POSTCODE;
  }

  public APILead ADDRESS_COUNTRY(String ADDRESS_COUNTRY) {
    this.ADDRESS_COUNTRY = ADDRESS_COUNTRY;
    return this;
  }

   /**
   * Address country attached to the Lead
   * @return ADDRESS_COUNTRY
  **/
  @ApiModelProperty(example = "null", value = "Address country attached to the Lead")
  public String getADDRESSCOUNTRY() {
    return ADDRESS_COUNTRY;
  }

  public void setADDRESSCOUNTRY(String ADDRESS_COUNTRY) {
    this.ADDRESS_COUNTRY = ADDRESS_COUNTRY;
  }

  public APILead TAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
    return this;
  }

  public APILead addTAGSItem(APITag TAGSItem) {
    this.TAGS.add(TAGSItem);
    return this;
  }

   /**
   * Set of tags attached to the Lead
   * @return TAGS
  **/
  @ApiModelProperty(example = "null", value = "Set of tags attached to the Lead")
  public List<APITag> getTAGS() {
    return TAGS;
  }

  public void setTAGS(List<APITag> TAGS) {
    this.TAGS = TAGS;
  }

  public APILead IMAGE_URL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
    return this;
  }

   /**
   * Url of the Image for the Lead.  Use the 'leads/:id/image' endpoint to change the image.
   * @return IMAGE_URL
  **/
  @ApiModelProperty(example = "null", value = "Url of the Image for the Lead.  Use the 'leads/:id/image' endpoint to change the image.")
  public String getIMAGEURL() {
    return IMAGE_URL;
  }

  public void setIMAGEURL(String IMAGE_URL) {
    this.IMAGE_URL = IMAGE_URL;
  }

  public APILead CAN_EDIT(Boolean CAN_EDIT) {
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

  public APILead CAN_DELETE(Boolean CAN_DELETE) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APILead apILead = (APILead) o;
    return Objects.equals(this.LEAD_ID, apILead.LEAD_ID) &&
        Objects.equals(this.SALUTATION, apILead.SALUTATION) &&
        Objects.equals(this.TITLE, apILead.TITLE) &&
        Objects.equals(this.FIRST_NAME, apILead.FIRST_NAME) &&
        Objects.equals(this.LAST_NAME, apILead.LAST_NAME) &&
        Objects.equals(this.ORGANIZATION_NAME, apILead.ORGANIZATION_NAME) &&
        Objects.equals(this.PHONE_NUMBER, apILead.PHONE_NUMBER) &&
        Objects.equals(this.MOBILE_PHONE_NUMBER, apILead.MOBILE_PHONE_NUMBER) &&
        Objects.equals(this.FAX_NUMBER, apILead.FAX_NUMBER) &&
        Objects.equals(this.EMAIL_ADDRESS, apILead.EMAIL_ADDRESS) &&
        Objects.equals(this.WEBSITE_URL, apILead.WEBSITE_URL) &&
        Objects.equals(this.OWNER_USER_ID, apILead.OWNER_USER_ID) &&
        Objects.equals(this.DATE_CREATED_UTC, apILead.DATE_CREATED_UTC) &&
        Objects.equals(this.DATE_UPDATED_UTC, apILead.DATE_UPDATED_UTC) &&
        Objects.equals(this.CONVERTED, apILead.CONVERTED) &&
        Objects.equals(this.CONVERTED_DATE_UTC, apILead.CONVERTED_DATE_UTC) &&
        Objects.equals(this.CONVERTED_CONTACT_ID, apILead.CONVERTED_CONTACT_ID) &&
        Objects.equals(this.CONVERTED_ORGANIZATION_ID, apILead.CONVERTED_ORGANIZATION_ID) &&
        Objects.equals(this.CONVERTED_OPPORTUNITY_ID, apILead.CONVERTED_OPPORTUNITY_ID) &&
        Objects.equals(this.VISIBLE_TO, apILead.VISIBLE_TO) &&
        Objects.equals(this.RESPONSIBLE_USER_ID, apILead.RESPONSIBLE_USER_ID) &&
        Objects.equals(this.INDUSTRY, apILead.INDUSTRY) &&
        Objects.equals(this.LEAD_STATUS_ID, apILead.LEAD_STATUS_ID) &&
        Objects.equals(this.LEAD_SOURCE_ID, apILead.LEAD_SOURCE_ID) &&
        Objects.equals(this.VISIBLE_TEAM_ID, apILead.VISIBLE_TEAM_ID) &&
        Objects.equals(this.EMPLOYEE_COUNT, apILead.EMPLOYEE_COUNT) &&
        Objects.equals(this.LEAD_RATING, apILead.LEAD_RATING) &&
        Objects.equals(this.LEAD_DESCRIPTION, apILead.LEAD_DESCRIPTION) &&
        Objects.equals(this.VISIBLE_USER_IDS, apILead.VISIBLE_USER_IDS) &&
        Objects.equals(this.CUSTOMFIELDS, apILead.CUSTOMFIELDS) &&
        Objects.equals(this.ADDRESS_STREET, apILead.ADDRESS_STREET) &&
        Objects.equals(this.ADDRESS_CITY, apILead.ADDRESS_CITY) &&
        Objects.equals(this.ADDRESS_STATE, apILead.ADDRESS_STATE) &&
        Objects.equals(this.ADDRESS_POSTCODE, apILead.ADDRESS_POSTCODE) &&
        Objects.equals(this.ADDRESS_COUNTRY, apILead.ADDRESS_COUNTRY) &&
        Objects.equals(this.TAGS, apILead.TAGS) &&
        Objects.equals(this.IMAGE_URL, apILead.IMAGE_URL) &&
        Objects.equals(this.CAN_EDIT, apILead.CAN_EDIT) &&
        Objects.equals(this.CAN_DELETE, apILead.CAN_DELETE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LEAD_ID, SALUTATION, TITLE, FIRST_NAME, LAST_NAME, ORGANIZATION_NAME, PHONE_NUMBER, MOBILE_PHONE_NUMBER, FAX_NUMBER, EMAIL_ADDRESS, WEBSITE_URL, OWNER_USER_ID, DATE_CREATED_UTC, DATE_UPDATED_UTC, CONVERTED, CONVERTED_DATE_UTC, CONVERTED_CONTACT_ID, CONVERTED_ORGANIZATION_ID, CONVERTED_OPPORTUNITY_ID, VISIBLE_TO, RESPONSIBLE_USER_ID, INDUSTRY, LEAD_STATUS_ID, LEAD_SOURCE_ID, VISIBLE_TEAM_ID, EMPLOYEE_COUNT, LEAD_RATING, LEAD_DESCRIPTION, VISIBLE_USER_IDS, CUSTOMFIELDS, ADDRESS_STREET, ADDRESS_CITY, ADDRESS_STATE, ADDRESS_POSTCODE, ADDRESS_COUNTRY, TAGS, IMAGE_URL, CAN_EDIT, CAN_DELETE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILead {\n");
    
    sb.append("    LEAD_ID: ").append(toIndentedString(LEAD_ID)).append("\n");
    sb.append("    SALUTATION: ").append(toIndentedString(SALUTATION)).append("\n");
    sb.append("    TITLE: ").append(toIndentedString(TITLE)).append("\n");
    sb.append("    FIRST_NAME: ").append(toIndentedString(FIRST_NAME)).append("\n");
    sb.append("    LAST_NAME: ").append(toIndentedString(LAST_NAME)).append("\n");
    sb.append("    ORGANIZATION_NAME: ").append(toIndentedString(ORGANIZATION_NAME)).append("\n");
    sb.append("    PHONE_NUMBER: ").append(toIndentedString(PHONE_NUMBER)).append("\n");
    sb.append("    MOBILE_PHONE_NUMBER: ").append(toIndentedString(MOBILE_PHONE_NUMBER)).append("\n");
    sb.append("    FAX_NUMBER: ").append(toIndentedString(FAX_NUMBER)).append("\n");
    sb.append("    EMAIL_ADDRESS: ").append(toIndentedString(EMAIL_ADDRESS)).append("\n");
    sb.append("    WEBSITE_URL: ").append(toIndentedString(WEBSITE_URL)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    DATE_CREATED_UTC: ").append(toIndentedString(DATE_CREATED_UTC)).append("\n");
    sb.append("    DATE_UPDATED_UTC: ").append(toIndentedString(DATE_UPDATED_UTC)).append("\n");
    sb.append("    CONVERTED: ").append(toIndentedString(CONVERTED)).append("\n");
    sb.append("    CONVERTED_DATE_UTC: ").append(toIndentedString(CONVERTED_DATE_UTC)).append("\n");
    sb.append("    CONVERTED_CONTACT_ID: ").append(toIndentedString(CONVERTED_CONTACT_ID)).append("\n");
    sb.append("    CONVERTED_ORGANIZATION_ID: ").append(toIndentedString(CONVERTED_ORGANIZATION_ID)).append("\n");
    sb.append("    CONVERTED_OPPORTUNITY_ID: ").append(toIndentedString(CONVERTED_OPPORTUNITY_ID)).append("\n");
    sb.append("    VISIBLE_TO: ").append(toIndentedString(VISIBLE_TO)).append("\n");
    sb.append("    RESPONSIBLE_USER_ID: ").append(toIndentedString(RESPONSIBLE_USER_ID)).append("\n");
    sb.append("    INDUSTRY: ").append(toIndentedString(INDUSTRY)).append("\n");
    sb.append("    LEAD_STATUS_ID: ").append(toIndentedString(LEAD_STATUS_ID)).append("\n");
    sb.append("    LEAD_SOURCE_ID: ").append(toIndentedString(LEAD_SOURCE_ID)).append("\n");
    sb.append("    VISIBLE_TEAM_ID: ").append(toIndentedString(VISIBLE_TEAM_ID)).append("\n");
    sb.append("    EMPLOYEE_COUNT: ").append(toIndentedString(EMPLOYEE_COUNT)).append("\n");
    sb.append("    LEAD_RATING: ").append(toIndentedString(LEAD_RATING)).append("\n");
    sb.append("    LEAD_DESCRIPTION: ").append(toIndentedString(LEAD_DESCRIPTION)).append("\n");
    sb.append("    VISIBLE_USER_IDS: ").append(toIndentedString(VISIBLE_USER_IDS)).append("\n");
    sb.append("    CUSTOMFIELDS: ").append(toIndentedString(CUSTOMFIELDS)).append("\n");
    sb.append("    ADDRESS_STREET: ").append(toIndentedString(ADDRESS_STREET)).append("\n");
    sb.append("    ADDRESS_CITY: ").append(toIndentedString(ADDRESS_CITY)).append("\n");
    sb.append("    ADDRESS_STATE: ").append(toIndentedString(ADDRESS_STATE)).append("\n");
    sb.append("    ADDRESS_POSTCODE: ").append(toIndentedString(ADDRESS_POSTCODE)).append("\n");
    sb.append("    ADDRESS_COUNTRY: ").append(toIndentedString(ADDRESS_COUNTRY)).append("\n");
    sb.append("    TAGS: ").append(toIndentedString(TAGS)).append("\n");
    sb.append("    IMAGE_URL: ").append(toIndentedString(IMAGE_URL)).append("\n");
    sb.append("    CAN_EDIT: ").append(toIndentedString(CAN_EDIT)).append("\n");
    sb.append("    CAN_DELETE: ").append(toIndentedString(CAN_DELETE)).append("\n");
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

