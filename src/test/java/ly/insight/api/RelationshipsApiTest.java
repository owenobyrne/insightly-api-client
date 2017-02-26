package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.Relationship;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RelationshipsApi
 */
public class RelationshipsApiTest {

    private final RelationshipsApi api = new RelationshipsApi();

    
    /**
     * Gets a list of Relationships
     *
     * This read only endpoint returns a list of the relationships that have been defined for the Insightly instance.            Relationships enable users to define how one Insightly object is related to another.            For example: contact A is a customer of contact B. The API only supports read access to relationships, to create or update            relationships, you&#39;ll need to do so via the web app.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRelationshipsTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Relationship> response = api.getRelationships(skip, top, countTotal);

        // TODO: test validations
    }
    
}
