package helpers.requests.authentication;

import POJO.AddItemToCart;
import helpers.BaseRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class DeleteRequestsForCustomer extends BaseRequest {

    public Response sendDeleteRequest(String endpoint){
        return baseRequestWithAuth()
                .delete(endpoint);
    }
}
