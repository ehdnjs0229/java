package com.kh.practice.score.view;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			int menu = parse(sc.nextLine());
			
			switch(menu) {
			case 1 : saveScore(); break;
			case 2 : readScore(); break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			
		}
	}
	
	public int parse(String str) {
		return Integer.parseInt(str);
	}
	
	public void saveScore() {
		int num = 0;
		
		while(true) {
			System.out.println((++num)+"번째 학생 정보 기록");
			
			System.out.println("이름 : ");
			String name = sc.nextLine();
			
			System.out.println("국어 점수 : ");
			int kor = parse(sc.nextLine());
			
			System.out.println("영어 점수 : ");
			int eng = parse(sc.nextLine());
			
			System.out.println("수학 점수 : ");
			int math = parse(sc.nextLine());
			
			int sum = kor + eng + math;
			
			double avg = sum / 3.0;
			
			scr.saveScore(name, kor, eng, math, sum, avg);
			
			System.out.println("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char ch = sc.nextLine().toLowerCase().charAt(0);
			if(ch == 'n') {
				break;
			} 
		}
	}
	
	public void readScore() {
		int count = 0;
		int sumAll = 0;
		double avgAll = 0.0;
		
		
		
		try { DataInputStream dis = scr.readScore();

	        System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

	        while (true) {
	            String name = dis.readUTF();
	            int kor = dis.readInt();
	            int eng = dis.readInt();
	            int math = dis.readInt();
	            int sum = dis.readInt();
	            double avg = dis.readDouble();
	            count++;
	            sumAll += sum;
	            avgAll += avg;

	            System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg);
	        }
	            
		} catch (FileNotFoundException e) {
	        System.out.println("저장된 성적 데이터가 없습니다.");
	        
	    } catch (EOFException e) {
	    	System.out.println("읽은 횟수 전체 합계 전체 평균");
	    	System.out.println(count + "\t" + sumAll + "\t" + avgAll / count);
	    }
		catch (IOException e) {
	        e.printStackTrace();
	    }
		
	}

}
