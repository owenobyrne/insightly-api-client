package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APICustomField
 */
@ApiModel(description = "APICustomField")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class CustomField implements Serializable {
  @SerializedName("CUSTOM_FIELD_ID")
  private String CUSTOM_FIELD_ID = null;

  @SerializedName("FIELD_VALUE")
  private Object FIELD_VALUE = null;

  public CustomField CUSTOM_FIELD_ID(String CUSTOM_FIELD_ID) {
    this.CUSTOM_FIELD_ID = CUSTOM_FIELD_ID;
    return this;
  }

   /**
   * The unique id of the custom field
   * @return CUSTOM_FIELD_ID
  **/
  @ApiModelProperty(example = "null", value = "The unique id of the custom field")
  public String getCUSTOMFIELDID() {
    return CUSTOM_FIELD_ID;
  }

  public void setCUSTOMFIELDID(String CUSTOM_FIELD_ID) {
    this.CUSTOM_FIELD_ID = CUSTOM_FIELD_ID;
  }

  public CustomField FIELD_VALUE(Object FIELD_VALUE) {
    this.FIELD_VALUE = FIELD_VALUE;
    return this;
  }

   /**
   * Text, multi-line text, bit, dropdown, date value, numeric value or URL for the Custom Field.
   * @return FIELD_VALUE
  **/
  @ApiModelProperty(example = "null", value = "Text, multi-line text, bit, dropdown, date value, numeric value or URL for the Custom Field.")
  public Object getFIELDVALUE() {
    return FIELD_VALUE;
  }

  public void setFIELDVALUE(Object FIELD_VALUE) {
    this.FIELD_VALUE = FIELD_VALUE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomField customField = (CustomField) o;
    return Objects.equals(this.CUSTOM_FIELD_ID, customField.CUSTOM_FIELD_ID) &&
        Objects.equals(this.FIELD_VALUE, customField.FIELD_VALUE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_FIELD_ID, FIELD_VALUE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomField {\n");
    
    sb.append("    CUSTOM_FIELD_ID: ").append(toIndentedString(CUSTOM_FIELD_ID)).append("\n");
    sb.append("    FIELD_VALUE: ").append(toIndentedString(FIELD_VALUE)).append("\n");
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

