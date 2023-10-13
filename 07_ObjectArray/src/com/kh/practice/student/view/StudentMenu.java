package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("==========  학생  정보  출력  ==========");
		Student[] studentArr = ssm.printStudent();
		
		for(int i = 0; i < studentArr.length; i++) {
			System.out.println(studentArr[i].inform());
		}
		
		System.out.println("========== 학생 성적 출력 ========== ");
		double[] dArr = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + (int)dArr[0]);
		System.out.println("학생 점수 평균 : " + dArr[1]);

		System.out.println("========== 성적 결과 출력 ========== ");
		for(int i = 0; i < studentArr.length; i++) {
			if(studentArr[i].getScore() < StudentController.Cut_Line) {
				System.out.println(studentArr[i].getName() + "학생은 재시험 대상입니다.");
			} else {
				System.out.println(studentArr[i].getName() + "학생은 통과입니다.");
			}
		}
	}
}
