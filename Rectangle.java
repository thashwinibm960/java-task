package com.java.Abstraction;

public class Rectangle extends Shapes {

	    private double length;
	    private double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    @Override
	    public void calculatearea() {
	        double area = length * width;
	        System.out.println("Area of Rectangle: " + area);
	    }

	    @Override
	    public void calculateVolume() {
	        System.out.println("Volume of a Rectangle is not applicable (2D shape).");
	    }

	    @Override
	    public void calculateSurfaceArea() {
	      
	        System.out.println("Surface Area of Rectangle: " + (2 * (length * width)));
	    }
	}



