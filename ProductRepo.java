package com.java.Product.Repo;

import com.java.Product.Product;

public class ProductRepo {
	Product[] items = new Product[10];

	public boolean saveproduct(Product product) {
		
		for (int i = 0; i < items.length; i++) {
			
			if (items[i] == null) {
				
				items[i] = product;
				System.out.println("Data has been save");
				return true;
			}
			
		}
		System.err.println("There is no space available to store");
		return false;
	}

	public Product[] readAll() {
	
		return items;
	}
	
	public String findProductByName(String productName) {
		if (productName != null) {
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null && productName.equals(items[i].getProductName())) {
                    return items[i].getProductName(); 
				}
			}
		}
		System.out.println("Product Name Not Found");
		return null;
		
	}
	
	public boolean updateProductByPrice(String productName,int price) {
		if(productName != null) {
			for(int i=0;i<items.length;i++) {
				if(items[i] != null && productName.equals(items[i].getProductName())) {
					items[i].setPrice(price);
					System.out.println("price is updated");
					return true;
					
				}
			}
		}
		return false;
		
	}
	
	public boolean deleteByName(String productName) {
		if(productName != null) {
			for(int i=0;i<items.length;i++) {
				if(items[i] != null && productName.equals(items[i].getProductName())) {
					 for (int j = i; j < items.length - 1; j++) {
		                    items[j] = items[j + 1];  
		                }
					items[items.length-1 ] = null;
	                System.out.println("Product " + productName + " has been deleted.");
	                return true;
				}
					
				}
					
				}
		return false;
		
	}

	public int findProductByPrice(int price) {
		if (price != 0) {
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null && price== items[i].getPrice()) {
                    return items[i].getPrice(); 
				}
			}
		}
		System.out.println("Product price Not Found");
		return 0;
		
	}

	public boolean updateProductByQuantity(String productName, int quantity) {
		if(productName != null) {
			for(int i=0;i<items.length;i++) {
				if(items[i] != null && productName.equals(items[i].getProductName())) {
					items[i].setQuantity(quantity);
					System.out.println("quantity is updated");
					return true;
					
				}
			}
		}
		return false;
		
	}

	public boolean deleteByQuantity(int quantity) {
		if(quantity != 0) {
			for(int i=0;i<items.length;i++) {
				if(items[i] != null && quantity == items[i].getQuantity()) {
					 for (int j = i; j < items.length - 1; j++) {
		                    items[j] = items[j + 1];  
		                }
					items[items.length-1 ] = null;
	                System.out.println("Product " + quantity + " has been deleted.");
	                return true;
				}
					
				}
					
				}
		return false;
	}

}
	
      



