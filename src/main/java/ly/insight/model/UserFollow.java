package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Information about a followed record.
 */
@ApiModel(description = "Information about a followed record.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class UserFollow implements Serializable {
  @SerializedName("RECORD_TYPE")
  private String RECORD_TYPE = null;

  @SerializedName("RECORD_ID")
  private Long RECORD_ID = null;

  public UserFollow RECORD_TYPE(String RECORD_TYPE) {
    this.RECORD_TYPE = RECORD_TYPE;
    return this;
  }

   /**
   * Type of the followed record. One of the following: EMAIL, NOTE, TASK, CONTACT, ORGANISATION, PROJECT, OPPORTUNITY, LEAD.
   * @return RECORD_TYPE
  **/
  @ApiModelProperty(example = "null", value = "Type of the followed record. One of the following: EMAIL, NOTE, TASK, CONTACT, ORGANISATION, PROJECT, OPPORTUNITY, LEAD.")
  public String getRECORDTYPE() {
    return RECORD_TYPE;
  }

  public void setRECORDTYPE(String RECORD_TYPE) {
    this.RECORD_TYPE = RECORD_TYPE;
  }

  public UserFollow RECORD_ID(Long RECORD_ID) {
    this.RECORD_ID = RECORD_ID;
    return this;
  }

   /**
   * ID of the followed record.
   * @return RECORD_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the followed record.")
  public Long getRECORDID() {
    return RECORD_ID;
  }

  public void setRECORDID(Long RECORD_ID) {
    this.RECORD_ID = RECORD_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFollow userFollow = (UserFollow) o;
    return Objects.equals(this.RECORD_TYPE, userFollow.RECORD_TYPE) &&
        Objects.equals(this.RECORD_ID, userFollow.RECORD_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(RECORD_TYPE, RECORD_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFollow {\n");
    
    sb.append("    RECORD_TYPE: ").append(toIndentedString(RECORD_TYPE)).append("\n");
    sb.append("    RECORD_ID: ").append(toIndentedString(RECORD_ID)).append("\n");
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

