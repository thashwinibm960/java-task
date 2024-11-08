package com.java.AccessSpecifier2.Custommer;

import com.java.AccessSpecifier2.CustommerRunner2;

public class OnlineOrder2 extends CustommerRunner2{
	public String deliveryAddress; 
	
	
    private OnlineOrder2(int orderid, String customername, int totalAmount,  String deliveryAddress) {
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


