package com.kh.exception.run;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;
import com.kh.exception.controller.C_CustomException;

public class Run {

	public static void main(String[] args) {
		/*
		 * 에러(오류) 종류
		 * - 시스템 에러 : 컴퓨터의 오작동으로 인해 발생하는 에러 => 소스코드로 해결이 불가능(심각한 에러)
		 * - 컴파일 에러 : 소스코드상의 문법적인 문제로 발생하는 에러 => 소스코드의 수정으로 해결가능(빨간밑줄로 알려줌)
		 * - 런타임 에러 : 소스코드상으로는 문제가 없는데, 프로그램을 실행 중 발생하는 에러 => 
		 * 				사용자의 잘못 일수도 있고, 개발자가 예측가능한 경우를 제대로 처리해놓지 않을 걸수도 있다.
		 * - 논 리 에러 : 소스코드상의 문법적인 문제도 없고, 실행했을때도 에러가 발생하지 않지만, 프로그램의 의도상의 기능과 맞지 않는 경우.
		 * 
		 * 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러와 같은 비교적 덜 심각한것들을 가지고 작업할 예정.
		 * 
		 * 이러한 에러들을 "예외"라고 정의함.(Exception)
		 * 
		 * 예외처리를 해야하는 이유 : 예외 발생시 프로그램이 비정상적으로 종료되는 것을 막고자 하기 위함.
		 * 
		 * 예외처리 방법
		 * 1. try ~ catch문을 이용
		 * 2. throws를 이용(떠넘기기)
		 * 
		 * 
		 * 
		 */
		
		A_UncheckedException aue = new A_UncheckedException();
		//aue.method1();
		B_CheckedException bce = new B_CheckedException();
		//bce.method1();
		
		// throw : throw 뒤의 예외를 강제로 발생시키는 구문
		if(true)
			throw new C_CustomException("이상한 에러가 발생했습니다.");
		
		

	}

}
