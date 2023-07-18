package requests;

import helpers.Endpoints;
import io.restassured.response.Response;

public class ItemInCartEndpoints extends Endpoints {

    public Response getItemsFromCart() { //only items
        Response response = sendGetRequest(enums.Endpoints.GET_ITEMS.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response countItemsInCart() {
        Response response = sendGetRequest(enums.Endpoints.COUNT_ITEMS.getEndpoint());
        response.getBody().print();
        return response;
    }

    public Response viewItemInCart(String key) {
        String endpointAndKey = enums.Endpoints.GET_ITEM.getEndpoint() + key;
        Response response = sendGetRequest(endpointAndKey);
        response.getBody().prettyPrint();
        return response;
    }

    public Response removeItemFromCart(String key) {
        Response response = sendDeleteRequest(enums.Endpoints.GET_ITEM.getEndpoint() + key);
        response.getBody().prettyPrint();
        return response;
    }
}
