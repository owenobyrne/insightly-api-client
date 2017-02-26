package ly.insight.api;

import ly.insight.ApiException;
import java.util.Date;
import ly.insight.model.Milestone;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MilestonesApi
 */
public class MilestonesApiTest {

    private final MilestonesApi api = new MilestonesApi();

    
    /**
     * Gets a list of Milestones.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMilestonesTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Milestone> response = api.getMilestones(skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a filtered list of Milestones.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMilestonesBySearchTest() throws ApiException {
        Date updatedAfterUtc = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Milestone> response = api.getMilestonesBySearch(updatedAfterUtc, skip, top, countTotal);

        // TODO: test validations
    }
    
}
