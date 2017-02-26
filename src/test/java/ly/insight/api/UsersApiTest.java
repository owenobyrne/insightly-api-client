package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APIUser;
import java.util.Date;
import ly.insight.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Gets a User
     *
     * This read only endpoint returns the details for a specific user on an Insightly instance, same fields as            returned by the /Users endpoint, but only for a single identified user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        Long id = null;
        // User response = api.getUser(id);

        // TODO: test validations
    }
    
    /**
     * Gets the User object for the calling user.
     *
     * This read only endpoint returns the details for the currently authenticated user on an Insightly instance, same fields as            returned by the /Users endpoint, but only for a single identified user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserMeTest() throws ApiException {
        // APIUser response = api.getUserMe();

        // TODO: test validations
    }
    
    /**
     * Gets a list of Users
     *
     * This is a read only endpoint that returns a list of users associated with an Insightly instance.            Use this endpoint when you need to obtain a list of valid USER_IDs, for example, when you want to assign            a task to a specific user (do not confuse the USER_ID with their CONTACT_ID).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<User> response = api.getUsers(skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a filtered list of Users
     *
     * This is a read only endpoint that returns a list of users associated with an Insightly instance.            Use this endpoint when you need to obtain a list of valid USER_IDs, for example, when you want to assign            a task to a specific user (do not confuse the USER_ID with their CONTACT_ID). Only one optional parameter (excluding top, skip and count_total) can be specified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersBySearchTest() throws ApiException {
        String firstName = null;
        String lastName = null;
        String email = null;
        Date updatedAfterUtc = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<User> response = api.getUsersBySearch(firstName, lastName, email, updatedAfterUtc, skip, top, countTotal);

        // TODO: test validations
    }
    
}
