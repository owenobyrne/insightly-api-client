package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.Tag;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagsApi
 */
public class TagsApiTest {

    private final TagsApi api = new TagsApi();

    
    /**
     * Gets a list of Tags used for a record type
     *
     * This endpoint returns a list of tags associated with a record type. The endpoint expects the query parameter            record_type&#x3D;contacts|leads|opportunities|organisations|projects|emails, so to fetch a list of tags associated with contacts, your query would be            /Tags?record_type&#x3D;contacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagsTest() throws ApiException {
        String recordType = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Tag> response = api.getTags(recordType, skip, top, countTotal);

        // TODO: test validations
    }
    
}
