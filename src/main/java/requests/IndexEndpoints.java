package requests;

import POJO.AddItemToCartRequest;
import enums.Endpoints;
import helpers.BaseEndpoint;
import io.restassured.response.Response;

public class IndexEndpoints extends BaseEndpoint {

    public Response getAllEndpoints() {
        Response response = sendGetRequest();
        response.getBody().prettyPrint();
        return response;
    }
}
