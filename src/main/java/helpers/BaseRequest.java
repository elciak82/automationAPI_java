package helpers;

import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public abstract class BaseRequest {

    Configuration getPropertyValues = new Configuration();

    private final String LOGIN = getPropertyValues.getPropValue("login");
    private final String PASSWORD = getPropertyValues.getPropValue("password");
    private final String BASE_URL = getPropertyValues.getPropValue("base.url");
    private final String BASE_PATH = getPropertyValues.getPropValue("base.path");


    public RequestSpecification baseRequest(){
        return given()
                .baseUri(BASE_URL)
                .basePath(BASE_PATH);
    }

    public RequestSpecification baseRequestWithAuth(){
        return baseRequest()
                .auth()
                .preemptive()
                .basic(LOGIN, PASSWORD);
    }

    public RequestSpecification baseRequestWithParams(Map<String, String> queryParams){
        return baseRequest()
                .params(queryParams);
    }
}
