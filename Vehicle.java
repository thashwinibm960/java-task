public class Vehicle {
    public enum VehicleType {
        CAR, TRUCK, MOTORCYCLE, BICYCLE, BUS
    }

    static String manufacturer;
    static int wheels;
    static String fuelType;

    String model;
    VehicleType type;
    double price; // in USD
    boolean hasAirConditioning;

    static {
        manufacturer = "AutoCorp";
        wheels = 4; 
        fuelType = "Gasoline"; 
    }

    public Vehicle(String model, VehicleType type, double price, boolean hasAirConditioning) {
        this.model = model;
        this.type = type;
        this.price = price;
        this.hasAirConditioning = hasAirConditioning;
    }

    public void printDetails() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Wheels: " + wheels);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Model: " + model);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("Has Air Conditioning: " + hasAirConditioning);
        System.out.println(); 
    }
}


