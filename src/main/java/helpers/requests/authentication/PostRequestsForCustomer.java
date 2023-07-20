package helpers.requests.authentication;

import POJO.AddItemToCart;
import helpers.BaseRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class PostRequestsForCustomer extends BaseRequest {

    public Response sendPostRequest(String endpoint){
        return baseRequestWithAuth()
                .post(endpoint);
    }

    public Response sendPostRequest(String endpoint, AddItemToCart body){
        return baseRequestWithAuth()
                .contentType(ContentType.JSON)
                .body(body)
                .post(endpoint);
    }

}
