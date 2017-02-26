package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APIOrganisationLink
 */
@ApiModel(description = "APIOrganisationLink")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class OrganisationLink implements Serializable {
  @SerializedName("RELATIONSHIP_ID")
  private Long RELATIONSHIP_ID = null;

  @SerializedName("FIRST_ORGANISATION_ID")
  private Long FIRST_ORGANISATION_ID = null;

  @SerializedName("SECOND_ORGANISATION_ID")
  private Long SECOND_ORGANISATION_ID = null;

  @SerializedName("DETAILS")
  private String DETAILS = null;

  @SerializedName("ORG_LINK_ID")
  private Long ORG_LINK_ID = null;

  public OrganisationLink RELATIONSHIP_ID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
    return this;
  }

   /**
   * Unique key of the Relationship from first Organisation to second Organisation
   * @return RELATIONSHIP_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique key of the Relationship from first Organisation to second Organisation")
  public Long getRELATIONSHIPID() {
    return RELATIONSHIP_ID;
  }

  public void setRELATIONSHIPID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
  }

  public OrganisationLink FIRST_ORGANISATION_ID(Long FIRST_ORGANISATION_ID) {
    this.FIRST_ORGANISATION_ID = FIRST_ORGANISATION_ID;
    return this;
  }

   /**
   * Unique key of an Organisation on one side of the relationship
   * @return FIRST_ORGANISATION_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique key of an Organisation on one side of the relationship")
  public Long getFIRSTORGANISATIONID() {
    return FIRST_ORGANISATION_ID;
  }

  public void setFIRSTORGANISATIONID(Long FIRST_ORGANISATION_ID) {
    this.FIRST_ORGANISATION_ID = FIRST_ORGANISATION_ID;
  }

  public OrganisationLink SECOND_ORGANISATION_ID(Long SECOND_ORGANISATION_ID) {
    this.SECOND_ORGANISATION_ID = SECOND_ORGANISATION_ID;
    return this;
  }

   /**
   * Unique key of an Organisation on the other side of the relationship
   * @return SECOND_ORGANISATION_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique key of an Organisation on the other side of the relationship")
  public Long getSECONDORGANISATIONID() {
    return SECOND_ORGANISATION_ID;
  }

  public void setSECONDORGANISATIONID(Long SECOND_ORGANISATION_ID) {
    this.SECOND_ORGANISATION_ID = SECOND_ORGANISATION_ID;
  }

  public OrganisationLink DETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
    return this;
  }

   /**
   * Details about the Relationship
   * @return DETAILS
  **/
  @ApiModelProperty(example = "null", value = "Details about the Relationship")
  public String getDETAILS() {
    return DETAILS;
  }

  public void setDETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
  }

  public OrganisationLink ORG_LINK_ID(Long ORG_LINK_ID) {
    this.ORG_LINK_ID = ORG_LINK_ID;
    return this;
  }

   /**
   * Unique ID for the Organisation Link record
   * @return ORG_LINK_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Organisation Link record")
  public Long getORGLINKID() {
    return ORG_LINK_ID;
  }

  public void setORGLINKID(Long ORG_LINK_ID) {
    this.ORG_LINK_ID = ORG_LINK_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisationLink organisationLink = (OrganisationLink) o;
    return Objects.equals(this.RELATIONSHIP_ID, organisationLink.RELATIONSHIP_ID) &&
        Objects.equals(this.FIRST_ORGANISATION_ID, organisationLink.FIRST_ORGANISATION_ID) &&
        Objects.equals(this.SECOND_ORGANISATION_ID, organisationLink.SECOND_ORGANISATION_ID) &&
        Objects.equals(this.DETAILS, organisationLink.DETAILS) &&
        Objects.equals(this.ORG_LINK_ID, organisationLink.ORG_LINK_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(RELATIONSHIP_ID, FIRST_ORGANISATION_ID, SECOND_ORGANISATION_ID, DETAILS, ORG_LINK_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationLink {\n");
    
    sb.append("    RELATIONSHIP_ID: ").append(toIndentedString(RELATIONSHIP_ID)).append("\n");
    sb.append("    FIRST_ORGANISATION_ID: ").append(toIndentedString(FIRST_ORGANISATION_ID)).append("\n");
    sb.append("    SECOND_ORGANISATION_ID: ").append(toIndentedString(SECOND_ORGANISATION_ID)).append("\n");
    sb.append("    DETAILS: ").append(toIndentedString(DETAILS)).append("\n");
    sb.append("    ORG_LINK_ID: ").append(toIndentedString(ORG_LINK_ID)).append("\n");
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

