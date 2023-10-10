package com.kh.chap02.loop;

public class B_While {
	
	/*
	 * while문
	 * 
	 * [표기법]
	 * 
	 * [초기식;] // 필수가 아님
	 * while(조건식) { // 조건식의 결과가 true일 경우 while문의 중괄호 블럭 안의 내용이 반복적으로 실행된다.
	 * 		반복적으로 실행 할 코드들
	 * [증감식;] // 필수가 아님
	 * }
	 * 
	 */
	
	public void method1() {
		// for문을 while문으로, while문을 for문으로 변경해보기
		for(int i = 0; i <5; i++) {
			System.out.println("안녕하세요");
		}
		int i = 0; // 초기식
		
		while(i < 5) { // 조건식
			System.out.println("안녕하세요");
			
			i++; // 증감식
		}
		System.out.println(i); // 5

	}
	
	public void method2() {
		
		for(int i = 1; i<=10; i++) {
			if(i % 2 == 1 ) {
			System.out.print(i+" ");
			}
		}
			
		System.out.println();
		for(int i = 1; i < 10; i+=2) {
			System.out.print(i+" ");
		}
		
//		int i = 1;
//		while(i<=10) {
//			if(i % 2 == 1 ) {
//				System.out.print(i+" ");
//			}
//			i++;
//		}
		
		int i = 1;
		while(i<10) {
			System.out.print(i+" ");
			i+=2;
		}
		
	}
	
	public void method3() {
		// 1부터 랜덤값(1~100) 까지의 총 합계
		int random = (int)(Math.random() * 100 +1);
		int sum = 0;
		
//		for(int i =1; i<=random; i++) {
//			sum += i;
//		}
		
		// while으로 작성
		int i = 1;
		while(i<=random) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 %d까지의 총 합계 : %d", random, sum);
		// 출력예시 : 1부터 random까지의 총 합계 : sum
	}
	
	public void method4() {
		// A_For클래스의 10번 메서드를 while문으로 바꾸기.
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int i = 0; // 초기식
		while(i <= str.length() -1) {
			System.out.println(str.charAt(i));
			i++;
		}
		
	}
	
	/*
	 * do-while문
	 * [표현법]
	 * do { // 조건검사 없이 무조건 1번은 실행한다.
	 *   실행할 코드
	 * }while(조건식); // 조건식의 결과가 true면 실행할코드 실행
	 * 				 // 조건식의 결과가 false면 반복문 빠져나옴.  
	 * 
	 * for/while문과 do-while문의 차이점
	 * for/while문은 처음 실행할때부터 조건 검사를 하고 반환값이 true여야 실행을 함
	 * do-while문은 첫 실행은 무조건 조건검사 없이 실행된다.
	 * 
	 */
	
	public void method5() {
		int num = 900;
		do {
			System.out.println("하이");
		} while(num==0); // false
	}
	public void method6() {
		// 1부터 사용자가 입력한 숫자까지의 총 합계
		// do-while문 사용
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		do {
			sum += i++;
		}while(i <= num);
		
		System.out.printf("1부터 %d까지의 총 합계 : %d", num, sum);
	}
}