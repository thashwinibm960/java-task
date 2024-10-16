public class MachineDetails {

    static WashMachine[] machinedata = new WashMachine[9];

    public static void main(String[] args) {

        WashMachine washmachine = new WashMachine("LG", "Small", "800 RPM", 6);
        WashMachine washmachine1 = new WashMachine("SAMSUNG", "medium", "1000 RPM", 7);
        WashMachine washmachine2 = new WashMachine("WHIRLPOOL", "large", "1400 RPM", 12);
        WashMachine washmachine3 = new WashMachine("BOSCH", "Small", "800 RPM", 6);
        WashMachine washmachine4 = new WashMachine("IFB", "medium", "1000 RPM", 7);
        WashMachine washmachine5 = new WashMachine("HAIER", "large", "1800 RPM", 12);
        WashMachine washmachine6 = new WashMachine("LG", "Small", "800 RPM", 6);
        WashMachine washmachine7 = new WashMachine("SAMSUNG", "medium", "1000 RPM", 7);
        WashMachine washmachine8 = new WashMachine("HAIER", "large", "1800 RPM", 12);

       
        SaveDetails(washmachine); 
        SaveDetails(washmachine1);
        SaveDetails(washmachine2);
        SaveDetails(washmachine3);
        SaveDetails(washmachine4);
        SaveDetails(washmachine5);
        SaveDetails(washmachine6);
        SaveDetails(washmachine7);
        SaveDetails(washmachine8);


        for (int i = 0; i < machinedata.length; i++) {
            if (machinedata[i] != null) {
                machinedata[i].WashMachineDetails();
            }
        }
    }

    public static boolean SaveDetails(WashMachine washmachine) {
        for (int i = 0; i < machinedata.length; i++) {
            if (machinedata[i] == null) {
                machinedata[i] = washmachine;
                System.out.println("Details saved");
                return true;
            }
        }
        System.out.println("Space full");
        return false;
    }
}
