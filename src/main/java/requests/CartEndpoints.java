package requests;

import POJO.AddItemToCartRequest;
import enums.Endpoints;
import helpers.BaseEndpoint;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.response.Response;

public class CartEndpoints extends BaseEndpoint {

    public Response getCart() {
        Response response = sendGetRequest(Endpoints.GET_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response countItemsInCart() {
        Response response = sendGetRequest(Endpoints.COUNT_ITEMS.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response clearCart() {
        Response response = sendPostRequest(Endpoints.CLEAR_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response addItemToCart(int quantity, String id, boolean returnCart) {

        AddItemToCartRequest bodyRequest = new AddItemToCartRequest(quantity, id, returnCart);

        Response response = sendPostRequest(Endpoints.ADD_ITEM.getEndpoint(), bodyRequest);
        response.getBody().prettyPrint();
        return response;

    }
}
