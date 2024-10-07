/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thash
 */
public class DataTypesValues {
    public static void main(String[] args){
        byte output = getByteValue();
       System.out.println("the byte value is :" + output);
        int result1 = getIntValue();
       System.out.println("the int value is :" + result1);
       short result2=getShortValue();
       System.out.println("the short value is :" + result2);
       long result3=getLongValue();
       System.out.println("the long value is :" + result3);
       float result4=getFloatValue();
       System.out.println("the float value is :" + result4);
       double result5=getDoubleValue();
       System.out.println("the double value is :" + result5);
       char result6=getCharValue();
       System.out.println("the char value is :" + result6);
       
        
        
       boolean result = getBooleanValue();
       System.out.println("the boolean value is :" + result);
       }   
    public static byte getByteValue(){
        System.out.println("declareing a byte value ");
        byte value =20;
        System.out.println("returning a byte value");
        return value;
}
    public static int getIntValue(){
        System.out.println("declareing a int value ");
        int value =10;
        System.out.println("returning a int value");
        return value;
}
     public static short getShortValue(){
        System.out.println("declareing a short value ");
        short value =30;
        System.out.println("returning a short value");
        return value;
}
     public static long getLongValue(){
        System.out.println("declareing a long value ");
        long value =20;
        System.out.println("returning a long value");
        return value;
}
     public static float getFloatValue(){
        System.out.println("declareing a float value ");
        float value =30;
        System.out.println("returning a float value");
        return value;
}
     public static double getDoubleValue(){
        System.out.println("declareing a double value ");
        double value =10;
        System.out.println("returning a double value");
        return value;
}
     public static char getCharValue(){
        System.out.println("declareing a char value ");
        char value ='a';
        System.out.println("returning a char value");
        return value;
}
     public static boolean getBooleanValue(){
        System.out.println("declareing a boolean value ");
        int  value=1;
        
        if(value == 1)
        {
        return true;
        }
        else{
           return false;
        }
}
}
