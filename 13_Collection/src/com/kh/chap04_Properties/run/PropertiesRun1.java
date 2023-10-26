package com.kh.chap04_Properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {
		/*
		 * Properties : Map 계열 => key, value 세트로 저장 
		 * 			   단, Properties의 특징은 key, value를 모두 String으로 제한함.
		 * 			   파일 입출력메소드를 지원함
		 * 			   설정정보를 표현하는데 있어 최적의 형태를 가지고 있음.
		 */
		
		Properties prop = new Properties();
		
		/*
		 * prop에 String자료형이 아닌값을 추가하게될 경우
		 * Map계열 구현클래스이기 때문에 put메서드를 통해 key + value 추가 가능
		 */
		
//		prop.put("다이제", new Snack("초코",1300));
//		
//		System.out.println(prop);
//		System.out.println(prop.get("다이제"));
		
		/*
		 * Properties를 사용하는 경우는 Properties내부의 key값 value값들을 묶어서 파일로 기록하거나,
		 * 기록된 내용을 읽어들일때만 사용이 된다. 이때 기록하고자하는 파일에 문자열이 아닌값이 존재하는 경우
		 * 기록이 불가능.
		 */
		
//		try {
//			prop.store(new FileOutputStream("test.properties"), "Properties test");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// Properties에 값을 추가할때는 put을 잘 사용 안함.
		// 잘못된 자료형의 값을 추가할 수 있기 때문.
		// 1. setProperties(String key, String value)
		prop.setProperty("List", "ArrayList,Vector,LinkedList");
		prop.setProperty("Set", "HashSet,TreeSet");
		prop.setProperty("Map", "HashMap,Properties");
		prop.setProperty("Map", "TreeMap");
		
		System.out.println(prop); // 저장순서유지 X, key값 중복 허용하지 않음
		
		// 값 가져올때 get함수 대신 getProperty(String key) 이용
		// 2. getProperty(String key)
		System.out.println(prop.getProperty("Map"));
		
		// Properties객체 내부의 데이터를 기록하는 방법
		// 3. store(OutputStream os , String comments) Properties에 담긴 key - value값들을 파일로 출력
		
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties test 1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 4. storeToXML(OutputStream os , String comments) - xml문서에 출력
		try {
			prop.storeToXML(new FileOutputStream("test.xml"),"xml test1");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
