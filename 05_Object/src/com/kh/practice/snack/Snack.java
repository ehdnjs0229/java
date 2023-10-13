package com.kh.practice.snack;

public class Snack {
	private String kind; // 종류
	private String name; // 이름
	private String flavor; // 맛
	private int numOf; // 개수
	private int price; // 가격
	
	public Snack() {
		
	}
	
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	public String getKind() {
		return kind;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public int getNumOf() {
		return numOf;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return this.kind+"("+this.name+" - "+this.flavor+") "+this.numOf+"개 "+this.price+"원";
	}
	
	
	

}
