package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import ly.insight.model.APIObjectPermissions;
import java.io.Serializable;

/**
 * Permissions determine if an individual user can read, edit, delete, or create records of a given object type.
 */
@ApiModel(description = "Permissions determine if an individual user can read, edit, delete, or create records of a given object type.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIPermissions implements Serializable {
  @SerializedName("PERMISSIONS_STATE")
  private String PERMISSIONS_STATE = null;

  @SerializedName("OBJECT_PERMISSIONS")
  private List<APIObjectPermissions> OBJECT_PERMISSIONS = new ArrayList<APIObjectPermissions>();

  public APIPermissions PERMISSIONS_STATE(String PERMISSIONS_STATE) {
    this.PERMISSIONS_STATE = PERMISSIONS_STATE;
    return this;
  }

   /**
   * A value representing the state of the permissions that may span multiple object types for an individual user.              If access level changes, the value will be re-calculated. This field can be used as quick way to check if               the a user's Role or Team settings have changed.
   * @return PERMISSIONS_STATE
  **/
  @ApiModelProperty(example = "null", value = "A value representing the state of the permissions that may span multiple object types for an individual user.              If access level changes, the value will be re-calculated. This field can be used as quick way to check if               the a user's Role or Team settings have changed.")
  public String getPERMISSIONSSTATE() {
    return PERMISSIONS_STATE;
  }

  public void setPERMISSIONSSTATE(String PERMISSIONS_STATE) {
    this.PERMISSIONS_STATE = PERMISSIONS_STATE;
  }

  public APIPermissions OBJECT_PERMISSIONS(List<APIObjectPermissions> OBJECT_PERMISSIONS) {
    this.OBJECT_PERMISSIONS = OBJECT_PERMISSIONS;
    return this;
  }

  public APIPermissions addOBJECTPERMISSIONSItem(APIObjectPermissions OBJECT_PERMISSIONSItem) {
    this.OBJECT_PERMISSIONS.add(OBJECT_PERMISSIONSItem);
    return this;
  }

   /**
   * A collection of Object Permissions which determine if an individual user can read, edit, delete, or create records of a given object type.
   * @return OBJECT_PERMISSIONS
  **/
  @ApiModelProperty(example = "null", value = "A collection of Object Permissions which determine if an individual user can read, edit, delete, or create records of a given object type.")
  public List<APIObjectPermissions> getOBJECTPERMISSIONS() {
    return OBJECT_PERMISSIONS;
  }

  public void setOBJECTPERMISSIONS(List<APIObjectPermissions> OBJECT_PERMISSIONS) {
    this.OBJECT_PERMISSIONS = OBJECT_PERMISSIONS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIPermissions apIPermissions = (APIPermissions) o;
    return Objects.equals(this.PERMISSIONS_STATE, apIPermissions.PERMISSIONS_STATE) &&
        Objects.equals(this.OBJECT_PERMISSIONS, apIPermissions.OBJECT_PERMISSIONS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PERMISSIONS_STATE, OBJECT_PERMISSIONS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIPermissions {\n");
    
    sb.append("    PERMISSIONS_STATE: ").append(toIndentedString(PERMISSIONS_STATE)).append("\n");
    sb.append("    OBJECT_PERMISSIONS: ").append(toIndentedString(OBJECT_PERMISSIONS)).append("\n");
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

