
# APIActivitySet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ACTIVITYSET_ID** | **Long** | Unique ID for the Activity Set record. |  [optional]
**NAME** | **String** | The name for the Activity Set. |  [optional]
**FOR_CONTACTS** | **Boolean** | Whether or not the Activity Set is assignable to Contacts. |  [optional]
**FOR_ORGANISATIONS** | **Boolean** | Whether or not the Activity Set is assignable to Organisations. |  [optional]
**FOR_OPPORTUNITIES** | **Boolean** | Whether or not the Activity Set is assignable to Opportunities. |  [optional]
**FOR_PROJECTS** | **Boolean** | Whether or not the Activity Set is assignable to Projects. |  [optional]
**FOR_LEADS** | **Boolean** | Whether or not the Activity Set is assignable to Leads. |  [optional]
**OWNER_USER_ID** | **Integer** | The unique ID for the Owner of the Activity.  This is a read-only field. |  [optional]
**ACTIVITIES** | [**List&lt;APIActivity&gt;**](APIActivity.md) | The list of Activities that belong to the Activity Set. |  [optional]



