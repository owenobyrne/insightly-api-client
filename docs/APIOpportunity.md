
# APIOpportunity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OPPORTUNITY_ID** | **Long** | Unique ID for the Opportunity record |  [optional]
**OPPORTUNITY_NAME** | **String** | Name of the Opportunity |  [optional]
**OPPORTUNITY_DETAILS** | **String** | Opportunity details |  [optional]
**PROBABILITY** | **Integer** | Percentage probability of winning the Opportunity, as an integer value from 0 to 100 |  [optional]
**BID_CURRENCY** | **String** | Three character code for a currency |  [optional]
**BID_AMOUNT** | **Long** | Potential value of the Opportunity, as an integer value |  [optional]
**BID_TYPE** | **String** | Type of bid for the Opportunity: Fixed Bid, Per Hour, Per Day, Per Week, Per Month or Per Year |  [optional]
**BID_DURATION** | **Integer** | Duration of the bid of the Opportunity, if per hour/day/etc as an integer value |  [optional]
**OPPORTUNITY_VALUE** | **Long** | Total value of the Opportunity, calculated based on BID_AMOUNT, BID_TYPE and BID_DURATION. This is a read-only field. |  [optional]
**FORECAST_CLOSE_DATE** | [**Date**](Date.md) | Forecast close date of the Opportunity, in YYYY-MM-DD format |  [optional]
**ACTUAL_CLOSE_DATE** | [**Date**](Date.md) | Actual close date of the Opportunity, in YYYY-MM-DD format |  [optional]
**CATEGORY_ID** | **Long** | The Category ID of the Opportunity, if it has been assigned to one |  [optional]
**PIPELINE_ID** | **Long** | The Pipeline ID that the Opportunity is in, if it has been assigned to one. Note: This is a read-only field, to update the Pipeline please use the /Opportunities/{id}/Pipeline endpoint. |  [optional]
**STAGE_ID** | **Long** | The Stage ID of the Stage that the Opportunity is in, if it has been assigned to one. Note: This is a read-only field, to update the Pipeline Stage please use the /Opportunities/{id}/PipelineStage endpoint. |  [optional]
**OPPORTUNITY_STATE** | **String** | Opportunity State (required): Open, Abandoned, Lost, Suspended, Won | 
**OPPORTUNITY_STATE_REASON_ID** | **Long** | Opportunity State Reason ID. Optional, if specified this field must have a valid State Reason ID. |  [optional]
**IMAGE_URL** | **String** | URL of the Image for the Opportunity |  [optional]
**RESPONSIBLE_USER_ID** | **Integer** | ID of the responsible user for the Opportunity |  [optional]
**OWNER_USER_ID** | **Integer** | User ID of the record owner. This is a read-only field. |  [optional]
**DATE_CREATED_UTC** | [**Date**](Date.md) | Date and time Opportunity record created, as Coordinated Universal Time |  [optional]
**DATE_UPDATED_UTC** | [**Date**](Date.md) | Date and time Opportunity record updated, as Coordinated Universal Time |  [optional]
**VISIBLE_TO** | **String** | Visible To: Everyone, Owner, Team or Individuals |  [optional]
**VISIBLE_TEAM_ID** | **Long** | If VISIBLE_TO is &#39;Team&#39;, the TEAM_ID |  [optional]
**VISIBLE_USER_IDS** | **String** | If VISIBLE_TO is &#39;Individuals&#39;, a comma separated list of User IDs |  [optional]
**CUSTOMFIELDS** | [**List&lt;APICustomField&gt;**](APICustomField.md) | Set of Custom Fields attached to the Opportunity |  [optional]
**TAGS** | [**List&lt;APITag&gt;**](APITag.md) | Set of Tags attached to the Opportunity |  [optional]
**LINKS** | [**List&lt;APILink&gt;**](APILink.md) | Set of Links attached to the Opportunity |  [optional]
**CAN_EDIT** | **Boolean** | True, if the user retrieving this record is allowed to edit the record. |  [optional]
**CAN_DELETE** | **Boolean** | True, if the user retrieving this record is allowed to delete the record. |  [optional]



