package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APIActivitySetAssignment;
import ly.insight.model.APICustomField;
import ly.insight.model.APILink;
import ly.insight.model.APINote;
import ly.insight.model.APIOpportunity;
import ly.insight.model.APIPipelineChange;
import ly.insight.model.APIPipelineStageChange;
import ly.insight.model.APITag;
import ly.insight.model.CalendarEvent;
import ly.insight.model.CustomField;
import java.util.Date;
import ly.insight.model.Email;
import java.io.File;
import ly.insight.model.FileAttachment;
import ly.insight.model.Follow;
import ly.insight.model.Link;
import ly.insight.model.LinkEmailAddress;
import ly.insight.model.Note;
import ly.insight.model.Opportunity;
import ly.insight.model.OpportunityState;
import ly.insight.model.Tag;
import ly.insight.model.Task;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OpportunitiesApi
 */
public class OpportunitiesApiTest {

    private final OpportunitiesApi api = new OpportunitiesApi();

    
    /**
     * Adds an Activity Set to an Opportunity
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
     * Adds a File Attachment to an Opportunity
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
     * Start following an Opportunity
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
     * Adds a Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLinkTest() throws ApiException {
        Long id = null;
        APILink apiLink = null;
        // Link response = api.addLink(id, apiLink);

        // TODO: test validations
    }
    
    /**
     * Adds a Note to an Opportunity.
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
     * Adds an Opportunity
     *
     * A common source of problems when creating opportunities occurs when users omit required fields, or insert             invalid data into a field (for example by referencing an invalid CATEGORY_ID). A good troubleshooting technique             is to create a few opportunities via the web interface, with representative data, links, etc, and then access             these opportunities via the GET method, and inspect the returned object graph. Also, note: The STAGE_ID and             PIPELINE_ID properties of opportunities are read-only. (There are separate endpoints to update pipelines/stages.)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOpportunityTest() throws ApiException {
        APIOpportunity apiOpportunity = null;
        // Opportunity response = api.addOpportunity(apiOpportunity);

        // TODO: test validations
    }
    
    /**
     * Adds a Tag for an Opportunity
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
     * Stop following an Opportunity
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
     * Deletes an Opportunity&#39;s Image
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
     * Deletes a Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLinkTest() throws ApiException {
        Long id = null;
        Long linkId = null;
        // api.deleteLink(id, linkId);

        // TODO: test validations
    }
    
    /**
     * Deletes an Opportunity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOpportunityTest() throws ApiException {
        Long id = null;
        // api.deleteOpportunity(id);

        // TODO: test validations
    }
    
    /**
     * Clears pipeline for the opportunity.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePipelineTest() throws ApiException {
        Long id = null;
        // Opportunity response = api.deletePipeline(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a Tag from an Opportunity
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
     * Gets a list of Opportunity&#39;s Emails
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
     * Gets an Opportunity&#39;s Events
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
     * Gets an Opportunity&#39;s File Attachments
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
     * Gets a Follow record for the Opportunity
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
     * Gets an Opportunity&#39;s Image
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
     * Gets the email address to use for linking with the opportunity
     *
     * An email address to use as a maildrop for the Opportunity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLinkEmailAddressTest() throws ApiException {
        Long id = null;
        // LinkEmailAddress response = api.getLinkEmailAddress(id);

        // TODO: test validations
    }
    
    /**
     * Gets an Opportunity&#39;s Notes
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
     * Gets a list of Opportunities.
     *
     * Simple object graphs (excluding Custom Fields, Tags, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesTest() throws ApiException {
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Opportunity> response = api.getOpportunities(brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a filtered list of Opportunities.
     *
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding Custom Fields, Tags, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunitiesBySearchTest() throws ApiException {
        String tag = null;
        String opportunityName = null;
        String opportunityState = null;
        Long categoryId = null;
        Long pipelineId = null;
        Long stageId = null;
        Long responsibleUserId = null;
        Long ownerUserId = null;
        Date forecastCloseDate = null;
        Date actualCloseDate = null;
        Date updatedAfterUtc = null;
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Opportunity> response = api.getOpportunitiesBySearch(tag, opportunityName, opportunityState, categoryId, pipelineId, stageId, responsibleUserId, ownerUserId, forecastCloseDate, actualCloseDate, updatedAfterUtc, brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets an Opportunity
     *
     * Returns the Opportunity object&#39;s full graph. Prior to attempting POST and PUT operations,             we recommend using this method to fetch an existing object and make incremental changes to it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunityTest() throws ApiException {
        Long id = null;
        // Opportunity response = api.getOpportunity(id);

        // TODO: test validations
    }
    
    /**
     * Gets the history of States and Reasons for an Opportunity.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStateHistoryTest() throws ApiException {
        Long id = null;
        // List<OpportunityState> response = api.getStateHistory(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Opportunity&#39;s Tasks
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
     * Updates an Opportunity&#39;s Image
     *
     * This action will replace any existing Image attached to the Opportunity. Image file contents should be sent as binary data in request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateImageTest() throws ApiException {
        Long id = null;
        String filename = null;
        byte[] file = null;
        // Opportunity response = api.updateImage(id, filename, file);

        // TODO: test validations
    }
    
    /**
     * Updates a Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLinkTest() throws ApiException {
        Long id = null;
        APILink apiLink = null;
        // Link response = api.updateLink(id, apiLink);

        // TODO: test validations
    }
    
    /**
     * Updates an Opportunity
     *
     * A common source of problems when updating opportunities occurs when users omit required fields, or insert             invalid data into a field (for example by referencing an invalid CATEGORY_ID). A good troubleshooting technique             is to create a few opportunities via the web interface, with representative data, links, etc, and then access             these opportunities via the GET method, and inspect the returned object graph. Also, note: The STAGE_ID and             PIPELINE_ID properties of opportunities are read-only. (There are separate endpoints to update pipelines/stages.)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOpportunityTest() throws ApiException {
        APIOpportunity apiOpportunity = null;
        Boolean brief = null;
        // Opportunity response = api.updateOpportunity(apiOpportunity, brief);

        // TODO: test validations
    }
    
    /**
     * Changes current pipeline for the opportunity.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePipelineTest() throws ApiException {
        Long id = null;
        APIPipelineChange apiPipelineChange = null;
        // Opportunity response = api.updatePipeline(id, apiPipelineChange);

        // TODO: test validations
    }
    
    /**
     * Changes current pipeline stage for the opportunity.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePipelineStageTest() throws ApiException {
        Long id = null;
        APIPipelineStageChange apiStageChange = null;
        // Opportunity response = api.updatePipelineStage(id, apiStageChange);

        // TODO: test validations
    }
    
}
