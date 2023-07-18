package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddItemToCartRequest {

    @JsonProperty
    private String id;
    @JsonProperty
    private int quantity;
    @JsonProperty
    private boolean return_cart;

    public AddItemToCartRequest(Integer quantity, String id, boolean returnCart){
        this.id = id;
        this.quantity = quantity;
        this.return_cart = returnCart;
    }
}
