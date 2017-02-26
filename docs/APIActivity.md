
# APIActivity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ACTIVITY_ID** | **Long** | Unique ID for the Activity |  [optional]
**ACTIVITYSET_ID** | **Long** | Unique ID for the Activity Set record that this Activity belongs to |  [optional]
**ACTIVITY_NAME** | **String** | The name for the Activity |  [optional]
**ACTIVITY_DETAILS** | **String** | The details for the Activity |  [optional]
**ACTIVITY_TYPE** | **String** | The type of Activity |  [optional]
**CATEGORY_ID** | **Long** | The unique ID for the category associated with the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK. |  [optional]
**REMINDER** | **Boolean** | Whether or not a reminder is set on the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK. |  [optional]
**REMINDER_DAYS_BEFORE_DUE** | **Integer** | Number of days before due date of the Activity a reminder will be sent out. Only applicable if the ACTIVITY_TYPE is set to TASK. |  [optional]
**REMINDER_TIME** | **String** | The time when a reminder will be sent out for the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK. |  [optional]
**PUBLICLY_VISIBLE** | **Boolean** | Whether the Activity is publicly visible. |  [optional]
**OWNER_VISIBLE** | **Boolean** | Whether the Activity is visible to the Owner. |  [optional]
**OWNER_USER_ID** | **Integer** | The unique ID for the Owner of the Activity. This is a read-only field. |  [optional]
**RESPONSIBLE_USER_ID** | **Integer** | The unique ID for the Responsible User of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK. |  [optional]
**ASSIGNED_TEAM_ID** | **Long** | The unique ID for the Responsible Team of the Activity. Only applicable if the ACTIVITY_TYPE is set to TASK. |  [optional]
**SKIP_SUN** | **Boolean** | Whether or not to skip scheduling of this Activity on a Sunday. |  [optional]
**SKIP_MON** | **Boolean** | Whether or not to skip scheduling of this Activity on a Monday. |  [optional]
**SKIP_TUE** | **Boolean** | Whether or not to skip scheduling of this Activity on a Tuesday. |  [optional]
**SKIP_WED** | **Boolean** | Whether or not to skip scheduling of this Activity on a Wednesday. |  [optional]
**SKIP_THU** | **Boolean** | Whether or not to skip scheduling of this Activity on a Thursday. |  [optional]
**SKIP_FRI** | **Boolean** | Whether or not to skip scheduling of this Activity on a Friday. |  [optional]
**SKIP_SAT** | **Boolean** | Whether or not to skip scheduling of this Activity on a Saturday. |  [optional]
**DUE_DAYS_AFTER_START** | **Integer** | Determines the due date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to TASK. |  [optional]
**DUE_DAYS_BEFORE_END** | **Integer** | Determines the due date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to TASK. |  [optional]
**EVENT_DAYS_AFTER_START** | **Integer** | Determines the event date based on number of days after the Activity Set is created. Only applicable if the ACTIVITY_TYPE is set to EVENT. |  [optional]
**EVENT_DAYS_BEFORE_END** | **Integer** | Determines the event date based on number of days before the Activity Set ends. Only applicable if the ACTIVITY_TYPE is set to EVENT. |  [optional]
**EVENT_TIME** | **String** | The time of the event. Only applicable if the ACTIVITY_TYPE is set to EVENT. |  [optional]
**ALL_DAY** | **Boolean** | Whether or not the event is an all day event. Only applicable if the ACTIVITY_TYPE is set to EVENT. |  [optional]
**DURATION** | **Integer** | Duration of the event in hours. Only applicable if the ACTIVITY_TYPE is set to EVENT. |  [optional]



