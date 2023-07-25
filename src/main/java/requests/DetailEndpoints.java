package requests;

import enums.Endpoints;
import helpers.BaseRequest;
import io.restassured.response.Response;

public class DetailEndpoints extends BaseRequest {

    public Response getEndpointsDetails() {
        Response response = baseRequestWithAuth().get();
        response.getBody().prettyPrint();
        return response;
    }

    public Response getStoreDetails() {
        Response response = baseRequestWithAuth().get(Endpoints.STORE.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }
}
