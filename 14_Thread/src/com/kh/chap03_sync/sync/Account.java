package com.kh.chap03_sync.sync;


//계좌
//2개의 ATM기에 동시 접속할 예정
public class Account {
	
	private int balance = 10000;
	
	
	public int getBalance() {
		return balance;
	}
	/*
	 * 동기화란 ?
	 * 멀티쓰레드 프로그램에서 스레드간의 공유자원에 대한 처리를 말함.
	 * 공유자원의 사용순서를 정하여, 한번에 한개의 스레드만 공유자원에 접근하여 사용 할 수 있도록 제어함.
	 * 
	 */
	
	public /*synchronized*/ void withdraw(int money) {
		
		/*
		 * synchronized(격리공간)
		 * - 동기화 메소드, 동기화 블럭에 사용되는 키워드
		 * - 동기화메소드는 메소드 선언에 synchronized키워드를 붙이고, 인스턴스 및 정적메소드에서도 사용이 가능하다.
		 * - 동기화메소드는 스레드가 메소드를 실행하면 메소드 전체에 즉시 락을 걸고 메소드가 종료되면 락이 풀린다.
		 * - 메소드 전체가 아니라 일부 내용에만 락을 걸고 싶다면 동기화 블럭을 이용하면 된다.
		 * - 락이 걸려있다면 락을 해소할 수 있는 키를 가진 스레드만 접근이 가능해진다.
		 */
		
		String threadName = Thread.currentThread().getName();
		synchronized(this) {
			System.out.println("현재 계좌에 남아있는 잔액?" + balance);
			if(money <= balance) {
				balance -= money;
				System.out.printf("[%s] %d원 출금 >> 잔액 : %d원%n", threadName, money, balance);
			} else {
				System.out.printf("[%s] %d원 출금시도 >>> 현재 잔액 %d%n", threadName, money, balance);
			}
			
		}
	}
	
	
	
	

}
