
# APIContactInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CONTACT_INFO_ID** | **Long** | Unique key of the Contact Info record |  [optional]
**TYPE** | **String** | Type of Contact Info&lt;br /&gt;              For Contacts, must be &#39;Phone&#39;, &#39;Email&#39;, or &#39;Website&#39;.&lt;br /&gt;              For Organizations, must be &#39;EmailDomain&#39;, &#39;Phone&#39;, &#39;Email&#39; or &#39;Website&#39;. | 
**SUBTYPE** | **String** | Subtype of Contact Info |  [optional]
**LABEL** | **String** | Label&lt;br /&gt;              If TYPE is &#39;Website&#39;, LABEL can be one of the following values: &#39;Work&#39;, &#39;Personal&#39;, &#39;Blog&#39;, or &#39;Other&#39;.&lt;br /&gt;              If TYPE is &#39;Phone&#39;, LABEL can be one of the following values: &#39;Work&#39;, &#39;Mobile&#39;, &#39;Fax&#39;, &#39;Pager&#39;, &#39;Home&#39;, &#39;Skype&#39;, &#39;Y! Messenger&#39; (or &#39;Yahoo&#39;), &#39;SIP&#39;, &#39;Other&#39;.&lt;br /&gt;              If TYPE is &#39;Email&#39;, LABEL can be one of the following values: &#39;Work&#39;, &#39;Personal&#39;, &#39;Other&#39;.&lt;br /&gt;              For Organizations, if TYPE is &#39;EmailDomain&#39;, LABEL should be empty. |  [optional]
**DETAIL** | **String** | Detail of the Contact Info | 



