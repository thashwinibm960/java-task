public class StringMethod{


	public static void main(String[] args) {

		System.out.println("............concat string......................");
		String festival = "deepavali";
		String concatenatedValue = festival.concat("  festival");
 		System.out.println(concatenatedValue);


 		System.out.println("...............spliting String.......................");
 		String product ="Samsung Galaxy S23";
 		String[] splitedString = product.split(" ");
		System.out.println(splitedString[0]);
		System.out.println(splitedString[1]);
		System.out.println(splitedString[2]);


		System.out.println(".............triming space.........................");
		String laptop = "  dell   ";
		String trimString = laptop.trim();
		System.out.println(trimString);


		System.out.println(".............upper case.........................");
		String location = "madikeri";
		String upperCase = location.toUpperCase();
		System.out.println(upperCase);


		System.out.println(".................lower case.....................");
		String mobile_brand2 = "VIVO";
		String lowerCase = mobile_brand2.toLowerCase();
		System.out.println(lowerCase);



		System.out.println("......................................");
		String name = "thashwini";
		char[] charArray3 =name.toCharArray();
		System.out.println(charArray3);



		System.out.println("..............checking if string is empty........................");
		String month = "march";
		boolean isEmpty = month.isEmpty();
		System.out.println(isEmpty);

		

		System.out.println("............palindrome string..........................");
		String palindrome = "racecar"; 
		char[] charArray =palindrome.toCharArray();
		String value="";
		for (int i = charArray.length-1;i>=0  ; i-- ) {
			value =value + charArray[i];

			}
		System.out.println(value);
		if (value.equals(palindrome)){
				System.out.println(" is palindrome");

			}
			else
			{
				System.out.println(" not a palindrome");
			}





		System.out.println(".............finding 2nd largest.........................");
		int[] even = {6,23,34,21,12,80,98,87,69,99};
		
		int n = even.length;
		int largeValue = 0;
		int secondLargest = 0;

		for (int i = 0 ; i < n ; i++ ) {
			if(even[i] > largeValue){
				secondLargest = largeValue;
				largeValue = even[i];
			}
		}
		System.out.println(secondLargest);
	}

	}

	