package requests;

import helpers.requests.authentication.DeleteRequestsForCustomer;
import helpers.requests.authentication.GetRequestsForCustomer;
import helpers.requests.authentication.PostRequestsForCustomer;
import helpers.requests.noauthentication.GetRequestsForGuest;
import helpers.requests.noauthentication.PostRequestsForGuest;
import io.restassured.response.Response;

public class ItemInCartEndpoints {

    private final GetRequestsForCustomer getForCustomer = new GetRequestsForCustomer();
    private final DeleteRequestsForCustomer deleteForCustomer = new DeleteRequestsForCustomer();

    public Response getItemsFromCart() { //only items
        Response response = getForCustomer.sendGetRequest(enums.Endpoints.GET_ITEMS.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response countItemsInCart() {
        Response response = getForCustomer.sendGetRequest(enums.Endpoints.COUNT_ITEMS.getEndpoint());
        response.getBody().print();
        return response;
    }

    public Response viewItemInCart(String key) {
        String endpointAndKey = enums.Endpoints.GET_ITEM.getEndpoint() + key;
        Response response = getForCustomer.sendGetRequest(endpointAndKey);
        response.getBody().prettyPrint();
        return response;
    }

    public Response removeItemFromCart(String key) {
        Response response = deleteForCustomer.sendDeleteRequest(enums.Endpoints.GET_ITEM.getEndpoint() + key);
        response.getBody().prettyPrint();
        return response;
    }
}
