package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p = new Product();
		p.setPName("s23");
		p.setPrice(600000);
		p.setBrand("삼성");
		
		Product p2 = new Product();
		p2.setPName("s24");
		p2.setPrice(1000000);
		p2.setBrand("삼성");
		
		p.information();
		p2.information();
				
		
				
				
	

	}

}
