public class Phone{
	String brandName;
	int storage;
	int price;
	String color;
	String ram;

	public Phone(){
		System.out.println("no parameter ");
	}
	public Phone(String brandName){
		this();
		this.brandName=brandName;

	}
	public Phone(String brandName,int storage){
		this(brandName);
		this.storage=storage;

	}
	public Phone(String brandName,int storage,int price,String color){
		this(brandName,storage);
		this.price=price;
		this.color=color;

	}
	public Phone(String brandName,int storage,int price,String color,String ram){
		this(brandName,storage,price,color);
		this.ram=ram;
	
	}
	public void printdetails(){
		System.out.println("brandName is"+brandName);
		System.out.println("phone storage is :"+storage);
		System.out.println("phone price:"+price);
		System.out.println("color of the phone:"+color);
		System.out.println("ram:"+ram);
	}
}