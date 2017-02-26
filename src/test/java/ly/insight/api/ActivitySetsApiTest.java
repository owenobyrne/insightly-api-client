package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.ActivitySet;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivitySetsApi
 */
public class ActivitySetsApiTest {

    private final ActivitySetsApi api = new ActivitySetsApi();

    
    /**
     * Gets a single Activity Set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivitySetTest() throws ApiException {
        Long id = null;
        // ActivitySet response = api.getActivitySet(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Activity Sets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivitySetsTest() throws ApiException {
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<ActivitySet> response = api.getActivitySets(brief, skip, top, countTotal);

        // TODO: test validations
    }
    
}
