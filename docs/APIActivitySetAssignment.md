
# APIActivitySetAssignment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ACTIVITYSET_ID** | **Long** | Unique ID for the Activity Set |  [optional]
**START_DATE** | [**Date**](Date.md) | Start Date for the Activity Set |  [optional]
**END_DATE** | [**Date**](Date.md) | End Date for the Activity Set. If activity set contains activities with end date specification then END_DATE is required |  [optional]
**ACTIVITY_ASSIGNMENTS** | [**List&lt;APIActivityAssignment&gt;**](APIActivityAssignment.md) | List of Activity Assignments. Only needed for Task Activities that have not been pre-assigned when configuring the Activity Set. |  [optional]



