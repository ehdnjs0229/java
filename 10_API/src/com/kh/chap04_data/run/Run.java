package com.kh.chap04_data.run;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {

	public static void main(String[] args) {
		
		// 기본생성자를 통해 Date객체 생성 -> 현재 시간 및 날짜를 가져옴
		Date today = new Date();
		System.out.println("기본생성자 : "+today);
		
		// 내가 원하는 날짜(2023년 10월 19일)로 시간 셋팅
		// 방법1. 매개변수 있는 Date클래스 생성자를 통해 변경
		Date date1 = new Date(2023 - 1900, 10 - 1, 19);
		// 년도 -> 셋팅하고자하는년도 - 1900
		// 월 -> 월 - 1
		System.out.println("매개변수 있는 생성자를 통한 Date : "+date1);
		
		//2023년 10월 19일 3시 37분 0초
		//2023-10-19 03:37:00
		//java.text.SimpleDateFormat => 내 입맛대로 포멧을 지정한 문자열을 받고자 할때 사용
		
		// 1. 형식(포멧)을 지정하면서 SimpleDateFormat 객체 생성.
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy년 MM월 dd일"
				+"hh시 mm분 ss초");
		// 2. sdf객체에서 제공하는 format메소드 호출하면서 매개변수로 Date객체를 전달한다.
		//    포멧에 지정한 형식대로 String 문자열을 반환
		//    sdf.format(Date참조변수) : String 
		String formatDate = sdf.format(today);
		System.out.println(formatDate);
		
		// Calendar : 날짜와 시간에 관한 데이터를 손쉽게 처리할 수 있는 추상 클래스
		// (국가마다 사용하는 달력체계 다를 수 있으므로, 나라마다 다른 달력객체를 반환해주기 위해 추상클래스로 선언됨)
		
		// 현재 날짜 및 시각 정보 조회
		Calendar cal1 = Calendar.getInstance();
		// 현재 로컬 컴퓨터상의 지역정보를 바탕으로 해당지역의 시간정보를 가져옴.
		// 그 달력정보가 그레고리력이면 그레고리달력객체를 반환
		Calendar cal2 = new GregorianCalendar();
		// 로컬컴퓨터상의 지역정보에 해당하는 달력.
		
		// 조회
		System.out.println(cal1.get(Calendar.YEAR));
		System.out.println(cal1.get(Calendar.MONTH));
		System.out.println(cal1.get(Calendar.DATE));
		
		// 그 외 년 월 일 시 분 초
		
		// 특정일 특정 시간을 Calendar객체로 생성.
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2024, 0, 1, 0,0,0); // 2024년 1월 1일 0시 0분 0초
		
		Calendar cal4 = new GregorianCalendar(2024, 1,1,0,0,0); // 2024년 2월 1일 0 0 0
		
		// 날짜 차이 계산
		Calendar now = Calendar.getInstance();
		// 밀리초 단위로 변환해서 시간의 차이를 구하기.
		
		long num1 = now.getTimeInMillis(); // 1970년 1월 1일 ~ 2023년 10월 19일까지 흐른시간을 밀리초로
		long num2 = cal3.getTimeInMillis(); // 1970년 1월 1일 ~ 2024년 1월 1일까지 흐른 시간을 밀리초로변환
		
		
		// mills / 1000 / 60 / 60 / 24 
		System.out.println("새해까지 D-" + (num2 - num1) / 1000 / 60 / 60 / 24 +"일 남았습니다.");
		// 73
		

	}

}
