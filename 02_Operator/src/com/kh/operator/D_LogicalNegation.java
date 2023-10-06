package com.kh.operator;

public class D_LogicalNegation {
	
	/*
	 * 논리부정연산자 ! (단항연산자)
	 * !논리값(true/false)
	 * 
	 * 논리값을 반대로 바꿔주는 연산자
	 */
	
	public void method() {
		
		// 1번방법. 리터럴에 논리부정연산자 붙이기
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		// 2번방법. 변수에 논리부정연산자 붙이기
		boolean b = true;
		boolean b2 = !b; // false
		System.out.println("b : " + b);
		System.out.println("b2 : " + b2);
		
		// 3번방법. 조건식,계산식에 논리부정연산자 사용하기
		boolean b3 = !(5>3);
		System.out.println(b3);
		
		
	}

}
