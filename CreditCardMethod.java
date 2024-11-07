package com.java.MethodOverriding.Payment;

public class CreditCardMethod extends PaymentMethod {
	
	    String cardNumber;
	

	    public CreditCardMethod(double transactionFees,String paymentName,String currency, String cardNumber) {
	        super(transactionFees, paymentName, currency);
	        this.cardNumber = cardNumber;
	    }

	    
	    @Override
	    public void processPayment(double amount) {
	    	double totalAmount = amount + transactionFees;
	        System.out.println("Processing Credit Card payment of " + amount +" " + currency + " with card number ending in " +cardNumber.substring(cardNumber.length() - 4));
	        System.out.println("Total amount charged (including fee): " + totalAmount + " " + currency);
	    }

	}


