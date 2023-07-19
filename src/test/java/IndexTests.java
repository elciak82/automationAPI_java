import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import requests.DetailEndpoints;

public class IndexTests {

    DetailEndpoints detailEndpoints = new DetailEndpoints();

    @BeforeTest
    public void before() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    @Test
    public void getAllEndpointsTest() {
        detailEndpoints.getEndpointsDetails();

    }

    @Test
    public void getAStoreDetailsTest() {
        detailEndpoints.getStoreDetails();

    }



}
