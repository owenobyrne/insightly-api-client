
# APITask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TASK_ID** | **Long** | Unique key of the Task record |  [optional]
**TITLE** | **String** | Title of the Task (required) | 
**CATEGORY_ID** | **Long** | The Category ID of the Task, if it has been assigned to one |  [optional]
**DUE_DATE** | [**Date**](Date.md) | Due date of the Task, in YYYY-MM-DD format |  [optional]
**COMPLETED_DATE_UTC** | [**Date**](Date.md) | Completed Date of the Task, in YYYY-MM-DD format |  [optional]
**PUBLICLY_VISIBLE** | **Boolean** | True, if Task is visible to others | 
**COMPLETED** | **Boolean** | True, if Task has been completed | 
**PROJECT_ID** | **Long** | ID of the project the task is related to, if applicable. Should be a valid PROJECT_ID, if set. |  [optional]
**OPPORTUNITY_ID** | **Long** | ID of the opportunity the task is related to. Can only be set if PROJECT_ID is null. |  [optional]
**MILESTONE_ID** | **Long** | ID of the project milestone the task is related to. Can only be set to a milestone of a project defined by PROJECT_ID. |  [optional]
**PIPELINE_ID** | **Long** | ID of the pipeline the task is related to. Can only be set to a pipeline associated with the related project or opportunity. |  [optional]
**STAGE_ID** | **Long** | ID of the pipeline stage the task is related to. Can only be set to an existing stage of a pipeline associated with related project or opportunity. |  [optional]
**DETAILS** | **String** | Details of the Task |  [optional]
**STATUS** | **String** | Status: Completed, Deferred, In Progress, Not Started, or Waiting |  [optional]
**PRIORITY** | **Integer** | Priority: 1 (Low), 2 (Normal) or 3 (High) |  [optional]
**PERCENT_COMPLETE** | **Integer** | Percentage completion of the Task, integer value from 0 to 100 |  [optional]
**START_DATE** | [**Date**](Date.md) | Start Date of the Task, in YYYY-MM-DD format |  [optional]
**ASSIGNED_BY_USER_ID** | **Integer** | User ID of the User who assigned the Task to another User |  [optional]
**PARENT_TASK_ID** | **Long** | Parent Task ID |  [optional]
**OWNER_VISIBLE** | **Boolean** | Used to determine if owner of assigned task wants to be kept notified of the Task |  [optional]
**RESPONSIBLE_USER_ID** | **Integer** | Responsible User ID |  [optional]
**ASSIGNED_TEAM_ID** | **Long** | ID of the Team which is responsible for the Task |  [optional]
**ASSIGNED_DATE_UTC** | [**Date**](Date.md) | Date when the Task was assigned |  [optional]
**OWNER_USER_ID** | **Integer** | User ID of the Task record owner. This is a read-only field. |  [optional]
**DATE_CREATED_UTC** | [**Date**](Date.md) | Date and time Task record created, as Coordinated Universal Time |  [optional]
**DATE_UPDATED_UTC** | [**Date**](Date.md) | Date and time Task record updated, as Coordinated Universal Time |  [optional]
**REMINDER_DATE_UTC** | [**Date**](Date.md) | Reminder date and time of the Task, as Coordinated Universal Time |  [optional]
**REMINDER_SENT** | **Boolean** | True, if a reminder was sent |  [optional]
**RECURRENCE** | **String** | Recurrence of the task or &#39;None&#39; for the non-recurrent tasks.              Can be one of the following values: None, Daily, Weekday, Weekly, Biweekly, Monthly, Bimontly, Quaterly, Sixmonthly, Yearly. |  [optional]
**TASKLINKS** | [**List&lt;APITaskLink&gt;**](APITaskLink.md) | Set of Links attached to the Task |  [optional]
**CAN_EDIT** | **Boolean** | True, if the user retrieving this record is allowed to edit the record. |  [optional]
**CAN_DELETE** | **Boolean** | True, if the user retrieving this record is allowed to delete the record. |  [optional]



