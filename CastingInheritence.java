package com.java.Casting;

public class CastingInheritence {
	
	public static void main(String[] args) {
		System.out.println("upcasting in Inheritance:");
		
		CastingAnimal animal = new CastingDog();
		
		animal.sound();
		
		CastingShapes shapes = new CastingCircle();
		
		shapes.draw();
		
		System.out.println("downcasting in Inheritance:");
		
		CastingDog dog =(CastingDog) animal;
		
		dog.bark();
		
		CastingCircle circle=(CastingCircle) shapes;
		circle.area();
		
		
		
		
	}

}
