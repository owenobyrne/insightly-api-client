package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APIFollow
 */
@ApiModel(description = "APIFollow")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIFollow implements Serializable {
  @SerializedName("FOLLOWING")
  private Boolean FOLLOWING = null;

  public APIFollow FOLLOWING(Boolean FOLLOWING) {
    this.FOLLOWING = FOLLOWING;
    return this;
  }

   /**
   * Whether or not a user is following a Contact, Organisation, Opportunity, or Project.
   * @return FOLLOWING
  **/
  @ApiModelProperty(example = "null", value = "Whether or not a user is following a Contact, Organisation, Opportunity, or Project.")
  public Boolean getFOLLOWING() {
    return FOLLOWING;
  }

  public void setFOLLOWING(Boolean FOLLOWING) {
    this.FOLLOWING = FOLLOWING;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIFollow apIFollow = (APIFollow) o;
    return Objects.equals(this.FOLLOWING, apIFollow.FOLLOWING);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FOLLOWING);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIFollow {\n");
    
    sb.append("    FOLLOWING: ").append(toIndentedString(FOLLOWING)).append("\n");
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

