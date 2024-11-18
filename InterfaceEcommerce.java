package com.java.Interface;

public class InterfaceEcommerce implements InterfaceOrderprocess , InterfaceCustomersupport{

	@Override
	public void provideSupport() {
		
		System.out.println("Provide support to the customer");
		
		
	}

	@Override
	public void processOrder() {
		System.out.println("processing order to the customer");
		
		
	}

}
