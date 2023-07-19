package requests;

import helpers.requests.RequestsWithAuth;
import io.restassured.response.Response;

public class ItemInCartEndpoints {

    private RequestsWithAuth loggedCustomer = new RequestsWithAuth();

    public Response getItemsFromCart() { //only items
        Response response = loggedCustomer.sendGetRequest(enums.Endpoints.GET_ITEMS.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response countItemsInCart() {
        Response response = loggedCustomer.sendGetRequest(enums.Endpoints.COUNT_ITEMS.getEndpoint());
        response.getBody().print();
        return response;
    }

    public Response viewItemInCart(String key) {
        String endpointAndKey = enums.Endpoints.GET_ITEM.getEndpoint() + key;
        Response response = loggedCustomer.sendGetRequest(endpointAndKey);
        response.getBody().prettyPrint();
        return response;
    }

    public Response removeItemFromCart(String key) {
        Response response = loggedCustomer.sendDeleteRequest(enums.Endpoints.GET_ITEM.getEndpoint() + key);
        response.getBody().prettyPrint();
        return response;
    }
}
