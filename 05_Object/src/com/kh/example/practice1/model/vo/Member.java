package com.kh.example.practice1.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 생성자부 
	public Member() {
		
		
	}
	//메서드부
	public void changeName(String name) {
		memberName = name;
	}
	
	public void printName() {
		System.out.println(memberName);
		
	}

}
