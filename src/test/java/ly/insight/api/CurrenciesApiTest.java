package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APICurrency;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CurrenciesApi
 */
public class CurrenciesApiTest {

    private final CurrenciesApi api = new CurrenciesApi();

    
    /**
     * Gets a list of Currencies used by Insightly
     *
     * This read only endpoint returns a list of the currencies and currency symbols currently recognized by Insightly.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrenciesTest() throws ApiException {
        // List<APICurrency> response = api.getCurrencies();

        // TODO: test validations
    }
    
}
