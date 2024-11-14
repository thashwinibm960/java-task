package com.java.Abstraction;

public class Circle extends Shapes {
	    
	    private double radius;
	    
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public void calculatearea() {
	        double area = Math.PI * radius * radius;
	        System.out.println("Area of Circle: " + area);
	    }

	    @Override
	    public void calculateVolume() {
	        System.out.println("Volume of a Circle is not applicable (2D shape).");
	    }

	    @Override
	    public void calculateSurfaceArea() {
	        System.out.println("Surface Area of a Circle is not applicable (2D shape).");
	    }

		
	}



