<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thash
 */
public class JavaArray {
    
    public static void main(String[] args){
        byte[] even={2,4,6,8,10,12,14,16,18,20};
        int[] marks={43,56,23,76,97,23,56,23,45,43};
        float[] floatArray = {0.0f, 1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f};
        long[] longArray = {10L,20L,30L,40L,50L,30L,60L,70L,80L,40L};
        double[] root = {1.0,1.41,1.73,2.0,2.24,2.45,2.65,2.83,3.0,3.16};
        char[] chararray = {'A','H','B','C','D','E','F','G','I','J'};
        short[] shortarray = {90,80,60,70,80,70,100,120,80,60};
        
        System.out.println("FOR condition for byte");
        
    
         for(byte i=0; i<10; i++)
        	System.out.println(even[i]);
        for(byte i=9; i>=0; i--)
        	System.out.println(even[i]);
        for(byte i=5; i<10; i++)
        	System.out.println(even[i]);
        for(byte i=9; i>=4; i--)
        	System.out.println(even[i]);
        for(byte i=0; i<10; i +=2)
        	System.out.println(even[i]);
        
        
        System.out.println("FOR condition for int");
        
        for(int i=0; i<10; i++)
        	System.out.println(marks[i]);
        for(int i=9; i>=0; i--)
        	System.out.println(marks[i]);
        for(int i=5; i<10; i++)
        	System.out.println(marks[i]);
        for(int i=9; i>=4; i--)
        	System.out.println(marks[i]);
        for(int i=0; i<10; i +=2)
        	System.out.println(marks[i]);
        
        
System.out.println("FOR condition for long");
        
        for(int i = 0; i < 10; i++) 
            System.out.println(longArray[i]);
        for(int i = 9; i >= 0; i--) 
            System.out.println(longArray[i]);
        for(int i = 5; i < 10; i++) 
            System.out.println(longArray[i]);
        for(int i = 9; i >= 4; i--) 
            System.out.println(longArray[i]);
        for(int i = 0; i < 10; i += 2) 
            System.out.println(longArray[i]);
        
        
        System.out.println("FOR condition for float");
        
        for(int i = 0; i < 10; i++) 
            System.out.println(floatArray[i]);
        for(int i = 9; i >= 0; i--) 
            System.out.println(floatArray[i]);
        for(int i = 5; i < 10; i++) 
            System.out.println(floatArray[i]);
        for(int i = 9; i >= 4; i--) 
            System.out.println(floatArray[i]);
        for(int i = 0; i < 10; i += 2) 
            System.out.println(floatArray[i]);
        
        
        System.out.println("FOR condition for char");
        
     
        for(char i=9; i>=0; i--)
        	System.out.println(chararray[i]);
        for(char i=7; i<10; i++)
        	System.out.println(chararray[i]);
        for(char i=9; i>=5; i--)
        	System.out.println(chararray[i]);
        for(char i=0; i<10; i +=2)
        	System.out.println(chararray[i]);
         for(char i=0; i<10; i++)
        	System.out.println(chararray[i]);
         
         
           System.out.println("FOR condition for short");
         
         for(short i=9; i>=5; i--)
        	System.out.println(shortarray[i]);
         for(short i=7; i<10; i++)
        	System.out.println(shortarray[i]);
        for(short i=9; i>=5; i--)
        	System.out.println(shortarray[i]);
        for(short i=0; i<10; i +=2)
        	System.out.println(shortarray[i]);
         for(short i=0; i<10; i++)
        	System.out.println(shortarray[i]);
        

}
    
}

