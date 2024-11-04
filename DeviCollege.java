public class DeviCollege extends CollegeDetails{
	
	int numberOfDepartments;
	int numberOfClassRooms;

	public DeviCollege(HeadOfDepartment[] hod, Principal principal, Students[] student, Professors[] professors, int numberOfDepartments, int numberOfClassRooms){
		super(hod, principal, student, professors);
		this.numberOfClassRooms = numberOfClassRooms;
		this.numberOfDepartments = numberOfDepartments;
	}

	public void printDetails(){

		System.out.println(".....SHREE DEVI COLLEGE DETAILS...");

		for(int i = 0; i<hod.length; i++){
			System.out.println("hod details:");
			hod[i].printDetails();
		}

		
			System.out.println("Principal details:");
			principal.printDetails();
		

		for(int i = 0; i<professors.length; i++){
			System.out.println("Professors details:");
			professors[i].printDetails();
		}

		for(int i = 0; i<student.length; i++){
			System.out.println("Students details:");
			student[i].printDetails();
		}

		System.out.println("Number of Department is:"+numberOfDepartments);
		System.out.println("Noumber of Classes is:"+numberOfClassRooms);
	}
}
