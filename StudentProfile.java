package com.java.Encapsulation;

public class StudentProfile {
	
	    
	    private String name;
	    private int age;
	    private String gender;
	    private String address;
	    private String phoneNumber;

	    
	    private String studentId;
	    private String courseName;
	    private String department;
	    private double cgpa;
	    private int totalCredits;

	   
	    private String clubMembership;
	    private String sportsParticipation;
	    private String hobbies;
	    private String languagesKnown;

	   
	    private String email;
	    private String linkedInProfile;
	    private String githubProfile;

	   
	    private boolean hasScholarship;
	    private boolean isHostelResident;
	    private String bloodGroup;

	    
	    public StudentProfile(String name,int age,String gender,String address,String phoneNumber,String studentId,String courseName,String department,double cgpa,int totalCredits,String clubMembership,String sportsParticipation,String hobbies,String languagesKnown,String email,String linkedInProfile,String githubProfile,  boolean hasScholarship,boolean isHostelResident,String bloodGroup) {

	    	this.name = name;
		    this.age=age;
		    this.gender = gender;
		    this.address = address;
		    this.phoneNumber = phoneNumber;
		    this.studentId = studentId;
		    this.courseName =courseName;
		    this.department=department;
		    this.cgpa=cgpa;
		    this.totalCredits=totalCredits;
		    this.clubMembership=clubMembership;
		    this.sportsParticipation=sportsParticipation;
		    this.hobbies=hobbies;
			this.languagesKnown=languagesKnown;
			this.email=email;
		    this.linkedInProfile=linkedInProfile;
		    this.githubProfile=githubProfile;
		    this.hasScholarship=hasScholarship;
		    this.isHostelResident=isHostelResident;
		    this.bloodGroup=bloodGroup;
		    
		    
	    }
		    
			public String getname() {
		    	System.out.println("print name");
		    	return name;

	       
	    }
		    public int getage() {
		    	System.out.println("print age");
		    	return age;
		    	

	       
	    }

		    public String getgender() {
		    	System.out.println("print gender");
		    	return gender;

	       
	    }

		    public void getaddress() {
		    	System.out.println("print address");

	       
	    }

		    public void getphoneNumber() {
		    	System.out.println("print phonenumber");

	       
	    }

		    public void getstudentId() {
		    	System.out.println("print studentid");

	       
	    }

		    public void getcourseName() {
		    	System.out.println("print course name");

	       
	    }

		    public void getdepartment() {
		    	System.out.println("print depertment");

	       
	    }

		    public double getcgpa() {
		    	System.out.println("print cgpa");
		    	return cgpa;

	       
	    }

		    public void gettotalCredits() {
		    	System.out.println("print name");

	       
	    }
		    public void getclubMembership() {
		    	System.out.println("print name");

	       
	    }
		    public void getsportsParticipation() {
		    	System.out.println("print name");

	       
	    }
		    public void gethobbies() {
		    	System.out.println("print name");

		    	
		    }
		    public String getlanguagesKnown() {
		    	System.out.println("print name");
		    	return languagesKnown;

	       
		    }
		    
		    public void getemail() {
		    	System.out.println("print name");

	       
	    }
		    public void getlinkedInProfile() {
		    	System.out.println("print name");

	       
	    }
		    public void getgithubProfiles() {
		    	System.out.println("print name");

	       
	    }
		    public void gethasScholarship() {
		    	System.out.println("print name");

	       
	    }
		    public void getisHostelResident() {
		    	System.out.println("print name");

	       
	    }
		    public void getbloodGroup() {
		    	System.out.println("print name");

	       
	    }
		    public void setname(String name) {
		    	this.name = name;
			   
	       
	    }
		    public void setage(int age) {
		    	 this.age=age;
				   

	       
	    }

		    public void setgender(String gender) {
		    	 this.gender = gender;
				   
	    }

		    public void setaddress(String address) {
		    	 this.address = address;
				    
	       

	       
	    }

		    public void setphoneNumber(String phoneNumber) {
		    	this.phoneNumber = phoneNumber;
			    
	       
	    }

		    public void setstudentId(String studentId) {
		    	this.studentId = studentId;
			   
	       
	    }

		    public void setcourseName(String courseName) {
		    	 this.courseName =courseName;
				   
	    }

		    public void setdepartment(String department) {
		    	 this.department=department;
				   
	       
	    }

		    public void setcgpa(double cgpa) {
		    	 this.cgpa=cgpa;
				    
	       
	    }

		    public void settotalCredits(int totalCredits) {
		    	this.totalCredits=totalCredits;
			    
       
	       
	    }
		    public void setclubMembership(String clubMembership) {
		    	this.clubMembership=clubMembership;
			   
	       
	    }
		    public void setsportsParticipation(String sportsParticipation) {
		    	 this.sportsParticipation=sportsParticipation;
				  

	       
	    }
		    public void sethobbies(String hobbies) {
		    	 this.hobbies=hobbies;
					

		    	
		    }
		    public void setlanguagesKnown(String languagesKnown) {
		    	this.languagesKnown=languagesKnown;
		    	 
		    }
		    
		    public void setemail(String email) {
		    	
				this.email=email;
			    
	       
	    }
		    public void setlinkedInProfile(String linkedInProfile) {
		    	this.linkedInProfile=linkedInProfile;
			    

	       
	    }
		    public void setgithubProfiles(String githubProfile) {
		    	this.githubProfile=githubProfile;
			   
	       
	    }
		    public void sethasScholarship(boolean hasScholarship) {
		    	 this.hasScholarship=hasScholarship;
				   


	       
	    }
		    public void setisHostelResident(boolean isHostelResident) {
		    	 this.isHostelResident=isHostelResident;
				   
	       

	       
	    }
		    public void setbloodGroup(String bloodGroup) {
		    	 this.bloodGroup=bloodGroup;
	       
	    }

			

			



	    
		   




	    
	}


