package helpers.requests.authentication;

import POJO.AddItemToCart;
import helpers.BaseRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class GetRequestsForCustomer extends BaseRequest {

    public Response sendGetRequest(){
        return baseRequestWithAuth()
                .get();
    }

    public Response sendGetRequest(String endpoint){
        return baseRequestWithAuth()
                .get(endpoint);
    }

    public Response sendGetRequest(String endpoint, Map<String, String> queryParams){
        return baseRequestWithAuth()
                .params(queryParams)
                .get(endpoint);
    }
}
