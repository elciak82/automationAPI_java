package requests;

import POJO.AddItemToCartRequest;
import helpers.requests.RequestsWithAuth;
import helpers.requests.RequestsWithoutAuth;
import io.restassured.response.Response;

import java.util.Map;

public class CartEndpoints {

    private RequestsWithAuth loggedCustomer = new RequestsWithAuth();
    private RequestsWithoutAuth guest = new RequestsWithoutAuth();

    public Response getCart() { //with removed items
        Response response = loggedCustomer.sendGetRequest(enums.Endpoints.GET_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }


    public Response clearCart() {
        Response response = loggedCustomer.sendPostRequest(enums.Endpoints.CLEAR_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response addItemToCart(int quantity, String id) {

        AddItemToCartRequest bodyRequest = new AddItemToCartRequest(quantity, id);

        Response response = loggedCustomer.sendPostRequest(enums.Endpoints.ADD_ITEM.getEndpoint(), bodyRequest);
        response.getBody().prettyPrint();
        return response;

    }

    public Response getGuestCartKey() {
        Response response = guest.sendGetRequest(enums.Endpoints.GET_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }
    public Response getGuestCartByKey(Map<String, String> queryParams) { //with removed items
        Response response = guest.sendGetWithParams(enums.Endpoints.GET_CART.getEndpoint(), queryParams);
        response.getBody().prettyPrint();
        return response;
    }
}
