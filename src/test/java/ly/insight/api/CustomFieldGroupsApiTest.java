package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.CustomFieldGroup;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomFieldGroupsApi
 */
public class CustomFieldGroupsApiTest {

    private final CustomFieldGroupsApi api = new CustomFieldGroupsApi();

    
    /**
     * Gets a list of Custom Field Groups defined for your instance
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomFieldGroupsTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<CustomFieldGroup> response = api.getCustomFieldGroups(skip, top, countTotal);

        // TODO: test validations
    }
    
}
