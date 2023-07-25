package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddItemToCart {

    @JsonProperty
    private String id;
    @JsonProperty
    private int quantity;

    public AddItemToCart(Integer quantity, String id) {
        this.id = id;
        this.quantity = quantity;
    }
}
