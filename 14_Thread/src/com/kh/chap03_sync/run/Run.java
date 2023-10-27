package com.kh.chap03_sync.run;

import com.kh.chap03_sync.sync.Account;
import com.kh.chap03_sync.sync.Atm;

public class Run {

	public static void main(String[] args) {
		Account acc = new Account();
		
		Thread atm1 = new Thread(new Atm(acc), "atm1");
		Thread atm2 = new Thread(new Atm(acc), "atm2");
		
		atm1.start();
		atm2.start();
		/*
		 * 하나의 공유자원에 동시에 여러개의 쓰레드가 달라붙어서 접근하는 상황을 경쟁상태라고 부름.
		 * 이를 방지하기 위해 하나의 공유자원에 하나의 스레드만 접근가능하도록 통제를 해야하는데,
		 * 그 통제가 필요한 영역을 임계영역이라고 부름.
		 * 임계영역을 통제하기 위하여 synchronized 키워드를 추가한다.
		 */
		
		System.out.println("메인 스레드 종료");
	}

}
