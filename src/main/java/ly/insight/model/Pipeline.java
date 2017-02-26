package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APIPipeline
 */
@ApiModel(description = "APIPipeline")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class Pipeline implements Serializable {
  @SerializedName("FOR_PROJECTS")
  private Boolean FOR_PROJECTS = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("PIPELINE_ID")
  private Long PIPELINE_ID = null;

  @SerializedName("FOR_OPPORTUNITIES")
  private Boolean FOR_OPPORTUNITIES = null;

  @SerializedName("PIPELINE_NAME")
  private String PIPELINE_NAME = null;

  public Pipeline FOR_PROJECTS(Boolean FOR_PROJECTS) {
    this.FOR_PROJECTS = FOR_PROJECTS;
    return this;
  }

   /**
   * True if the Pipeline is available for Project records.
   * @return FOR_PROJECTS
  **/
  @ApiModelProperty(example = "null", value = "True if the Pipeline is available for Project records.")
  public Boolean getFORPROJECTS() {
    return FOR_PROJECTS;
  }

  public void setFORPROJECTS(Boolean FOR_PROJECTS) {
    this.FOR_PROJECTS = FOR_PROJECTS;
  }

  public Pipeline OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * User ID of the Pipeline record owner. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "User ID of the Pipeline record owner. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public Pipeline PIPELINE_ID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
    return this;
  }

   /**
   * Unique ID for the Pipeline record.
   * @return PIPELINE_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Pipeline record.")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }

  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  public Pipeline FOR_OPPORTUNITIES(Boolean FOR_OPPORTUNITIES) {
    this.FOR_OPPORTUNITIES = FOR_OPPORTUNITIES;
    return this;
  }

   /**
   * True if the Pipeline is available for Opportunity records.
   * @return FOR_OPPORTUNITIES
  **/
  @ApiModelProperty(example = "null", value = "True if the Pipeline is available for Opportunity records.")
  public Boolean getFOROPPORTUNITIES() {
    return FOR_OPPORTUNITIES;
  }

  public void setFOROPPORTUNITIES(Boolean FOR_OPPORTUNITIES) {
    this.FOR_OPPORTUNITIES = FOR_OPPORTUNITIES;
  }

  public Pipeline PIPELINE_NAME(String PIPELINE_NAME) {
    this.PIPELINE_NAME = PIPELINE_NAME;
    return this;
  }

   /**
   * Name of the Pipeline.
   * @return PIPELINE_NAME
  **/
  @ApiModelProperty(example = "null", value = "Name of the Pipeline.")
  public String getPIPELINENAME() {
    return PIPELINE_NAME;
  }

  public void setPIPELINENAME(String PIPELINE_NAME) {
    this.PIPELINE_NAME = PIPELINE_NAME;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pipeline pipeline = (Pipeline) o;
    return Objects.equals(this.FOR_PROJECTS, pipeline.FOR_PROJECTS) &&
        Objects.equals(this.OWNER_USER_ID, pipeline.OWNER_USER_ID) &&
        Objects.equals(this.PIPELINE_ID, pipeline.PIPELINE_ID) &&
        Objects.equals(this.FOR_OPPORTUNITIES, pipeline.FOR_OPPORTUNITIES) &&
        Objects.equals(this.PIPELINE_NAME, pipeline.PIPELINE_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FOR_PROJECTS, OWNER_USER_ID, PIPELINE_ID, FOR_OPPORTUNITIES, PIPELINE_NAME);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pipeline {\n");
    
    sb.append("    FOR_PROJECTS: ").append(toIndentedString(FOR_PROJECTS)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    PIPELINE_ID: ").append(toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    FOR_OPPORTUNITIES: ").append(toIndentedString(FOR_OPPORTUNITIES)).append("\n");
    sb.append("    PIPELINE_NAME: ").append(toIndentedString(PIPELINE_NAME)).append("\n");
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

