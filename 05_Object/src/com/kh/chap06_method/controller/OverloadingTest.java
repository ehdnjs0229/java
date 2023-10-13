package com.kh.chap06_method.controller;

public class OverloadingTest {
	/*
	 * 메소드 오버로딩
	 * - 하나의 클래스 내부에 "같은"이름의 메소드명을 정의할 수 있는 방법.
	 * - 매개변수의 자료형의 갯수, 순서를 다르게 작성하면 된다.
	 * - 단, 매개변수명이나 접근제한자 반환형은 오버로딩과 아무 연관이 없다.
	 * 
	 */
	
	public void test() {
		System.out.println(); // 대표적인 메소드 오버로딩 케이스
	}
	
	public void test(int a) {
		
	}
	
	// 위 메스더와 매개변수의 갯수가 다르다
	public void test(int a, int b) {
		
	}
	
	// 위 메서드와 매개변수의 갯수는 같지만 자료형이 다르다.
	public void test(int a, String b) {
		
	}
	
	// 위 메서드와 매개변수의 자료형은 같지만 순서가 다르다.
	public void test(String b, int a) {
		
	}
	
	// 매개변수의 이름은 오버로딩이 적용되지 않는다. 에러발생
//	public void test(String str, int a) {
//		
//	}
	
	// 반환형은 메서드 오버로딩이 적용되지 않는다. 에러 발생
//	public int test(String b, int a) {
//		return a;
//	}
	
	// 접근제한자가 다르다고 오버로딩이 적용되지 않는다. 에러 발생
//	private public void test(String b, int a) {
//		
//	}

}
