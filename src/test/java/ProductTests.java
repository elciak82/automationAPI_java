import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import requests.IndexEndpoints;

public class ProductTests {

    IndexEndpoints productEndpoints = new IndexEndpoints();

    @BeforeTest
    public void before() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    @Test
    public void getWholeCart() {
        productEndpoints.getProducts();

    }



}
