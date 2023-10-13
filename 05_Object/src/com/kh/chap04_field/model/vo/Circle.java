package com.kh.chap04_field.model.vo;

public class Circle {
	private final static double PI = 3.14;
	private int radius = 1;
	
	public Circle() {
		
	}
	
	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() {
		System.out.println(radius*radius*PI);
	}
	
	public void getSizeOfCircle() {
		System.out.println(radius*2*PI);
		
	}
	

}
