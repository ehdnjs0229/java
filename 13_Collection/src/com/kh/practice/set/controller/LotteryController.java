package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
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
		
		// 2번 add함수 결과값 반환
		// return lottery.add(l);
		
		// 3번 반복문으로 이미 존재하는 객체인지 확인
	}
	
	public boolean deleteObject(Lottery l) {
		boolean result = lottery.remove(l);
		
		if(result && win != null) {
			win.remove(l);
		} 
		
		return result;
	}
	
	public HashSet winObject() {
		
		ArrayList<Lottery> l = new ArrayList(lottery);
		
		while(win.size() != 4) {
			int randomIndex = (int)(Math.random() * l.size() + 1) ; // l의 길이가 5라면 1~5의 범위
			win.add(l.get(randomIndex -1) );
		
		}
		
		return win;
	}
	
	public TreeSet sortedWinObject() {
		
		Comparator<Lottery> comp = new SortedLottery();
		
		TreeSet<Lottery> ts = new TreeSet(comp);
		if(win.size() != 4) {
			winObject();
		}
		ts.addAll(win);
		return ts;
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
		
	}

}
