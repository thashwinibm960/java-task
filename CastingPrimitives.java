package com.java.Casting;

public class CastingPrimitives {
	
	
	
	public static void main(String[] args ) {
		
		System.out.println("upcasting in primitives:");
		int val =100;
		long val1=val;
		
		System.out.println("print the values int to long:"+val1);
		
		float num=10.5f;
		double num1=num;
		
		System.out.println("print the values float to double:"+num1);
		
		byte data1=20;
		short data2=data1;
		
		System.out.println("print the values byte to shor:"+data2);
		
		char char1='K';
		int  char2= char1;
		
		System.out.println("print the values character to int:"+char2);
		
		
		System.out.println("downcasting in primitives:");
		
		double percent1=90.99;
		int percent2 = (int)percent1;
		
		System.out.println("print the values double to int:"+percent2);
		
		float mark1=  55.8f;
		int mark2= (int)mark1;
		
		System.out.println("print the values float to int:"+mark2);
		
		short num4=128;
		byte num3=(byte)num4;
		
		System.out.println("print the values short to byte:"+num3);
		
		int value=80;
		char value2=(char)value;
		
		System.out.println("print the values int to char:"+value2);
		
		
		
	}
	
	

	
	
	

}
