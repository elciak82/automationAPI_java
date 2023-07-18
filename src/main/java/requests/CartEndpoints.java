package requests;

import POJO.AddItemToCartRequest;
import enums.Endpoints;
import helpers.BaseEndpoint;
import io.restassured.response.Response;

public class CartEndpoints extends BaseEndpoint {

    public Response getCart() { //with removed items
        Response response = sendGetRequest(Endpoints.GET_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }


    public Response clearCart() {
        Response response = sendPostRequest(Endpoints.CLEAR_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response addItemToCart(int quantity, String id) {

        AddItemToCartRequest bodyRequest = new AddItemToCartRequest(quantity, id);

        Response response = sendPostRequest(Endpoints.ADD_ITEM.getEndpoint(), bodyRequest);
        response.getBody().prettyPrint();
        return response;

    }
}
