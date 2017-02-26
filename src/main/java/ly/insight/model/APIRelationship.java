package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APIRelationship
 */
@ApiModel(description = "APIRelationship")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIRelationship implements Serializable {
  @SerializedName("RELATIONSHIP_ID")
  private Long RELATIONSHIP_ID = null;

  @SerializedName("FORWARD_TITLE")
  private String FORWARD_TITLE = null;

  @SerializedName("FORWARD")
  private String FORWARD = null;

  @SerializedName("REVERSE_TITLE")
  private String REVERSE_TITLE = null;

  @SerializedName("REVERSE")
  private String REVERSE = null;

  @SerializedName("FOR_CONTACTS")
  private Boolean FOR_CONTACTS = null;

  @SerializedName("FOR_ORGANISATIONS")
  private Boolean FOR_ORGANISATIONS = null;

  public APIRelationship RELATIONSHIP_ID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
    return this;
  }

   /**
   * Unique ID for the Relationship record.
   * @return RELATIONSHIP_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Relationship record.")
  public Long getRELATIONSHIPID() {
    return RELATIONSHIP_ID;
  }

  public void setRELATIONSHIPID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
  }

  public APIRelationship FORWARD_TITLE(String FORWARD_TITLE) {
    this.FORWARD_TITLE = FORWARD_TITLE;
    return this;
  }

   /**
   * Name of the direct Relationship.
   * @return FORWARD_TITLE
  **/
  @ApiModelProperty(example = "null", value = "Name of the direct Relationship.")
  public String getFORWARDTITLE() {
    return FORWARD_TITLE;
  }

  public void setFORWARDTITLE(String FORWARD_TITLE) {
    this.FORWARD_TITLE = FORWARD_TITLE;
  }

  public APIRelationship FORWARD(String FORWARD) {
    this.FORWARD = FORWARD;
    return this;
  }

   /**
   * Description of the direct Relationship.
   * @return FORWARD
  **/
  @ApiModelProperty(example = "null", value = "Description of the direct Relationship.")
  public String getFORWARD() {
    return FORWARD;
  }

  public void setFORWARD(String FORWARD) {
    this.FORWARD = FORWARD;
  }

  public APIRelationship REVERSE_TITLE(String REVERSE_TITLE) {
    this.REVERSE_TITLE = REVERSE_TITLE;
    return this;
  }

   /**
   * Name of the inverse Relationship.
   * @return REVERSE_TITLE
  **/
  @ApiModelProperty(example = "null", value = "Name of the inverse Relationship.")
  public String getREVERSETITLE() {
    return REVERSE_TITLE;
  }

  public void setREVERSETITLE(String REVERSE_TITLE) {
    this.REVERSE_TITLE = REVERSE_TITLE;
  }

  public APIRelationship REVERSE(String REVERSE) {
    this.REVERSE = REVERSE;
    return this;
  }

   /**
   * Description of the inverse Relationship.
   * @return REVERSE
  **/
  @ApiModelProperty(example = "null", value = "Description of the inverse Relationship.")
  public String getREVERSE() {
    return REVERSE;
  }

  public void setREVERSE(String REVERSE) {
    this.REVERSE = REVERSE;
  }

  public APIRelationship FOR_CONTACTS(Boolean FOR_CONTACTS) {
    this.FOR_CONTACTS = FOR_CONTACTS;
    return this;
  }

   /**
   * Indicates whether the relationship is availble for linking Contacts.
   * @return FOR_CONTACTS
  **/
  @ApiModelProperty(example = "null", value = "Indicates whether the relationship is availble for linking Contacts.")
  public Boolean getFORCONTACTS() {
    return FOR_CONTACTS;
  }

  public void setFORCONTACTS(Boolean FOR_CONTACTS) {
    this.FOR_CONTACTS = FOR_CONTACTS;
  }

  public APIRelationship FOR_ORGANISATIONS(Boolean FOR_ORGANISATIONS) {
    this.FOR_ORGANISATIONS = FOR_ORGANISATIONS;
    return this;
  }

   /**
   * Indicates whether the relationship is availble for linking Organisations.
   * @return FOR_ORGANISATIONS
  **/
  @ApiModelProperty(example = "null", value = "Indicates whether the relationship is availble for linking Organisations.")
  public Boolean getFORORGANISATIONS() {
    return FOR_ORGANISATIONS;
  }

  public void setFORORGANISATIONS(Boolean FOR_ORGANISATIONS) {
    this.FOR_ORGANISATIONS = FOR_ORGANISATIONS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIRelationship apIRelationship = (APIRelationship) o;
    return Objects.equals(this.RELATIONSHIP_ID, apIRelationship.RELATIONSHIP_ID) &&
        Objects.equals(this.FORWARD_TITLE, apIRelationship.FORWARD_TITLE) &&
        Objects.equals(this.FORWARD, apIRelationship.FORWARD) &&
        Objects.equals(this.REVERSE_TITLE, apIRelationship.REVERSE_TITLE) &&
        Objects.equals(this.REVERSE, apIRelationship.REVERSE) &&
        Objects.equals(this.FOR_CONTACTS, apIRelationship.FOR_CONTACTS) &&
        Objects.equals(this.FOR_ORGANISATIONS, apIRelationship.FOR_ORGANISATIONS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(RELATIONSHIP_ID, FORWARD_TITLE, FORWARD, REVERSE_TITLE, REVERSE, FOR_CONTACTS, FOR_ORGANISATIONS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIRelationship {\n");
    
    sb.append("    RELATIONSHIP_ID: ").append(toIndentedString(RELATIONSHIP_ID)).append("\n");
    sb.append("    FORWARD_TITLE: ").append(toIndentedString(FORWARD_TITLE)).append("\n");
    sb.append("    FORWARD: ").append(toIndentedString(FORWARD)).append("\n");
    sb.append("    REVERSE_TITLE: ").append(toIndentedString(REVERSE_TITLE)).append("\n");
    sb.append("    REVERSE: ").append(toIndentedString(REVERSE)).append("\n");
    sb.append("    FOR_CONTACTS: ").append(toIndentedString(FOR_CONTACTS)).append("\n");
    sb.append("    FOR_ORGANISATIONS: ").append(toIndentedString(FOR_ORGANISATIONS)).append("\n");
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

