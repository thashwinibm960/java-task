public class CollegRunner{

	public static void main(String[] args) {

		HeadOfDepartment hod1 = new HeadOfDepartment("lekha", 55, 65000.00f, "MCA");
		HeadOfDepartment hod2 = new HeadOfDepartment("tharunya", 45, 65000.00f, "MBA");

		HeadOfDepartment[] hod = {hod1, hod2};

		Principal princi1 = new Principal("thananya", 88, 1000000.00f, 4);

		Professors professor1 = new Professors("sameeksha", 28, 40000.00f, "JAVA");
		Professors professor2 = new Professors("deepthi", 30, 45000.00f, "Python");
		Professors professor3 = new Professors("thajeswi", 35, 42000.00f, "C++");
		Professors professor4 = new Professors("thashwini", 40, 35000.00f, "JavaScript");

		Professors[] professor = {professor1, professor2, professor3, professor4};


		Students student1 = new Students("deepthi d", 24, "MCA");
		Students student2 = new Students("manya", 25, "MBA");
		Students student3 = new Students("vinya", 23, "MCA");
		Students student4 = new Students("harshitha", 24, "MBA");
		Students student5 = new Students("supritha", 23, "MCA");
		Students[] student = {student1,student2, student3, student4, student5};

		DeviCollege devi = new DeviCollege(hod, princi1, student, professor,4,12);
		devi.printDetails();


		HeadOfDepartment hod3 = new HeadOfDepartment("pooja", 55, 65000.00f, "MCA");
		HeadOfDepartment hod4 = new HeadOfDepartment("manavi", 45, 65000.00f, "MBA");

		HeadOfDepartment[] d_hod = {hod3, hod4};

		Principal princi2 = new Principal("sukshma", 60, 1000000.00f, 2);

		Professors professor5 = new Professors("rachana", 28, 40000.00f, "JAVA");
		Professors professor6 = new Professors("amitha", 30, 45000.00f, "Python");
		Professors professor7 = new Professors("vyashnavi", 35, 42000.00f, "C++");
		Professors professor8 = new Professors("aradhaya", 40, 35000.00f, "JavaScript");

		Professors[] d_professor = {professor5, professor6, professor7, professor8};


		
		Students student6 = new Students("nalani", 25, "MBA");
		Students student7 = new Students("drithi", 23, "MCA");
		Students student8 = new Students("dvithi", 24, "MBA");
		Students student9 = new Students("hatvik", 23, "MCA");
		Students[] d_student = {student6, student7, student8, student9};



		CauveryCollege cauvery = new CauveryCollege(d_hod, princi2, d_student, d_professor,15);
		cauvery.printDetails();

	}
}
