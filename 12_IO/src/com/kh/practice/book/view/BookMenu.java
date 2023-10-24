package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
		//  파일이 없을 때 만들어주기 위해  BookController(bc)에  makeFile()  호출 
		//  필드에 있는  bArr에 bc의  fileRead()  반환  값  대입
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: fileSave(); break;
			case 2: fileRead(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
			
		}
	
	}
	
	public void fileSave() {
		System.out.println("도서 명 :");
		String title = sc.nextLine();
		System.out.println("저자 명 :");
		String author = sc.nextLine();
		System.out.println("도서 가격 :");
		int price = sc.nextInt();
		System.out.println("출판 날짜(yyyy-mm-dd) :");
		String date = sc.next();
		System.out.println("할인율 :");
		double discount = sc.nextDouble();
		

        Calendar cal = Calendar.getInstance();
        String[] dateArr = date.split("-");
        cal.set(Integer.parseInt(dateArr[0]), Integer.parseInt(dateArr[1])-1, Integer.parseInt(dateArr[2]));
      
    
        
        for(int i = 0; i < bArr.length; i++) {
        	if (bArr[i] == null) {
        		bArr[i] = new Book(title, author, price, cal, discount);
        		break;
        	}
        }
        bc.fileSave(bArr);
	}
	
	public void fileRead() {
		Book[] books = bc.fileRead();
		for(Book book : books) {
			if(book != null)
				System.out.println(book);
		}
	}

}
