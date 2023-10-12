package com.kh.array;

import java.util.Random;
import java.util.Scanner;

public class A_Array {
	
	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * 		ex) int a = 10;
	 * 			    a = 20;
	 * 
	 * 배열 : 하나의 공간에 여러 개의 값을 담을 수가 있음(단, 같은 자료형의 값만)
	 * 	  	정확히 얘기하면 배열의 각 인덱스 위치에 실제 값이 담긴다.(인덱스는 0부터 시작)
	 *     ex) int [] a = new int[3]; // int자료형의 값만 담을 수 있는 3개의 공간이 할당된다.
	 *     							  // 방 [0], [1], [2] 방 3개를 만듬
	 *     							  // 인덱스는 항상 0부터 시작한다
	 *     				    		  // 배열의 크기는 3, 마지막 인덱스 = 3-1 == 2
	 *     					   	 	  // 배열의 크기 만약 100이라면 마지막 인덱스는 99
	 *     		 					  // 크기 = n , 마지막 인덱스 == n-1
	 * 
	 * 
	 */
	
	public void method1() {
		// 배열을 왜 써야할까 ?
		// 만약 변수만을 가지고 프로그래밍을 하게 된다면...
		// 0, 1, 2, 3, 4 기록해야됨.
		
		/*
		 * 변수를 이용하여 각 데이터를 보관하고자 할 때 -> 각 각의 변수를 만들어서 따로 관리해야 한다.
		 * 
		 * int num1 = 0;
		 * int num2 = 1;
		 * int num3 = 2;
		 * ...
		 * 
		 * 저장된 값을 전부다 출력해야한다면?? 반복문 사용하지 못함.
		 * 
		 * for(int i = 1; i<=5; i++) { XX 실행안됨
		 * 	System.out.println(num+i);
		 * } 
		 * 
		 * 1. 배열을 가지고 프로그래밍시
		 * 	 0, 1, 2, 3, 4
		 * 
		 * 1) 배열 선언
		 * 자료형 [] 배열명;
		 * 자료형 배열명 [];
		 * int a; // 변수
		 * int [] arr; // 배열
		 * int arr[]; // 배열
		 * 
		 * 2) 배열 할당
		 * 이 배열에 몇 개의 값들을 보관할건지 배열의 크기를 지정해주는 과정
		 * 지정한 갯수만큼 값이 들어갈 공간이 확보됨
		 * 
		 * [표현법]
		 * 배열명 = new 자료형[배열의크기];
		 * 
		 * arr = new int[5];
		 * 
		 */
		
		int [] arr = new int [5];
		System.out.println(arr);
		// [I@53bd815b 여기서 @기준으로 우측은 참조하고 있는 메모리 영역의 주소값
		// [ : 배열을 의미함
		// I : int자료형임을 의미
		
		/*
		 * 3. 배열의 각 인덱스(=방번호) 자리에 값 대입
		 * [표현법]
		 * 배열명[방번호(== 인덱스)] = 값;
		 * 
		 * arr[0] = 0;
		 * arr[1] = 1;
		 * arr[2] = 2;
		 * ...
		 */
		
		for(int i =0; i<5; i++) {
			arr[i] = i; // arr[0] = 0; 다음 반복시 arr[1] = 1;
		}
//		arr[0] = 0;
//		arr[1] = 1;
//		arr[2] = 2;
		
		// 반복문을 활용한 값대입 / 출력도 가능함.
		for(int i = 0; i<5; i++) {
			// 각각의 인덱스 값을 확인하기 위해서는 []블럭을 통해 내가 접근하고자하는 인덱스를 제시해줘야 한다.
			System.out.printf("%d번 인덱스의 값 : %d \n", i , arr[i]);
		}
	}
	
	public void method2() {
		int i = 10; // 일반 변수.
		
		int [] arr = new int[5]; // 배열
		
		/*
		 * arr이라는 배열명을 가진 int형 배열 박스가 stack영역에 만들어짐.
		 * 
		 * 그 다음 new int[5]가 실행된다. 실행시 크기 5짜리 저장공간이 heap영역에 생성됨
		 * (new라는 키워드가 붙은 모든 코드는 항상 heap영역에 값이 할당됨)
		 * 
		 * 5칸짜리 저장공간이 만들어진 후에 각 인덱스에는 자료형에 맞는 기본값으로 데이터가 초기화 되고,
		 * 그 후 주소값이 할당됨(0x123)
		 * 
		 * 그 다음 주소값을 대입연산자를 통해 arr배열에 할당한다.
		 * 
		 */
		
		System.out.println("i : "+ i); //10
		System.out.println("arr : "+arr); //[I@16진수랜덤값
		System.out.println("arr의 해시코드값 : "+arr.hashCode());
		// 해시코드() : 주소값을 10진수의 형태로 변환한것.
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		System.out.println("dArr의 해시코드값 : "+dArr.hashCode());
		
		/*
		 * 기본자료형(boolean, char, byte, short, int, long, float, double)
		 * => 실제 값(리터럴)을 바로 stack 영역에 담을 수 있는 변수 => 일반변수
		 * 
		 * 그 외 자료형(int[], double[], String, Scanner, ...)
		 * -> heap 영역안에 생성된 데이터의 주소값을 담고 있는 변수
		 * -> 주소값을 참조한다(참조변수) => 레퍼런스 변수
		 */
	}
	
	public void method3() {
		int[] iArr = new int[3];
		double[] dArr = new double[3];
		
		for(int i = 0; i<3; i++) { // 0, 1, 2
			System.out.println(iArr[i]);
		}
		// 문자열의 크기를 아는 방법 : 문자열.length(); -> 함수
		// 배열의 크기를 아는 방법 : 배열명.length; -> 필드
		for(int i = 0; i<dArr.length; i++) { // 0, 1, 2
			System.out.println(dArr[i]); // jvm이 자동으로 값을 넣어줘서 0.0 출력
		}
	}
	
	public void method4() {
		int[] arr = new int[5];
		
		// 각 배열의 인덱스에 값을 대입하는 반복문.
		// arr[0] = 1;
		// arr[1] = 2;
		// arr[2] = 3;
		// arr[n-1] = n;
		for(int i = 0; i <arr.length; i++) { // 0, 1, 2, 3, 4
			arr[i] = i+1;
		}
		
		// arr배열의 마지막 인덱스에 담긴값을 출력?
		System.out.println(arr[4]);
		//System.out.println(arr[5]);
		/*
		 * ArrayIndexOutOfBoundException
		 * 배열의 인덱스 범위를 벗어남.
		 * 
		 */
	}
	public void method5() {
		
		int i = 0; 
		String str = null; // 참조자료형의 기본값 : null 
		
		// int i2 = null; null값은 참조자료형에만 대입 가능.
		int [] arr = null; // null값 할당 가능. 주소값을 담을 수 있는 변수들의 기본값은 null;
		
		System.out.println(arr.hashCode());
		/*
		 * 기본값이 null인 변수를 가지고 "메소드를 호출"한다던가 혹은 특정 "필드"에 접근하려고 할때
		 * 발생하는 에러.
		 * null값을 가지고 있다고 해서 반드시 에러가 발생하는게 아니다.
		 * null값을 통해 어딘가를 참조하려고 할때 에러발생
		 * ex) arr.length(); , arr[0] , arr.length;
		 */
	}
	
	public void method6() {
		int [] arr = new int[5];
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 */
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (i*2) + 2;
		}
		System.out.println(arr[0]);
		
		/*
		 * 배열의 단점
		 * 1) 한번 지정한 크기는 변경이 불가능함.
		 * => 배열의 크기를 변경하고자 한다면 새로운 배열을 선언해야함
		 * 
		 */
		
		System.out.println("==== arr 변경전 ====");
		System.out.println(arr);
		System.out.println("arr의 해시코드값 : "+arr.hashCode());
		
		arr = new int[7];
		
		System.out.println("==== arr 변경후 ====");
		System.out.println(arr);
		System.out.println("arr의 해시코드값 : "+arr.hashCode());
		System.out.println(arr[0]); // 0
		
		/*
		 * 항상 고유한 주소값 부여, 기존에 생성되었던 주소와는 절대로 겹치지 않는다.
		 * 기존에 참조하고 있던 연결이 끊기고 새로운 곳 참조
		 * 
		 * 연결이 끊어진 기존의 배열은 Heap영역 내부에 떠다님
		 * 일정시간이 지나고서도 사용이 되지 않으면 가비지 컬렉터가 수거해간다.(자동 메모리 관리)
		 * => 자바에서 자동메모리관리 특징 => 개발자가 코드에만 신경쓸수 있게 해준다.
		 */
	} 
	
	public void method7() {
		
		// 배열 선언과 동시에 할당(크기 지정)
		int [] arr = new int[4]; // 배열변수 선언 및 할당 및 초기화
		
		// 각 인덱스에 값들을 직접 대입하여 초기화
		arr[0] = 1;
		arr[1] = 2;
		
		// 배열 선언과 동시에 초기화까지 한번에 끝내는 방법
		// 방법1.
		int[] arr1 = new int[] {1,2,3,4} ;
		
		// 방법2.
		int[] arr2 = {1,2,3,4};
		
		int[] arr3 = arr2; // 얕은 복사 (메모리 주소값만 복사)
		
		System.out.println(arr1 == arr2);
		
		System.out.println(arr2 == arr3);
		System.out.println(arr2[2]);
		arr3[2] = 999;
		System.out.println(arr2[2]);
		// arr1 -> arr1의 heap영역의 주소값
		// arr2 -> arr2의 heap영역의 주소값
		// 주소값 == 주소값 : 주소값간의 동등비교를 수행하기 때문에 false
	}
	
	public void method8() {
		/*
		 * 1. 크기 10짜리 정수배열 선언
		 * 
		 * 2. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값을 대입.
		 * 	  대입할 값은 1~100까지 범위의 랜덤값 
		 * 
		 * 3. 반복문을 활용해서 0번 인덱스부터 ~ 마지막 인덱스까지 배열에 담긴 값을 출력
		 * 출력예시) arr[x] : xx
		 */
		int [] arr = new int[10];
		
		Random random = new Random();
		
		for(int i=0; i<arr.length; i++) {
			int randomValue = random.nextInt(100) + 1;
			arr[i]= randomValue;
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
//		for (int i = 0; i < arr.length; i++) {
//            System.out.println("arr[" + i + "] : " + arr[i]);
//        }
	}
	
	public void method9() {
		// 1. 사용자에게 매번 키의 정보를 입력받은 후 해당 크기만큼 문자열 배열 생성.
		// 입력예시 : 배열의 길이 :
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : " );
		int size = sc.nextInt();
		
		String [] arr = new String[size];
		
		// 2. 반복문을 활용해서 매번 사용자에게 과일명을 입력받아 그 값을 매 인덱스자리에 대입
		// 입력예시 : 좋아하는 과일 입력
		
		System.out.println(arr[0]);
		
		sc.nextLine();
		for(int i = 0; i<arr.length; i++) {
			System.out.print("좋아하는 과일 입력 : ");
			arr[i] = sc.nextLine();
			System.out.println(arr[i] + " ");
		
		}
	}
	
	public void method10() {
		/*
		 * 사용자에게 문자열을 하나 입력받은 후 
		 * 각각의 문자들을 char배열에 옮겨담기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : "); // 민경민
		String str = sc.nextLine();
		
		// 문자열의 길이만큼의 크기를 가진 char배열 생성
		char [] arr = new char[str.length()];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method11() {
		// 1. 사용자에게 배열의 길이를 입력받은 후 , 해당 크기만큼의 정수형 배열을 생성
		// 2. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값 대입(1~100랜덤값)
		// 3. 반복문 활용하여 0번 인덱스부터 ~ 마지막 인덱스까지 배열에 담긴 값 출력과 동시에
		//    해당 인덱스에 담긴 값이 짝수인 경우 그 값들의 총합 구하기.
		// 출력예시 : arr[x] : x
		// 			   총합 : x
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이를 입력해주세요.");
		int size = sc.nextInt();
		Random random = new Random();
		
		int [] arr = new int[size];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			int randomValue = random.nextInt(100) + 1;
			arr[i] = randomValue;
			System.out.println("arr[" +i+ "] : " + arr[i]);
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println("짝수 총합 : " + sum);
	}
	public void method12() {
		Scanner sc = new Scanner(System.in);
		double [] heights = new double[3];
		// 1. 반복문을 활용해서 heights배열의 0번 인덱스부터 마지막 인덱스까지 반복을 진행하면서
		//    사용자로부터 키에 대한 정보(cm)를 입력받아 각 인덱스에 저장
		double sum = 0;
		for(int i = 0; i<heights.length; i++) {
			heights[i] = sc.nextDouble();
			
			System.out.println(heights[i]);
			sum += heights[i];
		}
//		double sum = 0;
		// 2. 3명의 키에 대한 정보를 출력 시키면서 동시에 모든 키값들에 대한 총합을 저장
//		for(int i = 0; i<heights.length; i++) {
//			System.out.println(heights[i]);
//		  	sum += heights[i];
//		}
		// 3. 3명의 키의 총합을 출력하고, 평균도 함께 출력(소숫점 첫째자리까지 출력)
		System.out.printf("3명의 키의 총 합계 : %.1f , 3명의 키의 평균 : %.1f", sum, sum/heights.length);
	}
}
