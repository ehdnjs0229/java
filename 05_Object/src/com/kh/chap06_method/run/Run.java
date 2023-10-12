package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.MethodTest1;
import com.kh.chap06_method.controller.MethodTest2;

public class Run {

	public static void main(String[] args) {
		MethodTest1 mt1 = new MethodTest1();
		int result = mt1.method4(2, 10);
		//System.out.println(result);
		//MethodTest2.count;
		
		MethodTest2 mt2 = new MethodTest2();
		MethodTest2.method1();

	}

}
