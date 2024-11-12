package com.java.Encapsulation;

public class StudentProfileRunner {
	public static void main(String[] args) {
		StudentProfile student= new StudentProfile("thashwini",23, "femail", "madikeri","7338456766", "SDIT001","MCA","MCA", 8.8, 120,"coding club","Badminton","Reading coding","english,kannada","thashwinibm960@gmail.com","linkedin.com","github.com", true, false, "o+");
		
		
		   System.out.println("Student Name: " + student.getname());
	        System.out.println("CGPA: " + student.getcgpa());
	        System.out.println("Languages Known: " + student.getlanguagesKnown());

	}

}
