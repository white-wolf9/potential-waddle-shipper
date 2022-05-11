package com.whitewolf09.shipper.inputDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateGroceryItem {

    /**
     * The value should match the key in the JSON POJO
     * If it does not match and @NotBlank is not present,
     * then the internal logic will skip the field and
     * the document will be created without the name field
     */
    @JsonProperty(value = "namae", required = true)
    @NotBlank(message = "Item should have a name!")
    private String name;
    /**
     * The @JSONProperty value should match the key in the JSON POJO
     * If it does not match and @NotBlank is present,
     * then the server will return an error code and no
     * document will be created without the name field
     */
    @JsonProperty(value = "quantity", required = true)
    @NotNull(message = "Item should have a quantity!")
    private int quantity;
    /**
     * The @JSONProperty required should be true and it governs
     * the behaviour during deserialization
     */
    @JsonProperty(value = "category", required = true)
    @NotBlank(message = "Item should have a category!")
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
