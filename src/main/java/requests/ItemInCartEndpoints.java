package requests;

import enums.Endpoints;
import helpers.BaseEndpoint;
import io.restassured.response.Response;

public class ItemInCartEndpoints extends BaseEndpoint {

    public Response getItemsFromCart() { //only items
        Response response = sendGetRequest(Endpoints.GET_ITEMS.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response countItemsInCart() {
        Response response = sendGetRequest(Endpoints.COUNT_ITEMS.getEndpoint());
        response.getBody().print();
        return response;
    }

    public Response viewItemInCart(String key) {
        String endpointAndKey = Endpoints.GET_ITEM.getEndpoint() + key;
        Response response = sendGetRequest(endpointAndKey);
        response.getBody().prettyPrint();
        return response;
    }

    public Response removeItemFromCart(String key) {
        Response response = sendDeleteRequest(Endpoints.GET_ITEM.getEndpoint() + key);
        response.getBody().prettyPrint();
        return response;
    }
}
