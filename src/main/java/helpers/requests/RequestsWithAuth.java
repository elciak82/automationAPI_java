package helpers.requests;

import POJO.AddItemToCartRequest;
import helpers.BaseRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class RequestsWithAuth extends BaseRequest {

    public Response sendGetRequest(){
        return baseRequestWithAuth()
                .get();
    }


    public Response sendGetRequest(String endpoint){
        return baseRequestWithAuth()
                .get(endpoint);
    }

    public Response sendPostRequest(String endpoint){
        return baseRequestWithAuth()
                .post(endpoint);
    }

    public Response sendPostRequest(String endpoint, AddItemToCartRequest body){
        return baseRequestWithAuth()
                .contentType(ContentType.JSON)
                .body(body)
                .post(endpoint);
    }

    public Response sendDeleteRequest(String endpoint){
        return baseRequestWithAuth()
                .delete(endpoint);
    }
}
