package com.kh.practice.token.controller;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		java.util.StringTokenizer st = new java.util.StringTokenizer(str , " ");
		
		String result = "";
		
		while(st.hasMoreTokens())
			result += st.nextToken();
			
		String[] arr = str.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		
		return result;
	}
	
	public String firstCap(String input) {
		
		String result = "";
		StringBuilder sb = new StringBuilder();
		// 1) 반복문 활용
		for(int i = 0; i < input.length(); i++) {
			char ch = (char)(input.charAt(i) - (i == 0 ? 32 : 0)); // 소문자에서 -32 하면 대문자(아스키 코드)
			sb.append(ch);
		}
		
		// 2) 메서드 활용
		// 첫번째 클자만 대문자로 변환 후 나머지 글자와 이어주기해서 출력.
		return input.toUpperCase().charAt(0)+input.substring(1);
		
		//return sb.toString();
	}
	
	public int findChar(String input, char one) {
		
		int count = 0;
		
		for(int i = 0; i<input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		
		return count;
	}

}
