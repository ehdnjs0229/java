package com.kh.operator;

public class C_Compound {
	
	/*
	 * 복합대입연산자 : 산술연산자 + 대입연산자 
	 * 
	 *  += , -= , *= , /= , %=
	 *  
	 *  a = a + 1 => a++
	 *  a = a + 3 => a += 3; // 기존의 a값에 3을 더해서 a에 다시 대입해주겠다.
	 * 
	 * 
	 */
	
	public void method() {
		
		int num = 12;
		
		System.out.println("현제 num : " + num);
		
		// num을 3 증가시키기
		num = num + 3;
		System.out.println("3 증가시킨 num : " + num);
		
		num += 3;
		System.out.println("3 증가시킨 num : " + num);
		
		// num을 5 감소시키기
		num -= 5;
		System.out.println("5 감소시킨 num : " + num);
		
		// num을 6배 증가시키기
		num *= 6; // num = num * 6;
		System.out.println("6배 증가시킨 num : " + num);
		
		// num /= 2 == num = num / 2
		
		// += 의 경우 문자열 접합도 가능
		String str = "Hello" ;
		
		//str = str + "World" ;
		str += "World" ;
		
		System.out.println(str);
	}

}
