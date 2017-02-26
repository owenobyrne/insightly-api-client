package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APIComment;
import ly.insight.model.APITask;
import ly.insight.model.APITaskLink;
import ly.insight.model.Comment;
import java.util.Date;
import ly.insight.model.Follow;
import ly.insight.model.Task;
import ly.insight.model.TaskLink;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TasksApi
 */
public class TasksApiTest {

    private final TasksApi api = new TasksApi();

    
    /**
     * Adds a Comment to a task.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCommentTest() throws ApiException {
        Long id = null;
        APIComment apiComment = null;
        // Comment response = api.addComment(id, apiComment);

        // TODO: test validations
    }
    
    /**
     * Start following a Task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addFollowTest() throws ApiException {
        Long id = null;
        // Follow response = api.addFollow(id);

        // TODO: test validations
    }
    
    /**
     * Adds a Task
     *
     * A common source of problems when creating tasks occurs when users omit required fields, or insert             invalid data into a field. A good troubleshooting technique             is to create a few tasks via the web interface, with representative data, links, etc, and then access             these tasks via the API, and inspect the returned object graph.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTaskTest() throws ApiException {
        APITask apiTask = null;
        // Task response = api.addTask(apiTask);

        // TODO: test validations
    }
    
    /**
     * Adds a Task Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTaskLinkTest() throws ApiException {
        Long id = null;
        APITaskLink apiLink = null;
        // TaskLink response = api.addTaskLink(id, apiLink);

        // TODO: test validations
    }
    
    /**
     * Stop following a Task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFollowTest() throws ApiException {
        Long id = null;
        // api.deleteFollow(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a Task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTaskTest() throws ApiException {
        Long id = null;
        // api.deleteTask(id);

        // TODO: test validations
    }
    
    /**
     * Deletes a Task Link
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTaskLinkTest() throws ApiException {
        Long id = null;
        Long linkId = null;
        // api.deleteTaskLink(id, linkId);

        // TODO: test validations
    }
    
    /**
     * Gets a Task&#39;s Comments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCommentsTest() throws ApiException {
        Long id = null;
        Date updatedAfterUtc = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Comment> response = api.getComments(id, updatedAfterUtc, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a Follow record for the Task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFollowTest() throws ApiException {
        Long id = null;
        // Follow response = api.getFollow(id);

        // TODO: test validations
    }
    
    /**
     * Gets a Task
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskTest() throws ApiException {
        Long id = null;
        // Task response = api.getTask(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Tasks.
     *
     * Simple object graphs (excluding TASKLINKS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTasksTest() throws ApiException {
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Task> response = api.getTasks(brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Gets a filtered list of Tasks.
     *
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding TASKLINKS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTasksBySearchTest() throws ApiException {
        String title = null;
        String status = null;
        Long categoryId = null;
        Long ownerUserId = null;
        Date updatedAfterUtc = null;
        Boolean brief = null;
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Task> response = api.getTasksBySearch(title, status, categoryId, ownerUserId, updatedAfterUtc, brief, skip, top, countTotal);

        // TODO: test validations
    }
    
    /**
     * Updates a Task
     *
     * A common source of problems when updating tasks occurs when users omit required fields, or insert             invalid data into a field. A good troubleshooting technique             is to create a few tasks via the web interface, with representative data, links, etc, and then access             these tasks via the API, and inspect the returned object graph.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTaskTest() throws ApiException {
        APITask apiTask = null;
        Boolean brief = null;
        // Task response = api.updateTask(apiTask, brief);

        // TODO: test validations
    }
    
}
