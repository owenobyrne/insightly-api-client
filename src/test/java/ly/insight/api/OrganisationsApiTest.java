package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APIActivitySetAssignment;
import ly.insight.model.APIAddress;
import ly.insight.model.APIContactInfo;
import ly.insight.model.APICustomField;
import ly.insight.model.APILink;
import ly.insight.model.APINote;
import ly.insight.model.APIOrganisation;
import ly.insight.model.APIOrganisationDate;
import ly.insight.model.APIOrganisationLink;
import ly.insight.model.APITag;
import ly.insight.model.Address;
import ly.insight.model.CalendarEvent;
import ly.insight.model.ContactInfo;
import ly.insight.model.CustomField;
import java.util.Date;
import ly.insight.model.Email;
import java.io.File;
import ly.insight.model.FileAttachment;
import ly.insight.model.Follow;
import ly.insight.model.Link;
import ly.insight.model.Note;
import ly.insight.model.Organisation;
import ly.insight.model.OrganisationDate;
import ly.insight.model.OrganisationLink;
import ly.insight.model.Tag;
import ly.insight.model.Task;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganisationsApi
 */
public class OrganisationsApiTest {

    private final OrganisationsApi api = new OrganisationsApi();

    
    /**
     * Adds an Activity Set to an Organisation
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
     * Adds an Address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAddressTest() throws ApiException {
        Long id = null;
        APIAddress apiAddress = null;
        // Address response = api.addAddress(id, apiAddress);

        // TODO: test validations
    }
    
    /**
     * Adds a Contact Info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addContactInfoTest() throws ApiException {
        Long id = null;
        APIContactInfo apiContactInfo = null;
        // ContactInfo response = api.addContactInfo(id, apiContactInfo);

        // TODO: test validations
    }
    
    /**
     * Adds an Organisation Date
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDateTest() throws ApiException {
        Long id = null;
        APIOrganisationDate apiDate = null;
        // OrganisationDate response = api.addDate(id, apiDate);

        // TODO: test validations
    }
    
    /**
     * Adds a File Attachment to an Organisation
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
     * Start following an Organisation
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
     * Adds a Note to an Organisation
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
     * Adds an Organisation
     *
     * If you have trouble with creating an organisation, try creating organisations via the web interface, and then access those organisations via the API. This way you            can see examples of the fields and sub-elements attached to the object. A common source of problems during write/update request is caused when users omit            required fields, or insert invalid data in a field (e.g. reference a CATEGORY_ID that does not exist in the user&#39;s Insightly instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrganisationTest() throws ApiException {
        APIOrganisation apiOrganisation = null;
        // Organisation response = api.addOrganisation(apiOrganisation);

        // TODO: test validations
    }
    
    /**
     * Adds an Organisation Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOrganisationLinkTest() throws ApiException {
        Long id = null;
        APIOrganisationLink apiLink = null;
        // OrganisationLink response = api.addOrganisationLink(id, apiLink);

        // TODO: test validations
    }
    
    /**
     * Adds a Tag
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
     * Deletes an Address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAddressTest() throws ApiException {
        Long id = null;
        Long addressId = null;
        // api.deleteAddress(id, addressId);

        // TODO: test validations
    }
    
    /**
     * Deletes a Contact Info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteContactInfoTest() throws ApiException {
        Long id = null;
        Long contactInfoId = null;
        // api.deleteContactInfo(id, contactInfoId);

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
     * Deletes an Organisation Date
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDateTest() throws ApiException {
        Long id = null;
        Long dateId = null;
        // api.deleteDate(id, dateId);

        // TODO: test validations
    }
    
    /**
     * Stop following an Organisation
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
     * Deletes an Organisation&#39;s Image
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
     * Deletes an Organisation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrganisationTest() throws ApiException {
        Long id = null;
        // api.deleteOrganisation(id);

        // TODO: test validations
    }
    
    /**
     * Deletes an Organisation Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrganisationLinkTest() throws ApiException {
        Long id = null;
        Long linkId = null;
        // api.deleteOrganisationLink(id, linkId);

        // TODO: test validations
    }
    
    /**
     * Deletes a Tag
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
     * Gets a list of Organisation&#39;s Emails
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
     * Gets an Organisation&#39;s Events
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
     * Gets an Organisation&#39;s File Attachments
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
     * Gets a Follow record for the Organisation
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
     * Gets an Organisations&#39;s Image
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
     * Gets an Organisation&#39;s Notes
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
     * Gets an Organisation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganisationTest() throws ApiException {
        Long id = null;
        // Organisation response = api.getOrganisation(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Organisations.
     *
     * Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganisationsTest() throws ApiException {
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Organisation> response = api.getOrganisations(brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a filtered list of Organisations.
     *
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganisationsBySearchTest() throws ApiException {
        String email = null;
        String emailDomain = null;
        String tag = null;
        String phoneNumber = null;
        String organisationName = null;
        String city = null;
        String state = null;
        String postcode = null;
        String country = null;
        Date updatedAfterUtc = null;
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Organisation> response = api.getOrganisationsBySearch(email, emailDomain, tag, phoneNumber, organisationName, city, state, postcode, country, updatedAfterUtc, brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Organisation&#39;s Tasks
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
     * Updates an Address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAddressTest() throws ApiException {
        Long id = null;
        APIAddress apiAddress = null;
        // Address response = api.updateAddress(id, apiAddress);

        // TODO: test validations
    }
    
    /**
     * Updates a Contact Info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateContactInfoTest() throws ApiException {
        Long id = null;
        APIContactInfo apiContactInfo = null;
        // ContactInfo response = api.updateContactInfo(id, apiContactInfo);

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
     * Updates an Organisation Date
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDateTest() throws ApiException {
        Long id = null;
        APIOrganisationDate apiDate = null;
        // OrganisationDate response = api.updateDate(id, apiDate);

        // TODO: test validations
    }
    
    /**
     * Updates an Organisation&#39;s Image
     *
     * This action will replace any existing Image attached to the Organisation. Image file contents should be sent as binary data in request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateImageTest() throws ApiException {
        Long id = null;
        String filename = null;
        byte[] file = null;
        // Organisation response = api.updateImage(id, filename, file);

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
     * Updates an Organisation
     *
     * If you have trouble updating an organisation, try accessing the organisation via the GET request to inspect its fields and sub-elements. A common source of            problems with write/update requests occurs when users either omit required fields, or insert invalid data into a field (for example, by referring a            CATEGORY_ID or LINK_ID which does not exist.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrganisationTest() throws ApiException {
        APIOrganisation apiOrganisation = null;
        Boolean brief = null;
        // Organisation response = api.updateOrganisation(apiOrganisation, brief);

        // TODO: test validations
    }
    
    /**
     * Updates an Organisation Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrganisationLinkTest() throws ApiException {
        Long id = null;
        APIOrganisationLink apiLink = null;
        // OrganisationLink response = api.updateOrganisationLink(id, apiLink);

        // TODO: test validations
    }
    
}
