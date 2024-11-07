package com.java.MethodOverriding;

import com.java.MethodOverriding.Payment.CreditCardMethod;
import com.java.MethodOverriding.Payment.PayPalPayment;
import com.java.MethodOverriding.Payment.BankTransferPayment;
import com.java.MethodOverriding.Payment.PaymentMethod;

public class PaymentMethodRunner {
	
	    public static void main(String[] args) {
	        PaymentMethod creditCard = new CreditCardMethod(2.5,"Credit Card", "USD", "1234567812345678");
	        PaymentMethod paypal = new PayPalPayment(1.5,"PayPal",  "USD", "user@example.com");
	        PaymentMethod bankTransfer = new BankTransferPayment( 3.0,"Bank Transfer", "USD", "987654321");

	        
	        System.out.println("Credit Card Payment:");
	        creditCard.displayPaymentDetails();
	        creditCard.processPayment(100.0);

	        System.out.println("\nPayPal Payment:");
	        paypal.displayPaymentDetails();
	        paypal.processPayment(100.0);

	        System.out.println("\nBank Transfer Payment:");
	        bankTransfer.displayPaymentDetails();
	        bankTransfer.processPayment(100.0);
	    }
	}

	
	
	

