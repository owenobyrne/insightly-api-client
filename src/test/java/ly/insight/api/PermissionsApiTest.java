package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APIPermissions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PermissionsApi
 */
public class PermissionsApiTest {

    private final PermissionsApi api = new PermissionsApi();

    
    /**
     * Gets the Permissions for a User
     *
     * Permissions determine if an individual user can read, edit, delete, or create records of a given object type.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPermissionsTest() throws ApiException {
        // APIPermissions response = api.getPermissions();

        // TODO: test validations
    }
    
}
