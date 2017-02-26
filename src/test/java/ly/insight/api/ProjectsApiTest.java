package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APIActivitySetAssignment;
import ly.insight.model.APICustomField;
import ly.insight.model.APILink;
import ly.insight.model.APIMilestone;
import ly.insight.model.APINote;
import ly.insight.model.APIPipelineChange;
import ly.insight.model.APIPipelineStageChange;
import ly.insight.model.APIProject;
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
import ly.insight.model.Milestone;
import ly.insight.model.Note;
import ly.insight.model.Project;
import ly.insight.model.Tag;
import ly.insight.model.Task;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    
    /**
     * Adds an Activity Set to a Project
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
     * Adds a File Attachment to a Project
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
     * Start following a Project
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
     * Adds a Link to a project
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
     * Adds a Milestone to a Project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMilestoneTest() throws ApiException {
        Long id = null;
        APIMilestone apiMilestone = null;
        // Milestone response = api.addMilestone(id, apiMilestone);

        // TODO: test validations
    }
    
    /**
     * Adds a Note to a Project.
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
     * Adds a Project
     *
     * A common source of problems when creating projects occurs when users omit required fields, or insert             invalid data into a field (for example by referencing an invalid CATEGORY_ID). A good troubleshooting technique             is to create a few projects via the web interface, with representative data, links, etc, and then access             these projects via the API, and inspect the returned object graph. Also, note: The STAGE_ID and PIPELINE_ID             properties of projects are read-only. (There are separate endpoints to update pipelines/stages.)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addProjectTest() throws ApiException {
        APIProject apiProject = null;
        // Project response = api.addProject(apiProject);

        // TODO: test validations
    }
    
    /**
     * Adds a Tag for a Project
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
     * Stop following a Project
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
     * Deletes a Project&#39;s Image
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
     * Deletes a Link from a project
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
     * Deletes a Milestone from a Project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMilestoneTest() throws ApiException {
        Long id = null;
        Long milestoneId = null;
        // api.deleteMilestone(id, milestoneId);

        // TODO: test validations
    }
    
    /**
     * Clears pipeline for the Project.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePipelineTest() throws ApiException {
        Long id = null;
        // Project response = api.deletePipeline(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a Project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectTest() throws ApiException {
        Long id = null;
        // api.deleteProject(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a Tag from a Project
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
     * Gets a list of Project&#39;s Emails
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
     * Gets a Project&#39;s Events
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
     * Gets a Project&#39;s File Attachments
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
     * Gets a Follow record for the Project
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
     * Gets a Project&#39;s Image
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
     * Gets the email address to use for linking with the Project
     *
     * An email address to use as a maildrop for the Project.
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
     * Gets a list of Milestones for a Project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMilestonesTest() throws ApiException {
        Long id = null;
        // List<Milestone> response = api.getMilestones(id);

        // TODO: test validations
    }
    
    /**
     * Gets a Project&#39;s Notes
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
     * Gets a Project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        Long id = null;
        // Project response = api.getProject(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Projects.
     *
     * Simple object graphs (excluding CUSTOMFIELDS, TAGS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectsTest() throws ApiException {
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Project> response = api.getProjects(brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a filtered list of Projects.
     *
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding CUSTOMFIELDS, TAGS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectsBySearchTest() throws ApiException {
        String tag = null;
        String projectName = null;
        String status = null;
        Long categoryId = null;
        Long pipelineId = null;
        Long stageId = null;
        Long responsibleUserId = null;
        Long ownerUserId = null;
        Date updatedAfterUtc = null;
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Project> response = api.getProjectsBySearch(tag, projectName, status, categoryId, pipelineId, stageId, responsibleUserId, ownerUserId, updatedAfterUtc, brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Project&#39;s Tasks
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
     * Updates a Project&#39;s Image
     *
     * This action will replace any existing Image attached to the Project. Image file contents should be sent as binary data in request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateImageTest() throws ApiException {
        Long id = null;
        String filename = null;
        byte[] file = null;
        // Project response = api.updateImage(id, filename, file);

        // TODO: test validations
    }
    
    /**
     * Updates a Link for a project
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
     * Updates a Milestone for a Project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMilestoneTest() throws ApiException {
        Long id = null;
        APIMilestone apiMilestone = null;
        // Milestone response = api.updateMilestone(id, apiMilestone);

        // TODO: test validations
    }
    
    /**
     * Changes current pipeline for the project.
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
        // Project response = api.updatePipeline(id, apiPipelineChange);

        // TODO: test validations
    }
    
    /**
     * Changes current pipeline stage for the project.
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
        // Project response = api.updatePipelineStage(id, apiStageChange);

        // TODO: test validations
    }
    
    /**
     * Updates a Project
     *
     * A common source of problems when updating projects occurs when users omit required fields, or insert             invalid data into a field (for example by referencing an invalid CATEGORY_ID). A good troubleshooting technique             is to create a few projects via the web interface, with representative data, links, etc, and then access             these projects via the API, and inspect the returned object graph. Also, note: The STAGE_ID and PIPELINE_ID             properties of projects are read-only. (There are separate endpoints to update pipelines/stages.)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProjectTest() throws ApiException {
        APIProject apiProject = null;
        Boolean brief = null;
        // Project response = api.updateProject(apiProject, brief);

        // TODO: test validations
    }
    
}
