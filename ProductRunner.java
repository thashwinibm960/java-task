package com.java.Product.Runner;

import com.java.Product.Product;
import com.java.Product.Service.ProductValidateImpl;

public class ProductRunner {
	public static void main(String[] args) {
		
		        Product product = new Product("Laptop", 800000, 30, "Electronics");
		        Product product2 = new Product("mobile", 570000, 30, "Electronics");
		        Product product3 = new Product("washingmachine", 500000, 30, "Electronics");
		        

		        ProductValidateImpl productService = new ProductValidateImpl();
		        
		        productService.validateProduct(product);
		        productService.validateProduct(product2);
		        productService.validateProduct(product3);
		        
		        Product[] data =  productService.readAll();
				
				for (int i = 0; i < data.length; i++) {
					
					if(data[i] != null) {
					
						data[i].printDetails();
					}

		       
				}
				
			productService.findProductByName("Laptop");
		
			for (int i = 0; i < data.length; i++) {
				
				if(data[i] != null) {
				
					data[i].printDetails();
				}

	       
			}
				
			
				productService.updateProductByPrice("Laptop" ,90000);
				for (int i = 0; i < data.length; i++) {
					
					if(data[i] != null) {
					
						data[i].printDetails();
					}

		       
				}
				productService.deleteByName("Laptop");
				for (int i = 0; i < data.length; i++) {
					
					if(data[i] != null) {
					
						data[i].printDetails();
					}

		       
				}
				 
				productService.findProductByPrice(57000);
				
				for (int i = 0; i < data.length; i++) {
					
					if(data[i] != null) {
					
						data[i].printDetails();
					}

		       
				}
					
				
					productService.updateProductByQuantity("Laptop" ,30);
					for (int i = 0; i < data.length; i++) {
						
						if(data[i] != null) {
						
							data[i].printDetails();
						}

			       
					}
					productService.deleteByQuantity(30);
					for (int i = 0; i < data.length; i++) {
						
						if(data[i] != null) {
						
							data[i].printDetails();
						}

			       
					}
					 
					
				
				
				
	}
	}


		
	


