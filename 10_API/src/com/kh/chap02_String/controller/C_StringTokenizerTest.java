package com.kh.chap02_String.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		String str = "Java Oracle JDBC HTML CSS JavaScript Server";
		
		// 구분자를 제시해서 해당 문자열을 분리시키는 방법.
		// 방법1. 분리된 문자열들을 String[]배열에 담아서 관리하는 방법.
		//       문자열.split(구분자) : String[]
		String[] arr = str.split(" ");
		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		// 배열,컬렉션은 for문을 다음과 같이 사용 가능.
		// 향상된 for문
		// [표현법]
		// for ( 순차적으로 접근한 인덱스의 값을 담아줄 참조변수 :  순차적으로 접근할 배열 ) {
		//          // 실행할 코드
		// }
		
		// 인덱스에 순차적으로 접근하기 위한 목적으로만 사용할 것을 권장
		for( String s : arr) {
			System.out.println(s);
		}
		System.out.println("====================================");
		
		// 방법 2. 분리된 각각의 문자열들을 토큰으로 취급하고 싶을떄
		//        java.util.StringTokenizer클래스를 이용한다.
		//        StringTokenizer stn = new StringTokenizer(분리시키고자 하는 문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		System.out.println("분리된 문자열의 갯수 : " + stn.countTokens());
		
//		int count = 0;
//		
//		// 현재 token의 순서 1 
//		System.out.println(stn.nextToken());
//		count ++;
//		
//		// 현재 token의 순서 2
//		System.out.println(stn.nextToken());
//		count++;
//		System.out.println(stn.nextToken());
//		count++;
//		System.out.println(stn.nextToken());
//		count++;
//		System.out.println(stn.nextToken());
//		count++;
//		System.out.println(stn.nextToken());
//		count++;
//		System.out.println(stn.nextToken());
//		count++;
		
		int count = 0;
		int totalTokens = stn.countTokens();
		while(count < totalTokens) { // 다음 토큰이 존재하면 true, 없으면 false
			System.out.println(stn.nextToken());
			count++;
		}
		
		
	}

}
