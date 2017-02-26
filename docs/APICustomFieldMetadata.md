
# APICustomFieldMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CUSTOM_FIELD_ID** | **String** | Unique ID for the custom field record | 
**ORDER_ID** | **Long** | ORDER_ID is required | 
**FIELD_FOR** | **String** | The type of object this custom field is for: Contact, Organisation, Project or Opportunity | 
**FIELD_NAME** | **String** | The name of the custom field | 
**FIELD_TYPE** | **String** | The type of data this custom field holds: text, date or dropdown | 
**FIELD_HELP_TEXT** | **String** | Help text that appears next to the custom field in the UI. |  [optional]
**DEFAULT_VALUE** | **Object** | The default value of the custom field |  [optional]
**GROUP_ID** | **Long** | Unique key of the custom field group |  [optional]
**EDITABLE** | **Boolean** | Whether or not the field is editable |  [optional]
**VISIBLE** | **Boolean** | Whether or not the field is visible |  [optional]
**CUSTOM_FIELD_OPTIONS** | [**List&lt;APICustomFieldOption&gt;**](APICustomFieldOption.md) | A list of option values for a dropdown Custom Field |  [optional]



