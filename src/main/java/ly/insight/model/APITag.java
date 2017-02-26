package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APITag
 */
@ApiModel(description = "APITag")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APITag implements Serializable {
  @SerializedName("TAG_NAME")
  private String TAG_NAME = null;

  public APITag TAG_NAME(String TAG_NAME) {
    this.TAG_NAME = TAG_NAME;
    return this;
  }

   /**
   * A tag name added to a contact, lead, organisation, opportunity or project
   * @return TAG_NAME
  **/
  @ApiModelProperty(example = "null", value = "A tag name added to a contact, lead, organisation, opportunity or project")
  public String getTAGNAME() {
    return TAG_NAME;
  }

  public void setTAGNAME(String TAG_NAME) {
    this.TAG_NAME = TAG_NAME;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APITag apITag = (APITag) o;
    return Objects.equals(this.TAG_NAME, apITag.TAG_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(TAG_NAME);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APITag {\n");
    
    sb.append("    TAG_NAME: ").append(toIndentedString(TAG_NAME)).append("\n");
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

