public class WashMachine{
	
	String brand_name;
	String capacity;
	String speed;
	int kg;


	public WashMachine(String brand_name,String capacity,String speed,int kg){
		this.brand_name = brand_name;
		this.capacity = capacity;
		this.speed =speed;
		this.kg = kg;


	}
	 public void WashMachineDetails() { // Changed to non-static
        System.out.println("brand name: " + brand_name);
        System.out.println("capacity: " + capacity);
        System.out.println(" speed: " + speed);
        System.out.println("kg: " + kg);
    }
}