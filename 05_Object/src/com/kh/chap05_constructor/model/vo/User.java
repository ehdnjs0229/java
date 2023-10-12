package com.kh.chap05_constructor.model.vo;

public class User {
	
	//필드부
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	//생성자부
	/*
	 * 생성자
	 * [표현법]
	 * 접근제한자 클래스명([매개변수]) {
	 *  //해당 생성자를 통해서 객체 생성시 실행하고자하는 코드;
	 * }
	 * 
	 * 생성자를 작성하는 목적
	 * 1. 객체를 생성하기 위해
	 * 2. 객체생성뿐 아니라 매개변수로 전달된 값을 통해 필드에 초기화시킬 목적
	 * 
	 * 생성자 작성시 주의사항
	 * 1. 생성자명은 반드시 클래스명과 동일해야함(대/소문자 구분)
	 * 2. 반환형이 존재하지 않는다.(반환형 존재시 메소드로 해석)
	 * 3. 여러개의 생성자를 만들 수 있지만, 매개변수가 중복되어서는 안된다.
	 * 4. 매개변수 생성자를 명시적으로 만들게 되면, 기본 생성자를 JVM이 자동으로 만들어주지 않는다.
	 * 따라서 무조건 기본생성자는 항상 작성하는 습관 들이기ㅣ. 
	 */
	
	public User() {
		/*
		 * 기본생성자 ? 매개변수가 없는 생성자
		 * 단지 객체를 생성만을 위한 목적으로 할때 사용함.
		 * 기본생성자를 생략하는 경우 => 오류가 발생하지 않음.
		 * JVM이 클래스를 컴파일할때 기본생성자를 작성하지 않은 경우 항상 자동으로 만들어주기 때문
		 * 단, 매개변수가 있는 생성자가 이미 클래스안에 작성되어있는 경우 반드시 기본생성자도 함께 작성해줘야한다.
		 */
		System.out.println("이거 출력 되냐 ??");
	}
	
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		this(userId, userPwd, userName);
		/*
		 * 생성자 내부에서 생성자끼리 중복되는 코드가 있는경우 this생성자를 통해 같은 클래스 내에 있는 다른 생성자를
		 * 호출할 수 있다. 단, 반드시 생성자 내부 첫줄에 기술해야한다.
		 * */
		this.age = age;
		this.gender = gender;
	}
	
	public String information() {
		return userId+" "+userPwd+" "+userName+" "+age+" "+gender;
	}
	

}
