package requests;

import helpers.BaseRequest;
import io.restassured.response.Response;

public class ItemInCartEndpoints extends BaseRequest {


    public Response getItemsFromCart() { //only items
        Response response = baseRequestWithAuth().get(enums.Endpoints.GET_ITEMS.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response countItemsInCart() {
        Response response = baseRequestWithAuth().get(enums.Endpoints.COUNT_ITEMS.getEndpoint());
        response.getBody().print();
        return response;
    }

    public Response viewItemInCart(String key) {
        Response response = baseRequestWithAuth().get(enums.Endpoints.GET_ITEM.getEndpoint() + key);
        response.getBody().prettyPrint();
        return response;
    }

    public Response removeItemFromCart(String key) {
        Response response = baseRequestWithAuth()
                .delete(enums.Endpoints.GET_ITEM.getEndpoint() + key);
        response.getBody().prettyPrint();
        return response;
    }
}
