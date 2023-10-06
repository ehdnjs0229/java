package com.kh.operator;

public class A_Arithmetic {
	
	// 산술연산자(이항연산자 == 두개의 값을 가지고 연산)
	// * / % + - 
	public void method() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1+num2)); // 
		// num1 + num2 로 출력해버리면 String처럼 각 각의 숫자 10과 3을 찍기 때문에 103이 출력된다
		// 괄호로 묶어서 먼저 산술연산처리를 해줘야 함
		
		System.out.println("num1 - num2 = " + (num1 - num2));
		// 뺄셈은 괄호로 묶어두지 않는 경우 숫자로 인식하기 때문에 에러 발생
		
		System.out.println("num1 + num2 = " + num1 * num2);
		System.out.println("num1 / num2 = " + num1 / num2);
		System.out.println("num1 % num2 = " + num1 % num2);
		// 곱셈, 나눗셈, 모듈러 연산의 경우 +보다 우선순위가 높기 때문에 괄호를 묶어두지 않아도 정확한 결과가 나온다.
		// 가독성을 위해 연산시에는 괄호로 묶는걸 권장
		
		// System.out.println(10 / 10);
		// ArithmeticException : / by zero라는 오류 발생
		// 수학과 마찬가지로 0으로 나누기는 불가능
		
		double a = 35; // 35.0
		double b = 10; // 10.0
		System.out.println( a / b ); // 3.5 
		System.out.println( a % b ); // 5.0 
	}

}
