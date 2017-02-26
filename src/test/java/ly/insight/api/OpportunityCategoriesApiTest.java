package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APICategory;
import ly.insight.model.Category;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OpportunityCategoriesApi
 */
public class OpportunityCategoriesApiTest {

    private final OpportunityCategoriesApi api = new OpportunityCategoriesApi();

    
    /**
     * Adds an Opportunity Category
     *
     * This endpoint is used to create a new opportunity category. This endpoint is only accessible to users with administrator permission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addOpportunityCategoryTest() throws ApiException {
        APICategory category = null;
        // Category response = api.addOpportunityCategory(category);

        // TODO: test validations
    }
    
    /**
     * Deactivates an Opportunity Category
     *
     * The endpoint is used to deactivate an existing opportunity category. This endpoint is only accessible to users with administrator permission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOpportunityCategoryTest() throws ApiException {
        Long id = null;
        // api.deleteOpportunityCategory(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Opportunity Categories
     *
     * This read only endpoint returns a list of opportunity categories set up for the Insightly instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunityCategoriesTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Category> response = api.getOpportunityCategories(skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets an Opportunity Category
     *
     * This endpoint returns the graph for a specific opportunity category
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpportunityCategoryTest() throws ApiException {
        Long id = null;
        // Category response = api.getOpportunityCategory(id);

        // TODO: test validations
    }
    
    /**
     * Updates an Opportunity Category
     *
     * This endpoint is used to update an existing opportunity category (for example, to change the background color for its label in the user interace). This endpoint is only accessible to users with administrator permission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOpportunityCategoryTest() throws ApiException {
        APICategory category = null;
        // Category response = api.updateOpportunityCategory(category);

        // TODO: test validations
    }
    
}
