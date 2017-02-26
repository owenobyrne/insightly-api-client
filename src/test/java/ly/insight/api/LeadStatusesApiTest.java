package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APILeadStatus;
import ly.insight.model.LeadStatus;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LeadStatusesApi
 */
public class LeadStatusesApiTest {

    private final LeadStatusesApi api = new LeadStatusesApi();

    
    /**
     * Adds a Lead Status
     *
     * This endpoint is used to add a new lead status option to the instance. This endpoint is only accessible to users with administrator access.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addLeadStatusTest() throws ApiException {
        APILeadStatus leadStatus = null;
        // LeadStatus response = api.addLeadStatus(leadStatus);

        // TODO: test validations
    }
    
    /**
     * Deletes a Lead Status
     *
     * This endpoint is used to delete an existing lead status.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLeadStatusTest() throws ApiException {
        Long id = null;
        // api.deleteLeadStatus(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Lead Statuses
     *
     * This endpoint returns a list of the possible lead statuses that have been defined for the Insightly instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeadStatusesTest() throws ApiException {
        Boolean includeConverted = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<LeadStatus> response = api.getLeadStatuses(includeConverted, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Updates a Lead Status
     *
     * This endpoint is used to update an existing lead status. This endpoint is only accessible to users with administrator access.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLeadStatusTest() throws ApiException {
        APILeadStatus leadStatus = null;
        // LeadStatus response = api.updateLeadStatus(leadStatus);

        // TODO: test validations
    }
    
}
