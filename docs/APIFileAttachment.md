
# APIFileAttachment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FILE_ID** | **Long** | Unique ID for the File Attachment record |  [optional]
**FILE_NAME** | **String** | The name and extension of the File Attachment | 
**CONTENT_TYPE** | **String** | The MIME type of the File Attachment | 
**FILE_SIZE** | **Long** | The size of the File Attachment, in bytes |  [optional]
**FILE_CATEGORY_ID** | **Long** | The category of the File Attachment, if it has been assigned to one |  [optional]
**OWNER_USER_ID** | **Integer** | The User ID of the File Attachment owner. This is a read-only field. |  [optional]
**DATE_CREATED_UTC** | [**Date**](Date.md) | Date and time File Attachment record created, as Coordinated Universal Time |  [optional]
**DATE_UPDATED_UTC** | [**Date**](Date.md) | Date and time File Attachment record updated, as Coordinated Universal Time |  [optional]
**URL** | **String** | URL of the File Attachment |  [optional]
**CAN_EDIT** | **Boolean** | True, if the user retrieving this record is allowed to edit the record. |  [optional]
**CAN_DELETE** | **Boolean** | True, if the user retrieving this record is allowed to delete the record. |  [optional]



