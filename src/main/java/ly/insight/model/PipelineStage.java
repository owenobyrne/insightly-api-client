package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * APIPipelineStage
 */
@ApiModel(description = "APIPipelineStage")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class PipelineStage implements Serializable {
  @SerializedName("STAGE_ORDER")
  private Integer STAGE_ORDER = null;

  @SerializedName("STAGE_NAME")
  private String STAGE_NAME = null;

  @SerializedName("ACTIVITYSET_ID")
  private Long ACTIVITYSET_ID = null;

  @SerializedName("OWNER_USER_ID")
  private Integer OWNER_USER_ID = null;

  @SerializedName("PIPELINE_ID")
  private Long PIPELINE_ID = null;

  @SerializedName("STAGE_ID")
  private Long STAGE_ID = null;

  public PipelineStage STAGE_ORDER(Integer STAGE_ORDER) {
    this.STAGE_ORDER = STAGE_ORDER;
    return this;
  }

   /**
   * Order of the Stage in the list of Stages for the Pipeline.
   * @return STAGE_ORDER
  **/
  @ApiModelProperty(example = "null", value = "Order of the Stage in the list of Stages for the Pipeline.")
  public Integer getSTAGEORDER() {
    return STAGE_ORDER;
  }

  public void setSTAGEORDER(Integer STAGE_ORDER) {
    this.STAGE_ORDER = STAGE_ORDER;
  }

  public PipelineStage STAGE_NAME(String STAGE_NAME) {
    this.STAGE_NAME = STAGE_NAME;
    return this;
  }

   /**
   * Name of the Stage.
   * @return STAGE_NAME
  **/
  @ApiModelProperty(example = "null", value = "Name of the Stage.")
  public String getSTAGENAME() {
    return STAGE_NAME;
  }

  public void setSTAGENAME(String STAGE_NAME) {
    this.STAGE_NAME = STAGE_NAME;
  }

  public PipelineStage ACTIVITYSET_ID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
    return this;
  }

   /**
   * Optional ID of the activity set associated with the pipeline stage.
   * @return ACTIVITYSET_ID
  **/
  @ApiModelProperty(example = "null", value = "Optional ID of the activity set associated with the pipeline stage.")
  public Long getACTIVITYSETID() {
    return ACTIVITYSET_ID;
  }

  public void setACTIVITYSETID(Long ACTIVITYSET_ID) {
    this.ACTIVITYSET_ID = ACTIVITYSET_ID;
  }

  public PipelineStage OWNER_USER_ID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
    return this;
  }

   /**
   * User ID of the Pipeline Stage record owner. This is a read-only field.
   * @return OWNER_USER_ID
  **/
  @ApiModelProperty(example = "null", value = "User ID of the Pipeline Stage record owner. This is a read-only field.")
  public Integer getOWNERUSERID() {
    return OWNER_USER_ID;
  }

  public void setOWNERUSERID(Integer OWNER_USER_ID) {
    this.OWNER_USER_ID = OWNER_USER_ID;
  }

  public PipelineStage PIPELINE_ID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
    return this;
  }

   /**
   * Unique ID for the Pipeline the Stage is participates in.
   * @return PIPELINE_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Pipeline the Stage is participates in.")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }

  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  public PipelineStage STAGE_ID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
    return this;
  }

   /**
   * Unique ID for the Stage record.
   * @return STAGE_ID
  **/
  @ApiModelProperty(example = "null", value = "Unique ID for the Stage record.")
  public Long getSTAGEID() {
    return STAGE_ID;
  }

  public void setSTAGEID(Long STAGE_ID) {
    this.STAGE_ID = STAGE_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PipelineStage pipelineStage = (PipelineStage) o;
    return Objects.equals(this.STAGE_ORDER, pipelineStage.STAGE_ORDER) &&
        Objects.equals(this.STAGE_NAME, pipelineStage.STAGE_NAME) &&
        Objects.equals(this.ACTIVITYSET_ID, pipelineStage.ACTIVITYSET_ID) &&
        Objects.equals(this.OWNER_USER_ID, pipelineStage.OWNER_USER_ID) &&
        Objects.equals(this.PIPELINE_ID, pipelineStage.PIPELINE_ID) &&
        Objects.equals(this.STAGE_ID, pipelineStage.STAGE_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(STAGE_ORDER, STAGE_NAME, ACTIVITYSET_ID, OWNER_USER_ID, PIPELINE_ID, STAGE_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PipelineStage {\n");
    
    sb.append("    STAGE_ORDER: ").append(toIndentedString(STAGE_ORDER)).append("\n");
    sb.append("    STAGE_NAME: ").append(toIndentedString(STAGE_NAME)).append("\n");
    sb.append("    ACTIVITYSET_ID: ").append(toIndentedString(ACTIVITYSET_ID)).append("\n");
    sb.append("    OWNER_USER_ID: ").append(toIndentedString(OWNER_USER_ID)).append("\n");
    sb.append("    PIPELINE_ID: ").append(toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    STAGE_ID: ").append(toIndentedString(STAGE_ID)).append("\n");
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

