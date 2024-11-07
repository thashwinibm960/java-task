package com.java.MethodOverriding.Payment;

public class PaymentMethod {
	double transactionFees;
	String paymentName;
	String currency ;
	
	public PaymentMethod(double transactionFees,String paymentName,String currency) 
	{
		this.transactionFees=transactionFees;
		this.paymentName=paymentName;
		this.currency=currency ;
	
	}
	public void processPayment(double amount) {
		System.out.println("processing amount of "+amount+""+currency);
	}
	public void displayPaymentDetails() {
	    System.out.println("Payment Method: " + paymentName);
	    System.out.println("Transaction Fees: " + transactionFees + " " + currency);
	    System.out.println("Currency: " + currency);
	}


}



