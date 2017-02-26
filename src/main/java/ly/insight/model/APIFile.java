package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Container for an uploaded file
 */
@ApiModel(description = "Container for an uploaded file")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIFile implements Serializable {
  @SerializedName("FILE_NAME")
  private String FILE_NAME = null;

  @SerializedName("CONTENT_TYPE")
  private String CONTENT_TYPE = null;

  @SerializedName("FILE_CATEGORY_ID")
  private Long FILE_CATEGORY_ID = null;

  public APIFile FILE_NAME(String FILE_NAME) {
    this.FILE_NAME = FILE_NAME;
    return this;
  }

   /**
   * The name and extension of the File Attachment
   * @return FILE_NAME
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name and extension of the File Attachment")
  public String getFILENAME() {
    return FILE_NAME;
  }

  public void setFILENAME(String FILE_NAME) {
    this.FILE_NAME = FILE_NAME;
  }

  public APIFile CONTENT_TYPE(String CONTENT_TYPE) {
    this.CONTENT_TYPE = CONTENT_TYPE;
    return this;
  }

   /**
   * The MIME type of the File Attachment
   * @return CONTENT_TYPE
  **/
  @ApiModelProperty(example = "null", required = true, value = "The MIME type of the File Attachment")
  public String getCONTENTTYPE() {
    return CONTENT_TYPE;
  }

  public void setCONTENTTYPE(String CONTENT_TYPE) {
    this.CONTENT_TYPE = CONTENT_TYPE;
  }

  public APIFile FILE_CATEGORY_ID(Long FILE_CATEGORY_ID) {
    this.FILE_CATEGORY_ID = FILE_CATEGORY_ID;
    return this;
  }

   /**
   * The category of the File Attachment, if it has been assigned to one
   * @return FILE_CATEGORY_ID
  **/
  @ApiModelProperty(example = "null", value = "The category of the File Attachment, if it has been assigned to one")
  public Long getFILECATEGORYID() {
    return FILE_CATEGORY_ID;
  }

  public void setFILECATEGORYID(Long FILE_CATEGORY_ID) {
    this.FILE_CATEGORY_ID = FILE_CATEGORY_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIFile apIFile = (APIFile) o;
    return Objects.equals(this.FILE_NAME, apIFile.FILE_NAME) &&
        Objects.equals(this.CONTENT_TYPE, apIFile.CONTENT_TYPE) &&
        Objects.equals(this.FILE_CATEGORY_ID, apIFile.FILE_CATEGORY_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FILE_NAME, CONTENT_TYPE, FILE_CATEGORY_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIFile {\n");
    
    sb.append("    FILE_NAME: ").append(toIndentedString(FILE_NAME)).append("\n");
    sb.append("    CONTENT_TYPE: ").append(toIndentedString(CONTENT_TYPE)).append("\n");
    sb.append("    FILE_CATEGORY_ID: ").append(toIndentedString(FILE_CATEGORY_ID)).append("\n");
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

