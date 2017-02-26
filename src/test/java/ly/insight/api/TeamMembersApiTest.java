package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APITeamMember;
import ly.insight.model.TeamMember;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamMembersApi
 */
public class TeamMembersApiTest {

    private final TeamMembersApi api = new TeamMembersApi();

    
    /**
     * Adds a new Team Member
     *
     * Note: Team Members of Anonymous Teams can only be created via the /Teams endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTeamMemberTest() throws ApiException {
        APITeamMember apiTeamMember = null;
        // TeamMember response = api.addTeamMember(apiTeamMember);

        // TODO: test validations
    }
    
    /**
     * Deletes a Team Member
     *
     * Note: Team Members of Anonymous Teams can only be deleted via the /Teams endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTeamMemberTest() throws ApiException {
        Long id = null;
        // api.deleteTeamMember(id);

        // TODO: test validations
    }
    
    /**
     * Gets a Team Member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamMemberTest() throws ApiException {
        Long id = null;
        // TeamMember response = api.getTeamMember(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Team Members
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamMembersTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<TeamMember> response = api.getTeamMembers(skip, top, countTotal);

        // TODO: test validations
    }
    
}
