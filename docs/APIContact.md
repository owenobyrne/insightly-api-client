
# APIContact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CONTACT_ID** | **Long** | Unique ID for the Contact record |  [optional]
**SALUTATION** | **String** | Salutation |  [optional]
**FIRST_NAME** | **String** | First/Given Name |  [optional]
**LAST_NAME** | **String** | Last/Family/Surname of the Contact |  [optional]
**BACKGROUND** | **String** | Additional background information |  [optional]
**IMAGE_URL** | **String** | URL of the Image for the Contact. |  [optional]
**DEFAULT_LINKED_ORGANISATION** | **Long** | Select an organization defined in the Links field to be marked as default.              If empty, or is not included in Links, or is not a valid ORGANISATION_ID, the first organization link will be set as default. |  [optional]
**OWNER_USER_ID** | **Integer** | User ID of the Contact owner. This is a read-only field. |  [optional]
**DATE_CREATED_UTC** | [**Date**](Date.md) | Date and time Contact record created, as Coordinated Universal Time |  [optional]
**DATE_UPDATED_UTC** | [**Date**](Date.md) | Date and time Contact record updated, as Coordinated Universal Time |  [optional]
**VISIBLE_TO** | **String** | Visible To |  [optional]
**VISIBLE_TEAM_ID** | **Long** | If VISIBLE_TO is &#39;Team&#39;, then this should be a TEAM_ID |  [optional]
**VISIBLE_USER_IDS** | **String** | If VISIBLE_TO is &#39;Individuals, this should be a comma separated list of user IDs |  [optional]
**CUSTOMFIELDS** | [**List&lt;APICustomField&gt;**](APICustomField.md) | Set of custom fields attached to the Contact |  [optional]
**ADDRESSES** | [**List&lt;APIAddress&gt;**](APIAddress.md) | Set of addresses attached to the Contact |  [optional]
**CONTACTINFOS** | [**List&lt;APIContactInfo&gt;**](APIContactInfo.md) | Set of contact infos attached to the Contact |  [optional]
**DATES** | [**List&lt;APIContactDate&gt;**](APIContactDate.md) | Set of dates to remember attached to the Contact |  [optional]
**TAGS** | [**List&lt;APITag&gt;**](APITag.md) | Set of tags attached to the Contact |  [optional]
**LINKS** | [**List&lt;APILink&gt;**](APILink.md) | Set of links attached to the Contact |  [optional]
**CONTACTLINKS** | [**List&lt;APIContactLink&gt;**](APIContactLink.md) | Set of links to other contacts attached to the Contact |  [optional]
**CAN_EDIT** | **Boolean** | True, if the user retrieving this record is allowed to edit the record. |  [optional]
**CAN_DELETE** | **Boolean** | True, if the user retrieving this record is allowed to delete the record. |  [optional]
**SOCIAL_LINKEDIN** | **String** | LinkedIn Profile URL. Pass an empty string to clear the value. |  [optional]
**SOCIAL_FACEBOOK** | **String** | Facebook Profile URL. Pass an empty string to clear the value. |  [optional]
**SOCIAL_TWITTER** | **String** | Twitter Profile URL. Pass an empty string to clear the value. |  [optional]



