package requests;

import POJO.AddItemToCartRequest;
import enums.Endpoints;
import helpers.BaseEndpoint;
import io.restassured.response.Response;

public class ItemEndpoints extends BaseEndpoint {

    public Response getItems() {
        Response response = sendGetRequest(Endpoints.GET_ITEMS.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }
}
