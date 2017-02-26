package ly.insight.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Object Permissions determine if an individual user can read, edit, delete, or create records of a given object type.
 */
@ApiModel(description = "Object Permissions determine if an individual user can read, edit, delete, or create records of a given object type.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-25T14:49:00.293Z")
public class APIObjectPermissions implements Serializable {
  @SerializedName("OBJECT_TYPE")
  private String OBJECT_TYPE = null;

  @SerializedName("PERMISSIONS_STATE")
  private String PERMISSIONS_STATE = null;

  @SerializedName("CAN_READ")
  private Boolean CAN_READ = null;

  @SerializedName("CAN_CREATE")
  private Boolean CAN_CREATE = null;

  @SerializedName("CAN_EDIT")
  private Boolean CAN_EDIT = null;

  @SerializedName("CAN_DELETE")
  private Boolean CAN_DELETE = null;

  public APIObjectPermissions OBJECT_TYPE(String OBJECT_TYPE) {
    this.OBJECT_TYPE = OBJECT_TYPE;
    return this;
  }

   /**
   * The type of object the permissions are for.
   * @return OBJECT_TYPE
  **/
  @ApiModelProperty(example = "null", value = "The type of object the permissions are for.")
  public String getOBJECTTYPE() {
    return OBJECT_TYPE;
  }

  public void setOBJECTTYPE(String OBJECT_TYPE) {
    this.OBJECT_TYPE = OBJECT_TYPE;
  }

  public APIObjectPermissions PERMISSIONS_STATE(String PERMISSIONS_STATE) {
    this.PERMISSIONS_STATE = PERMISSIONS_STATE;
    return this;
  }

   /**
   * A value representing the state of the permissions for a given object type for an individual user.              If access level changes, the value will be re-calculated. This field can be used as quick way to check if               the permissions at an object level have changed.
   * @return PERMISSIONS_STATE
  **/
  @ApiModelProperty(example = "null", value = "A value representing the state of the permissions for a given object type for an individual user.              If access level changes, the value will be re-calculated. This field can be used as quick way to check if               the permissions at an object level have changed.")
  public String getPERMISSIONSSTATE() {
    return PERMISSIONS_STATE;
  }

  public void setPERMISSIONSSTATE(String PERMISSIONS_STATE) {
    this.PERMISSIONS_STATE = PERMISSIONS_STATE;
  }

  public APIObjectPermissions CAN_READ(Boolean CAN_READ) {
    this.CAN_READ = CAN_READ;
    return this;
  }

   /**
   * True, if a user is allowed to read objects of the given type.
   * @return CAN_READ
  **/
  @ApiModelProperty(example = "null", value = "True, if a user is allowed to read objects of the given type.")
  public Boolean getCANREAD() {
    return CAN_READ;
  }

  public void setCANREAD(Boolean CAN_READ) {
    this.CAN_READ = CAN_READ;
  }

  public APIObjectPermissions CAN_CREATE(Boolean CAN_CREATE) {
    this.CAN_CREATE = CAN_CREATE;
    return this;
  }

   /**
   * True, if a user is allowed to create objects of the given type.
   * @return CAN_CREATE
  **/
  @ApiModelProperty(example = "null", value = "True, if a user is allowed to create objects of the given type.")
  public Boolean getCANCREATE() {
    return CAN_CREATE;
  }

  public void setCANCREATE(Boolean CAN_CREATE) {
    this.CAN_CREATE = CAN_CREATE;
  }

  public APIObjectPermissions CAN_EDIT(Boolean CAN_EDIT) {
    this.CAN_EDIT = CAN_EDIT;
    return this;
  }

   /**
   * True, if a user is allowed to edit objects of the given type.
   * @return CAN_EDIT
  **/
  @ApiModelProperty(example = "null", value = "True, if a user is allowed to edit objects of the given type.")
  public Boolean getCANEDIT() {
    return CAN_EDIT;
  }

  public void setCANEDIT(Boolean CAN_EDIT) {
    this.CAN_EDIT = CAN_EDIT;
  }

  public APIObjectPermissions CAN_DELETE(Boolean CAN_DELETE) {
    this.CAN_DELETE = CAN_DELETE;
    return this;
  }

   /**
   * True, if a user is allowed to delete objects of the given type.
   * @return CAN_DELETE
  **/
  @ApiModelProperty(example = "null", value = "True, if a user is allowed to delete objects of the given type.")
  public Boolean getCANDELETE() {
    return CAN_DELETE;
  }

  public void setCANDELETE(Boolean CAN_DELETE) {
    this.CAN_DELETE = CAN_DELETE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIObjectPermissions apIObjectPermissions = (APIObjectPermissions) o;
    return Objects.equals(this.OBJECT_TYPE, apIObjectPermissions.OBJECT_TYPE) &&
        Objects.equals(this.PERMISSIONS_STATE, apIObjectPermissions.PERMISSIONS_STATE) &&
        Objects.equals(this.CAN_READ, apIObjectPermissions.CAN_READ) &&
        Objects.equals(this.CAN_CREATE, apIObjectPermissions.CAN_CREATE) &&
        Objects.equals(this.CAN_EDIT, apIObjectPermissions.CAN_EDIT) &&
        Objects.equals(this.CAN_DELETE, apIObjectPermissions.CAN_DELETE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(OBJECT_TYPE, PERMISSIONS_STATE, CAN_READ, CAN_CREATE, CAN_EDIT, CAN_DELETE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIObjectPermissions {\n");
    
    sb.append("    OBJECT_TYPE: ").append(toIndentedString(OBJECT_TYPE)).append("\n");
    sb.append("    PERMISSIONS_STATE: ").append(toIndentedString(PERMISSIONS_STATE)).append("\n");
    sb.append("    CAN_READ: ").append(toIndentedString(CAN_READ)).append("\n");
    sb.append("    CAN_CREATE: ").append(toIndentedString(CAN_CREATE)).append("\n");
    sb.append("    CAN_EDIT: ").append(toIndentedString(CAN_EDIT)).append("\n");
    sb.append("    CAN_DELETE: ").append(toIndentedString(CAN_DELETE)).append("\n");
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

