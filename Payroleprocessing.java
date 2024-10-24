public class Payroleprocessing{
	public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public enum SubscriptionLevel{
	FREE, BASIC,PREMIUM,ENTERPRISE;
}
public enum VehicleType{
	CAR, TRUCK, MOTERCYCLE,BICYCLE,BUS;
}
public enum OrderProcess{

	PENDING , PROCESSING, SHIPPING , DELIVERED, CANCELLED;
	

}
public enum Payroll{
	
	CREDIT_CARD ,UPI ,DEBIT_CARD ,NET_BANKING;

}
public enum Season {
    WINTER, SPRING, SUMMER;
}

public enum Direction {
    NORTH, SOUTH, EAST, WEST;
}
public enum Brand {
    DELL, HP, LENOVO, APPLE, ASUS;
}
public enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}
public enum Animal {
    DOG, CAT, ELEPHANT, TIGER, LION;
}



	public static void main(String[] args) {
		Payroll payrollCard = Payroll.CREDIT_CARD;
		 Day today = Day.WEDNESDAY;
		 OrderProcess process=OrderProcess.SHIPPING;
		 VehicleType typeofvehicle =VehicleType.BUS;
		 SubscriptionLevel level=SubscriptionLevel.ENTERPRISE;
		 Season currentSeason = Season.SUMMER;
		 Direction travelDirection = Direction.NORTH;
		 Month birthMonth = Month.DECEMBER;
		 Brand laptopBrand = Brand.APPLE;
		 Animal petAnimal = Animal.CAT;

		System.out.println("payment mode is:" + payrollCard);
		System.out.println("Today is: " + today);
		System.out.println("order is in: " + process);
		System.out.println("Today i am traveling in: " + typeofvehicle);
		System.out.println("Subscription Level is : " + level);
		System.out.println("Current season is: " + currentSeason);
		System.out.println("Traveling direction is: " + travelDirection);
		System.out.println("My birth month is: " + birthMonth);
		System.out.println("My laptop brand is: " + laptopBrand);
		System.out.println("My pet animal is: " + petAnimal);

	}
	
}

