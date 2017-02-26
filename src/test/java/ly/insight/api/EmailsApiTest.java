package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APIComment;
import ly.insight.model.APIEmailLink;
import ly.insight.model.APITag;
import ly.insight.model.Comment;
import java.util.Date;
import ly.insight.model.Email;
import ly.insight.model.EmailLink;
import ly.insight.model.FileAttachment;
import ly.insight.model.Follow;
import ly.insight.model.Tag;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailsApi
 */
public class EmailsApiTest {

    private final EmailsApi api = new EmailsApi();

    
    /**
     * Adds a Comment to an email.
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
     * Adds an Email Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEmailLinkTest() throws ApiException {
        Long id = null;
        APIEmailLink apiLink = null;
        // EmailLink response = api.addEmailLink(id, apiLink);

        // TODO: test validations
    }
    
    /**
     * Start following an Email
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
     * Adds a Tag for an Email
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
     * Deletes an Email Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEmailLinkTest() throws ApiException {
        Long id = null;
        Long linkId = null;
        // api.deleteEmailLink(id, linkId);

        // TODO: test validations
    }
    
    /**
     * Stop following an Email
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
     * Deletes a Tag from an Email
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
     * Gets an Email&#39;s Comments
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
     * Gets an Email
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailTest() throws ApiException {
        Long id = null;
        // Email response = api.getEmail(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Emails.
     *
     * Simple object graphs (excluding EMAILLINKS, TAGS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailsTest() throws ApiException {
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Email> response = api.getEmails(brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a filtered list of Emails.
     *
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified.             Simple object graphs (excluding EMAILLINKS, TAGS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailsBySearchTest() throws ApiException {
        String emailFrom = null;
        String emailTo = null;
        String tag = null;
        Date updatedAfterUtc = null;
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Email> response = api.getEmailsBySearch(emailFrom, emailTo, tag, updatedAfterUtc, brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets an Email&#39;s File Attachments
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
     * Gets a Follow record for the Email
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
    
}
