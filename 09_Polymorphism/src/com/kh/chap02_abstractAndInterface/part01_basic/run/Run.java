package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		
		// Sports클래스 객체 생성
		//Sports s = new Sports(); // 추상클래스는 객체 생성이 불가능. -> 미완성된 클래스이기 때문
		
		// 단, 객체생성은 불가능하지만, 참조변수로는 사용 가능.
		Sports s;
		s = new Football(); // 즉, 다형성을 적용해서 자식객체를 생성하고 이를 저장하는 용도로 사용 가능.
		
		
		Sports[] arr = new Sports[2];
		arr[0] = new Football(12);
		arr[1] = new Basketball(6);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].rule();
		}
		
		/*
		 * 추상클래스
		 * - 미완성된 클래스 abstract class
		 * - 객체생성 불가능(단, 참조변수(레퍼런스변수)로는 선언 가능)
		 * - 추상클래스 내부에 추상메소드가 존재하는 순간 해당 클래스는 반드시 추상클래스로 정의
		 *   (일반필드 + 일반 메소드 + [추상메소드(생략가능)])
		 *   
		 *   단, 추상메소드가 굳이 없어도 추상클래스로 둘 수 있다.
		 *   언제? 클래스가 아직 구체적으로 덜 구현된 상태인것으로 보이는 경우(개념적)
		 *        현재 이 클래스를 객체 생성이 불가하게끔 하고자 할때 (기술적)
		 *        
		 *   - 객체 생성은 불가능한데 참조번수로 선언 가능하다라는 특징은
		 *     다형성을 적용할 수 있다로 해석이 된다.
		 *     
		 *   추상메소드
		 *   - 미완성된 메소드로 몸통부 {} 가 구현되어 있지 않은 메소드
		 *   - 자식클래스에서 오버라이딩을 통해 완성됨(강제로 오버라이딩 해야함)
		 *    => 오버라이딩 하지 않을 경우 에러가 발생
		 *    => 메소드 사용의 통일성 확보 목적.
		 *    => 표준화된 틀을 제공할 수 있는 목적.
		 *
		 */
			
		

	}

}
