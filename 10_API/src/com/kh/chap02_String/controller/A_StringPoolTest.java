package com.kh.chap02_String.controller;

// String 불변클래스 (값이 변하지 않는 클래스)
// 값을 수정하는 순간 기존의 값이 담겨있는 공간에서 수정되지 않음.

public class A_StringPoolTest {
	
	// 생성자를 통한 문자열 담기
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2); // false
		System.out.println(str1);
		System.out.println(str1.toString());
		// String클래스의 toString()메소드의 경우 실제 담겨있는 문자열을 반환하도록 오버라이딩 되어있음.
		
		System.out.println(str1.equals(str2));
		// String클래스의 equals()메소드의 경우 주소값 비교가 아닌 문자열 비교를 하도록 오버라이딩 되어있음.
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String클래스의 hashCode()메소드의 경우 주소값 기반이 아닌 실제 담긴 문자열 기반으로 해시코드
		// 값을 반환하도록 오버라이딩 되어있음.
		
		// 정말 주소값을 알고싶을때 사용하는 메서드 : System.identityHashCode(참조변수);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	// 2. 문자열을 리터럴로 생성
	public void method2() {
		
		String str = new String("hello");
		
		// 리터럴값은 상수풀(String pool)에 올라감
		String str1 = "hello";
		String str2 = "hello";
		
		// String pool : 동일한 문자열 존재 불가.
		System.out.println(str1 == str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	// 불변클래스
	public void method3() {
		String str = "hello";
		System.out.println(System.identityHashCode(str));
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str));
		
		str += "abc"; // goodbyeabc
		System.out.println(System.identityHashCode(str));
		
		String str2 = "hello";
		System.out.println(System.identityHashCode(str2));
		
		int a = 1;
		a = 2;
	}
	
	/*
	 * 기존의 상수풀의 연결이 끊긴 문자열들은 가비지 콜랙터가 알아서 정리해줌.
	 * 불변이라고해서 수정이 아예 안되는게 아니라
	 * 기존의 저장공간(원래있던 주소값)에서 수정되는 개념이 아니라 매번
	 * 새로운 주소값을 참조하게 됨
	 * 
	 */
	
	public void method4() {
		
	}

}
