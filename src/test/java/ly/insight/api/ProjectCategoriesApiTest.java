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
 * API tests for ProjectCategoriesApi
 */
public class ProjectCategoriesApiTest {

    private final ProjectCategoriesApi api = new ProjectCategoriesApi();

    
    /**
     * Adds a Project Category
     *
     * This endpoint is used to create a new project category. This endpoint is only accessible to users with administrator permission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addProjectCategoryTest() throws ApiException {
        APICategory category = null;
        // Category response = api.addProjectCategory(category);

        // TODO: test validations
    }
    
    /**
     * Deactivates a Project Category
     *
     * This endpoint is used to deactivate an existing project category. This endpoint is only accessible to users with administrator permission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProjectCategoryTest() throws ApiException {
        Long id = null;
        // api.deleteProjectCategory(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Project Categories
     *
     * This read only endpoint returns a list of the project categories that have been configured for the Insightly instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectCategoriesTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Category> response = api.getProjectCategories(skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a Project Category
     *
     * This endpoint is used to retrieve the graph for a specific project category.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectCategoryTest() throws ApiException {
        Long id = null;
        // Category response = api.getProjectCategory(id);

        // TODO: test validations
    }
    
    /**
     * Updates a Project Category
     *
     * This endpoint is used to update an existing project category. This endpoint is only accessible to users with administrator permission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProjectCategoryTest() throws ApiException {
        APICategory category = null;
        // Category response = api.updateProjectCategory(category);

        // TODO: test validations
    }
    
}
