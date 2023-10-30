package com.kh.practice.generics.view;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("========== KH  마트  ==========");
			System.out.println("*******  메인  메뉴  *******");
			System.out.println("1.  직원메뉴");
			System.out.println("2.  손님메뉴");
			System.out.println("9.  종료");
			System.out.println("메뉴 번호 선택 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: adminMenu(); break;
			case 2: customerMenu(); break;
			case 9: System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); return;
			}
		}
		
	}
	
	public void adminMenu() {
		
		while (true){
			System.out.println("*******  직원  메뉴  *******");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류  삭제");
			System.out.println("3. 수량  수정");
			System.out.println("4. 농산물  목록");
			System.out.println("9. 메인으로  돌아가기");
			System.out.println("메뉴  번호  선택  :");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: addNewKind(); break;
			case 2: removeKind(); break;
			case 3: changeAmount() ; break;
			case 4: printFarm() ; break;
			case 9: mainMenu() ; break;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); return;
			}
		}
	}
	
	public void customerMenu() {
		printFarm();
		while (true){
			System.out.println("*******  고객  메뉴  *******");
			System.out.println("1.  농산물  사기");
			System.out.println("2.  농산물  빼기");
			System.out.println("3.  구입한  농산물  보기");
			System.out.println("9.  메인으로  돌아가기");
			System.out.println("메뉴  번호  선택  :");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: buyFarm(); break;
			case 2: removeFarm(); break;
			case 3: changeAmount() ; break;
			case 4: printBuyFarm() ; break;
			case 9: mainMenu() ; break;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); return;
			}
		}
	}
	
	public void addNewKind() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("추가할 종류 번호 : ");
		int menu = parse(sc.nextLine());
		
		if(!(menu > 0 && menu < 4)) {
			System.out.println("잘못 입력하셨습니다.");
			addNewKind();
			return;
		}
		
		Farm f = null;
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("수량");
		int amount = parse(sc.nextLine());
		
		switch(menu) {
		case 1: f= new Fruit("과일", name); break;
		case 2: f= new Vegetable("채소",name); break;
		case 3: f= new Nut("견과", name); break;
		}
		
		boolean result = fc.addNewKind(f, amount);
		
		if(result) {
			System.out.println("추가성공");
		} else {
			System.out.println("추가실패");
		}
	}

	private int parse(String nextLine) {
		return Integer.parseInt(sc.nextLine());
	}
	
	public void removeKind() {
		
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("추가할 종류 번호 : ");
		int menu = parse(sc.nextLine());
		
		if(!(menu > 0 && menu < 4)) {
			System.out.println("잘못 입력하셨습니다.");
			addNewKind();
			return;
		}
		
		Farm f = null;
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		switch(menu) {
		case 1: f= new Fruit("과일", name); break;
		case 2: f= new Vegetable("채소",name); break;
		case 3: f= new Nut("견과", name); break;
		}
		
		boolean result = fc.removeKind(f);
		
		if(result) {
			System.out.println("추가성공");
		} else {
			System.out.println("추가실패");
		}
	}
	
	public void changeAmount() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("추가할 종류 번호 : ");
		int menu = parse(sc.nextLine());
		
		if(!(menu > 0 && menu < 4)) {
			System.out.println("잘못 입력하셨습니다.");
			addNewKind();
			return;
		}
		
		Farm f = null;
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("수량");
		int amount = parse(sc.nextLine());
		
		switch(menu) {
		case 1: f= new Fruit("과일", name); break;
		case 2: f= new Vegetable("채소",name); break;
		case 3: f= new Nut("견과", name); break;
		}
		
		boolean result = fc.changeAmount(f, amount);
		
		if(result) {
			System.out.println("수정성공");
		} else {
			System.out.println("수정실패");
		}
	}
	
	public void printFarm() {
		HashMap<Farm, Integer> hMap = fc.printFarm();
		
		for(Farm key : hMap.keySet()) {
			System.out.printf("%s : %s(%d개)\n", key.getKind(),
					key.getName(),
//					key instanceof Fruit ? ((Fruit)key).getName() : 
//					key instanceof Nut ? ((Nut)key).getName() : ((Vegetable)key).getName()
					hMap.get(key)
					);
			
		}
	}
	
	public void buyFarm() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("추가할 종류 번호 : ");
		int menu = parse(sc.nextLine());
		
		if(!(menu > 0 && menu < 4)) {
			System.out.println("잘못 입력하셨습니다.");
			buyFarm();
			return;
		}
		
		Farm f = null;
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		switch(menu) {
		case 1: f= new Fruit("과일", name); break;
		case 2: f= new Vegetable("채소",name); break;
		case 3: f= new Nut("견과", name); break;
		}
		
		boolean result = fc.buyFarm(f);
		
		if(result) {
			System.out.println("수정성공");
		} else {
			System.out.println("수정실패");
		}
	}
	
	public void removeFarm() {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.println("추가할 종류 번호 : ");
		int menu = parse(sc.nextLine());
		
		if(!(menu > 0 && menu < 4)) {
			System.out.println("잘못 입력하셨습니다.");
			buyFarm();
			return;
		}
		
		Farm f = null;
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		switch(menu) {
		case 1: f= new Fruit("과일", name); break;
		case 2: f= new Vegetable("채소",name); break;
		case 3: f= new Nut("견과", name); break;
		}
		
		boolean result = fc.removeFarm(f);
		
		if(result) {
			System.out.println("취소성공");
		} else {
			System.out.println("취소실패");
		}
	}
	
	public void printBuyFarm() {
		
		Iterator<Farm> iter = fc.printBuyFarm().iterator();
		
		while(iter.hasNext()) {
			Farm f = iter.next();
			System.out.println(f.getKind() + " : "+f.getName());
		}
	}
	
	
	
	
}
