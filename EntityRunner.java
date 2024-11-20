package com.java.Entity.information;

import com.java.Entity.Entity;
import com.java.Entity.service.ValidationImpl;

public class EntityRunner {
	
	    public static void main(String[] args) {
	        Entity entity = new Entity("thashwini", 25, "thashwinibm960@gmail.com", "73384567", "madikeri");

	       
	        ValidationImpl validator = new ValidationImpl();
	         validator.validate(entity);

	    }
	}


