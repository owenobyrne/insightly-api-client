package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APIAddress
 */
@ApiModel(description = "APIAddress")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class Address implements Serializable {
  @SerializedName("CITY")
  private String CITY = null;

  @SerializedName("COUNTRY")
  private String COUNTRY = null;

  @SerializedName("POSTCODE")
  private String POSTCODE = null;

  @SerializedName("ADDRESS_TYPE")
  private String ADDRESS_TYPE = null;

  @SerializedName("STATE")
  private String STATE = null;

  @SerializedName("STREET")
  private String STREET = null;

  @SerializedName("ADDRESS_ID")
  private Long ADDRESS_ID = null;

  public Address CITY(String CITY) {
    this.CITY = CITY;
    return this;
  }

   /**
   * City
   * @return CITY
  **/
  @ApiModelProperty(example = "null", value = "City")
  public String getCITY() {
    return CITY;
  }

  public void setCITY(String CITY) {
    this.CITY = CITY;
  }

  public Address COUNTRY(String COUNTRY) {
    this.COUNTRY = COUNTRY;
    return this;
  }

   /**
   * Country, see Countries resource for options
   * @return COUNTRY
  **/
  @ApiModelProperty(example = "null", value = "Country, see Countries resource for options")
  public String getCOUNTRY() {
    return COUNTRY;
  }

  public void setCOUNTRY(String COUNTRY) {
    this.COUNTRY = COUNTRY;
  }

  public Address POSTCODE(String POSTCODE) {
    this.POSTCODE = POSTCODE;
    return this;
  }

   /**
   * Zip or postal code
   * @return POSTCODE
  **/
  @ApiModelProperty(example = "null", value = "Zip or postal code")
  public String getPOSTCODE() {
    return POSTCODE;
  }

  public void setPOSTCODE(String POSTCODE) {
    this.POSTCODE = POSTCODE;
  }

  public Address ADDRESS_TYPE(String ADDRESS_TYPE) {
    this.ADDRESS_TYPE = ADDRESS_TYPE;
    return this;
  }

   /**
   * Address Type
   * @return ADDRESS_TYPE
  **/
  @ApiModelProperty(example = "null", required = true, value = "Address Type")
  public String getADDRESSTYPE() {
    return ADDRESS_TYPE;
  }

  public void setADDRESSTYPE(String ADDRESS_TYPE) {
    this.ADDRESS_TYPE = ADDRESS_TYPE;
  }

  public Address STATE(String STATE) {
    this.STATE = STATE;
    return this;
  }

   /**
   * State/Province
   * @return STATE
  **/
  @ApiModelProperty(example = "null", value = "State/Province")
  public String getSTATE() {
    return STATE;
  }

  public void setSTATE(String STATE) {
    this.STATE = STATE;
  }

  public Address STREET(String STREET) {
    this.STREET = STREET;
    return this;
  }

   /**
   * Street number and name of address
   * @return STREET
  **/
  @ApiModelProperty(example = "null", value = "Street number and name of address")
  public String getSTREET() {
    return STREET;
  }

  public void setSTREET(String STREET) {
    this.STREET = STREET;
  }

  public Address ADDRESS_ID(Long ADDRESS_ID) {
    this.ADDRESS_ID = ADDRESS_ID;
    return this;
  }

   /**
   * Unique key of the address record
   * @return ADDRESS_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique key of the address record")
  public Long getADDRESSID() {
    return ADDRESS_ID;
  }

  public void setADDRESSID(Long ADDRESS_ID) {
    this.ADDRESS_ID = ADDRESS_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.CITY, address.CITY) &&
        Objects.equals(this.COUNTRY, address.COUNTRY) &&
        Objects.equals(this.POSTCODE, address.POSTCODE) &&
        Objects.equals(this.ADDRESS_TYPE, address.ADDRESS_TYPE) &&
        Objects.equals(this.STATE, address.STATE) &&
        Objects.equals(this.STREET, address.STREET) &&
        Objects.equals(this.ADDRESS_ID, address.ADDRESS_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CITY, COUNTRY, POSTCODE, ADDRESS_TYPE, STATE, STREET, ADDRESS_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    CITY: ").append(toIndentedString(CITY)).append("\n");
    sb.append("    COUNTRY: ").append(toIndentedString(COUNTRY)).append("\n");
    sb.append("    POSTCODE: ").append(toIndentedString(POSTCODE)).append("\n");
    sb.append("    ADDRESS_TYPE: ").append(toIndentedString(ADDRESS_TYPE)).append("\n");
    sb.append("    STATE: ").append(toIndentedString(STATE)).append("\n");
    sb.append("    STREET: ").append(toIndentedString(STREET)).append("\n");
    sb.append("    ADDRESS_ID: ").append(toIndentedString(ADDRESS_ID)).append("\n");
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

