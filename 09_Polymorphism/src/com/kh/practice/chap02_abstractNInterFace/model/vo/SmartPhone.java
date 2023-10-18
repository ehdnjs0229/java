package com.kh.practice.chap02_abstractNInterFace.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	
	private String maker;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String makeCall, String takeCall, String picture, String charge, String touch, boolean bluetoothPen) {
		
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public abstract String printInformation();
	
	

}
