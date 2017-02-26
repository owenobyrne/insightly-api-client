
# APIOrganisation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ORGANISATION_ID** | **Long** | Unique ID for the Organisation record |  [optional]
**ORGANISATION_NAME** | **String** | Name of the Organisation (required) | 
**BACKGROUND** | **String** | Additional background information |  [optional]
**IMAGE_URL** | **String** | URL of the Image for the Organisation |  [optional]
**OWNER_USER_ID** | **Integer** | User ID of the Organisation record owner. This is a read-only field. |  [optional]
**DATE_CREATED_UTC** | [**Date**](Date.md) | Date and time Organisation record created, as Coordinated Universal Time |  [optional]
**DATE_UPDATED_UTC** | [**Date**](Date.md) | Date and time Organisation record updated, as Coordinated Universal Time |  [optional]
**VISIBLE_TO** | **String** | Visible To: Everyone, Owner, Team or Individuals |  [optional]
**VISIBLE_TEAM_ID** | **Long** | If VISIBLE_TO is &#39;Team&#39;, the TEAM_ID |  [optional]
**VISIBLE_USER_IDS** | **String** | If VISIBLE_TO is &#39;Individuals&#39;, a comma separated list of User IDs |  [optional]
**CUSTOMFIELDS** | [**List&lt;APICustomField&gt;**](APICustomField.md) | Set of Custom Fields atttached to the Organisation |  [optional]
**ADDRESSES** | [**List&lt;APIAddress&gt;**](APIAddress.md) | Set of Addresses attached to the Organisation |  [optional]
**CONTACTINFOS** | [**List&lt;APIContactInfo&gt;**](APIContactInfo.md) | Set of Contact Infos attached to the Organisation |  [optional]
**DATES** | [**List&lt;APIOrganisationDate&gt;**](APIOrganisationDate.md) | Set of Dates to Remember attached to the Organisation |  [optional]
**TAGS** | [**List&lt;APITag&gt;**](APITag.md) | Set of Tags attached to the Organisation |  [optional]
**LINKS** | [**List&lt;APILink&gt;**](APILink.md) | Set of Links attached to the Organisation |  [optional]
**ORGANISATIONLINKS** | [**List&lt;APIOrganisationLink&gt;**](APIOrganisationLink.md) | Set of Links to other Organisations attached to the Organisation |  [optional]
**CAN_EDIT** | **Boolean** | True, if the user retrieving this record is allowed to edit the record. |  [optional]
**CAN_DELETE** | **Boolean** | True, if the user retrieving this record is allowed to delete the record. |  [optional]
**SOCIAL_LINKEDIN** | **String** | LinkedIn Profile URL. Pass an empty string to clear the value. |  [optional]
**SOCIAL_FACEBOOK** | **String** | Facebook Profile URL. Pass an empty string to clear the value. |  [optional]
**SOCIAL_TWITTER** | **String** | Twitter Profile URL. Pass an empty string to clear the value. |  [optional]



