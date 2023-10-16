package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	private Employee e = new Employee();
	
	public void add(int empNo, String name, char gender, String phone) {
		e = new Employee(empNo, name, gender, phone);
	}
	
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		e= new Employee(empNo, name, gender, phone, dept, salary, bonus);
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
		
	}
	
	public void modify(int salary) {
		e.setSalary(salary);
	}
	
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	
	public  Employee remove() {
		// 객체를 삭제하는 메소드 (객체 e에 null을 저장하여 객체 삭제)
		e = null;
		return e;
	}
	
	public String inform() {
		// 참조 자료형의 기본값이기 때문에 null 값 가능
		return e == null ? null : e.printEmployee();
		
	}
	
	

}
