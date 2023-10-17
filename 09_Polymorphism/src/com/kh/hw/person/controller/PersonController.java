package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Student;
import com.kh.hw.person.model.vo.Employee;

public class PersonController {
	
	private Student[] s = new Student[3]; // 클래스명@16진수주소값 null null 
	private Employee[] e = new Employee[10];
	// null null null null null null null null null null
	
	public int[] personCount() {
		int[] arr = new int[2];
		int count = 0;
		for(int i = 0; i<s.length; i++) {
			if(s[i] !=  null) { // true일시 null이 아닌 주소값을 보관 ==> 즉, 객체가 생성된 상태
				// 숫자를 카운팅
				count++;
			}
		}
		arr[0] = count;
		
		count = 0;
		for(int i = 0; i<e.length; i++) {
			if(e[i] !=  null) { // true일시 null이 아닌 주소값을 보관 ==> 즉, 객체가 생성된 상태
				// 숫자를 카운팅
				count++;
			}
		}
		arr[1] = count;
		
		return arr;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		Student student = new Student(name, age, height, weight, grade, major);
		// 매개변수로 받아온 데이터를 / 학생 객체배열중 "빈곳" == null 에 저장하는 메소드
		for(int i =0; i<s.length; i++) { // null null null 
			if(s[i] == null) {
				s[i] = student;
				break;
			}
		}
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age,double height, double weight, int salary, String dept) {
		Employee employee = new Employee(name, age, height, weight, salary, dept);
		for(int i =0; i<e.length; i++) { // null null null 
			if(e[i] == null) {
				e[i] = employee;
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}

}
