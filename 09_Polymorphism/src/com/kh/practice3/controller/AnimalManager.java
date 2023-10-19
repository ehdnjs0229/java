package com.kh.practice3.controller;

import com.kh.practice3.model.vo.Animal;
import com.kh.practice3.model.vo.Cat;
import com.kh.practice3.model.vo.Dog;

public class AnimalManager {
	
	public static void main(String[] args) {
		Animal [] arr = new Animal[5];
		arr[0] = new Dog("건욱1", "강아지종류", 80);		
		arr[1] = new Cat("건욱2", "고양이종류", "화성", "검정");		
		arr[2] = new Dog("건욱3", "강아지종류", 80);		
		arr[3] = new Cat("건욱4", "고양이종류", "화성", "빨강");		
		arr[4] = new Dog("건욱5", "강아지종류", 80);
		
		for(int i = 0; i<arr.length; i++) {
			arr[i].speak();
		}
	}

}
