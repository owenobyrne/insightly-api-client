
# CalendarEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LOCATION** | **String** | Location of the event |  [optional]
**CAN_EDIT** | **Boolean** | True, if the user retrieving this record is allowed to edit the record. |  [optional]
**PUBLICLY_VISIBLE** | **Boolean** | True, if event is visible to others |  [optional]
**START_DATE_UTC** | [**Date**](Date.md) | Start date and time of the event, as Coordinated Universal Time | 
**DETAILS** | **String** | Details of the event |  [optional]
**DATE_UPDATED_UTC** | [**Date**](Date.md) | Date and time event record updated, as Coordinated Universal Time |  [optional]
**CAN_DELETE** | **Boolean** | True, if the user retrieving this record is allowed to delete the record. |  [optional]
**OWNER_USER_ID** | **Integer** | User ID of the event owner (must be a valid user ID). This is a read-only field. |  [optional]
**DATE_CREATED_UTC** | [**Date**](Date.md) | Date and time event record created, as Coordinated Universal Time |  [optional]
**REMINDER_DATE_UTC** | [**Date**](Date.md) | Reminder data and time of the event, as Coordinated Universal Time |  [optional]
**EVENTLINKS** | [**List&lt;APIEventLink&gt;**](APIEventLink.md) | Set of links attached to the Event |  [optional]
**EVENT_ID** | **Long** | Unique ID for event record |  [optional]
**TITLE** | **String** | Name or title of the event (required) | 
**END_DATE_UTC** | [**Date**](Date.md) | End date and time of the event, as Coordinated Universal Time | 
**ALL_DAY** | **Boolean** | True, if event is an all-day event |  [optional]
**REMINDER_SENT** | **Boolean** | True, if a reminder was sent |  [optional]



