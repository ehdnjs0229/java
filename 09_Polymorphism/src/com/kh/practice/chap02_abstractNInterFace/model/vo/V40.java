package com.kh.practice.chap02_abstractNInterFace.model.vo;

public class V40 extends SmartPhone implements NotePen{
	
	public V40() {
		super.setMaker("LG");
	}
	
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}
	
	public String picture() {
		return "1200, 1600만 트리플 카메라";
	}
	
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	
	public String touch() {
		return "정전식";
	}
	
	public boolean bluetoothPen() {
		return false;
		
	}
	
	@Override
	public String printInformation() {
		
		String result = "V40은 "+super.getMaker()+"에서 만들어졌고 제원은 다믕과 같다. \n";
			   result+= makeCall()+"\n";
			   result+= takeCall()+"\n";
			   result+= picture()+"\n";
			   result+= charge()+"\n";
			   result+= touch()+"\n";
			   result+= "블루투스 펜 탑재 여부 : " + bluetoothPen();
			   
	    return result;
	}

}
