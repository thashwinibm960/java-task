 


public class Text {
    
 public static void main(String[] args) {

                            
     getinfo("thashwini");
      getinfo("thashwini" , 7338678);
       getinfo(5674829, "thashwini");
       employdetails(001);
       employdetails(002,"testing");
       employdetails("thashwini" , 7338678);
       adress(98);
       adress("Madikeri" ,571235);
       adress(7338678,"Karnataka");
 }
     public static void getinfo(String name)
      {
     	System.out.println("name is:" + name);
     	
     	
     }
 	 public static void getinfo(String name , int phone_num)
      {
     	System.out.println("name is:" + name);
     	System.out.println("phone_num is:" + phone_num);
     	
     	
     	
     }
 	 public static void getinfo(int phone_num , String name)
      {
     	System.out.println("phone_num is:" + phone_num);
     	System.out.println("name is:" + name);
     	
     	
     	
     }
     public static void employdetails(int id)
     {
     	System.out.println("employ id is:" + id);
     }
 	 
	 public static void employdetails(int id ,String dept)
     {
     	System.out.println("employ id is:" + id);
     	System.out.println("employ dept is:" + dept);
     }
 	  public static void employdetails(String name ,int phone_num )
     {
     	System.out.println("employ name is:" + name);
     	System.out.println("employ phone_num:" + phone_num);
     }
 	  public static void adress(int dore_no)
     {
     	System.out.println("employ dore_no is:" + dore_no);
     }
      public static void adress(String city, int pincode)
     {
     	System.out.println("employ city is:" + city);
     	System.out.println("employ pincode is:" + pincode);


     }
     public static void adress(int phone_num, String state)
     {
     	System.out.println("employ phone_num is:" + phone_num);
     	System.out.println("employ state is:" + state);


     }
 	 
 	 
}
