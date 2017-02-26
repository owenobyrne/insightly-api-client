
# APINote

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NOTE_ID** | **Long** | Unique ID for the Note record |  [optional]
**TITLE** | **String** | Title of the Note (required) | 
**BODY** | **String** | Body of the Note |  [optional]
**LINK_SUBJECT_ID** | **Long** | ID of the Contact, Organisation, Opportunity or Project the Note is linked to | 
**LINK_SUBJECT_TYPE** | **String** | Link subject type: CONTACT, ORGANISATION, OPPORTUNITY or PROJECT | 
**OWNER_USER_ID** | **Integer** | User ID of the Note owner. This is a read-only field. |  [optional]
**DATE_CREATED_UTC** | [**Date**](Date.md) | Date and time Note record created, as Coordinated Universal Time |  [optional]
**DATE_UPDATED_UTC** | [**Date**](Date.md) | Date and time Note record updated, as Coordinated Universal Time |  [optional]
**VISIBLE_TO** | **String** | Visible To: Everyone, Team, Owner or Individuals |  [optional]
**VISIBLE_TEAM_ID** | **Long** | If VISIBLE_TO is &#39;Team&#39;, the TEAM_ID |  [optional]
**VISIBLE_USER_IDS** | **String** | If VISIBLE_TO is &#39;Individuals&#39;, a comma separated list of User IDs |  [optional]
**NOTELINKS** | [**List&lt;APINoteLink&gt;**](APINoteLink.md) | Set of Links attached to the Note |  [optional]
**CAN_EDIT** | **Boolean** | True, if the user retrieving this record is allowed to edit the record. |  [optional]
**CAN_DELETE** | **Boolean** | True, if the user retrieving this record is allowed to delete the record. |  [optional]



