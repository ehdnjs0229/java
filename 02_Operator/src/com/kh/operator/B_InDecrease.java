package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * 증감연산자(단항연산자) ++ --
	 * 
	 * ++ : 변수에 담긴 값을 1 증가시키는 연산자
	 * 		++변수, 변수++ ==> (전위연산자) , (후위연산자)
	 * -- : 변수에 담긴 값을 1 감소시키는 연산자
	 * 		--변수, 변수-- 
	 * 
	 * (증감연산자)변수 : 전위연산 -> 선증감 후처리
	 * 변수(증감연산자) : 후위연산 -> 선처리 후증감
	 * 
	 * int num = 1;
	 * 
	 * num = num + 1; == num++ 
	 * 
	 */
	
	
	public void method1() {
		// 전위연산
		int num = 10;
		System.out.println("전위연산 적용 전 num : " + num); // 10
		System.out.println("1회 수행 후 결과 : " +  ++num ); // 10에서 증감연산 실행 ==> 11출력될것, num에 담긴 값=11
		
		System.out.println("2회 수행 후 결과 : " +  ++num); // 12 , num에 담긴값 12
		System.out.println("3회 수행 후 결과 : " +  ++num); // 13 , num에 담긴값 13
		
		System.out.println("최종 num : " + num);
		
		//sysout+ctrl+spacebar
		System.out.println("==============================================");
		
		// 후위 연산
		int num2 =10;
		System.out.println("후위연산 적용 전 num2 : " + num2); // 10
		System.out.println("1회 수행 후 결과 : " + num2++); // 후증감, 선처리 10
		// 출력 당시에는 10이 출력되고, 출력처리가 끝난 후 11로 후증감처리된다.
		System.out.println("2회 수행 후 결과 : " + num2++); // 11
		System.out.println("3회 수행 후 결과 : " + num2++); // 12
		
		System.out.println("최종 num2 : " + num2);
		
		
	}
	
	public void method2() {
		int a = 10; 
		int b = ++a; // a = 11 b = 11
		
		System.out.println("a : " + a + ", b : " + b);
		
		int c = 10;
		int d = c++; // c = 11 d = 10
		
		System.out.printf("c : %d , d : %d \n", c,d);
		
		//예측
		int num = 20;
		System.out.println("현재 num: " + num); // 출력시 : 20, num : 20
		System.out.println("++num ? " + ++num); // 출력시 : 21, num : 21
		System.out.println("num++ ? " + num++); // 출력시 : 21, num : 22
		System.out.println("--num ? " + --num); // 출력시 : 21, num : 21
		System.out.println("num-- ? " + num--); // 출력시 : 21, num : 20
		
		System.out.println("최종 num ? " + num); //20
		
		
		
	}
	
	public void method3() {
		
		int num1 = 20;
		int result1 = num1++ * 3;
		// num1 : 21 , result1 : 60 => result1 = 20 * 3 연산처리 후 num1 = num1 + 1;
		
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1);
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		// num2 = 21, result2 = 21 * 3
	
		System.out.println("num2 : " + num2);
		System.out.println("result2 : " + result2);
	}
	public void method4() { 
		int a = 10;
		int b = 20;
		int c = 30;
		
		//주석으로 출력될 값 예측해보기.
		
		//a++;
		System.out.println(a++); //출력 10 a=11 b=20 c=30 
		//(++a) + (b++) 
		System.out.println((++a) + (b++)); //출력 12+20=32 a=12 b=21 c=30
		//(a++) + (--b) + (--c) 
		System.out.println((a++) + (--b) + (--c)); // 출력 12+20+29=61 a=13 b=20 c=29
		System.out.printf("a : %d, b : %d, c :%d ", a,b,c);
	}
	
	public void quiz() {
		int a = 5; // a:5, b: , c: , d: , e: , f: , g: , h:, i:
		int b = 10; // a:5, b:10 , c: , d: , e: , f: , g: , h:, i:
		
		int c = (++a) + b; // 6+10 a:6, b:10, c:16 , d: , e: , f: , g: , h:, i:
		int d = c / a; // 16/6 몫2 나머지4 a:6, b:10, c:16 , d:2 , e: , f: , g: , h:, i:
		int e = c % a; // 16%6 몫2 나머지4 a:6, b:10, c:16 , d:2 , e:4 , f: , g: , h:, i:
		
		int f = e++; // 4 a:6, b:10, c:16 , d:2 , e:5, f:4, g: , h:, i:
		int g = (--b) + (d--) ; // 9+2 a:6, b:9, c:16 , d:1 , e:5, f:4, g:11 , h:, i:
		
		int h = 2; // a:6, b:9, c:16 , d:1 , e:5, f:4, g:11 , h:2, i:
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); // 6 + 9 / (15/4)몫3나머지3 * (11-1) % (6+2)   6 + 9 / 3 * 10 % 8  6 + 6
		// a:7, b:9, c:15 , d:1 , e:6, f:4, g:10 , h:2, i:12
		
		System.out.printf("a : %d, b : %d, c : %d, d : %d, e : %d, f : %d, g : %d, h : %d, i : %d " + " ", a,b,c,d,e,f,g,h,i);
		        
		          
	}
	
	

}
