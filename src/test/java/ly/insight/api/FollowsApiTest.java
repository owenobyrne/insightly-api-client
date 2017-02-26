package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.UserFollow;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FollowsApi
 */
public class FollowsApiTest {

    private final FollowsApi api = new FollowsApi();

    
    /**
     * Gets a list of followed records for the user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFollowsTest() throws ApiException {
        String recordType = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<UserFollow> response = api.getFollows(recordType, skip, top, countTotal);

        // TODO: test validations
    }
    
}
