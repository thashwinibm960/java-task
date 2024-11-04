public class CauveryCollege extends CollegeDetails{
	
	int numberOfFestivals;
	

	public CauveryCollege(HeadOfDepartment[] hod, Principal principal, Students[] student, Professors[] professors, int numberOfFestivals){
		super(hod, principal, student, professors);
		this.numberOfFestivals = numberOfFestivals;
	}

	public void printDetails(){

		System.out.println("...CAUVERY COLLEGE DETAILS...");

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

		System.out.println("Number of Festivals is:"+numberOfFestivals);
		
	}
}
