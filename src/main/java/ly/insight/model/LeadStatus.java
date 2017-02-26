package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APICategory
 */
@ApiModel(description = "APICategory")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class LeadStatus implements Serializable {
  @SerializedName("FIELD_ORDER")
  private Integer FIELD_ORDER = null;

  @SerializedName("LEAD_STATUS_ID")
  private Long LEAD_STATUS_ID = null;

  @SerializedName("LEAD_STATUS")
  private String LEAD_STATUS = null;

  @SerializedName("DEFAULT_STATUS")
  private Boolean DEFAULT_STATUS = null;

  @SerializedName("STATUS_TYPE")
  private Integer STATUS_TYPE = null;

  public LeadStatus FIELD_ORDER(Integer FIELD_ORDER) {
    this.FIELD_ORDER = FIELD_ORDER;
    return this;
  }

   /**
   * Field Order used to retrive list sorted
   * @return FIELD_ORDER
  **/
  @ApiModelProperty(example = "null", value = "Field Order used to retrive list sorted")
  public Integer getFIELDORDER() {
    return FIELD_ORDER;
  }

  public void setFIELDORDER(Integer FIELD_ORDER) {
    this.FIELD_ORDER = FIELD_ORDER;
  }

  public LeadStatus LEAD_STATUS_ID(Long LEAD_STATUS_ID) {
    this.LEAD_STATUS_ID = LEAD_STATUS_ID;
    return this;
  }

   /**
   * Unique ID for the current Lead Status
   * @return LEAD_STATUS_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the current Lead Status")
  public Long getLEADSTATUSID() {
    return LEAD_STATUS_ID;
  }

  public void setLEADSTATUSID(Long LEAD_STATUS_ID) {
    this.LEAD_STATUS_ID = LEAD_STATUS_ID;
  }

  public LeadStatus LEAD_STATUS(String LEAD_STATUS) {
    this.LEAD_STATUS = LEAD_STATUS;
    return this;
  }

   /**
   * Lead Status value
   * @return LEAD_STATUS
  **/
  @ApiModelProperty(example = "null", required = true, value = "Lead Status value")
  public String getLEADSTATUS() {
    return LEAD_STATUS;
  }

  public void setLEADSTATUS(String LEAD_STATUS) {
    this.LEAD_STATUS = LEAD_STATUS;
  }

  public LeadStatus DEFAULT_STATUS(Boolean DEFAULT_STATUS) {
    this.DEFAULT_STATUS = DEFAULT_STATUS;
    return this;
  }

   /**
   * checks or sets the current Lead source for being the default value
   * @return DEFAULT_STATUS
  **/
  @ApiModelProperty(example = "null", value = "checks or sets the current Lead source for being the default value")
  public Boolean getDEFAULTSTATUS() {
    return DEFAULT_STATUS;
  }

  public void setDEFAULTSTATUS(Boolean DEFAULT_STATUS) {
    this.DEFAULT_STATUS = DEFAULT_STATUS;
  }

  public LeadStatus STATUS_TYPE(Integer STATUS_TYPE) {
    this.STATUS_TYPE = STATUS_TYPE;
    return this;
  }

   /**
   * Status type indicating Lead Status (either open or close)
   * @return STATUS_TYPE
  **/
  @ApiModelProperty(example = "null", value = "Status type indicating Lead Status (either open or close)")
  public Integer getSTATUSTYPE() {
    return STATUS_TYPE;
  }

  public void setSTATUSTYPE(Integer STATUS_TYPE) {
    this.STATUS_TYPE = STATUS_TYPE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadStatus leadStatus = (LeadStatus) o;
    return Objects.equals(this.FIELD_ORDER, leadStatus.FIELD_ORDER) &&
        Objects.equals(this.LEAD_STATUS_ID, leadStatus.LEAD_STATUS_ID) &&
        Objects.equals(this.LEAD_STATUS, leadStatus.LEAD_STATUS) &&
        Objects.equals(this.DEFAULT_STATUS, leadStatus.DEFAULT_STATUS) &&
        Objects.equals(this.STATUS_TYPE, leadStatus.STATUS_TYPE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FIELD_ORDER, LEAD_STATUS_ID, LEAD_STATUS, DEFAULT_STATUS, STATUS_TYPE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadStatus {\n");
    
    sb.append("    FIELD_ORDER: ").append(toIndentedString(FIELD_ORDER)).append("\n");
    sb.append("    LEAD_STATUS_ID: ").append(toIndentedString(LEAD_STATUS_ID)).append("\n");
    sb.append("    LEAD_STATUS: ").append(toIndentedString(LEAD_STATUS)).append("\n");
    sb.append("    DEFAULT_STATUS: ").append(toIndentedString(DEFAULT_STATUS)).append("\n");
    sb.append("    STATUS_TYPE: ").append(toIndentedString(STATUS_TYPE)).append("\n");
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

