package helpers;

import POJO.AddItemToCartRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Endpoints extends BaseRequest  {

    public Response sendGetRequest(){
        return baseRequest()
                .get();
    }

    public Response sendGetRequest(String endpoint){
        return baseRequest()
                .get(endpoint);
    }

    public Response sendPostRequest(String endpoint){
        return baseRequest()
                .post(endpoint);
    }

    public Response sendPostRequest(String endpoint, AddItemToCartRequest body){
        return baseRequest()
                .contentType(ContentType.JSON)
                .body(body)
                .post(endpoint);
    }

    public Response sendDeleteRequest(String endpoint){
        return baseRequest()
                .delete(endpoint);
    }
}
