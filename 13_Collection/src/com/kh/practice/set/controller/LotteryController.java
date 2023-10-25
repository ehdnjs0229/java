package com.kh.practice.set.controller;

import java.util.HashSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	
	private HashSet<Lottery> lottery = new HashSet();
	private HashSet<Lottery> win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		
		// 1번 사이즈 체크
		int beforeSize = lottery.size();
		lottery.add(l);
		int afterSize = lottery.size();
		return beforeSize != afterSize;
		
		// 2번 
		
	}
	
	public boolean deleteObject(Lottery l) {
		return;
	}
	
	public HashSet winObject() {
		return;
	}
	
	public TreeSet sortedWinObject() {
		return;
	}
	
	public boolean searchWinner(Lottery l) {
		return;
	}

}
