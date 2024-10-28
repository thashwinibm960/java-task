public class PhoneRunner{
	public static void main(String[] args) {
		Phone phone= new Phone("redmi",128,15000,"white");
		Phone phone1= new Phone("redmi",128,15000,"white","8gb");

		phone.printdetails();
		phone1.printdetails();
	}
}