package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.io.Serializable;

/**
 * APIContactDate
 */
@ApiModel(description = "APIContactDate")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class ContactDate implements Serializable {
  @SerializedName("OCCASION_DATE")
  private Date OCCASION_DATE = null;

  @SerializedName("REPEAT_YEARLY")
  private Boolean REPEAT_YEARLY = null;

  @SerializedName("CREATE_TASK_YEARLY")
  private Boolean CREATE_TASK_YEARLY = null;

  @SerializedName("OCCASION_NAME")
  private String OCCASION_NAME = null;

  @SerializedName("DATE_ID")
  private Long DATE_ID = null;

  public ContactDate OCCASION_DATE(Date OCCASION_DATE) {
    this.OCCASION_DATE = OCCASION_DATE;
    return this;
  }

   /**
   * Occasion Date of the Contact Date, in YYYY-MM-DD HH:MM:SS format
   * @return OCCASION_DATE
  **/
  @ApiModelProperty(example = "null", value = "Occasion Date of the Contact Date, in YYYY-MM-DD HH:MM:SS format")
  public Date getOCCASIONDATE() {
    return OCCASION_DATE;
  }

  public void setOCCASIONDATE(Date OCCASION_DATE) {
    this.OCCASION_DATE = OCCASION_DATE;
  }

  public ContactDate REPEAT_YEARLY(Boolean REPEAT_YEARLY) {
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

  public ContactDate CREATE_TASK_YEARLY(Boolean CREATE_TASK_YEARLY) {
    this.CREATE_TASK_YEARLY = CREATE_TASK_YEARLY;
    return this;
  }

   /**
   * True to create a reminder each year
   * @return CREATE_TASK_YEARLY
  **/
  @ApiModelProperty(example = "null", value = "True to create a reminder each year")
  public Boolean getCREATETASKYEARLY() {
    return CREATE_TASK_YEARLY;
  }

  public void setCREATETASKYEARLY(Boolean CREATE_TASK_YEARLY) {
    this.CREATE_TASK_YEARLY = CREATE_TASK_YEARLY;
  }

  public ContactDate OCCASION_NAME(String OCCASION_NAME) {
    this.OCCASION_NAME = OCCASION_NAME;
    return this;
  }

   /**
   * Occasion name of the Contact Date (e.g. Birthday, Hire Date, etc)
   * @return OCCASION_NAME
  **/
  @ApiModelProperty(example = "null", value = "Occasion name of the Contact Date (e.g. Birthday, Hire Date, etc)")
  public String getOCCASIONNAME() {
    return OCCASION_NAME;
  }

  public void setOCCASIONNAME(String OCCASION_NAME) {
    this.OCCASION_NAME = OCCASION_NAME;
  }

  public ContactDate DATE_ID(Long DATE_ID) {
    this.DATE_ID = DATE_ID;
    return this;
  }

   /**
   * Unique ID for the contact date record
   * @return DATE_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the contact date record")
  public Long getDATEID() {
    return DATE_ID;
  }

  public void setDATEID(Long DATE_ID) {
    this.DATE_ID = DATE_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactDate contactDate = (ContactDate) o;
    return Objects.equals(this.OCCASION_DATE, contactDate.OCCASION_DATE) &&
        Objects.equals(this.REPEAT_YEARLY, contactDate.REPEAT_YEARLY) &&
        Objects.equals(this.CREATE_TASK_YEARLY, contactDate.CREATE_TASK_YEARLY) &&
        Objects.equals(this.OCCASION_NAME, contactDate.OCCASION_NAME) &&
        Objects.equals(this.DATE_ID, contactDate.DATE_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(OCCASION_DATE, REPEAT_YEARLY, CREATE_TASK_YEARLY, OCCASION_NAME, DATE_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDate {\n");
    
    sb.append("    OCCASION_DATE: ").append(toIndentedString(OCCASION_DATE)).append("\n");
    sb.append("    REPEAT_YEARLY: ").append(toIndentedString(REPEAT_YEARLY)).append("\n");
    sb.append("    CREATE_TASK_YEARLY: ").append(toIndentedString(CREATE_TASK_YEARLY)).append("\n");
    sb.append("    OCCASION_NAME: ").append(toIndentedString(OCCASION_NAME)).append("\n");
    sb.append("    DATE_ID: ").append(toIndentedString(DATE_ID)).append("\n");
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

