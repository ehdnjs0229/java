package com.kh.practice.chap02_abstractNInterFace.model.vo;

public interface Phone {
	
	public char[] NUMBERPAD = {'1','2','3','4','5','6','7','8','9','*','0','#'};
	
	public abstract String makeCall(); // 전화걸기
	
	public abstract String takeCall(); // 전화 받기
	
}	
