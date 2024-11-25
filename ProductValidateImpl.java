package com.java.Product.Service;

import com.java.Product.Product;

import com.java.Product.Repo.ProductRepo;


public class ProductValidateImpl {
	private ProductRepo repo = new 	ProductRepo();
    public boolean validateProduct(Product product) {
        if (product.getProductName() != null ) {
        	if (product.getPrice() >10000) {
        		 if (product.getQuantity() > 20) {
        			 if (product.getCategory() != null ) {
        				 System.out.println("data saved");
        				 return repo.saveproduct(product);
        				
        		            
        		        }
        	            
        	        }    
            }
        	
        }
        System.out.println("data not valide");
        return false;
    }
    public Product[] readAll() {
		
		return repo.readAll();
	}
    
    public String findProductByName(String productName) {
    	if(productName != null && !productName.isEmpty()){
    		
    		System.out.println("product found:");
    		
    		return repo.findProductByName(productName);
    		
    	}
    	System.out.println("brand name not valide");
    	return null;	
    }
    
    public boolean updateProductByPrice(String productName,int price) {
    	if(productName != null && !productName.isEmpty()){
    		System.out.println("after updating the price the products is:");
    		
    		return repo.updateProductByPrice(productName, price);
		 
		
		
	}
	System.out.println("brand name not valide");
	return false;	
}
    
    public boolean deleteByName(String productName) {
    	if(productName != null && !productName.isEmpty()){
    		System.out.println("product is deleted");
    		
    	return repo.deleteByName(productName);
    	}
    	System.out.println("brand name not valide");
        return false;
		
    }
    
    public int findProductByPrice(int price) {
    	if(price != 0 && price > 10000){
    		
    		System.out.println("product found:");
    		
    		return repo.findProductByPrice(price);
    		
    	}
    	System.out.println("brand name not valide");
    	return 0;	
    }
    
    public boolean updateProductByQuantity(String productName,int quantity) {
    	if(productName != null && !productName.isEmpty()){
    		System.out.println("after updating the quantity the products is:");
    		
    		return repo.updateProductByQuantity(productName, quantity);
		 
		
		
	}
	System.out.println("brand name not valide");
	return false;	
}
    
    public boolean deleteByQuantity(int quantity) {
    	if(quantity != 0 && quantity > 10){
    		System.out.println("product is deleted");
    		
    	return repo.deleteByQuantity(quantity);
    	}
    	System.out.println("brand name not valide");
        return false;
		
    }
    
    }
 	
    

    
    






