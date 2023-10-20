package com.kh.chap02_byte.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object) : 데이터가 보관되어있는 공간과 직접 접근해서 데이터를 입,출력할수 있는 클래스

public class FileByteDao {
	
	
	// 현재 프로그램 -> 외부매체(파일)
	// 출력 : 프로그램 나의 데이터를 파일로 내보내기(즉, 파일에 저장)
	public void fileSave() {
		
		//FileOutputStream : "파일"로 데이터를 1byte단위로 출력하는 스트림.
		
		FileOutputStream fos = null;
		
		try {
			// 1. FileOutputStream객체 생성 => 매개변수로 지정한 파일과 직접적으로 연결되는 통로 만듬
			// 해당 파일이 존재하지 않으면 해당 파일이 생성되면서 통로가 연결됨.
			// 이미 존재하는 파일이라면 즉시 통로가 연결됨.
			// 두번째 매개변수로 true 추가시 -> 기존에 해당파일이 있을경우 "이어쓰기" 가능
			// 두번째 매개변수로 미작성시     -> 기존에 해당파일이 있더라도 "덮어씌우기"
			//fos = new FileOutputStream("a_byte.txt"); // 객체생성후 덮어씌우기
			fos = new FileOutputStream("a_byte.txt", true); // 이어쓰기
			
			// 2. 연결통로로 데이터를 내보내기(출력) : write()메소드 이용
			//  1byte의 범위  : -128 ~ 127 까지의 범위(파일에 기록이 될때 해당 숫자의 고유한 문자가 기록됨)
			fos.write(97); // a
			fos.write('b');
			//fos.write('민'); // 기록은 되지만 깨짐
			
			byte[] arr = {99,100,101};
			fos.write(arr);
			
			fos.write(arr, 1, 2); // 1번 인덱스에서부터 2개만 기록해라. 100, 101
			
			// 3. 스트림을 사용했으면 반드시 자원 반납하기(반드시)
			//fos.close(); 위 코드에서 에러가 발생하는 경우 실행이 안될 수 있다.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 어떤 예외가 발생하든간에 반드시 실행하는 구문.
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
