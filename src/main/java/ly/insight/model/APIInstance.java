package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * API instance object.
 */
@ApiModel(description = "API instance object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIInstance implements Serializable {
  @SerializedName("INSTANCE_NAME")
  private String INSTANCE_NAME = null;

  @SerializedName("INSTANCE_SUBDOMAIN")
  private String INSTANCE_SUBDOMAIN = null;

  @SerializedName("PLAN_NAME")
  private String PLAN_NAME = null;

  public APIInstance INSTANCE_NAME(String INSTANCE_NAME) {
    this.INSTANCE_NAME = INSTANCE_NAME;
    return this;
  }

   /**
   * Name of your organization
   * @return INSTANCE_NAME
  **/
  @ApiModelProperty(example = "null", value = "Name of your organization")
  public String getINSTANCENAME() {
    return INSTANCE_NAME;
  }

  public void setINSTANCENAME(String INSTANCE_NAME) {
    this.INSTANCE_NAME = INSTANCE_NAME;
  }

  public APIInstance INSTANCE_SUBDOMAIN(String INSTANCE_SUBDOMAIN) {
    this.INSTANCE_SUBDOMAIN = INSTANCE_SUBDOMAIN;
    return this;
  }

   /**
   * Sub domain of the instance
   * @return INSTANCE_SUBDOMAIN
  **/
  @ApiModelProperty(example = "null", value = "Sub domain of the instance")
  public String getINSTANCESUBDOMAIN() {
    return INSTANCE_SUBDOMAIN;
  }

  public void setINSTANCESUBDOMAIN(String INSTANCE_SUBDOMAIN) {
    this.INSTANCE_SUBDOMAIN = INSTANCE_SUBDOMAIN;
  }

  public APIInstance PLAN_NAME(String PLAN_NAME) {
    this.PLAN_NAME = PLAN_NAME;
    return this;
  }

   /**
   * The plan that you have subscribed to
   * @return PLAN_NAME
  **/
  @ApiModelProperty(example = "null", value = "The plan that you have subscribed to")
  public String getPLANNAME() {
    return PLAN_NAME;
  }

  public void setPLANNAME(String PLAN_NAME) {
    this.PLAN_NAME = PLAN_NAME;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIInstance apIInstance = (APIInstance) o;
    return Objects.equals(this.INSTANCE_NAME, apIInstance.INSTANCE_NAME) &&
        Objects.equals(this.INSTANCE_SUBDOMAIN, apIInstance.INSTANCE_SUBDOMAIN) &&
        Objects.equals(this.PLAN_NAME, apIInstance.PLAN_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(INSTANCE_NAME, INSTANCE_SUBDOMAIN, PLAN_NAME);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIInstance {\n");
    
    sb.append("    INSTANCE_NAME: ").append(toIndentedString(INSTANCE_NAME)).append("\n");
    sb.append("    INSTANCE_SUBDOMAIN: ").append(toIndentedString(INSTANCE_SUBDOMAIN)).append("\n");
    sb.append("    PLAN_NAME: ").append(toIndentedString(PLAN_NAME)).append("\n");
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

