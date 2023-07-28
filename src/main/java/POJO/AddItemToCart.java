package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddItemToCart {

    @JsonProperty
    private String id;
    @JsonProperty
    private int quantity;
    @JsonProperty
    private ItemData item_data;

    public AddItemToCart(Integer quantity, String id, ItemData itemData) {
        this.id = id;
        this.quantity = quantity;
        this.item_data = itemData;
    }
}
