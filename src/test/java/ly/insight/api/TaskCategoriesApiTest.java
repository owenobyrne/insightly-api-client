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
 * API tests for TaskCategoriesApi
 */
public class TaskCategoriesApiTest {

    private final TaskCategoriesApi api = new TaskCategoriesApi();

    
    /**
     * Adds a Task Category
     *
     * This endpoint is used to create a new task category. This endpoint is only accessible to users with administrator permission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTaskCategoryTest() throws ApiException {
        APICategory category = null;
        // Category response = api.addTaskCategory(category);

        // TODO: test validations
    }
    
    /**
     * Deactivates a Task Category
     *
     * This endpoint is used to deactivate a task category. This endpoint is only accessible to users with administrator permission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTaskCategoryTest() throws ApiException {
        Long id = null;
        // api.deleteTaskCategory(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Task Categories
     *
     * This read only endpoint returns a list of the task categories set up for the Insightly instance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskCategoriesTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Category> response = api.getTaskCategories(skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a Task Category
     *
     * This endpoint returns the graph for a specific task category.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskCategoryTest() throws ApiException {
        Long id = null;
        // Category response = api.getTaskCategory(id);

        // TODO: test validations
    }
    
    /**
     * Updates a Task Category
     *
     * This endpoint is used to update an existing task category, for example to change the background color for the task category&#39;s label in the web UI. This endpoint is only accessible to users with administrator permission.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaskCategoryTest() throws ApiException {
        APICategory category = null;
        // Category response = api.updateTaskCategory(category);

        // TODO: test validations
    }
    
}
