package requests;

import enums.Endpoints;
import helpers.BaseEndpoint;
import io.restassured.response.Response;

public class CartEndpoints extends BaseEndpoint {

    public Response getCart () {

        Response response = sendGetRequest(Endpoints.GET_CART.getEndpoint());

        response.getBody().prettyPrint();

        return response;
    }
}
