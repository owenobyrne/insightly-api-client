package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APICalendarEvent;
import ly.insight.model.APIEventLink;
import ly.insight.model.CalendarEvent;
import java.util.Date;
import ly.insight.model.EventLink;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    
    /**
     * Adds a Calendar Event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEventTest() throws ApiException {
        APICalendarEvent apiEvent = null;
        // CalendarEvent response = api.addEvent(apiEvent);

        // TODO: test validations
    }
    
    /**
     * Adds an Event Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEventLinkTest() throws ApiException {
        Long id = null;
        APIEventLink apiLink = null;
        // EventLink response = api.addEventLink(id, apiLink);

        // TODO: test validations
    }
    
    /**
     * Deletes a Calendar Event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEventTest() throws ApiException {
        Long id = null;
        // api.deleteEvent(id);

        // TODO: test validations
    }
    
    /**
     * Deletes an Event Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEventLinkTest() throws ApiException {
        Long id = null;
        Long linkId = null;
        // api.deleteEventLink(id, linkId);

        // TODO: test validations
    }
    
    /**
     * Gets a Calendar Event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventTest() throws ApiException {
        Long id = null;
        // CalendarEvent response = api.getEvent(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Calendar Events.
     *
     * Simple object graphs (excluding EVENTLINKS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsTest() throws ApiException {
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<CalendarEvent> response = api.getEvents(brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a filtered list of Calendar Events.
     *
     * Only one optional parameter (excluding top, skip and count_total) can be specified. Simple object graphs (excluding EVENTLINKS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsBySearchTest() throws ApiException {
        String title = null;
        Long ownerUserId = null;
        Date startDateUtc = null;
        Date endDateUtc = null;
        Date updatedAfterUtc = null;
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<CalendarEvent> response = api.getEventsBySearch(title, ownerUserId, startDateUtc, endDateUtc, updatedAfterUtc, brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Updates a Calendar Event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEventTest() throws ApiException {
        APICalendarEvent apiEvent = null;
        Boolean brief = null;
        // CalendarEvent response = api.updateEvent(apiEvent, brief);

        // TODO: test validations
    }
    
}
