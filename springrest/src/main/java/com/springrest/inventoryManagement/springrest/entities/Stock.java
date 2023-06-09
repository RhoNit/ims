package com.springrest.inventoryManagement.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int item_id;
	
	private int quantity;

	public Stock(int item_id, int quantity) {
		super();
		this.item_id = item_id;
		this.quantity = quantity;
	}

	public Stock() {
		super();
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Stock [item_id=" + item_id + ", quantity=" + quantity + "]";
	}
	
		
}
