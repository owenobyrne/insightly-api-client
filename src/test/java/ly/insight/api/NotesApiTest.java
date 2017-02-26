package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APIComment;
import ly.insight.model.APINote;
import ly.insight.model.APINoteLink;
import ly.insight.model.Comment;
import java.util.Date;
import java.io.File;
import ly.insight.model.FileAttachment;
import ly.insight.model.Follow;
import ly.insight.model.Note;
import ly.insight.model.NoteLink;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotesApi
 */
public class NotesApiTest {

    private final NotesApi api = new NotesApi();

    
    /**
     * Adds a Comment to a Note
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCommentTest() throws ApiException {
        Long id = null;
        APIComment apiComment = null;
        // Comment response = api.addComment(id, apiComment);

        // TODO: test validations
    }
    
    /**
     * Adds a File Attachment to a Note
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
     * Start following a Note
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
     * Adds a Note Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addNoteLinkTest() throws ApiException {
        Long id = null;
        APINoteLink apiLink = null;
        // NoteLink response = api.addNoteLink(id, apiLink);

        // TODO: test validations
    }
    
    /**
     * Stop following a Note
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
     * Deletes a Note
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNoteTest() throws ApiException {
        Long id = null;
        // api.deleteNote(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a Note Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNoteLinkTest() throws ApiException {
        Long id = null;
        Long linkId = null;
        // api.deleteNoteLink(id, linkId);

        // TODO: test validations
    }
    
    /**
     * Gets a Note&#39;s Comments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentsTest() throws ApiException {
        Long id = null;
        Date updatedAfterUtc = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Comment> response = api.getComments(id, updatedAfterUtc, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a Note&#39;s File Attachments
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
     * Gets a Follow record for the Note
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
     * Gets a Note
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteTest() throws ApiException {
        Long id = null;
        // Note response = api.getNote(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Notes.
     *
     * Simple object graphs (excluding NOTELINKS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesTest() throws ApiException {
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Note> response = api.getNotes(brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a filtered list of Notes.
     *
     * Only one optional parameter (excluding top, skip and count_total) can be specified. Simple object graphs (excluding NOTELINKS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesBySearchTest() throws ApiException {
        String title = null;
        Long ownerUserId = null;
        Date updatedAfterUtc = null;
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Note> response = api.getNotesBySearch(title, ownerUserId, updatedAfterUtc, brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Updates a Note
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNoteTest() throws ApiException {
        APINote apiNote = null;
        Boolean brief = null;
        // Note response = api.updateNote(apiNote, brief);

        // TODO: test validations
    }
    
}
