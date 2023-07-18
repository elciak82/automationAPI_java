package requests;

import enums.Endpoints;
import helpers.BaseEndpoint;
import io.restassured.response.Response;

public class ItemEndpoints extends BaseEndpoint {

    public Response getItems() {
        Response response = sendGetRequest(Endpoints.GET_ITEMS.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }

    public Response viewItem(String key) {
        String endpointAndKey = Endpoints.GET_ITEM.getEndpoint() + key;
        Response response = sendGetRequest(endpointAndKey);
        response.getBody().prettyPrint();
        return response;
    }
}
