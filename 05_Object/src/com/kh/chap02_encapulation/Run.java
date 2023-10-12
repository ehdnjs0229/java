package com.kh.chap02_encapulation;

import com.kh.chap02_encapulation.model.vo.Student;

public class Run {
	
	/*
	 * 7. 캡슐화 과정을 통해 완벽한 클래스의 틀을 갖추게 하기
	 *  * 캡슐화란? 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법 중 하나로
	 *  		  클래스에서의 가장 중요한 목적인 '데이터의 접근제한'을 원칙으로
	 *  		  외부로부터 '데이터의 접근을 막고'
	 *    		  대신에 '데이터를 간접적으로나마 처리'할수 있는 메소드를 클래스 내부에 작성해서 관리하는 방식
	 *    
	 *    캡슐화를 하지 않으면 : 외부로부터 직접 접근이 가능하기 때문에 함부로 값이 변질되거나 조회를 막지 못하는 문제 발생
	 *    
	 *    1) 정보은닉 : private
	 *    	 필드들을 외부로부터 직접 접근을 막기 위해 public 대신에 private 접근제한자를 사용
	 *    
	 *    2) setter / getter 메서드
	 *    	 간접적으로나마 필드에 접근해서 값을 담거나, 그 값을 가져올 수 있는 메서드가 setter / getter 메소드
	 *    
	 */

	public static void main(String[] args) {
		Student hong = new Student();
//		hong.name = "홍길동";
//		hong.age = 40;
//		hong.height = "111.1";
		
		hong.setName("홍길동");
		hong.setAge(33);
		hong.setHeight(111.1);
		
		//getter메서드 없이는 저장한 값을 얻어올수 없음.
		//System.out.println(hong.name);
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		
		// 학생객체를 하나 새롭게 생성하고
		// 생성된 학생객체에 본인의 인적사항을 기록 후
		// xx님의 나이는 xx살이고 키는 xx.xcm입니다 출력
		
		Student st = new Student();
		
		st.setName("임도원");
		st.setAge(24);
		st.setHeight(150.1);
		
		System.out.printf("%s님의 나이는 %d살이고 키는 %.1fcm입니다.",st.getName(),st.getAge(),st.getHeight());
		
		

	}

}
