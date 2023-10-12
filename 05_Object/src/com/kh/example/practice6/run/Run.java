package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book bk = new Book();
		bk.inform();
		
		Book bk2 = new Book("title", "publisher", "author");
		bk2.inform();
		
		Book bk3 = new Book("title2", "publisher2", "author2", 100, 10.0);
		bk3.inform();
		

	}

}
