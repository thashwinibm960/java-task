public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Tesla Model S", Vehicle.VehicleType.CAR, 79999.99, true);
        Vehicle vehicle2 = new Vehicle("Ford F-150", Vehicle.VehicleType.TRUCK, 29999.99, false);
        Vehicle vehicle3 = new Vehicle("Harley-Davidson", Vehicle.VehicleType.MOTORCYCLE, 19999.99, false);
        Vehicle vehicle4 = new Vehicle("Giant Escape 3", Vehicle.VehicleType.BICYCLE, 499.99, false);
        Vehicle vehicle5 = new Vehicle("Bluebird All American", Vehicle.VehicleType.BUS, 85000.00, true);

        vehicle1.printDetails();
        vehicle2.printDetails();
        vehicle3.printDetails();
        vehicle4.printDetails();
        vehicle5.printDetails();
    }
}