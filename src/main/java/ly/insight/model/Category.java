package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APICategory
 */
@ApiModel(description = "APICategory")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class Category implements Serializable {
  @SerializedName("CATEGORY_ID")
  private Long CATEGORY_ID = null;

  @SerializedName("ACTIVE")
  private Boolean ACTIVE = null;

  @SerializedName("CATEGORY_NAME")
  private String CATEGORY_NAME = null;

  @SerializedName("BACKGROUND_COLOR")
  private String BACKGROUND_COLOR = null;

  public Category CATEGORY_ID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
    return this;
  }

   /**
   * Unique ID for the category record
   * @return CATEGORY_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the category record")
  public Long getCATEGORYID() {
    return CATEGORY_ID;
  }

  public void setCATEGORYID(Long CATEGORY_ID) {
    this.CATEGORY_ID = CATEGORY_ID;
  }

  public Category ACTIVE(Boolean ACTIVE) {
    this.ACTIVE = ACTIVE;
    return this;
  }

   /**
   * True, if the Category is active
   * @return ACTIVE
  **/
  @ApiModelProperty(example = "null", value = "True, if the Category is active")
  public Boolean getACTIVE() {
    return ACTIVE;
  }

  public void setACTIVE(Boolean ACTIVE) {
    this.ACTIVE = ACTIVE;
  }

  public Category CATEGORY_NAME(String CATEGORY_NAME) {
    this.CATEGORY_NAME = CATEGORY_NAME;
    return this;
  }

   /**
   * Name of the Category
   * @return CATEGORY_NAME
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name of the Category")
  public String getCATEGORYNAME() {
    return CATEGORY_NAME;
  }

  public void setCATEGORYNAME(String CATEGORY_NAME) {
    this.CATEGORY_NAME = CATEGORY_NAME;
  }

  public Category BACKGROUND_COLOR(String BACKGROUND_COLOR) {
    this.BACKGROUND_COLOR = BACKGROUND_COLOR;
    return this;
  }

   /**
   * The background color that will be displayed in the UI, in hex RGB, e.g. FF4A00 for Insightly orange
   * @return BACKGROUND_COLOR
  **/
  @ApiModelProperty(example = "null", required = true, value = "The background color that will be displayed in the UI, in hex RGB, e.g. FF4A00 for Insightly orange")
  public String getBACKGROUNDCOLOR() {
    return BACKGROUND_COLOR;
  }

  public void setBACKGROUNDCOLOR(String BACKGROUND_COLOR) {
    this.BACKGROUND_COLOR = BACKGROUND_COLOR;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.CATEGORY_ID, category.CATEGORY_ID) &&
        Objects.equals(this.ACTIVE, category.ACTIVE) &&
        Objects.equals(this.CATEGORY_NAME, category.CATEGORY_NAME) &&
        Objects.equals(this.BACKGROUND_COLOR, category.BACKGROUND_COLOR);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CATEGORY_ID, ACTIVE, CATEGORY_NAME, BACKGROUND_COLOR);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    
    sb.append("    CATEGORY_ID: ").append(toIndentedString(CATEGORY_ID)).append("\n");
    sb.append("    ACTIVE: ").append(toIndentedString(ACTIVE)).append("\n");
    sb.append("    CATEGORY_NAME: ").append(toIndentedString(CATEGORY_NAME)).append("\n");
    sb.append("    BACKGROUND_COLOR: ").append(toIndentedString(BACKGROUND_COLOR)).append("\n");
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

