package requests;

import POJO.AddItemToCart;
import POJO.AddItemToCartByKey;
import enums.Endpoints;
import helpers.requests.authentication.GetRequestsForCustomer;
import helpers.requests.authentication.PostRequestsForCustomer;
import helpers.requests.noauthentication.GetRequestsForGuest;
import helpers.requests.noauthentication.PostRequestsForGuest;
import io.restassured.response.Response;

import java.util.Map;

public class CartEndpoints {

    private final GetRequestsForCustomer getForCustomer = new GetRequestsForCustomer();
    private final PostRequestsForCustomer postForCustomer = new PostRequestsForCustomer();
    private final GetRequestsForGuest getForGuest = new GetRequestsForGuest();
    private final PostRequestsForGuest postForGuest = new PostRequestsForGuest();

    public Response getCart() { //with removed items

        Response response = getForCustomer.sendGetRequest(enums.Endpoints.GET_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response getCartByKey(Map<String, String> queryParams) { //with removed items

        Response response = getForCustomer.sendGetRequest(enums.Endpoints.GET_CART.getEndpoint(), queryParams);
        response.getBody().prettyPrint();
        return response;
    }


    public Response clearCart() {
        Response response = postForCustomer.sendPostRequest(enums.Endpoints.CLEAR_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response addItemToCart(AddItemToCart bodyRequest) {

        Response response = postForCustomer.sendPostRequest(enums.Endpoints.ADD_ITEM.getEndpoint(), bodyRequest);
        response.getBody().prettyPrint();
        return response;

    }

    public Response getGuestCartKey() {

        Response response = getForGuest.sendGetRequest(enums.Endpoints.GET_CART.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response getGuestCartByKey(Map<String, String> queryParams) { //with removed items

        Response response = getForGuest.sendGetRequest(enums.Endpoints.GET_CART.getEndpoint(), queryParams);
        response.getBody().prettyPrint();
        return response;
    }

    public Response addItemToGuestCart(AddItemToCartByKey bodyRequest) {

        Response response = postForGuest.sendPostRequest(Endpoints.ADD_ITEM.getEndpoint(), bodyRequest);
        response.getBody().prettyPrint();
        return response;
    }
}
