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
public class APILeadSource implements Serializable {
  @SerializedName("LEAD_SOURCE_ID")
  private Long LEAD_SOURCE_ID = null;

  @SerializedName("LEAD_SOURCE")
  private String LEAD_SOURCE = null;

  @SerializedName("DEFAULT_VALUE")
  private Boolean DEFAULT_VALUE = null;

  @SerializedName("FIELD_ORDER")
  private Integer FIELD_ORDER = null;

  public APILeadSource LEAD_SOURCE_ID(Long LEAD_SOURCE_ID) {
    this.LEAD_SOURCE_ID = LEAD_SOURCE_ID;
    return this;
  }

   /**
   * Unique ID for the current Lead Source
   * @return LEAD_SOURCE_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the current Lead Source")
  public Long getLEADSOURCEID() {
    return LEAD_SOURCE_ID;
  }

  public void setLEADSOURCEID(Long LEAD_SOURCE_ID) {
    this.LEAD_SOURCE_ID = LEAD_SOURCE_ID;
  }

  public APILeadSource LEAD_SOURCE(String LEAD_SOURCE) {
    this.LEAD_SOURCE = LEAD_SOURCE;
    return this;
  }

   /**
   * Lead Source value
   * @return LEAD_SOURCE
  **/
  @ApiModelProperty(example = "null", required = true, value = "Lead Source value")
  public String getLEADSOURCE() {
    return LEAD_SOURCE;
  }

  public void setLEADSOURCE(String LEAD_SOURCE) {
    this.LEAD_SOURCE = LEAD_SOURCE;
  }

  public APILeadSource DEFAULT_VALUE(Boolean DEFAULT_VALUE) {
    this.DEFAULT_VALUE = DEFAULT_VALUE;
    return this;
  }

   /**
   * checks or sets the current Lead source for being the default value
   * @return DEFAULT_VALUE
  **/
  @ApiModelProperty(example = "null", value = "checks or sets the current Lead source for being the default value")
  public Boolean getDEFAULTVALUE() {
    return DEFAULT_VALUE;
  }

  public void setDEFAULTVALUE(Boolean DEFAULT_VALUE) {
    this.DEFAULT_VALUE = DEFAULT_VALUE;
  }

  public APILeadSource FIELD_ORDER(Integer FIELD_ORDER) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APILeadSource apILeadSource = (APILeadSource) o;
    return Objects.equals(this.LEAD_SOURCE_ID, apILeadSource.LEAD_SOURCE_ID) &&
        Objects.equals(this.LEAD_SOURCE, apILeadSource.LEAD_SOURCE) &&
        Objects.equals(this.DEFAULT_VALUE, apILeadSource.DEFAULT_VALUE) &&
        Objects.equals(this.FIELD_ORDER, apILeadSource.FIELD_ORDER);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LEAD_SOURCE_ID, LEAD_SOURCE, DEFAULT_VALUE, FIELD_ORDER);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILeadSource {\n");
    
    sb.append("    LEAD_SOURCE_ID: ").append(toIndentedString(LEAD_SOURCE_ID)).append("\n");
    sb.append("    LEAD_SOURCE: ").append(toIndentedString(LEAD_SOURCE)).append("\n");
    sb.append("    DEFAULT_VALUE: ").append(toIndentedString(DEFAULT_VALUE)).append("\n");
    sb.append("    FIELD_ORDER: ").append(toIndentedString(FIELD_ORDER)).append("\n");
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

