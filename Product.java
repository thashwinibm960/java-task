package com.java.Product;

public class Product {
	private String productName;
	private int price;
	private int quantity;
	private String category;
	
	
	public Product(String productName, int price, int quantity, String category) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void printDetails() {
		System.out.println("the product name is:"+productName);
		System.out.println("the product price is:"+price);
		System.out.println("the product quantity is:"+quantity);
		System.out.println("the product category is:"+category);
	}
	
	

}



