package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddItemToCartRequest {

    @JsonProperty
    private String id;
    @JsonProperty
    private int quantity;

    public AddItemToCartRequest(Integer quantity, String id){
        this.id = id;
        this.quantity = quantity;
    }
}
