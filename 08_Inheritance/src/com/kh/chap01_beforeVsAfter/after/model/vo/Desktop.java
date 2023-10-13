package com.kh.chap01_beforeVsAfter.after.model.vo;

			 // 자식           부모
			 // 후손           조상
             // 하위           상위

public class Desktop extends Product{
	private boolean allInOne;
	
	public Desktop() {
	//	super(); => 부모클래스의 주솟값을 보관하고 있음.
	//  super.으로 부모에 접근이 가능.
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		super();
		// brand, pCode, pName, price를 부모클래스의 Product에 있는 필드에 초기화
		//super(brand,pCode,pName,price);
		
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		this.allInOne =allInOne;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// 오버라이딩 : 부모클래스에 이미 존재하는 메소드를 재정의(override) 하는 것
	public String information() {
		return super.information()+" allInOne : "+allInOne;
	}
	

}
