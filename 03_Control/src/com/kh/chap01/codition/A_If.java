package com.kh.chap01.codition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * 기본적으로 프로그램의 진행은 순차적으로 진행됨.
	 * 단, 이 순차적인 흐름을 바꾸고자 한다면 제어문을 이용해서 직접 제어 가능.
	 * 
	 * 
	 * 선택적으로 실행시키고자 할때 => 제어문(if, switch)
	 * 반복적으로 실행시키고자 할때 => 반복문(for, while, do-while)
	 * 그 외에는 => 분기문
	 * 
	 * 조건문
	 * 조건식을 통해 참이냐 거짓이냐를 판단해서 그에 해당하는 코드 실행
	 * 
	 * 조건식
	 * 반드시 결과값 true/false여야함
	 * 보통의 조건식에는 비교연산자, 논리연산자를 주로 사용함.
	 * 
	 * 조건문에는 크게 if문, switch문으로 나뉨
	 */
	
	// 삼항연산자를 조건문으로 바꿔보기
	public void method1() { 
		/*
		 * 단독 if문
		 * 
		 * [표현법]
		 * if(조건식) {
		 * 	
		 * }
		 * => 조건식의 결과가 참일경우 중괄호 블록 안의 코드가 실행
		 * => 조건식의 결과가 거짓일경우 중괄호 블록 안의 코드가 무시되고 넘어감.
		 * */
		
		// 사용자에게 정수값을 입력받은후 양수다, 양수가 아니다를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요 : ");
		int num = sc.nextInt(); // num > 0 ? "양수" : "음수"
		
		
		if(num > 0) {
			System.out.println("양수입니다");	
		}
		
		if(num <= 0) {
			System.out.println("양수가 아닙니다");
		}
		
		
		
	}
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = "양수가 아닙니다";
		
		if(num > 0) {
			result = "양수입니다";
		}
		System.out.println(result);
		
//		if(num > 0) {
//			// 조건식이 true인 경우 실행될 코드
//			System.out.println("양수입니다");
//		}else {
//			// 조건식이 false인 경우 실행될 코드
//			System.out.println("양수가 아닙니다");
//		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		/*
		 * if ~ else if문
		 * 
		 * 같은 비교대상으로 여러개의 조건을 제시해야될 경우 사용
		 * if(조건식1) {
		 * 	  조건식1이 true라면 실행할 코드
		 * } else if(조건식2) {
		 *    조건식2가 true라면 실행할 코드
		 * } else if(조건식n) {
		 *    조건식n이 true라면 실행할 코드
		 * } [else {
		 *   위 모든 조건식의 결과가 false라면 실행할 코드
		 * }]
		 */
		
		if(num > 0) { 
			System.out.println("양수입니다");
		} else if(num == 0) {
			System.out.println("0입니다");
		}else {
			System.out.println("음수입니다.");
		}
		
		
	}
	
	public void method4() {
		// 사용자가 입력한 나이값을 가지고 어린이 / 청소년 / 성인 출력
		// if ~ else if문을 통해 작성해보기
		// 13세 이하 => 어린이
		// 13세 초과 ~ 19세 이하 => 청소년
		// 그외 => 성인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이");
			
		} else if(age <= 19) {
			System.out.println("청소년");
			
		} else {
			System.out.println("성인");
		}
		
		
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		// 사용자에게 이름, 성별을 입력받아 남자인지 여자인지 출력하는 메서드
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = "";
		
		if(gender == 'M' || gender == 'm' ) {
			result = "남자";
			//System.out.printf("%s님은 %s이다.", name, "남자");
			//System.out.println(name + "님은 남자이다");
		} else if(gender == 'F' || gender == 'f'){
			result = "여자";
			//System.out.printf("%s님은 %s이다.", name, "여자");
			//System.out.println(name + "님은 여자이다");
		} else {
			System.out.println("잘못 입력하셨습니다");
			
			// 현재 메서드를 빠져나가는 역할을 수행
			method5();
			return;
		}
		System.out.printf("%s님은 %s이다.", name, result);
		
		// 출력에서 : x님은 x이다.
		// 성별 값('M','m' = > 남자, 'F','f' => 여자)을 잘못 입력한 경우 => 잘못 입력하셨습니다.
		
	}
	
	public void method6() {
		
		// 특이케이스, 문자열간의 동등비교(문자열 == 문자열)
		// 사용자에게 이름을 입력받아 입력문과 일치하는지 비교하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
//		if(name == "민경민") {
//			System.out.println("민경민님 반갑습니다");
//		} else {
//			System.out.println("누구세요?");
//		}
	
	/*
	 * 기본 자료형 : boolean. byte, short, int, long, float, double, char
	 * 참조 자료형 : 기본 자료형이 아닌 모든 자료형 대표)String 
	 * 
	 * 기본자료형같의 비교시에는 == != 사용가능하지만 , 참조자료형은 동등비교연산시 정상적으로 연산이 안됨.
	 * 왜냐면 name과 같은 참조형변수는 실제로 메모리에서 저장되어있는 주소값만 가지고 있기 때문
	 * 
	 * 그럼 어떻게 하냐? 문자열.equals(비교문자열)로 비교하면 된다.(동등성 비교)
	 * 
	 */
	
		if(name.equals("민경민")) { // equals() 반환값이 true or false
		System.out.println("민경민님 반갑습니다");
		} else {
		System.out.println("누구세요?");
	
		}
	
	}
	public void method7() {
		Scanner sc = new Scanner(System.in );
		
		System.out.print("정수(양수)를 입력 : ");
		int num = sc.nextInt();
		
		// 양수를 입력받고, 입력받은값이 짝수인지 홀수인지 판별하는 프로그램
		// 양수를 입력하지 않은 경우, "양수가 아닙니다. 잘못 입력하셨습니다. " 출력된 후 다시한번 입력할수있게 메서드 재호출
		
		String result = "";
		
		if(num > 0 && num % 2 == 0) {
			result = "짝수입니다";
			//System.out.println("짝수입니다.");
		} 
		else if(num > 0 && num % 2 == 1) {
			result = "홀수입니다";
			//System.out.println("홀수입니다.");
		} 
		else {
			System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
			method7();
			return;
		}
		System.out.println("결과 : " + result);
	}
	
}
