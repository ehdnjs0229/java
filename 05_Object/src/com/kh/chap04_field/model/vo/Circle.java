package com.kh.chap04_field.model.vo;

public class Circle {
	private final static double PI = 3.14;
	private int radius = 1;
	private int increment = 0;
	
	public Circle() {
		
	}
	
	public void getAreaOfCircle() {
		System.out.println(radius*radius*PI);
	}
	
	public void getSizeOfCircle() {
		System.out.println(radius*2*PI);
		
	}
	
	public void incrementRadius() {
		int increment = radius+1;
		System.out.println(increment*increment*PI);
		System.out.println(increment*2*PI);
	}
}
