package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APICustomFieldOption
 */
@ApiModel(description = "APICustomFieldOption")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APICustomFieldOption implements Serializable {
  @SerializedName("OPTION_ID")
  private Integer OPTION_ID = null;

  @SerializedName("OPTION_VALUE")
  private String OPTION_VALUE = null;

  @SerializedName("OPTION_DEFAULT")
  private Boolean OPTION_DEFAULT = null;

  public APICustomFieldOption OPTION_ID(Integer OPTION_ID) {
    this.OPTION_ID = OPTION_ID;
    return this;
  }

   /**
   * The unique id of the option
   * @return OPTION_ID
  **/
  @ApiModelProperty(example = "null", value = "The unique id of the option")
  public Integer getOPTIONID() {
    return OPTION_ID;
  }

  public void setOPTIONID(Integer OPTION_ID) {
    this.OPTION_ID = OPTION_ID;
  }

  public APICustomFieldOption OPTION_VALUE(String OPTION_VALUE) {
    this.OPTION_VALUE = OPTION_VALUE;
    return this;
  }

   /**
   * An option value for a dropdown Custom Field
   * @return OPTION_VALUE
  **/
  @ApiModelProperty(example = "null", required = true, value = "An option value for a dropdown Custom Field")
  public String getOPTIONVALUE() {
    return OPTION_VALUE;
  }

  public void setOPTIONVALUE(String OPTION_VALUE) {
    this.OPTION_VALUE = OPTION_VALUE;
  }

  public APICustomFieldOption OPTION_DEFAULT(Boolean OPTION_DEFAULT) {
    this.OPTION_DEFAULT = OPTION_DEFAULT;
    return this;
  }

   /**
   * True, if the option value should be the default
   * @return OPTION_DEFAULT
  **/
  @ApiModelProperty(example = "null", required = true, value = "True, if the option value should be the default")
  public Boolean getOPTIONDEFAULT() {
    return OPTION_DEFAULT;
  }

  public void setOPTIONDEFAULT(Boolean OPTION_DEFAULT) {
    this.OPTION_DEFAULT = OPTION_DEFAULT;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICustomFieldOption apICustomFieldOption = (APICustomFieldOption) o;
    return Objects.equals(this.OPTION_ID, apICustomFieldOption.OPTION_ID) &&
        Objects.equals(this.OPTION_VALUE, apICustomFieldOption.OPTION_VALUE) &&
        Objects.equals(this.OPTION_DEFAULT, apICustomFieldOption.OPTION_DEFAULT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(OPTION_ID, OPTION_VALUE, OPTION_DEFAULT);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICustomFieldOption {\n");
    
    sb.append("    OPTION_ID: ").append(toIndentedString(OPTION_ID)).append("\n");
    sb.append("    OPTION_VALUE: ").append(toIndentedString(OPTION_VALUE)).append("\n");
    sb.append("    OPTION_DEFAULT: ").append(toIndentedString(OPTION_DEFAULT)).append("\n");
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

