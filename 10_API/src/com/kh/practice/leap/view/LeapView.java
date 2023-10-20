package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView() {
        Calendar today = Calendar.getInstance();
        today.set(Calendar.YEAR, 2019);
        LeapController controller = new LeapController();

        int currentYear = today.get(Calendar.YEAR);
        boolean isLeapYear = controller.isLeapYear(currentYear);
        long totalDays = controller.leapDate(today);

        System.out.println(currentYear + "년은 " + (isLeapYear ? "윤년" : "평년") + "입니다.");
        System.out.println("총 날짜 수 : " + totalDays);

	}	

}
