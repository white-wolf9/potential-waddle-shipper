package com.whitewolf09.shipper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.whitewolf09.shipper.inputDto.CreateGroceryItem;
import com.whitewolf09.shipper.model.GroceryItem;
import com.whitewolf09.shipper.repository.ItemRepository;

import javax.validation.Valid;

@RestController
public class GroceryItemController {


	@Autowired
    ItemRepository itemRepository;

	@RequestMapping(value = "/createItem", method = RequestMethod.POST)
	public String saveGroceryItem(@Valid @RequestBody CreateGroceryItem createGroceryItem) {
		GroceryItem addedGroceryItem = itemRepository.insert(new GroceryItem(createGroceryItem.getName(), createGroceryItem.getQuantity(), createGroceryItem.getCategory()));
		return "Added grocery item bearing ID"+" "+ addedGroceryItem.getId();
	}
}
