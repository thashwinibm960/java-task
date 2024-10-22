public class StringCreator{
	public static void main(String[] args) {
		String day = "monday";
		String festival ="deepavali";
		String product = "iPhone 14";
		String name = "thashwini";
		String location = "madikeri";
		String month = "march";
		String mobile_brand = "Samsung Galaxy S23";
		String smart_watch = "Samsung Galaxy Watch 5";
		String laptop = "dell";
		String mobile_brand2 = "vivo";


		String day1 = new String("monday");
		String festival1 = new String("deepavali");
		String product1 = new String("iPhone 14");
		String name1 = new String("thashwini");
		String location1 = new String("madikeri");
		String month1 = new String("march");
	    String mobile_brand1 = new String("Samsung Galaxy S23");
		String smart_watch1 = new String("Samsung Galaxy Watch 5");
		String laptop1 = new String("dell");
		String smart_watch2 = new String("vivo");




		System.out.println(day.equals(day1));
        System.out.println(festival.equals(festival1));
        System.out.println(product.equals(product1));
        System.out.println(name.equals(name1));
        System.out.println(location.equals(location1));
        System.out.println(month.equals(month1));
        System.out.println(mobile_brand.equals(mobile_brand1));
        System.out.println(smart_watch.equals(smart_watch1));
        System.out.println(laptop.equals(laptop1));
        System.out.println(mobile_brand2.equals(smart_watch2));


		char[] charArray =smart_watch1.toCharArray();
		String value="";
		for (int i = charArray.length-1;i>=0  ; i-- ) {
			value =value + charArray[i];
			
		}
		System.out.println(value);

		char[] charArray1 =month1.toCharArray();
		String value1="";
		for (int i = charArray1.length-1;i>=0  ; i-- ) {
			value1 =value1 + charArray1[i];
			
		}
		System.out.println(value1);

		char[] charArray2 =location.toCharArray();
		String value2="";
		for (int i = charArray2.length-1;i>=0  ; i-- ) {
			value2 =value2 + charArray2[i];
			
		}
		System.out.println(value2);


		char[] charArray3 =mobile_brand.toCharArray();
		String value3="";
		for (int i = charArray3.length-1;i>=0  ; i-- ) {
			value3 =value3 + charArray3[i];
			
		}
		System.out.println(value3);






	}
}