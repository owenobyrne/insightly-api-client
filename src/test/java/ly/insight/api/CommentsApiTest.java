package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APIComment;
import ly.insight.model.Comment;
import java.util.Date;
import java.io.File;
import ly.insight.model.FileAttachment;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommentsApi
 */
public class CommentsApiTest {

    private final CommentsApi api = new CommentsApi();

    
    /**
     * Adds a File Attachment to a Comment
     *
     * 
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
     * Deletes a Comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCommentTest() throws ApiException {
        Long id = null;
        // api.deleteComment(id);

        // TODO: test validations
    }
    
    /**
     * Gets a Comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentTest() throws ApiException {
        Long id = null;
        // Comment response = api.getComment(id);

        // TODO: test validations
    }
    
    /**
     * Gets a Comments&#39;s File Attachments
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
     * Updates a Comment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCommentTest() throws ApiException {
        APIComment apiComment = null;
        // Comment response = api.updateComment(apiComment);

        // TODO: test validations
    }
    
}
