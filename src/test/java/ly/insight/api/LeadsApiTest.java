package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APIActivitySetAssignment;
import ly.insight.model.APICustomField;
import ly.insight.model.APILead;
import ly.insight.model.APINote;
import ly.insight.model.APITag;
import ly.insight.model.CalendarEvent;
import ly.insight.model.CustomField;
import java.util.Date;
import ly.insight.model.Email;
import java.io.File;
import ly.insight.model.FileAttachment;
import ly.insight.model.Follow;
import ly.insight.model.Lead;
import ly.insight.model.Note;
import ly.insight.model.Tag;
import ly.insight.model.Task;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LeadsApi
 */
public class LeadsApiTest {

    private final LeadsApi api = new LeadsApi();

    
    /**
     * Adds an Activity Set to a Lead
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addActivitySetAssignmentTest() throws ApiException {
        Long id = null;
        APIActivitySetAssignment apiActivitySetAssignment = null;
        // api.addActivitySetAssignment(id, apiActivitySetAssignment);

        // TODO: test validations
    }
    
    /**
     * Adds a File Attachment to a Lead
     *
     * This endpoint expects multipart/form-data as the request payload. See Stack Overflow for examples of how to generate multipart requests, or see our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is generated. Only one file can be added per request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFileAttachmentTest() throws ApiException {
        Long id = null;
        File file = null;
        String fileName = null;
        String contentType = null;
        Integer fileCategoryId = null;
        // FileAttachment response = api.addFileAttachment(id, file, fileName, contentType, fileCategoryId);

        // TODO: test validations
    }
    
    /**
     * Start following a Lead
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFollowTest() throws ApiException {
        Long id = null;
        // Follow response = api.addFollow(id);

        // TODO: test validations
    }
    
    /**
     * Adds a Lead
     *
     * A common source of problems when creating leads occurs when users omit required fields, or insert             invalid data into a field. A good troubleshooting technique             is to create a few leads via the web interface, with representative data, links, etc, and then access             these leads via the API, and inspect the returned object graph.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLeadTest() throws ApiException {
        APILead apiLead = null;
        // Lead response = api.addLead(apiLead);

        // TODO: test validations
    }
    
    /**
     * Adds a Note to a Lead.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addNoteTest() throws ApiException {
        Long id = null;
        APINote apiNote = null;
        // Note response = api.addNote(id, apiNote);

        // TODO: test validations
    }
    
    /**
     * Adds a Tag for a Lead
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTagTest() throws ApiException {
        Long id = null;
        APITag apiTag = null;
        // Tag response = api.addTag(id, apiTag);

        // TODO: test validations
    }
    
    /**
     * Deletes a Custom Field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomFieldTest() throws ApiException {
        Long id = null;
        String customFieldId = null;
        // api.deleteCustomField(id, customFieldId);

        // TODO: test validations
    }
    
    /**
     * Stop following a Lead
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFollowTest() throws ApiException {
        Long id = null;
        // api.deleteFollow(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a Lead&#39;s Image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteImageTest() throws ApiException {
        Long id = null;
        // api.deleteImage(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a Lead
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLeadTest() throws ApiException {
        Long id = null;
        // api.deleteLead(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a Tag from a Lead
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTagTest() throws ApiException {
        Long id = null;
        String tagName = null;
        // api.deleteTag(id, tagName);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Lead&#39;s Emails
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailsTest() throws ApiException {
        Long id = null;
        Date updatedAfterUtc = null;
        Integer top = null;
        Integer skip = null;
        Boolean brief = null;
        Boolean countTotal = null;
        // List<Email> response = api.getEmails(id, updatedAfterUtc, top, skip, brief, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a Lead&#39;s Events
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsTest() throws ApiException {
        Long id = null;
        Date updatedAfterUtc = null;
        Integer top = null;
        Integer skip = null;
        Boolean brief = null;
        Boolean countTotal = null;
        // List<CalendarEvent> response = api.getEvents(id, updatedAfterUtc, top, skip, brief, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a Lead&#39;s File Attachments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileAttachmentsTest() throws ApiException {
        Long id = null;
        Date updatedAfterUtc = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<FileAttachment> response = api.getFileAttachments(id, updatedAfterUtc, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a Follow record for the Lead
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFollowTest() throws ApiException {
        Long id = null;
        // Follow response = api.getFollow(id);

        // TODO: test validations
    }
    
    /**
     * Gets a Lead&#39;s Image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImageTest() throws ApiException {
        Long id = null;
        // api.getImage(id);

        // TODO: test validations
    }
    
    /**
     * Gets a Lead
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeadTest() throws ApiException {
        Long id = null;
        // Lead response = api.getLead(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Leads.
     *
     * Simple object graphs (excluding Custom Fields, Tags, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeadsTest() throws ApiException {
        Boolean includeConverted = null;
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Lead> response = api.getLeads(includeConverted, brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a filtered list of Leads.
     *
     * Only one optional parameter (excluding include_converted, top, skip and count_total) can be specified. Simple object graphs (excluding Custom Fields, Tags, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeadsBySearchTest() throws ApiException {
        String email = null;
        String tag = null;
        String phoneNumber = null;
        String firstName = null;
        String lastName = null;
        String city = null;
        String state = null;
        String postcode = null;
        String country = null;
        String organisation = null;
        Date updatedAfterUtc = null;
        Boolean includeConverted = null;
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Lead> response = api.getLeadsBySearch(email, tag, phoneNumber, firstName, lastName, city, state, postcode, country, organisation, updatedAfterUtc, includeConverted, brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a Lead&#39;s Notes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesTest() throws ApiException {
        Long id = null;
        Date updatedAfterUtc = null;
        Integer top = null;
        Integer skip = null;
        Boolean brief = null;
        Boolean countTotal = null;
        // List<Note> response = api.getNotes(id, updatedAfterUtc, top, skip, brief, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Lead&#39;s Tasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTasksTest() throws ApiException {
        Long id = null;
        Date updatedAfterUtc = null;
        Integer top = null;
        Integer skip = null;
        Boolean brief = null;
        Boolean countTotal = null;
        // List<Task> response = api.getTasks(id, updatedAfterUtc, top, skip, brief, countTotal);

        // TODO: test validations
    }
    
    /**
     * Updates a Custom Field
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomFieldTest() throws ApiException {
        Long id = null;
        APICustomField apiCustomField = null;
        // CustomField response = api.updateCustomField(id, apiCustomField);

        // TODO: test validations
    }
    
    /**
     * Updates a Lead&#39;s Image
     *
     * This action will replace any existing Image attached to the Lead. The contents of the image file should be sent as binary data in the request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateImageTest() throws ApiException {
        Long id = null;
        String filename = null;
        byte[] file = null;
        // Lead response = api.updateImage(id, filename, file);

        // TODO: test validations
    }
    
    /**
     * Updates a Lead
     *
     * A common source of problems when updating leads occurs when users omit required fields, or insert             invalid data into a field. A good troubleshooting technique             is to create a few leads via the web interface, with representative data, links, etc, and then access             these leads via the API, and inspect the returned object graph.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLeadTest() throws ApiException {
        APILead apiLead = null;
        Boolean brief = null;
        // Lead response = api.updateLead(apiLead, brief);

        // TODO: test validations
    }
    
}
