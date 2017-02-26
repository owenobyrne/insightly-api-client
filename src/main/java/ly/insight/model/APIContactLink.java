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
public class APIContactLink implements Serializable {
  @SerializedName("CONTACT_LINK_ID")
  private Long CONTACT_LINK_ID = null;

  @SerializedName("FIRST_CONTACT_ID")
  private Long FIRST_CONTACT_ID = null;

  @SerializedName("SECOND_CONTACT_ID")
  private Long SECOND_CONTACT_ID = null;

  @SerializedName("RELATIONSHIP_ID")
  private Long RELATIONSHIP_ID = null;

  @SerializedName("DETAILS")
  private String DETAILS = null;

  public APIContactLink CONTACT_LINK_ID(Long CONTACT_LINK_ID) {
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

  public APIContactLink FIRST_CONTACT_ID(Long FIRST_CONTACT_ID) {
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

  public APIContactLink SECOND_CONTACT_ID(Long SECOND_CONTACT_ID) {
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

  public APIContactLink RELATIONSHIP_ID(Long RELATIONSHIP_ID) {
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

  public APIContactLink DETAILS(String DETAILS) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIContactLink apIContactLink = (APIContactLink) o;
    return Objects.equals(this.CONTACT_LINK_ID, apIContactLink.CONTACT_LINK_ID) &&
        Objects.equals(this.FIRST_CONTACT_ID, apIContactLink.FIRST_CONTACT_ID) &&
        Objects.equals(this.SECOND_CONTACT_ID, apIContactLink.SECOND_CONTACT_ID) &&
        Objects.equals(this.RELATIONSHIP_ID, apIContactLink.RELATIONSHIP_ID) &&
        Objects.equals(this.DETAILS, apIContactLink.DETAILS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CONTACT_LINK_ID, FIRST_CONTACT_ID, SECOND_CONTACT_ID, RELATIONSHIP_ID, DETAILS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIContactLink {\n");
    
    sb.append("    CONTACT_LINK_ID: ").append(toIndentedString(CONTACT_LINK_ID)).append("\n");
    sb.append("    FIRST_CONTACT_ID: ").append(toIndentedString(FIRST_CONTACT_ID)).append("\n");
    sb.append("    SECOND_CONTACT_ID: ").append(toIndentedString(SECOND_CONTACT_ID)).append("\n");
    sb.append("    RELATIONSHIP_ID: ").append(toIndentedString(RELATIONSHIP_ID)).append("\n");
    sb.append("    DETAILS: ").append(toIndentedString(DETAILS)).append("\n");
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

