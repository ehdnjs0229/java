package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {
		
	}
	
	public int countAlpha(String s) throws CharCheckException{
		if(s.indexOf(" ") > -1) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		}
		
		int count = 0;
		s = s.toUpperCase();
		
		for(int i = 0; i<s.length(); i++) {
			char currentVal = s.charAt(i);
			if(currentVal >= 'A' && currentVal <= 'Z') { // 영문자라면
				count++;
			}
		}
		return count;
	}

}
