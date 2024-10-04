


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thash
 */
public class parameter {
    public static void main(String[] args) {
	 	email("thashwinibm456@gmail.com" , "create email");
	 	email("yuhrddgt567@gmail.com" ,"send email");
	 	email("irhhjdudlk234@gmail.com", "received email");
                
                phonecall(733845676,"thashwini");
                phonecall(456826887,"tharunya");
                phonecall(356715657,"thananya");
                
                login("thashwinibm345@gmail.com","Thash@123");
                login("tharunyabm345@gmail.com","Tharu@123");
                login("thananyabm345@gmail.com","Thanya@123");
 
    }
    public static void email(String emailid, String subject){
	System.out.println("Sending email to:" + emailid);
	System.out.println("subject:" + subject);

	}
    public static void phonecall(int mobileno,String name){
    	System.out.println("num:" + mobileno);
    	System.out.println("nam:" + name);
        
    
    }
     public static void login(String emailid,String password){
        
        System.out.println("mailid:" + emailid);
        System.out.println("password:" + password);
        
        
        
    }  
}
