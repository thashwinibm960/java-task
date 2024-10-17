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
        WashMachine washmachine7 = new WashMachine("SAMSUNG", "medium", "5000 RPM", 8);
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

        System.out.println("......machine details ........");


        for (int i = 0; i < machinedata.length; i++) {
            if (machinedata[i] != null) {
                machinedata[i].WashMachineDetails();
                
            }
        }
         
          System.out.println("......find machine by name........");
         WashMachine foundMachine = findByMachineName("BOSCH");
         WashMachine foundMachine2 = findByMachineName("WHIRLPOOL");
         if (foundMachine != null) {
         	foundMachine.WashMachineDetails(); 
         	foundMachine2.WashMachineDetails();
         }

        
        System.out.println("......update machine by it speed and name........");

        UpdateMachineBySpeed("SAMSUNG" ,"2000 RPM");
         UpdateMachineBySpeed("IFB" ,"1500 RPM");

        for (int i=0;i< machinedata.length ;i++ ) {
        	if(machinedata[i] != null){
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

    public static WashMachine findByMachineName(String brand_name){
    	for (int i=0;i< machinedata.length ;i++ ) {
    		if (machinedata[i]!= null) {
    			if (machinedata[i].brand_name.equals(brand_name)) {
    				machinedata[i].brand_name = brand_name;
    				System.out.println("brand name find");
    				return machinedata[i];
    				
    			}
    			
    		}
    		
    	}
    	System.out.println("name not found");
    	return null;
    }


    public static boolean UpdateMachineBySpeed(String brand_name  , String speed )
    {
    	for (int i =0;i < machinedata.length ;i++ ) {
    		if(machinedata[i] != null){
    			if(machinedata[i].brand_name.equals(brand_name)){
    				machinedata[i].speed = speed;
    				System.out.println("updated machine speed");
    				return true;
    			}

    		}
    		
    	}
    	System.out.println("not updated");
    	return false;

    }
}
