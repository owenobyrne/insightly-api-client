package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.Pipeline;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PipelinesApi
 */
public class PipelinesApiTest {

    private final PipelinesApi api = new PipelinesApi();

    
    /**
     * Gets a Pipeline
     *
     * This endpoint returns the graph for a specific pipeline.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineTest() throws ApiException {
        Long id = null;
        // api.getPipeline(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Pipelines
     *
     * This read only endpoint returns a list of pipelines that have been set up for the Insightly instance.            Pipelines can be defined for both projects and opportunities, and are used to track the progression of projects and opportunities.            To create and update pipelines, you&#39;ll need to go to the web app (API access is read-only).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelinesTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<Pipeline> response = api.getPipelines(skip, top, countTotal);

        // TODO: test validations
    }
    
}
