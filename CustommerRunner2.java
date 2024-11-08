package com.java.AccessSpecifier2;

import com.java.AccessSpecifier2.Custommer.CustommerOrder2;

public class CustommerRunner2 extends CustommerOrder2 {
	
	
		public CustommerRunner2(int orderid, String customername, int totalAmount) {
			super(orderid, customername, totalAmount);
			
		}
		public static void main(String[] args) {
			
			CustommerRunner2 runner = new CustommerRunner2(001,"thash",200);
			
			runner.processOrder();
			runner.updateStatus();
			runner.calculatetotalamount();
			
			
		}
		public  void processOrder() {
			System.out.println("Processing order ID :"+orderid);
			calculatetotalamount();
			updateStatus();
			System.out.println("order status updated as :"+orderid);
			
			
			
		}
	    protected void calculatetotalamount() {
	    	System.out.println("checking payment for the order: "+orderid+"with payment method for amount");
			 
			
	    	
			
		}
	     void updateStatus() {
	    	System.out.println("updating status....");
			
	    	
			
			
		}
	    
	   
	}






