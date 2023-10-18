package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		// 인터페이스 적용 전
		//Person p = new Person();
//		Person p1 = new Mother("정선이", 50, 50 , "출산");
//		Person p2 = new Baby("민경민", 3.5, 60);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		p1.eat(); // 60 40
//		p1.sleep(); // 60 50
//		
//		p2.sleep(); // 6.5 61
//		p2.eat(); // 6.5 64
//		
//		System.out.println("== 다음날 ==");
//		
//		System.out.println(p1);
//		System.out.println(p2);
		
		// 인터페이스 적용 후 
		//Basic b1 = new Basic();
		Basic b1 = new Mother("정선이",77 ,77,"출산");
		Basic b2 = new Baby("민경민", 33, 55);
		
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		 * 클래스에서 클래스를 상속 받을때 : extends 클래스(단일상속만 가능) : 화살표 실선
		 * 클래스에서 인터페이스를 구현할때 : implements 인터페이스, 인터페이스(다중구현가능) : 화살표 점선
		 * 인터페이스에서 인터페이스를 상속 : extends 인터페이스, 인터페이스(다중상속가능) : 화살표 실선
		 * 
		 * 배운순서
		 * 
		 * extends 일반클래스 -> extends 추상클래스 -> implements 인터페이스
		 * 
		 * 뒤로 갈수록 기능구현의 강제성이 더 짙어진다.
		 * 
		 */ 

	}

}
