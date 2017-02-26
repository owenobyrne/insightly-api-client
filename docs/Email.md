
# Email

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VISIBLE_USER_IDS** | **String** | If VISIBLE_TO is &#39;Individuals&#39;, a comma separated list of user IDs |  [optional]
**CAN_EDIT** | **Boolean** | True, if the user retrieving this record is allowed to edit the record. |  [optional]
**FORMAT** | **String** | Format of the email: text or html |  [optional]
**EMAIL_CC** | **String** | CC addresses of the email |  [optional]
**SIZE** | **Long** | The size of the email, in bytes |  [optional]
**CAN_DELETE** | **Boolean** | True, if the user retrieving this record is allowed to delete the record. |  [optional]
**EMAILLINKS** | [**List&lt;APIEmailLink&gt;**](APIEmailLink.md) | Set of links attached to the Email |  [optional]
**OWNER_USER_ID** | **Integer** | Insightly User ID of the email owner. This is a read-only field. |  [optional]
**GMAIL_MESSAGE_ID** | **String** | Unique key of the Gmail message |  [optional]
**EMAIL_FROM** | **String** | From address of the email |  [optional]
**VISIBLE_TEAM_ID** | **Long** | If VISIBLE_TO is &#39;Team&#39;, the TEAM_ID |  [optional]
**VISIBLE_TO** | **String** | Visible To: Everyone, Owner, Team or Individuals |  [optional]
**DATE_CREATED_UTC** | [**Date**](Date.md) | Date and time Email record created, as Coordinated Universal Time |  [optional]
**SUBJECT** | **String** | Subject of the Email |  [optional]
**EMAIL_ID** | **Long** | Unique ID for the email record |  [optional]
**EMAIL_TO** | **String** | To addresses of the email |  [optional]
**BODY** | **String** | The body of the Email. This field is empty on list requests. |  [optional]
**BODY_EXTRACT** | **String** | An extract of the Email body. |  [optional]
**TAGS** | [**List&lt;APITag&gt;**](APITag.md) | Set of tags attached to the Email |  [optional]
**EMAIL_DATE_UTC** | [**Date**](Date.md) | Date and time email sent, as Coordinated Universal Time |  [optional]



