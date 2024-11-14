package com.java.Abstraction;

public class ShapesRunner {
	
	    public static void main(String[] args) {
	        
	      
	        Shapes circle = new Circle(5);
	        System.out.println("For Circle:");
	        circle.displayShapes();
	        circle.calculatearea();
	        circle.calculateVolume();
	        circle.calculateSurfaceArea();
	        
	        
	        Shapes rectangle = new Rectangle(5, 3);
	        System.out.println("\nFor Rectangle:");
	        rectangle.displayShapes();
	        rectangle.calculatearea();
	        rectangle.calculateVolume();
	        rectangle.calculateSurfaceArea();
	        
	       
	        Shapes triangle = new Triangle(6, 4);
	        System.out.println("\nFor Triangle:");
	        triangle.displayShapes();
	        triangle.calculatearea();
	        triangle.calculateVolume();
	        triangle.calculateSurfaceArea();
	    }
	}


