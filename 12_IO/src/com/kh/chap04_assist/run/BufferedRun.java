package com.kh.chap04_assist.run;

import com.kh.chap04_assist.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		
		/*
		 * 보조 스트림
		 * 기반스트림(외부매체와 직접 연결할 수 있는 기능)의 부족한 기능들을 확장시킬 수 있도록 도와주는 스트림.
		 * 보조스트림은 단독으로는 사용할수가 없음 == 단독으로 객체생성이 불가.
		 * 
		 * [표현법]
		 * 보조스트림 변수명 = new 보조 스트림( 기반스트림객체(필수) );
		 * 
		 * BufferedXXX: 속도 성능 향상 목적의 보조 스트림
		 * => Buffer라는 저장공간을 제공해서 입출력때 필요한 데이터를 한번에 모아뒀다가 한꺼번에 입출력 진행.
		 * 
		 */
		
		BufferedDao bd = new BufferedDao();
		
		//bd.fileSave();
		bd.fileRead();

	}

}
