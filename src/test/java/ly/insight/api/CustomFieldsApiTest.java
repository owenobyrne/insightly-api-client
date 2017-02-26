package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.CustomFieldMetadata;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomFieldsApi
 */
public class CustomFieldsApiTest {

    private final CustomFieldsApi api = new CustomFieldsApi();

    
    /**
     * Gets a list of Custom Fields
     *
     * Use this API call to get a list of custom fields metadata. The properties FIELD_FOR, GROUP_ID, and ORDER_ID can be used to determine which fields belong to a particular object. See CustomFieldGroups if more data on a custom field&#39;s group is needed. A common problem API users have is to reference an invalid CUSTOM_FIELD_ID when referencing custom fields in a newly created or updated object.            If you plan to use custom fields in your API based application, be sure you are working with valid custom field IDs. To add or update custom fields for your Insightly instance, you&#39;ll need to go to the web app to do so.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomFieldsTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<CustomFieldMetadata> response = api.getCustomFields(skip, top, countTotal);

        // TODO: test validations
    }
    
}
