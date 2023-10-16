package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return "면적 : "+c.toString()+" / "+radius*radius*Math.PI;
	}
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x,y,radius);
		return "둘레 : "+c.toString()+" / "+radius*2*Math.PI;
	}

}
