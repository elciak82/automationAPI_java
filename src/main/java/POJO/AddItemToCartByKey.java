package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddItemToCartByKey {

    @JsonProperty
    private String id;
    @JsonProperty
    private int quantity;
    @JsonProperty
    private String cart_key;

    public AddItemToCartByKey(int quantity, String id, String cartKey){
        this.quantity = quantity;
        this.id = id;
        this.cart_key = cartKey;

    }
}
