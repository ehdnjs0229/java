package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	private List<Book> list = new ArrayList();
	
	public BookController() {
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000)); 
		list.add(new Book("쉽게 배우는  알고리즘", "문병로", "기타", 15000)); 
		list.add(new Book("대화의 기술", "강보람", "인문", 17500)); 
		list.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	public ArrayList selectList() {
		return (ArrayList)list;
	}
	
	public ArrayList searchBook(String keyword) {
		ArrayList searchList = new ArrayList();
		for (Book book : list) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                searchList.add(book);
            }
        }
        return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;

		for (int i = 0; i < list.size(); i++) {
	        Book book = list.get(i);
	        if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
	            removeBook = book;
	            list.remove(i); 
	            break; 
	        }
	    }

	    return removeBook; 
	}
	
	public int ascBook() {
		
		return 1;
	}

}
