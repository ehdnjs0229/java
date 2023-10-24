package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class FileByteRun {
	
	/*
	 * 바이트 기반 스트림
	 * 바이트 스트림 : 1byte단위로만 입출력 할 수 있는 스트림(통로)(xxxInputStream / xxxOutputStream)
	 * 기반  스트림 : 외부매체와 직접적으로 연결되는 통로.
	 * 
	 * 바이트기반스트림 : 외부매체를 지정하고 그 외부매체와 직접적으로 연결되는 1byte단위의 통로를 만들겠다.
	 * xxxInputStream  : xxx매체로부터 데이터를 "입력"받는 통로를 열겠다. (데이터를 읽어들일때)
	 * xxxOutputStream : xxx매체로부터 데이터를 "출력"하는 통로를 열겠다. (외부매체로 데이터를 내보낼때)
	 * 
	 */

	public static void main(String[] args) {
		FileByteDao fbd = new FileByteDao();
		//fbd.fileSave();
		fbd.fileRead();

	}

}
