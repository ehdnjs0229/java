package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {
	public static void main(String[] args) {
		// java.io.File 클래스를 가지고 파일 만드는 과정 실습.
		
		try {
			// 1. 별도의 저장경로를 지정하지 않고 생성하고자하는 파일의 이름만 제시해서 생성해보기.
			File file1 = new File("test.txt");
			file1.createNewFile();
			
			// 2. 경로지정을 한 파일명을 제시해서 생성하기.
			File file2 = new File("C:\\dev\\test.txt");
			file2.createNewFile();
			
			// 3. 폴더를 생성하고나서 그 안에 파일을 생성하는 방법.
			String dir = "C:\\b";
			File bFolder = new File(dir);
//			if(!bFolder.isDirectory()) // bFolder가 디렉토리(폴더)인지 확인.
//				bFolder.mkdir(); // makeDirectory
				bFolder.mkdirs(); // 여러개의 폴더를 생성할때 사용
				
			File file3 = new File(dir+"\\test.txt");
			file3.createNewFile();
			
			// 4. 별도의 경로지정 없이 폴더 생성
			File folder = new File("test");
			folder.mkdir();
			
			File file = new File("test\\person.txt");
			file.createNewFile();
			
			//File에서 제공하는 메소드들
			System.out.println(folder.isFile());
			System.out.println(file.isDirectory());
			
			System.out.println("파일명 : "+file.getName());
			System.out.println("상위폴더 : "+file.getParent());
			System.out.println("파일 용량 : "+file.length());
			System.out.println("절대경로 : "+file.getAbsolutePath());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 프로그램 상의 데이터를 외부매체(모니터, 스피커, 자바프로그램, 파일 등등)로 출력하거나
		 * 입력장치(키보드, 마우스)로 입력받는 과정을 진행하고자 한다면 반드시 외부매체와의 연결통로를 만들어야한다.
		 * (통로 == 스트림)
		 * 
		 * 스트림의 특징
		 * - 단방향 : 입력이면 입력, 출력이면 출력 즉 , 입력용 출력용 스트림이 별도로 존재한다.
		 * 			동시에 입출력하고자 한다면 하나의 스트림으로는 불가능함.
		 * 
		 * - 선입선출(FIFO) : 먼저 전달한 값이 먼저 나오게 됨
		 * - 시간지연문제가 발생할 수 있다.
		 * 
		 * 스트림의 구분
		 * - 통로의 사이즈 :
		 * 		바이트 스트림 : 1byte짜리가 이동할 수 있을정도의 사이즈(좁은통로)
		 * 		문자  스트림 : 2byte짜리가 이동할 수 있을정도의 사이즈(넓은통로)
		 * 
		 * - 외부매체와의 직접적인 연결여부 : 
		 *    기반스트림 : 외부매체와 직접적으로 연결되는 통로(스트림)이다
		 *    보조스트림 : 기반스트림만으로 부족한 성능을 향상시켜주는 용도의 스트림
		 *    			직접적으로 외부매체와 연결할 수 없음, 즉 단독사용이 불가능하다.
		 *    			기반스트림을 보조해주는 역할을 한다.
		 *    		 보조기능 : 속도향상, 자료형 변환, 객체단위 입출력등.
		 *    
		 *    보조스트림 사용시 단독적으로는 사용이 불가능하므로, 따라서 반드시 기반스트림과 함께 사용해야한다.
		 *    
		 */
	}

}
