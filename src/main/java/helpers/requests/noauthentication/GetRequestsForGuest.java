package helpers.requests.noauthentication;

import POJO.AddItemToCart;
import POJO.AddItemToCartByKey;
import helpers.BaseRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class GetRequestsForGuest extends BaseRequest {


    public Response sendGetRequest(String endpoint){
        return baseRequest()
                .get(endpoint);
    }

    public Response sendGetRequest(String endpoint, Map<String, String> queryParams){
        return baseRequestWithParams(queryParams)
                .get(endpoint);
    }

}
