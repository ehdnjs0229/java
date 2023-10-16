package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;
import com.kh.hw.employee.model.vo.Employee;

public class EmployeeMenu {
	
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		
	while(true) {
		
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 수정");
		System.out.println("3. 사원 삭제");
		System.out.println("4. 사원 출력");
		System.out.println("9. 프로그램 종료");
		System.out.println("메뉴번호를 누르세요 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1: insertEmp(); break;
		case 2: updateEmp(); break;
		case 3: deleteEmp(); break;
		case 4: printEmp(); break;
		case 9: System.out.println("프로그램을 종료합니다.");
		default : System.out.println("잘못 입력하셨습니다.");
		}
		
		}
	}
	
	public void insertEmp() {
		
		System.out.print("사원 번호 : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("사원 성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("전화 번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("추가 정보를 더 입력하시겠습니까? (y/n) : ");
		char ch = sc.nextLine().charAt(0);
		if(ch == 'y' || ch == 'Y') {
			
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			
			System.out.print("사원 연봉 : ");
			int salary  = sc.nextInt();
			
			System.out.print("보너스 율 : ");
			double bonus = sc.nextDouble();
			
			sc.nextLine();
			// 인자 == argument 매개변수
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
		} else {
			ec.add(empNo, name, gender, phone);
		}
	}
	
	public void updateEmp() {
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니다?");
		System.out.println("1. 전화번호");
		System.out.println("2. 사원연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.println("메뉴 번호를 누르세요 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.print("수정할 전화번호 : ");
			String phone = sc.nextLine();
			ec.modify(phone);
			break;
		case 2:
			System.out.print("수정할 사원 연봉 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			ec.modify(salary);
			break;
		case 3:
			System.out.print("수정할 보너스율 : ");
			double bonus = sc.nextDouble();
			sc.nextLine();
			ec.modify(bonus);
			break;
		case 9:
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		default :
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	
	public void deleteEmp() {
		System.out.print("정말 삭제하시겠습니까? (y/n) : ");
		char ch = sc.nextLine().charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			Employee e = ec.remove();
			
			if(e == null) {
				System.out.println("데이터 삭제에 성공했습니다.");
			} else {
				System.out.println("데이터 삭제에 실패했습니다.");
			}
		}
		
	}
	
	public void printEmp() {
		// 사원정보가 있다면 사원정보 출력, 없다면 "사원 데이터가 없습니다"출력
		System.out.println(ec.inform() == null ? "사원 데이터가 없습니다" : ec.inform() );
		
	}
	
	

}
