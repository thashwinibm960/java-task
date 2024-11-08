package com.java.AccessSpecifier2.Custommer;

public class CustommerOrder2 {
	
		
		protected  int orderid;
		public String customername;
		private String orderDate;
		int totalAmount;
		
		public CustommerOrder2(int orderid,String customername,int totalAmount) {
			this.orderid=orderid;
			this.customername = customername;
			this.totalAmount= totalAmount;
			
		}
		 CustommerOrder2( String orderDate) {
			this.orderDate = orderDate;
		
		}
		
		public void printDetails() {
			System.out.println("the order id is:"+orderid);
			System.out.println("the customer name is:"+customername);
			System.out.println("the order Date is:"+orderDate);
			System.out.println("the total Amount is:"+totalAmount);
		}
		
		

	}

