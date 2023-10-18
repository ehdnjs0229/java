package com.kh.practice.chap02_abstractNInterFace.controller;

import com.kh.practice.chap02_abstractNInterFace.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterFace.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterFace.model.vo.V40;

public class PhoneController {
	
	private String[] result = new String[2];
	
	public String [] method() {
		Phone[] arr = new Phone[2];
		arr[0] = new GalaxyNote9();
		arr[1] = new V40();
		for(int i = 0; i<arr.length; i++ ) {
			if(arr[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)arr[i]).printInformation();
			}else {
				result[i] = ((V40)arr[i]).printInformation();
				
			}
			
		}
		
		return result;
	}

}
