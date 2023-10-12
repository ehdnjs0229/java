package com.kh.chap04_field.model.vo;

// static변수(클래스변수)와 상수필드(static final)
public class FieldTest3 {
	
	// 접근제한자 [예약어] 자료형 변수명;
	public static int num = 100;
	/*
	 * static "공유"의 개념이 강함 => 프로그램 실행과 동시에 메모리영역에 데이터를 올려두고 공유를 해서 쓰자.
	 * 자주 사양되는 변수, 메서드를 static으로 선언함.
	 * 생성시점 : 프로그램 실행과 동시에 메모리의 static영역에 할당됨 => 객체를 생성하지 않아도 할당됨.
	 * 소멸시점 : 프로그램 종료시 
	 */
	
	/*
	 * 상수필드
	 * public static final 자료형 변수명 = 값;
	 * 한번 지정된 값을 고정해서 사용하기 때문에 무조건 초기화를 해줘야함.
	 * 
	 * static : 공유의 개념
	 * final  : 상수의 개념
	 * 
	 * 값이 변경되서는 안되는 고정적인 값을 메모리상에 올려두고 공유하면서 사용할 목적으로 사용함.
	 * ** 상수 필드명은 항상 모든 글자가 대문자
	 */
	
	public static final int NUM = 9;
	
	public static void test() {
		System.out.println("안녕");
	}
	

}
