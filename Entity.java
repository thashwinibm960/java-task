package com.java.Entity;

public class Entity {
	private String name;
	private int age;
	private String email;
	private String phonenumber;
	private String address;
	
	
	public Entity(String name, int age, String email, String phonenumber, String address) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
