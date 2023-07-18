package requests;

import POJO.AddItemToCartRequest;
import helpers.Endpoints;
import io.restassured.response.Response;

public class CartEndpoints extends Endpoints {

    public Response getCart() { //with removed items
        Response response = sendGetRequest(enums.Endpoints.GET_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }


    public Response clearCart() {
        Response response = sendPostRequest(enums.Endpoints.CLEAR_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response addItemToCart(int quantity, String id) {

        AddItemToCartRequest bodyRequest = new AddItemToCartRequest(quantity, id);

        Response response = sendPostRequest(enums.Endpoints.ADD_ITEM.getEndpoint(), bodyRequest);
        response.getBody().prettyPrint();
        return response;

    }
}
