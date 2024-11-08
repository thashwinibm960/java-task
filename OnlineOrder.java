package com.java.AccessSpecifier;

public class OnlineOrder extends CustommerRunner{
	public String deliveryAddress; 
	
	
	    private OnlineOrder(int orderid, String customername, int totalAmount,  String deliveryAddress) {
	        super(orderid, customername, totalAmount);
	        this.deliveryAddress = deliveryAddress;
	    }

	    @Override
	    public void processOrder() {
	        System.out.println("Processing online order ID: " + orderid);
	        verifyDeliveryAddress();
			System.out.println("Order status updated to: " + customername);
	    }


		private void verifyDeliveryAddress() {
	        System.out.println("Verifying delivery address: " + deliveryAddress);
	      
	    }

	  


		
	}


