package ly.insight.api;

import ly.insight.ApiException;
import ly.insight.model.APICountry;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CountriesApi
 */
public class CountriesApiTest {

    private final CountriesApi api = new CountriesApi();

    
    /**
     * Gets a list of Countries used by Insightly
     *
     * This read only endpoint returns a list of the countries Insightly recognizes for use in addresses.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCountriesTest() throws ApiException {
        // List<APICountry> response = api.getCountries();

        // TODO: test validations
    }
    
}
