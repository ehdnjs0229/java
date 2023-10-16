package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		System.out.println("현재 저장된 학생은"+s+"명입니다.");
		return s.length;
		System.out.println("현재 저장된 사원은"+e+"명입니다.");
		return e.length;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
	}
	
	public Student[] printStudent() {
		
	}
	
	public void insertEmployee(String name, int age,double height, double weight, int salary, String dept) {
		
	}
	
	public Employee[] printEmployee() {
		
	}

}
