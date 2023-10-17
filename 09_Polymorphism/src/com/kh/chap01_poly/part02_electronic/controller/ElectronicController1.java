package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성 적용전
public class ElectronicController1 {
	
	// 하이마트.
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	// 데스크탑 추가하는 메서드
	public void insert(Desktop d) {
		desk = d;
	}
	// 노트북을 추가하는 메서드
	public void insert(NoteBook n) {
		note = n;
	}
	// 태블릿을 추가하는 메서드
	public void insert(Tablet t) {
		tab = t;
	}
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}

}
