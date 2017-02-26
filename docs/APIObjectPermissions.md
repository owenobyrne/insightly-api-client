
# APIObjectPermissions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OBJECT_TYPE** | **String** | The type of object the permissions are for. |  [optional]
**PERMISSIONS_STATE** | **String** | A value representing the state of the permissions for a given object type for an individual user.              If access level changes, the value will be re-calculated. This field can be used as quick way to check if               the permissions at an object level have changed. |  [optional]
**CAN_READ** | **Boolean** | True, if a user is allowed to read objects of the given type. |  [optional]
**CAN_CREATE** | **Boolean** | True, if a user is allowed to create objects of the given type. |  [optional]
**CAN_EDIT** | **Boolean** | True, if a user is allowed to edit objects of the given type. |  [optional]
**CAN_DELETE** | **Boolean** | True, if a user is allowed to delete objects of the given type. |  [optional]



