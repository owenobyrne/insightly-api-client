package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * API object for a link email address.
 */
@ApiModel(description = "API object for a link email address.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APILinkEmailAddress implements Serializable {
  @SerializedName("EMAIL")
  private String EMAIL = null;

  public APILinkEmailAddress EMAIL(String EMAIL) {
    this.EMAIL = EMAIL;
    return this;
  }

   /**
   * Email address.
   * @return EMAIL
  **/
  @ApiModelProperty(example = "null", value = "Email address.")
  public String getEMAIL() {
    return EMAIL;
  }

  public void setEMAIL(String EMAIL) {
    this.EMAIL = EMAIL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APILinkEmailAddress apILinkEmailAddress = (APILinkEmailAddress) o;
    return Objects.equals(this.EMAIL, apILinkEmailAddress.EMAIL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EMAIL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APILinkEmailAddress {\n");
    
    sb.append("    EMAIL: ").append(toIndentedString(EMAIL)).append("\n");
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

