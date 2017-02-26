
# Project

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RESPONSIBLE_USER_ID** | **Integer** | Responsible user ID |  [optional]
**CATEGORY_ID** | **Long** | The Category ID of the Project, if it has been assigned to one. |  [optional]
**VISIBLE_USER_IDS** | **String** | If VISIBLE_TO is &#39;Individuals&#39;, a comma separated list of user IDs |  [optional]
**CAN_EDIT** | **Boolean** | True, if the user retrieving this record is allowed to edit the record. |  [optional]
**STARTED_DATE** | [**Date**](Date.md) | Date Project started, in YYYY-MM-DD format |  [optional]
**DATE_UPDATED_UTC** | [**Date**](Date.md) | Date and time Project record updated, as Coordinated Universal Time |  [optional]
**CAN_DELETE** | **Boolean** | True, if the user retrieving this record is allowed to delete the record. |  [optional]
**LINKS** | [**List&lt;APILink&gt;**](APILink.md) | Set of Links attached to the Project |  [optional]
**OWNER_USER_ID** | **Integer** | User ID of the Project record owner. This is a read-only field. |  [optional]
**PIPELINE_ID** | **Long** | The Pipeline ID that the Project is in, if it has been assigned to one. Note: This is a read-only field, to update the Pipeline please use the /Projects/{id}/Pipeline endpoint. |  [optional]
**CUSTOMFIELDS** | [**List&lt;APICustomField&gt;**](APICustomField.md) | Set of Custom Fields attached to the Project |  [optional]
**PROJECT_NAME** | **String** | Name of the Project (required) | 
**VISIBLE_TEAM_ID** | **Long** | If VISIBLE_TO is &#39;Team&#39;, the TEAM_ID |  [optional]
**VISIBLE_TO** | **String** | Visible To: Everyone, Owner, Team or Individuals |  [optional]
**DATE_CREATED_UTC** | [**Date**](Date.md) | Date and time Project record created, as Coordinated Universal Time |  [optional]
**STATUS** | **String** | Status: Abandoned, Cancelled, Completed, Deferred, In Progress or Not Started | 
**PROJECT_DETAILS** | **String** | Details of the Project |  [optional]
**COMPLETED_DATE** | [**Date**](Date.md) | Date Project completed, in YYYY-MM-DD format |  [optional]
**OPPORTUNITY_ID** | **Long** | Unique ID for the Opportunity from which the Project may have been converted |  [optional]
**STAGE_ID** | **Long** | The Stage ID of the Stage the Project is in, if it has been assigned to one. Note: This is a read-only field, to update the Pipeline Stage please use the /Projects/{id}/PipelineStage endpoint. |  [optional]
**PROJECT_ID** | **Long** | Unique ID for the Project record |  [optional]
**TAGS** | [**List&lt;APITag&gt;**](APITag.md) | Set of Tags attached to the Project |  [optional]
**IMAGE_URL** | **String** | URL of the Image for the Project |  [optional]



