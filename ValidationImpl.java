package com.java.Entity.service;

import com.java.Entity.Entity;

public class ValidationImpl implements validation {

	@Override
	public boolean validate(Entity entity) {
		 if (entity.getName() == null || entity.getName().isEmpty()) {
			 if (entity.getAge() <= 0 || entity.getAge() > 120) {
				 if (entity.getEmail() == null || !entity.getEmail().contains("@")) {
					  if (entity.getPhonenumber() == null || entity.getPhonenumber().length() != 10) {
						  if (entity.getAddress() == null || entity.getAddress().isEmpty()) {
					            System.out.println("Address cannot be empty.");
					            return false;
					        }
				            System.out.println("Phone number must be 10 digits.");
				            return false;
				        }
			            System.out.println("Invalid email.");
			            return false;
			        }
		            System.out.println("Age must be between 1 and 120.");
		            return false;
		        }
			 System.out.println("Name cannot be empty.");
	            return false;
	           
	        }

	      System.out.println("data saved ");
			return true;

			
	}

		
		
	}
	


