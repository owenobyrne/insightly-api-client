package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APITeam;
import ly.insight.model.APITeamMember;
import java.util.Date;
import ly.insight.model.Team;
import ly.insight.model.TeamMember;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamsApi
 */
public class TeamsApiTest {

    private final TeamsApi api = new TeamsApi();

    
    /**
     * Adds a Team
     *
     * TEAM_NAME is required when creating a Team with ANONYMOUS_TEAM set to \&quot;false\&quot;. When creating Anonymous Teams, e.g. ANONYMOUS_TEAM&#x3D;true, you must include all the Team Members that should be part of the team. A minimum of one Team Member is required.             For more details, please refer to GET /Teams above.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTeamTest() throws ApiException {
        APITeam apiTeam = null;
        // Team response = api.addTeam(apiTeam);

        // TODO: test validations
    }
    
    /**
     * Adds a Team Member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTeamMemberTest() throws ApiException {
        Long id = null;
        APITeamMember apiTeamMember = null;
        // TeamMember response = api.addTeamMember(id, apiTeamMember);

        // TODO: test validations
    }
    
    /**
     * Deletes a Team
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTeamTest() throws ApiException {
        Long id = null;
        // api.deleteTeam(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a Team Member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTeamMemberTest() throws ApiException {
        Long id = null;
        Long permissionId = null;
        // api.deleteTeamMember(id, permissionId);

        // TODO: test validations
    }
    
    /**
     * Gets a Team
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamTest() throws ApiException {
        Long id = null;
        // Team response = api.getTeam(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Teams.
     *
     * Simple object graphs (excluding TEAMMEMBERS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.            &lt;br /&gt; The API responses may contain two types of Teams: a) regular Teams configured via System Settings and b) so called Anonymous Teams which are created by the system when you set a record permission visible to Individuals.            You can differentiate these two types on Teams by the ANONYMOUS_TEAM property. Anonymous Teams are a bit more restricted when it comes to modifying them via the API, they can only be created/updated/deleted via the root /Teams endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamsTest() throws ApiException {
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Team> response = api.getTeams(brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a filtered list of Teams.
     *
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding TEAMMEMBERS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.             &lt;br /&gt; The API responses may contain two types of Teams: a) regular Teams configured via System Settings and b) so called Anonymous Teams which are created by the system when you set a record permission visible to Individuals.            You can differentiate these two types on Teams by the ANONYMOUS_TEAM property. Anonymous Teams are a bit more restricted when it comes to modifying them via the API, they can only be created/updated/deleted via the /Teams endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeamsBySearchTest() throws ApiException {
        String teamName = null;
        Date updatedAfterUtc = null;
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Team> response = api.getTeamsBySearch(teamName, updatedAfterUtc, brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Updates a Team
     *
     * When updating Anonymous Teams, the brief parameter has no effect and you must include all the Team Members that should be part of the team. A minimum of one Team Member is required.  For more details, please refer to GET /Teams above.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTeamTest() throws ApiException {
        APITeam apiTeam = null;
        Boolean brief = null;
        // Team response = api.updateTeam(apiTeam, brief);

        // TODO: test validations
    }
    
}
