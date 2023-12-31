package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	
	private Scanner sc =new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		System.out.println("=====  메뉴  =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.println("메뉴 번호 : ");
		String menu = sc.nextLine();
		
		switch(menu) {
		
		case "1" : circleMenu(); break;
		case "2" : rectangleMenu();break;
		case "9" : System.out.println("프로그램을 종료합니다."); return;
		default : System.out.println("잘못입력하셨습니다.");
		
		}
	}
	
	public void circleMenu() {
		System.out.println("=====  원  메뉴  =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		String menu = sc.nextLine();
		
		switch(menu) {
		
		case "1" : calcCircum(); break;
		case "2" : calcCircleArea(); break;
		case "9" : return;
		default : System.out.println("잘못입력하셨습니다.");
		}
	}
	
	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴  =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		String menu = sc.nextLine();
		
		switch(menu) {
		case "1" : calcPerimeter(); break;
		case "2" : calcRectArea(); break;
		case "9" : return;
		default : System.out.println("잘못입력하셨습니다.");
		}
	}
	
	public void calcCircum() {
		System.out.println(" x 좌표 :");
		int x = sc.nextInt();
				
		System.out.println(" y 좌표 :");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		sc.nextLine();
		System.out.println(cc.calcCircum(x, y, radius));
	}
	
	public void calcCircleArea() {
		System.out.println(" x 좌표 :");
		int x = sc.nextInt();
				
		System.out.println(" y 좌표 :");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		sc.nextLine();
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() {
		System.out.println(" x 좌표 :");
		int x = sc.nextInt();
				
		System.out.println(" y 좌표 :");
		int y = sc.nextInt();
		
		System.out.println("높이 : ");
		int height = sc.nextInt();
				
		System.out.println("너비 : ");
		int width = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}
	
	public void calcRectArea() {
		System.out.println(" x 좌표 :");
		int x = sc.nextInt();
				
		System.out.println(" y 좌표 :");
		int y = sc.nextInt();
		
		System.out.println("높이 : ");
		int height = sc.nextInt();
				
		System.out.println("너비 : ");
		int width = sc.nextInt();
		System.out.println(rc.calcRectArea(x, y, height, width));
		
	}

}
