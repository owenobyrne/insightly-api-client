package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ly.insight.model.APIPipelineStageChange;
import java.io.Serializable;

/**
 * Pipeline change api object.
 */
@ApiModel(description = "Pipeline change api object.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIPipelineChange implements Serializable {
  @SerializedName("PIPELINE_ID")
  private Long PIPELINE_ID = null;

  @SerializedName("PIPELINE_STAGE_CHANGE")
  private APIPipelineStageChange PIPELINE_STAGE_CHANGE = null;

  public APIPipelineChange PIPELINE_ID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
    return this;
  }

   /**
   * ID of the new pipeline.
   * @return PIPELINE_ID
  **/
  @ApiModelProperty(example = "null", value = "ID of the new pipeline.")
  public Long getPIPELINEID() {
    return PIPELINE_ID;
  }

  public void setPIPELINEID(Long PIPELINE_ID) {
    this.PIPELINE_ID = PIPELINE_ID;
  }

  public APIPipelineChange PIPELINE_STAGE_CHANGE(APIPipelineStageChange PIPELINE_STAGE_CHANGE) {
    this.PIPELINE_STAGE_CHANGE = PIPELINE_STAGE_CHANGE;
    return this;
  }

   /**
   * Initial stage of the pipeline.
   * @return PIPELINE_STAGE_CHANGE
  **/
  @ApiModelProperty(example = "null", value = "Initial stage of the pipeline.")
  public APIPipelineStageChange getPIPELINESTAGECHANGE() {
    return PIPELINE_STAGE_CHANGE;
  }

  public void setPIPELINESTAGECHANGE(APIPipelineStageChange PIPELINE_STAGE_CHANGE) {
    this.PIPELINE_STAGE_CHANGE = PIPELINE_STAGE_CHANGE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIPipelineChange apIPipelineChange = (APIPipelineChange) o;
    return Objects.equals(this.PIPELINE_ID, apIPipelineChange.PIPELINE_ID) &&
        Objects.equals(this.PIPELINE_STAGE_CHANGE, apIPipelineChange.PIPELINE_STAGE_CHANGE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PIPELINE_ID, PIPELINE_STAGE_CHANGE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIPipelineChange {\n");
    
    sb.append("    PIPELINE_ID: ").append(toIndentedString(PIPELINE_ID)).append("\n");
    sb.append("    PIPELINE_STAGE_CHANGE: ").append(toIndentedString(PIPELINE_STAGE_CHANGE)).append("\n");
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

