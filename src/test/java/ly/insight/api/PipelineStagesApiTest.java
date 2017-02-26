package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.PipelineStage;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PipelineStagesApi
 */
public class PipelineStagesApiTest {

    private final PipelineStagesApi api = new PipelineStagesApi();

    
    /**
     * Gets a Pipeline Stage
     *
     * This endpoint returns the graph for a specific pipeline stage.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineStageTest() throws ApiException {
        Long id = null;
        // PipelineStage response = api.getPipelineStage(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of Pipeline Stages
     *
     * This read only endpoint returns a list of the pipeline stages that have been set up for the Insightly instance.            Pipeline stages are used to indicate where a project or opportunity is in terms of its progression.            For example, stage 1 for the sales pipeline might be \&quot;initial contact\&quot;, while stage 4 might be \&quot;generating quote\&quot;.            The API for pipeline stages is read only, so to create or update pipeline stages, you&#39;ll need to use the web app to do so.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineStagesTest() throws ApiException {
        Integer skip = null;
        Integer top = null;
        Boolean countTotal = null;
        // List<PipelineStage> response = api.getPipelineStages(skip, top, countTotal);

        // TODO: test validations
    }
    
}
