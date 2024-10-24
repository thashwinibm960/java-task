public class Device {
    public enum DeviceType {
        SMARTPHONE, LAPTOP, TABLET, SMARTWATCH, DESKTOP
    }

    static String manufacturer;
    static int warrantyPeriod; 
    static String commonOS;

    String model;
    DeviceType type;
    double price; 
    boolean is5GCompatible;

    static {
        manufacturer = "TechCorp";
        warrantyPeriod = 24; 
        commonOS = "Operating System"; 
    }

    public Device(String model, DeviceType type, double price, boolean is5GCompatible) {
        this.model = model;
        this.type = type;
        this.price = price;
        this.is5GCompatible = is5GCompatible;
    }

    public void printDetails() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
        System.out.println("Common OS: " + commonOS);
        System.out.println("Model: " + model);
        System.out.println("Device Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println("5G Compatible: " + is5GCompatible);
        System.out.println(); 
    }
}
