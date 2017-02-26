package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APICurrency
 */
@ApiModel(description = "APICurrency")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APICurrency implements Serializable {
  @SerializedName("CURRENCY_CODE")
  private String CURRENCY_CODE = null;

  @SerializedName("CURRENCY_SYMBOL")
  private String CURRENCY_SYMBOL = null;

  public APICurrency CURRENCY_CODE(String CURRENCY_CODE) {
    this.CURRENCY_CODE = CURRENCY_CODE;
    return this;
  }

   /**
   * Currency Code
   * @return CURRENCY_CODE
  **/
  @ApiModelProperty(example = "null", value = "Currency Code")
  public String getCURRENCYCODE() {
    return CURRENCY_CODE;
  }

  public void setCURRENCYCODE(String CURRENCY_CODE) {
    this.CURRENCY_CODE = CURRENCY_CODE;
  }

  public APICurrency CURRENCY_SYMBOL(String CURRENCY_SYMBOL) {
    this.CURRENCY_SYMBOL = CURRENCY_SYMBOL;
    return this;
  }

   /**
   * Currency Symbol
   * @return CURRENCY_SYMBOL
  **/
  @ApiModelProperty(example = "null", value = "Currency Symbol")
  public String getCURRENCYSYMBOL() {
    return CURRENCY_SYMBOL;
  }

  public void setCURRENCYSYMBOL(String CURRENCY_SYMBOL) {
    this.CURRENCY_SYMBOL = CURRENCY_SYMBOL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICurrency apICurrency = (APICurrency) o;
    return Objects.equals(this.CURRENCY_CODE, apICurrency.CURRENCY_CODE) &&
        Objects.equals(this.CURRENCY_SYMBOL, apICurrency.CURRENCY_SYMBOL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CURRENCY_CODE, CURRENCY_SYMBOL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICurrency {\n");
    
    sb.append("    CURRENCY_CODE: ").append(toIndentedString(CURRENCY_CODE)).append("\n");
    sb.append("    CURRENCY_SYMBOL: ").append(toIndentedString(CURRENCY_SYMBOL)).append("\n");
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

