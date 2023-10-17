package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {

	public static void main(String[] args) {
		
//		ElectronicController1 ec = new ElectronicController1();
//		// ec(하이마트)객체 생성시 해당 클래스의 필드값들에 null값이 자동으로 추가.
//		//Desktop d = new Desktop("삼성", "데스크탑", 800000, "Geforce 1070");
//		
//		ec.insert(new Desktop("삼성", "데스크탑", 800000, "Geforce 1070"));
//		ec.insert(new NoteBook("LG", "그램", 1500000, 4));
//		ec.insert(new Tablet("애플", "아이패드", 600000, true));
//		
//		System.out.println(ec.selectDesktop());
//		System.out.println(ec.selectNoteBook());
//		System.out.println(ec.selectTablet());
		
		// 다형성 적용후
		ElectronicController2 ec = new ElectronicController2();
		
		ec.insert(new Desktop("삼성", "데스크탑", 800000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "그램", 1500000, 4));
		ec.insert(new Tablet("애플", "아이패드", 600000, true));
		
		Electronic [] arr = ec.select();	
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 * 다형성을 사용하는 이유
		 * 1. 부모타입의 객체배열로 다양한 자식들을 받아줄 수 있음.
		 * 	  => 부모타입 하나만으로 다양한 자식객체들을 다룰 수 있음
		 * 2. 메소드의 매개변수나 반환형에 다형성을 적용하게 되면 메소드의 갯수가 확 줄어든다.
		 * 
		 */

	}

}
