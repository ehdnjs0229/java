package com.kh.practice.chap02_abstractNInterFace.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {
		super.setMaker("삼성");
		
	}
	
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}
	
	public String picture() {
		return "1300만 듀얼카메라";
	}
	
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	
	public String touch() {
		return "정전식, 와콤펜 지원";
	}
	
	public boolean bluetoothPen() {
		return true;
		
	}
	
	@Override
	public String printInformation() {
		
		String result = "갤럭시 노트9은 "+super.getMaker()+"에서 만들어졌고 제원은 다믕과 같다. \n";
			   result+= makeCall()+"\n";
			   result+= takeCall()+"\n";
			   result+= picture()+"\n";
			   result+= charge()+"\n";
			   result+= touch()+"\n";
			   result+= "블루투스 펜 탑재 여부 : " + bluetoothPen();
			   
	    return result;
	}
	

}
