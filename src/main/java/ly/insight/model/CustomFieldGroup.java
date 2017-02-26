package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APICustomFieldGroup
 */
@ApiModel(description = "APICustomFieldGroup")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class CustomFieldGroup implements Serializable {
  @SerializedName("GROUP_NAME")
  private String GROUP_NAME = null;

  @SerializedName("GROUP_ORDER")
  private Integer GROUP_ORDER = null;

  @SerializedName("GROUP_ID")
  private Long GROUP_ID = null;

  @SerializedName("GROUP_FOR")
  private String GROUP_FOR = null;

  public CustomFieldGroup GROUP_NAME(String GROUP_NAME) {
    this.GROUP_NAME = GROUP_NAME;
    return this;
  }

   /**
   * Name of the custom field group
   * @return GROUP_NAME
  **/
  @ApiModelProperty(example = "null", value = "Name of the custom field group")
  public String getGROUPNAME() {
    return GROUP_NAME;
  }

  public void setGROUPNAME(String GROUP_NAME) {
    this.GROUP_NAME = GROUP_NAME;
  }

  public CustomFieldGroup GROUP_ORDER(Integer GROUP_ORDER) {
    this.GROUP_ORDER = GROUP_ORDER;
    return this;
  }

   /**
   * The order of the group
   * @return GROUP_ORDER
  **/
  @ApiModelProperty(example = "null", value = "The order of the group")
  public Integer getGROUPORDER() {
    return GROUP_ORDER;
  }

  public void setGROUPORDER(Integer GROUP_ORDER) {
    this.GROUP_ORDER = GROUP_ORDER;
  }

  public CustomFieldGroup GROUP_ID(Long GROUP_ID) {
    this.GROUP_ID = GROUP_ID;
    return this;
  }

   /**
   * Unique ID for the custom field group
   * @return GROUP_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the custom field group")
  public Long getGROUPID() {
    return GROUP_ID;
  }

  public void setGROUPID(Long GROUP_ID) {
    this.GROUP_ID = GROUP_ID;
  }

  public CustomFieldGroup GROUP_FOR(String GROUP_FOR) {
    this.GROUP_FOR = GROUP_FOR;
    return this;
  }

   /**
   * The type of object this group is for: Contact, Organisation, Project or Opportunity
   * @return GROUP_FOR
  **/
  @ApiModelProperty(example = "null", value = "The type of object this group is for: Contact, Organisation, Project or Opportunity")
  public String getGROUPFOR() {
    return GROUP_FOR;
  }

  public void setGROUPFOR(String GROUP_FOR) {
    this.GROUP_FOR = GROUP_FOR;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldGroup customFieldGroup = (CustomFieldGroup) o;
    return Objects.equals(this.GROUP_NAME, customFieldGroup.GROUP_NAME) &&
        Objects.equals(this.GROUP_ORDER, customFieldGroup.GROUP_ORDER) &&
        Objects.equals(this.GROUP_ID, customFieldGroup.GROUP_ID) &&
        Objects.equals(this.GROUP_FOR, customFieldGroup.GROUP_FOR);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GROUP_NAME, GROUP_ORDER, GROUP_ID, GROUP_FOR);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldGroup {\n");
    
    sb.append("    GROUP_NAME: ").append(toIndentedString(GROUP_NAME)).append("\n");
    sb.append("    GROUP_ORDER: ").append(toIndentedString(GROUP_ORDER)).append("\n");
    sb.append("    GROUP_ID: ").append(toIndentedString(GROUP_ID)).append("\n");
    sb.append("    GROUP_FOR: ").append(toIndentedString(GROUP_FOR)).append("\n");
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

