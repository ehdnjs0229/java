package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		//User user = new User("dlaehdnjs","1234","임도원");
		//User user = new User();
		User user = new User("alsehdnjs","12345","도원",24,'M');
		
		User user2 = new User("alsehdnjs","12345","도원",24,'M');
		
		System.out.println(user.information());
	}

}
