package helpers.requests.noauthentication;

import POJO.AddItemToCartByKey;
import helpers.BaseRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class PostRequestsForGuest extends BaseRequest {

    public Response sendPostRequest(String endpoint, AddItemToCartByKey body){
        return baseRequest()
                .contentType(ContentType.JSON)
                .body(body)
                .post(endpoint);
    }

}
