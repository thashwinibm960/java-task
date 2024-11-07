package com.java.MethodOverriding.Payment;

public class PayPalPayment extends PaymentMethod 
	 {
	    String paypalAccount;

	    public PayPalPayment(double transactionFees,String paymentName,String currency,  String paypalAccount) {
	        super(transactionFees, paymentName, currency);
	        this.paypalAccount = paypalAccount;
	    }

	    
	    @Override
	    public void processPayment(double amount) {
	    	double totalAmount = amount + transactionFees;
	        System.out.println("Processing PayPal payment of " + amount + " " + currency + " using account " + paypalAccount);
	        System.out.println("Total amount charged (including fee): " + totalAmount + " " + currency);
	    }
	}



