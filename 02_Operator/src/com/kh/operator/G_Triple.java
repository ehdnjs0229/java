package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항연산자 : 3개의 항목을 가지고 연산하는 연산자
	 * 
	 * [표현법]
	 * 
	 * 조건식 ? 조건식의 결과값이 true인경우 결과값 : 조건이 false인 경우 결과값
	 * 
	 */
	
	public void method1() {
		// 사용자가 입력한 값이 양수값인지 아닌지 판별후, 양수라면 "양수입니다", 아니라면 "양수가 아닙니다"를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 입력 : ");
		int num = sc.nextInt();
		//조건식 ? 조건식의 결과값이 true인경우 결과값 : 조건이 false인 경우 결과값
		
		//String result = num > 0 ? "양수입니다" : "양수가 아닙니다" ;
		//System.out.println(num+"은(는) " + result);
		
		// 산술연산이 삼항연산보다 우선순위가 높기때문에 반드시()로 묶어줘야한다.
		System.out.println(num+"은(는) " + (num > 0 ? "양수입니다" : "양수가 아닙니다"));
	}
	
	public void method2() {
		
		// 사용자가 입력한 정수값이 짝수인지 홀수인지 판별 후 출력(삼항연산자이용)
		Scanner sc = new Scanner(System.in);
		
		// 입력에서 : 정수값 입력 :
		System.out.println("정수값 입력 : ");
		int num = sc.nextInt();
		
		// 출력에서 : xx는 짝(홀)수 입니다.
		System.out.println(num+ "은(는) "+(num % 2 == 0 ? "짝수입니다" : "홀수입니다"));
		
		
	}
	
	public void method3() {
		
		// 사용자가 입력받은 영문자가 대문인지 아닌지 판별 후 출력. (아스키코드표 참조)
		Scanner sc = new Scanner(System.in);
		// 입력에서 : 영문자 한개만 입력 :
		System.out.println("영문자 한개만 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = ('A'<=ch && ch<='Z') ? "대문자입니다" : "대문자가 아닙니다";
		// 출력에서 : 대문자입니다 or 대문자가 아닙니다
		
		System.out.printf("%c는 %s \n", ch, result);
		
		
	}
	
	// 삼항연산자 중첩 사용
	public void method4() {
		// method1()을 보완하여 사용자가 입력한 정수값이 양수인지 0인지 음수인지 판별
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 입력 : ");
		int num = sc.nextInt();
		
		System.out.println(num+"은(는) " + (num > 0 ? "양수입니다" : (num == 0 ? "0입니다" : "음수입니다")));

	}
	
	public void method5() {
		// 두개의 정수값과 + , -의 '문자'를 입력받아
		// +일경우 두 정수값의 덧셈연산한 결과를 출력
		// -일경우 두 정수값의 뺄셈연산한 결과를 출력
		// 둘다아닐경우 잘못입력했습니다를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자 입력(+ or -) : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = '+'==ch  ? ""+(num1+num2) :'-'==ch ? ""+(num1-num2) : "잘못입력했습니다"; // 삼항연산자 중첩
		
		System.out.println(result);
		
	}

}
