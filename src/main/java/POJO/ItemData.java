package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemData {

    @JsonProperty
    private String attribute_colours;
    @JsonProperty
    private String attribute_pa_size;

    public ItemData(String attributeColours, String attributePaSize) {
        this.attribute_colours = attributeColours;
        this.attribute_pa_size = attributePaSize;

    }
}
