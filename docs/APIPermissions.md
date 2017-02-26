
# APIPermissions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PERMISSIONS_STATE** | **String** | A value representing the state of the permissions that may span multiple object types for an individual user.              If access level changes, the value will be re-calculated. This field can be used as quick way to check if               the a user&#39;s Role or Team settings have changed. |  [optional]
**OBJECT_PERMISSIONS** | [**List&lt;APIObjectPermissions&gt;**](APIObjectPermissions.md) | A collection of Object Permissions which determine if an individual user can read, edit, delete, or create records of a given object type. |  [optional]



