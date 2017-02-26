package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APIContactLink
 */
@ApiModel(description = "APIContactLink")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class ContactLink implements Serializable {
  @SerializedName("RELATIONSHIP_ID")
  private Long RELATIONSHIP_ID = null;

  @SerializedName("DETAILS")
  private String DETAILS = null;

  @SerializedName("SECOND_CONTACT_ID")
  private Long SECOND_CONTACT_ID = null;

  @SerializedName("FIRST_CONTACT_ID")
  private Long FIRST_CONTACT_ID = null;

  @SerializedName("CONTACT_LINK_ID")
  private Long CONTACT_LINK_ID = null;

  public ContactLink RELATIONSHIP_ID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
    return this;
  }

   /**
   * Unique ID for the Relationship from First Contact to Second Contact
   * @return RELATIONSHIP_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Relationship from First Contact to Second Contact")
  public Long getRELATIONSHIPID() {
    return RELATIONSHIP_ID;
  }

  public void setRELATIONSHIPID(Long RELATIONSHIP_ID) {
    this.RELATIONSHIP_ID = RELATIONSHIP_ID;
  }

  public ContactLink DETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
    return this;
  }

   /**
   * Description of the Relationship
   * @return DETAILS
  **/
  @ApiModelProperty(example = "null", value = "Description of the Relationship")
  public String getDETAILS() {
    return DETAILS;
  }

  public void setDETAILS(String DETAILS) {
    this.DETAILS = DETAILS;
  }

  public ContactLink SECOND_CONTACT_ID(Long SECOND_CONTACT_ID) {
    this.SECOND_CONTACT_ID = SECOND_CONTACT_ID;
    return this;
  }

   /**
   * Unique ID for a Contact on the other side of the relationship
   * @return SECOND_CONTACT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact on the other side of the relationship")
  public Long getSECONDCONTACTID() {
    return SECOND_CONTACT_ID;
  }

  public void setSECONDCONTACTID(Long SECOND_CONTACT_ID) {
    this.SECOND_CONTACT_ID = SECOND_CONTACT_ID;
  }

  public ContactLink FIRST_CONTACT_ID(Long FIRST_CONTACT_ID) {
    this.FIRST_CONTACT_ID = FIRST_CONTACT_ID;
    return this;
  }

   /**
   * Unique ID for a Contact on one side of the relationship
   * @return FIRST_CONTACT_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for a Contact on one side of the relationship")
  public Long getFIRSTCONTACTID() {
    return FIRST_CONTACT_ID;
  }

  public void setFIRSTCONTACTID(Long FIRST_CONTACT_ID) {
    this.FIRST_CONTACT_ID = FIRST_CONTACT_ID;
  }

  public ContactLink CONTACT_LINK_ID(Long CONTACT_LINK_ID) {
    this.CONTACT_LINK_ID = CONTACT_LINK_ID;
    return this;
  }

   /**
   * Unique ID for the Contact Link record
   * @return CONTACT_LINK_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Contact Link record")
  public Long getCONTACTLINKID() {
    return CONTACT_LINK_ID;
  }

  public void setCONTACTLINKID(Long CONTACT_LINK_ID) {
    this.CONTACT_LINK_ID = CONTACT_LINK_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactLink contactLink = (ContactLink) o;
    return Objects.equals(this.RELATIONSHIP_ID, contactLink.RELATIONSHIP_ID) &&
        Objects.equals(this.DETAILS, contactLink.DETAILS) &&
        Objects.equals(this.SECOND_CONTACT_ID, contactLink.SECOND_CONTACT_ID) &&
        Objects.equals(this.FIRST_CONTACT_ID, contactLink.FIRST_CONTACT_ID) &&
        Objects.equals(this.CONTACT_LINK_ID, contactLink.CONTACT_LINK_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(RELATIONSHIP_ID, DETAILS, SECOND_CONTACT_ID, FIRST_CONTACT_ID, CONTACT_LINK_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactLink {\n");
    
    sb.append("    RELATIONSHIP_ID: ").append(toIndentedString(RELATIONSHIP_ID)).append("\n");
    sb.append("    DETAILS: ").append(toIndentedString(DETAILS)).append("\n");
    sb.append("    SECOND_CONTACT_ID: ").append(toIndentedString(SECOND_CONTACT_ID)).append("\n");
    sb.append("    FIRST_CONTACT_ID: ").append(toIndentedString(FIRST_CONTACT_ID)).append("\n");
    sb.append("    CONTACT_LINK_ID: ").append(toIndentedString(CONTACT_LINK_ID)).append("\n");
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

