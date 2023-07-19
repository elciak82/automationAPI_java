package helpers.requests;

import POJO.AddItemToCartRequest;
import helpers.BaseRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class RequestsWithoutAuth extends BaseRequest {


    public Response sendGetRequest(String endpoint){
        return baseRequest()
                .get(endpoint);
    }

    public Response sendGetWithParams(String endpoint, Map<String, String> queryParams){
        return baseRequestWithParams(queryParams)
                .get(endpoint);
    }


}
