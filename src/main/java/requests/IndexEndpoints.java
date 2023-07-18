package requests;

import helpers.Endpoints;
import io.restassured.response.Response;

public class IndexEndpoints extends Endpoints {

    public Response getAllEndpoints() {
        Response response = sendGetRequest();
        response.getBody().prettyPrint();
        return response;
    }
}
