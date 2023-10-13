package com.kh.chap01_beforeVsAfter.after.run;

import com.kh.chap01_beforeVsAfter.after.model.vo.Desktop;
import com.kh.chap01_beforeVsAfter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVsAfter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		Desktop d = new Desktop("삼성", "d-01", "삼성데스크탑", 1_500_000, true);
		
		SmartPhone sm = new SmartPhone("삼성", "s-01", "s23", 1_500_000, "skt");
		
		Tv t = new Tv("엘쥐", "t-01", "얇은 티비", 3_500_000, 60);
		
		/*
		 * 실행하고자하는 메소드가 자식클래스에 없다면, 자동으로 부모클래스에 있는 메소드가 실행됨.
		 * 단, 자식클래스에서 재정의된(오버라이딩된)메소드가 있을 경우 자식클래스에 있는 메소드가 실행에서
		 * 우선권을 가진다.
		 * 
		 */
		System.out.println(d.information());
		System.out.println(sm.information());
		System.out.println(t.information());
		
		/*
		 * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스들을 작성 가능
		 * - 중복된 코드를 공통적으로 관리하기 때문에 새로운 코드를 추가하거나 수정할때 용이함.
		 *   => 프로그램의 생산성 증대 및 유지보수에 크게 기여한다.
		 *   
		 * 상속의 특징
		 * - 클래스간의 상속은 다중상속이 불가능함(단일 상속만 가능)
		 * - 명시되어있지 않지만 모든 클래스는 Object클래스의 후손
		 *   => Object클래스에 있는 메소드를 모든 클래스에서 사용이 가능함.
		 *   => Object클래스에 있는 메소드가 마음에 안들면 오버라이딩을 통해 재정의가 가능하다.
		 */

	}

}
