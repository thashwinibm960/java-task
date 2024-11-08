package com.java.AccessSpecifier;

public class CustommerRunner extends CustomerOrder {
	
	public CustommerRunner(int orderid, String customername, int totalAmount) {
		super(orderid, customername, totalAmount);
		
	}
	public static void main(String[] args) {
		
		CustommerRunner runner = new CustommerRunner(001,"thash",200);
		
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



