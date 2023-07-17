package enums;

public enum Endpoints {

    GET_CART("/cart");

    private final String endpoint;


    Endpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}
