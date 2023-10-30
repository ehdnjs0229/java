package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.practice.generics.model.vo.Farm;

public class FarmController {
	
	private HashMap <Farm, Integer> hMap= new HashMap<>();
	private ArrayList <Farm> list = new ArrayList<>();
	
	public boolean addNewKind(Farm f, int amount) {
		Integer result = hMap.get(f);
		
		hMap.put(f, amount);
		return result == null ? true : false;
	}
	
	public boolean removeKind(Farm f) {
		return hMap.remove(f) == null ? false : true;
	}
	
	public boolean changeAmount(Farm f, int amount) {
		return hMap.replace(f, hMap.get(f), amount);
	}
	
	public HashMap<Farm, Integer> printFarm(){
		return hMap;
	}
	
	public boolean buyFarm(Farm f) {
		Integer amount = hMap.get(f);
		
		if(amount != null && amount > 0) {
			list.add(f);
			hMap.put(f, --amount);
			return true;
		}
		return false;
	}
	
	public boolean removeFarm(Farm f) {
		int index = list.indexOf(f);
		if(index == -1) {
			return false;
		}
		Farm farm = list.remove(index);
		hMap.replace(farm, hMap.get(farm)+1);
		
		return false;
	}
	
	public ArrayList<Farm> printBuyFarm(){
		return list;
	}
	
}
