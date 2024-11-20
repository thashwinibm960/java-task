package com.java.Entity.information;

import com.java.Entity.Entity;
import com.java.Entity.service.ValidationImpl;

public class EntityRunner {
	
	    public static void main(String[] args) {
	        Entity entity = new Entity("John Doe", 25, "john.doe@example.com", "1234567890", "123 Main St");

	        // Using the interface reference to call validate
	        ValidationImpl validator = new ValidationImpl();
	        boolean isValid = validator.validate(entity);

	        if (isValid) {
	            System.out.println("Entity is valid.");
	        } else {
	            System.out.println("Entity validation failed.");
	        }
	    }
	}


