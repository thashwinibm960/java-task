public class Loops{
	
	


	public static void main(String[] args){
        byte[] even={2,4,6,8,10,12,14,16,18,20};
        int[] marks={32,54,45,67,76,87,78,67,58,48};	


	
	  System.out.println("FOR condition for int");
        //FOR condition for int
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
        
}
	}