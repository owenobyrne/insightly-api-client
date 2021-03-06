
# APIComment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**COMMENT_ID** | **Long** | Unique ID for the Comment record. |  [optional]
**BODY** | **String** | Text of the Comment. |  [optional]
**OWNER_USER_ID** | **Integer** | User ID of the Owner of the Comment. This is a read-only field. |  [optional]
**NOTE_ID** | **Long** | ID of the note the comment belongs to. |  [optional]
**EMAIL_ID** | **Long** | ID of the email the comment belongs to. |  [optional]
**TASK_ID** | **Long** | ID of the task the comment belongs to. |  [optional]
**DATE_CREATED_UTC** | [**Date**](Date.md) | Date and Time Comment Created as Coordinated Universal Time. |  [optional]
**DATE_UPDATED_UTC** | [**Date**](Date.md) | Date and Time Comment Updated as Coordinated Universal Time. |  [optional]
**CAN_EDIT** | **Boolean** | True, if the user retrieving this record is allowed to edit the record. |  [optional]
**CAN_DELETE** | **Boolean** | True, if the user retrieving this record is allowed to delete the record. |  [optional]



