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

    public Response sendGetRequestWithParams(String endpoint, Map<String, String> queryParams){
        return baseRequestWithParams(queryParams)
                .get(endpoint);
    }

    public Response sendPostRequestWithParamsAndBody(String endpoint, Map<String, String> queryParams, AddItemToCartRequest body){
        return baseRequestWithParams(queryParams)
                .body(body)
                .post(endpoint);
    }


}
