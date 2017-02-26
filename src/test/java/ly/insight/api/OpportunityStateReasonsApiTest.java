package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.OpportunityStateReason;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OpportunityStateReasonsApi
 */
public class OpportunityStateReasonsApiTest {

    private final OpportunityStateReasonsApi api = new OpportunityStateReasonsApi();

    
    /**
     * Gets a list of Opportunity State Reasons
     *
     * This endpoint returns a list of opportunity state reasons set up for the Insightly instance.            This is a read only endpoint, so to add or update opportunity state reasons, you will need to do that via the web app.            Opportunity state reasons are used to indicate why the opportunity state was set to its current value.            For example, you can use this to indicate why you lost a particular sale.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunityStateReasonsTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<OpportunityStateReason> response = api.getOpportunityStateReasons(skip, top, countTotal);

        // TODO: test validations
    }
    
}
