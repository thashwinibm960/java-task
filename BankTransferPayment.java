package com.java.MethodOverriding.Payment;

public class BankTransferPayment extends PaymentMethod  {
	
	    String bankAccount;

	    public BankTransferPayment( double transactionFees,String paymentName, String currency, String bankAccount) {
	        super(transactionFees, paymentName, currency);
	        this.bankAccount = bankAccount;
	    }

	   
	    @Override
	    public void processPayment(double amount) {
	    	double totalAmount = amount + transactionFees;
	        System.out.println("Processing Bank Transfer payment of " + amount + " " + currency + " from account " + bankAccount);
	        System.out.println("Total amount charged (including fee): " + totalAmount + " " + currency);
	    }
	}




