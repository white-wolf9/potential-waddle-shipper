package com.whitewolf09.shipper.inputDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateGroceryItem {

//    @JsonProperty(value = "name", required = true)
    @NotBlank(message = "Item should have a name!")
    private String name;
//    @JsonProperty(value = "quantity", required = true)
    @NotNull(message = "Item should have a quantity!")
    private int quantity;
//    @JsonProperty(value = "category", required = true)
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
