package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APICountry
 */
@ApiModel(description = "APICountry")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APICountry implements Serializable {
  @SerializedName("COUNTRY_NAME")
  private String COUNTRY_NAME = null;

  public APICountry COUNTRY_NAME(String COUNTRY_NAME) {
    this.COUNTRY_NAME = COUNTRY_NAME;
    return this;
  }

   /**
   * Country Name
   * @return COUNTRY_NAME
  **/
  @ApiModelProperty(example = "null", value = "Country Name")
  public String getCOUNTRYNAME() {
    return COUNTRY_NAME;
  }

  public void setCOUNTRYNAME(String COUNTRY_NAME) {
    this.COUNTRY_NAME = COUNTRY_NAME;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICountry apICountry = (APICountry) o;
    return Objects.equals(this.COUNTRY_NAME, apICountry.COUNTRY_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(COUNTRY_NAME);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICountry {\n");
    
    sb.append("    COUNTRY_NAME: ").append(toIndentedString(COUNTRY_NAME)).append("\n");
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

