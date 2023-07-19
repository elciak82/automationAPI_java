package requests;

import enums.Endpoints;
import helpers.requests.RequestsWithAuth;
import helpers.requests.RequestsWithoutAuth;
import io.restassured.response.Response;

public class DetailEndpoints {

    private RequestsWithAuth loggedCustomer = new RequestsWithAuth();

    public Response getEndpointsDetails() {
        Response response = loggedCustomer.sendGetRequest();
        response.getBody().prettyPrint();
        return response;
    }

    public Response getStoreDetails() {
        Response response = loggedCustomer.sendGetRequest(Endpoints.STORE.getEndpoint());
        response.getBody().prettyPrint();
        return response;
    }
}
