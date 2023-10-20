package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 : ");
		String s = sc.nextLine();
		
		CharacterController cc = new CharacterController();
		try {
			System.out.printf("'%s'에 포함된 영문자 개수 : %d", s, cc.countAlpha(s));
		} catch(CharCheckException e) {
			e.printStackTrace();
		}
		
		

		
	}

}
