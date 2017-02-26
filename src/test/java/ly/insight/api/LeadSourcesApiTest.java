package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APILeadSource;
import ly.insight.model.LeadSource;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LeadSourcesApi
 */
public class LeadSourcesApiTest {

    private final LeadSourcesApi api = new LeadSourcesApi();

    
    /**
     * Adds a Lead Source
     *
     * This endpoint is used to define a new lead source. This endpoint is only accessible to users with administrator access.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLeadSourceTest() throws ApiException {
        APILeadSource leadSource = null;
        // LeadSource response = api.addLeadSource(leadSource);

        // TODO: test validations
    }
    
    /**
     * Deletes a Lead Source
     *
     * This endpoint is used to delete an existing lead source.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLeadSourceTest() throws ApiException {
        Long id = null;
        // api.deleteLeadSource(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Lead Sources
     *
     * This endpoint returns a list of the lead sources that have been defined on the Insightly instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeadSourcesTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<LeadSource> response = api.getLeadSources(skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Updates a Lead Source
     *
     * This endpoint is used to update an existing lead source.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLeadSourceTest() throws ApiException {
        APILeadSource leadSource = null;
        // LeadSource response = api.updateLeadSource(leadSource);

        // TODO: test validations
    }
    
}
