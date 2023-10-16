package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle {
	
	private int tire;
	private int wing;
	
	public Airplane() {
		super();
	}
	
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}
	
	//information메서드 오버라이딩
	@Override
	public String information() { 
		return super.information()+", tire :"+tire+", wing :"+wing;
	}
	
	//howToMove메서드 오버라이딩
	@Override
	public void howToMove() {
		System.out.println("바퀴를 굴려서 움직이고 날개를 이용해서 난다.");
	}

}
