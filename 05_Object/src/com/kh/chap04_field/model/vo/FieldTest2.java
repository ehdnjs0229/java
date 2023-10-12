package com.kh.chap04_field.model.vo;

public class FieldTest2 {
	/*
	 * (+) public  => 어디서든 접근 가능(같은패키지 + 다른패키지)
	 * (#) protected => 같은패키지에서만 접근가능. 단, "상속"구조라면 다른패키지에서도 가능
	 * (~) default => 오직 같은 패키지에서만 접근 가능
	 * (-) private => 오직 해당 클래스에서만 접근 가능
	 * 
	 * 위에서부터 아래로 내려갈수록 접근할 수 있는 범위가 좁아진다.
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	String df = "default";
	private String pri = "private";

}
