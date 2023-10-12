package com.kh.chap04_field.model.vo;

public class FieldTest1 {
	
	/* 
	 * 변수구분
	 * - 전역변수 : 클래스 영역에 바로 선언하는 변수 -> 클래스 내에서면 어디서든 사용가능
	 * - 지역변수 : 클래스 영역 내의 특정 중괄호 영역에 선언한 변수(선언한 영역에서만 사용 가능)
	 * 			  ex) 메소드 영역, if문 영역, for문 영역..
	 * 1. 전역변수(2가지로 구분됨)
	 * 	- 필드 == 인스턴스 변수 == 멤버변수
	 * 	   생성시점 : new 연산자를 통해 해당 객체가 생성하는 순간 메모리 영역에 할당.
	 * 	   소멸시점 : 객체 소멸시 같이 소멸
	 * 
	 *  - static변수 == 클래스변수 : static이라는 예약어 붙어있냐 아니냐에 따라서 필드냐, static변수냐로 구분된다.
	 * 	   생성시점 : 프로그램 실행과 동시에 메모리영역(static영역)에 할당
	 * 	   소멸시점 : 프로그램이 종료될때 소멸
	 * 
	 * 2. 지역변수
	 * 	  생성시점 : 프로그램을 실행하다가 특정 중괄호 구역을 만났을때 메모리 영역에 할당(stack)
	 *    소멸시점 : 중괄호 구역이 끝났을때 소멸
	 * 
	 */
	
	//변수 선언위치에 따른 구분(전역변수, 지역변수)
	
	// 전역변수(필드)
	private int global;
	
	public void test(int num) {
		// 매개변수 ==> 지역변수
		
		// 지역변수(메소드 영역 내에 생성) => 지역변수에는 접근제한자를 붙일 수 없다.
		int local = 100; // 지역변수에는 항상 값을 초기화 시켜줘야한다.
		
		if(true) {
			int a = 0; // 지역변수
			System.out.println(a); // 0
		}// int a 소멸;
		
		/*
		 * 필드에 값을 초기화하지 않아도 에러가 발생하지 않는 이유.
		 * 필드의 생성시점은 객체의 생성시점과 동일하며, 객체생성시 초기화되지 않은 필드들은
		 * jvm이 자동으로 기본값을 대입해줬기 때문에 항상 값이 들어가있다.
		 */
		System.out.println(global);
		
		// 현재 메서드test(int num) 호출시에는 반드시 값을 넘겨줘야 호출이 가능하기 때문에
		// num에는 반드시 어떤 값이든 들어가있기 때문
		System.out.println(num);
		
		System.out.println(local); // 값을 초기화해두지 않으면 에러가 발생.
	}
	
	


}