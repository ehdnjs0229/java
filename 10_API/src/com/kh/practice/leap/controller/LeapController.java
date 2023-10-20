package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	
	public boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true; // 윤년
        } else {
            return false; // 평년
        }
		
	}
	
    public long leapDate(Calendar c) {
        int currentYear = c.get(Calendar.YEAR);
        int currentMonth = c.get(Calendar.MONTH) + 1;
        int currentDay = c.get(Calendar.DAY_OF_MONTH);

        long totalDays = 0;

        for (int year = 1; year <= currentYear; year++) {
            if (isLeapYear(year)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }

            if (year == currentYear) {
                for (int month = 1; month < currentMonth; month++) {
                    if (month == 2) {
                        totalDays += isLeapYear(year) ? 29 : 28;
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        totalDays += 30;
                    } else {
                        totalDays += 31;
                    }
                }
                totalDays += currentDay;
            } else {
                for (int month = 1; month <= 12; month++) {
                    if (month == 2) {
                        totalDays += isLeapYear(year) ? 29 : 28;
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        totalDays += 30;
                    } else {
                        totalDays += 31;
                    }
                }
            }
        }

        return totalDays;
    }

}
