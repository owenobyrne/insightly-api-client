package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;

/**
 * APIOrganisationDate
 */
@ApiModel(description = "APIOrganisationDate")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIOrganisationDate implements Serializable {
  @SerializedName("DATE_ID")
  private Long DATE_ID = null;

  @SerializedName("OCCASION_NAME")
  private String OCCASION_NAME = null;

  @SerializedName("OCCASION_DATE")
  private Date OCCASION_DATE = null;

  @SerializedName("REPEAT_YEARLY")
  private Boolean REPEAT_YEARLY = null;

  @SerializedName("CREATE_TASK_YEARLY")
  private Boolean CREATE_TASK_YEARLY = null;

  public APIOrganisationDate DATE_ID(Long DATE_ID) {
    this.DATE_ID = DATE_ID;
    return this;
  }

   /**
   * Unique ID for the Organisation Date record
   * @return DATE_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Organisation Date record")
  public Long getDATEID() {
    return DATE_ID;
  }

  public void setDATEID(Long DATE_ID) {
    this.DATE_ID = DATE_ID;
  }

  public APIOrganisationDate OCCASION_NAME(String OCCASION_NAME) {
    this.OCCASION_NAME = OCCASION_NAME;
    return this;
  }

   /**
   * Occasion Name of the Organisation Date
   * @return OCCASION_NAME
  **/
  @ApiModelProperty(example = "null", value = "Occasion Name of the Organisation Date")
  public String getOCCASIONNAME() {
    return OCCASION_NAME;
  }

  public void setOCCASIONNAME(String OCCASION_NAME) {
    this.OCCASION_NAME = OCCASION_NAME;
  }

  public APIOrganisationDate OCCASION_DATE(Date OCCASION_DATE) {
    this.OCCASION_DATE = OCCASION_DATE;
    return this;
  }

   /**
   * Occasion date, in YYYY-MM-DD HH:MM:SS format
   * @return OCCASION_DATE
  **/
  @ApiModelProperty(example = "null", value = "Occasion date, in YYYY-MM-DD HH:MM:SS format")
  public Date getOCCASIONDATE() {
    return OCCASION_DATE;
  }

  public void setOCCASIONDATE(Date OCCASION_DATE) {
    this.OCCASION_DATE = OCCASION_DATE;
  }

  public APIOrganisationDate REPEAT_YEARLY(Boolean REPEAT_YEARLY) {
    this.REPEAT_YEARLY = REPEAT_YEARLY;
    return this;
  }

   /**
   * True, if Occasion occurs each year
   * @return REPEAT_YEARLY
  **/
  @ApiModelProperty(example = "null", value = "True, if Occasion occurs each year")
  public Boolean getREPEATYEARLY() {
    return REPEAT_YEARLY;
  }

  public void setREPEATYEARLY(Boolean REPEAT_YEARLY) {
    this.REPEAT_YEARLY = REPEAT_YEARLY;
  }

  public APIOrganisationDate CREATE_TASK_YEARLY(Boolean CREATE_TASK_YEARLY) {
    this.CREATE_TASK_YEARLY = CREATE_TASK_YEARLY;
    return this;
  }

   /**
   * True, to create a reminder each year
   * @return CREATE_TASK_YEARLY
  **/
  @ApiModelProperty(example = "null", value = "True, to create a reminder each year")
  public Boolean getCREATETASKYEARLY() {
    return CREATE_TASK_YEARLY;
  }

  public void setCREATETASKYEARLY(Boolean CREATE_TASK_YEARLY) {
    this.CREATE_TASK_YEARLY = CREATE_TASK_YEARLY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIOrganisationDate apIOrganisationDate = (APIOrganisationDate) o;
    return Objects.equals(this.DATE_ID, apIOrganisationDate.DATE_ID) &&
        Objects.equals(this.OCCASION_NAME, apIOrganisationDate.OCCASION_NAME) &&
        Objects.equals(this.OCCASION_DATE, apIOrganisationDate.OCCASION_DATE) &&
        Objects.equals(this.REPEAT_YEARLY, apIOrganisationDate.REPEAT_YEARLY) &&
        Objects.equals(this.CREATE_TASK_YEARLY, apIOrganisationDate.CREATE_TASK_YEARLY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DATE_ID, OCCASION_NAME, OCCASION_DATE, REPEAT_YEARLY, CREATE_TASK_YEARLY);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIOrganisationDate {\n");
    
    sb.append("    DATE_ID: ").append(toIndentedString(DATE_ID)).append("\n");
    sb.append("    OCCASION_NAME: ").append(toIndentedString(OCCASION_NAME)).append("\n");
    sb.append("    OCCASION_DATE: ").append(toIndentedString(OCCASION_DATE)).append("\n");
    sb.append("    REPEAT_YEARLY: ").append(toIndentedString(REPEAT_YEARLY)).append("\n");
    sb.append("    CREATE_TASK_YEARLY: ").append(toIndentedString(CREATE_TASK_YEARLY)).append("\n");
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

