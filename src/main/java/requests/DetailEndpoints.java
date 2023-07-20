package requests;

import enums.Endpoints;
import helpers.requests.authentication.GetRequestsForCustomer;
import io.restassured.response.Response;

public class DetailEndpoints {

    private final GetRequestsForCustomer loggedCustomer = new GetRequestsForCustomer();

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
