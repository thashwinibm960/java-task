public class DeviceRunner {
    public static void main(String[] args) {
        Device device1 = new Device("iPhone 14", Device.DeviceType.SMARTPHONE, 999.99, true);
        Device device2 = new Device("Dell XPS 13", Device.DeviceType.LAPTOP, 1299.99, false);
        Device device3 = new Device("iPad Pro", Device.DeviceType.TABLET, 799.99, false);
        Device device4 = new Device("Apple Watch Series 8", Device.DeviceType.SMARTWATCH, 399.99, true);
        Device device5 = new Device("iMac 24", Device.DeviceType.DESKTOP, 1499.99, false);

        device1.printDetails();
        device2.printDetails();
        device3.printDetails();
        device4.printDetails();
        device5.printDetails();
    }
}
