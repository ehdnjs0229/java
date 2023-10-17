package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true); 
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19); 
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12); 
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false); 
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] bList = new Book[5];
		int count = 0;
		
		for(int i = 0; i<bList.length; i++) {
			if(this.bList[i].getTitle().contains(keyword)) {
				bList[i] = this.bList[i];
				count++;
			}
		}
		return bList;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		Book bk = bList[index];
		if (bk instanceof AniBook) {
			int memberAge = mem.getAge();
			
			int accessAge = ((AniBook) bk).getAccessAge();
			
			if(memberAge < accessAge) {
				result = 1;
			}
		}else if(bk instanceof CookBook){
			boolean coupon = ((CookBook) bk).isCoupon();
			if(coupon) {
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2;
			}
		}
		
		return result;
	}
	

}
