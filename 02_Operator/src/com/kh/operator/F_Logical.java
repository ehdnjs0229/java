package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	
	/*
	 * 논리 연산자
	 * 두개의 논리값을 연산하는 연산자
	 * 논리값(논리연산자) 논리값 => 결과값도 논리값
	 * 
	 * AND 연산자 : 논리값 && 논리값 => 왼쪽, 오른쪽 논리값이 둘다 TRUE여야 최종결과값 TRUE
	 * OR 연산자 : 논리값 || 논리값 => 왼쪽, 오른쪽 논리값중 하나라도 TRUE면 최종결과값 TRUE
	 * 
	 */
	
	public void method1() {
		
		// 사용자가 입력한 정수값이 양수이면서 짝수인지 확인하기. ==> ~이면서 , ~이고, 그리고 => &&
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		
		boolean result1 = num > 0; // 양수면 true / 아니면 false
		boolean result2 = num % 2 == 0; // 짝수면 true / 아니면 false
		boolean result3 = result1 && result2; 
		
		System.out.println("사용자가 입력한 값이 양수이면서 짝수입니까? " + result3);
	}
	
	public void method2() {
		
		// 사용자가 입력한 정수값이 1이상 100이하의 수인지 확인하기.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 입력 : ");
		int num = sc.nextInt();
		
		// 사용자가 입력한 값이 1이상 100이하 입니까? true/false
		// 1 <= num <= 100 ==> 1<= num && num <= 100
		boolean result = 1<= num && num <= 100;
		System.out.println("사용자가 입력한 값이 1이상 100이하 입니까? " + result);
	
	}
	
	public void method3() {
		
		// 사용자가 입력한 값이 y이거나 Y인지 확인하기.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계속 진행하시려면 y를 입력해주세요");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = ch == 'y' || ch == 'Y';
		System.out.println("사용자가 입력한 값이 y 또는 Y입니까 ? " + result);
		
		
		/*
		 * || (or) :  또는 , 이거나
		 * 두 조건 중 하나라도 true라면 결과값도 true
		 * */
	}
	
	public void method4() {
		
		int num1 = 10;
		
		// num1 이 11과 같으면서, 증감연산한값이 0보다 큰지
		boolean result1 = (num1 == 11) && (++num1 > 0); // false
		// && : 앞의 조건이 false인 경우 결과값이 무조건 false이기 때문에 뒤의 비교연산을 수행하지 않는다.
		// || : 앞의 조건이 true인 경우 결과값이 무조건 true이기 때문에 뒤쪽의 연산을 수행하지 않는다.
		
		System.out.println(num1); // 10
		
		boolean result2 = true || (++num1 > 0);
		/*
		 * 뒤의 비교연산 구문이 Dead code라고 뜬다.
		 * 실행할때는 오류가 나지 않지만, result2의 결과값이 어차피 true 
		 */
		
		System.out.println(num1); // 10
	}

	
	
	
	
	
	
}
