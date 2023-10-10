package com.kh.chap01.codition;

import java.util.Scanner;

public class B_Switch {
	
	/*
	 * Switch문과 if문 둘은 동일한 조건문
	 * 
	 * 차이점
	 * if(조건식) => 조건식을 복잡하게 기술 가능, 범위 제시 가능
	 * switch(조건식) => 정확한 값의 조건만 기술(동등비교만 수행가능)
	 * 
	 * [표현법]
	 * switch(동등비교를 할 대상자) {
	 * case 값1 : 실행할 코드1; // 동등비교를 할 대상자와 값1이 일치할 경우 실행할 코드
	 * 			 break; // 실행할 코드를 실행하고 switch문을 종료시키기 위한 키워드
	 * case 값2 : 실행할 코드2;
	 * 			 break;
	 * case 값n : 실행할 코드n;
	 * 			 break;
	 * default : 실행할 코드 // if~else의 else와 같은 역할을 한다.
	 * 					  // 위의 값1,값2,값3...과 비교대상자가 모두 일치하지 않을 경우
	 * 					  // default내의 실행할 코드가 실행된다.
	 * }
	 * 
	 * switch문 언제 쓰냐?
	 * 항상 정확하게 동일한 시간으로 연산결과가 수행되어야 하는 경우.
	 * ex) 키보드입력, 마우스입력 등
	 * 
	 */
	
	public void method1() {
		// 1~3사이의 정수값을 입력받아
		// 1인경우 "빨간불입니다"
		// 2인경우 "파란불입니다"
		// 3인경우 "초록불입니다"
		// 잘못입력한경우 "잘못입력했습니다"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
//		if(num == 1) {
//			System.out.println("빨간불입니다");
//		}
//		else if(num == 2) {
//			System.out.println("파란불입니다");
//		}
//		else if(num == 3) {
//			System.out.println("초록불입니다");
//		}
//		else {
//			System.out.println("잘못입력했습니다");
//		}
		switch(num) {
		case 1 : 
			System.out.println("빨간불입니다");
			break;
		case 2 :
			System.out.println("파란불입니다");
			break;
		case 3 :
			System.out.println("초록불입니다");
			break;
		default :
			System.out.println("잘못입력했습니다");
		}
			
	}
	
	public void method2() {
		// 사용자에게 구매할 과일명을 입력받아
		// 각 과일마다의 가격을 출력(사과 1000원, 바나나 2000원, 복숭아 5000원)
		// 잘못된 과일 입력시 "저희 가게에서 판매하는 과일이 아닙니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구매할 과일(사과,바나나,복숭아)를 입력 : ");
		String fruit = sc.nextLine();
		
		// 출력예시 : xx의 가격은 xx원 입니다. or 저희 가게에서 판매하는 과일이 아닙니다.
		
		int price = 0;
		
		switch(fruit) {
		case "사과" :
			price = 1000;
			break;
		case "바나나" :
			price = 2000;
			break;
		case "복숭아" :
			price = 5000;
			break;
		default :
			System.out.println("저희 가게에서 판매하는 과일이 아닙니다.");
			method2();
			return;
			
		}
		
		System.out.printf("%s의 가격은 %d원 입니다.  \n", fruit, price);
	}
	
	public void method3() {
		/*
		 * break가 없는 switch문.
		 * 
		 * 사용자에게 등급별로 권한을 부여하는 프로그램
		 * 1 : 관리자 권한, 글쓰기 권한, 읽기 권한
		 * 2 : 글쓰기 권한, 읽기 권한
		 * 3 : 읽기 권한
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("등급 : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 1 : System.out.print("관리자 권한, ");
		case 2 : System.out.print("글쓰기 권한, "); 
		case 3 : System.out.print("읽기 권한");
		}
	}
	public void method4() {
		/*
		 * 사용자에게 1월 ~ 12월 사이의 월을 입력받아
		 * 해당 달의 마지막 날짜를 출력하는 프로그램
		 * 1, 3, 5, 7, 8, 10, 12 -> 31일
		 * 4, 6, 9, 11 -> 30일
		 * 2월 -> 28일이거나 29일
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1월 ~ 12월 사이의 월 입력 : ");
		int month = sc.nextInt();
		
		// 조건) 각 출력문은 한번만 사용 switch문으로 만들기
		
		// "해당 달은 31일 입니다."
		// "해당 달은 30일 입니다."
		// "해당 달은 28일 또는 29일 입니다."
		// "1월부터 12월에 해당하는 달을 입력하셔야 합니다."
		
		switch(month) {
		case 4 : 
		case 6 : 
		case 9 :
		case 11 : 
			System.out.println("해당 달은 30일 입니다.");
			break;
		case 2:
			System.out.println("해당 달은 28일 또는 29일 입니다.");
			break;
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("해당 달은 31일 입니다.");
			break;
		default : 
			System.out.println("1월부터 12월에 해당하는 달을 입력하셔야 합니다.");
			method4();
			return;
		}	
			
	}

	
	
	
	
}
