package com.kh.chap02_String.run;

import com.kh.chap02_String.controller.A_StringPoolTest;
import com.kh.chap02_String.controller.B_StringMethodTest;
import com.kh.chap02_String.controller.C_StringTokenizerTest;
import com.kh.chap02_String.controller.D_StringBufferAndBuilder;

public class Run {

	public static void main(String[] args) {
		A_StringPoolTest apt = new A_StringPoolTest();
		//apt.method3();
		
		B_StringMethodTest bst = new B_StringMethodTest();
		//bst.method();
		
		C_StringTokenizerTest cst = new C_StringTokenizerTest();
		cst.method();
		
		D_StringBufferAndBuilder dsb = new D_StringBufferAndBuilder();
		//dsb.method();

	}

}
