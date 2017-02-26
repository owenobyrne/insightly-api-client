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
 * API tests for FileCategoriesApi
 */
public class FileCategoriesApiTest {

    private final FileCategoriesApi api = new FileCategoriesApi();

    
    /**
     * Adds a File Category
     *
     * This endpoint is used to create a new File Category. This endpoint is only accessible to users with administrator permission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFileCategoryTest() throws ApiException {
        APICategory category = null;
        // Category response = api.addFileCategory(category);

        // TODO: test validations
    }
    
    /**
     * Deactivates a File Category
     *
     * This endpoint is used to deactivate an existing File Category. This endpoint is only accessible to users with administrator permission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileCategoryTest() throws ApiException {
        Long id = null;
        // api.deleteFileCategory(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of File Categories
     *
     * This read only endpoint returns a list of file categories that have been set up for the Insightly instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileCategoriesTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Category> response = api.getFileCategories(skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a File Category
     *
     * This endpoint returns the graph for a specific file category.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFileCategoryTest() throws ApiException {
        Long id = null;
        // Category response = api.getFileCategory(id);

        // TODO: test validations
    }
    
    /**
     * Updates a File Category
     *
     * This endpoint is used to update an existing File Category. This endpoint is only accessible to users with administrator permission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFileCategoryTest() throws ApiException {
        APICategory category = null;
        // Category response = api.updateFileCategory(category);

        // TODO: test validations
    }
    
}
