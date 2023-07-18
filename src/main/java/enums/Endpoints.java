package enums;

public enum Endpoints {

    GET_CART("/cart"),
    CLEAR_CART("/cart/clear"),
    ADD_ITEM("/cart/add-item"),
    GET_ITEMS("/cart/items");

    private final String endpoint;


    Endpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}
