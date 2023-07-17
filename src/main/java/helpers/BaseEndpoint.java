package helpers;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public abstract class BaseEndpoint  {

    Configuration getPropertyValues = new Configuration();

    private final String LOGIN = getPropertyValues.getPropValue("login");
    private final String PASSWORD = getPropertyValues.getPropValue("password");
    private final String BASE_URL = getPropertyValues.getPropValue("base.url");
    private final String BASE_PATH = getPropertyValues.getPropValue("base.path");

    public Response sendGetRequest(String endpoint){
        return given()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD)
                .baseUri(BASE_URL)
                .basePath(BASE_PATH)
                .get(endpoint);
    }
}
