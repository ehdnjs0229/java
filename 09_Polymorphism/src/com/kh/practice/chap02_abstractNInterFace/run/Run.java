package com.kh.practice.chap02_abstractNInterFace.run;

import com.kh.practice.chap02_abstractNInterFace.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String [] result = pc.method();
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}

}
