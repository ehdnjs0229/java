package com.kh.chap02_encapulation.model.vo;

public class Student {
	// 필드부
	/*
	 * 필드 == 멤버변수 == 인스턴스 변수
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 자료형 필드명;
	 * 
	 */
	private String name;
	private int age;
	private double height;
	
	// 생성자부
	public Student() {
		
	}
	
	// 메소드부
	/*
	 * 각 기능을 구현하는 부분
	 * 
	 * [표현법]
	 * 접근제한자 반환형 메소드명([매개변수]) {
	 * 	   // 기능
	 * }
	 * setter -> setXXX
	 * 해당 필드에 대입하고자 하는 값을 전달받아 해당필드에 대입시켜주는 기능의 메소드
	 * 이때, 이 메소드는 접근이 가능해야하기 때문에 public 접근제한자를 사용
	 */
	
	// 이름값을 기록 및 수정할 수 있는 기능의 메소드(name필드에 값을 셋팅하기위한 용도)
	// set+필드명 => set이라는 단어와 필드명을 합칠때 카멀케이스를 활용하여 메서드명 작성해야한다.
	public void setName(String name) {
		//name = name;
		//매개변수 name에 매개변수 name에 들어가있는 값을 그대로 대입하는 부분이라 변경점이 없다.
		//왜? 필드명과 매개변수명이 동일한 경우 {}영역 내부에서 선언한 변수가 우선순위가 더 높기 때문에
		// 생성된 객체의 name에 접근하려면 this를 사용해야함.
		// this에는 생성된 객체의 "주소값"이 보관되어 있다.
		
		this.name = name;
	}
	
	// 나이값을 기록 및 수정할 수 있는 기능의 메서드(age필드에 값을 대입하기 위한 용도)
	public void setAge(int age) {
		this.age = age;
	}
	
	// 키값을 기록 및 수정
	public void setHeight(double height) {
		this.height = height;
	}
	
	// 데이터를 반환해주는 기능의 메소드 : getter메소드
	// name필드에 담긴값을 돌려주는 용도의 메소드
	// get+필드명(카멀케이스적용)
	public String getName() { // void : 반환할 값이 없는 경우에 작성하는 반환형
		return name; // return 반환값; -> 반환값을 나를 호출한 메소드의 위치에 전달한다.
	}
	
	// age필드에 담긴 값을 반환해주는 용도의 메서드
	public int getAge() {
		return age;
	}
	
	// height필드에 담긴 값을 반환해주는 용도의 메서드
	public double getHeight() {
		return height;
	}

}
