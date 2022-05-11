package com.whitewolf09.shipper.model;

import lombok.Generated;
import org.springframework.data.annotation.Id;

public class GroceryItem {

	@Id
    private String id;

    private String name;
    private int quantity;
    private String category;

    public GroceryItem(String name, int quantity, String category) {
        super();
        this.setName(name);
        this.setQuantity(quantity);
        this.setCategory(category);
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GroceryItem() {
		// TODO Auto-generated constructor stub
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
