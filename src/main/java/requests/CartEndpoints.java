package requests;

import POJO.AddItemToCart;
import POJO.AddItemToCartByKey;
import enums.Endpoints;
import helpers.BaseRequest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class CartEndpoints extends BaseRequest {

    public Response getCart() { //with removed items

        Response response =
                baseRequestWithAuth()
                        .get(enums.Endpoints.GET_CART.getEndpoint());

        response.getBody().prettyPrint();
        return response;
    }

    public Response getCartByKey(Map<String, String> queryParams) { //with removed items

        Response response = baseRequestWithAuth()
                .params(queryParams)
                .get(enums.Endpoints.GET_CART.getEndpoint(), queryParams);

        response.getBody().prettyPrint();
        return response;
    }


    public Response clearCart() {
        Response response = baseRequestWithAuth()
                .post(enums.Endpoints.CLEAR_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response addItemToCart(AddItemToCart bodyRequest) {

        Response response = baseRequestWithAuth()
                .contentType(ContentType.JSON)
                .body(bodyRequest)
                .post(enums.Endpoints.ADD_ITEM.getEndpoint(), bodyRequest);

        response.getBody().prettyPrint();
        return response;

    }

    public Response getGuestCartKey() {

        Response response = baseRequest()
                .get(enums.Endpoints.GET_CART.getEndpoint());

        response.getBody().prettyPrint();
        return response;
    }

    public Response getGuestCartByKey(Map<String, String> queryParams) { //with removed items

        Response response = baseRequest()
                .get(enums.Endpoints.GET_CART.getEndpoint(), queryParams);

        response.getBody().prettyPrint();
        return response;
    }

    public Response addItemToGuestCart(AddItemToCartByKey bodyRequest) {

        Response response = baseRequest()
                .contentType(ContentType.JSON)
                .body(bodyRequest)
                .post(Endpoints.ADD_ITEM.getEndpoint(), bodyRequest);

        response.getBody().prettyPrint();
        return response;
    }
}
