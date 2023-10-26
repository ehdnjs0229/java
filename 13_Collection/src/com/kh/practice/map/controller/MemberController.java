package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	
	private Map<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
//		if(map.containsKey(id)) { // map내부에 매개변수로 제시한 key값
//			map.put(id, m);
//			return true;	
//		} else {
//			return false;
//		}
		
		if(map.get(id)==null) {
			map.put(id, m);
			return true;	
		} else {
			return false;
		}
	}
	
	public String login(String id, String password) {
		Member member = map.get(id);
		if(member != null && member.getPassword().equals(password)) {
			return member.getName();
		} else {
			return null;
		}
			
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		Member member = map.get(id);
		if(member != null && member.getPassword().equals(oldPw)) {
			oldPw = newPw;
			return true;
		} else {
			return false;
		}
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {
		Set<String> s = map.keySet();
		TreeMap<String, String> tm = new TreeMap<>();
		
		for(String key : s) {
			if(map.get(key).getName().equals(name)) {
				tm.put(key, name);
			}
		}
		return tm;
	}

}
