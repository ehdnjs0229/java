package com.kh.practice.numRange.controller;


import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	
	public NumberController() {
		
	}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException{
		if(num1 > 101 || num2 > 101 || 0 > num1 || 0 > num2) {
			throw new NumRangeException("1부터 100 사이의 값이 아닙니다.");
		} 
		
		if (num1 % num2 == 0) {
            return true;
        } else {
            return false;
        }
		
	}

}
