package com.java.Abstraction;

public class Triangle extends Shapes {

	    private double base;
	    private double height;

	    public Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }

	    @Override
	    public void calculatearea() {
	        double area = 0.5 * base * height;
	        System.out.println("Area of Triangle: " + area);
	    }

	    @Override
	    public void calculateVolume() {
	        System.out.println("Volume of a Triangle is not applicable (2D shape).");
	    }

	    @Override
	    public void calculateSurfaceArea() {
	        System.out.println("Surface Area of Triangle is not applicable (2D shape).");
	    }
	}



