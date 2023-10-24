package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {
	
	/* 
	 * 컬렉션(Collection)
	 * 자료구조가 내장되어있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"다.
	 * 
	 * 자료구조
	 * 방대한 데이터들을 효율적으로 다룰때 필요한 개념을 클래스로 정의한것.
	 * 
	 * 프레임워크
	 * 효율적인 기능들이 이미 정의되어있는 틀
	 * 
	 * 데이터들이 새롭게 추가된거나, 삭제가 되거나 , 수정이 되는 기능들이 이미 정의되어있는 틀이 있다 == 컬렉션
	 * => 다량의 데이터들을 관리하고자 할 때 배열 가지고 충분히 사용을 할수 있었지만, 배열이 가진 단점들을
	 *      보완한 것이 컬렉션.
	 * -------------------------------------------------------------------------------------
	 * 
	 * 배열과 컬렉션의 차이점.
	 * - 배열의 단점
	 * 1. 배열을 쓰고자 할 때 먼저 크기를 지정해야함 , 한번 지정된 크기는 변경이 불가
	 *    만약, 새로운 값을 추가하고자 한다면 크기가 오버될 경우 새로운 크기의 배열을 만들고 기존의 내용들을
	 *    복사해서 옮겨주는 코드를 직접짜야 했음.
	 * 2. 배열 중간 위치에 새로운 데이터를 추가하거나 , 삭제하는 경우 기존의 값들을 땡겨주는 코드를 직접 짜줘야함.
	 * 3. 한 타입의 데이터들만 저장 가능.
	 * 
	 * - 컬렉션의 장점
	 * 1. 크기에 제약이 없다.
	 *   => 크기지정을 해줄 필요도 없고, 만일 크기지정을 해도 알아서 크기가 늘어나거나 줄어드는 코드가 내부적으로 이미
	 *      정의 되어 있음.
	 * 2. 중간에 값을 추가하거나 삭제하는 경우 값들을 땡겨주는 코드가 이미 내부적으로 정의되어 있음.
	 * 3. 여러타입의 데이터들을 저장할 수 있음(단, 제네릭설정을 통해 한 타입의 데이터들만 들어올수 있게끔도 가능)
	 * 
	 * ----------------------------------------------------------------------------------
	 * 
	 * 배열 --> 방대한 데이터들을 단지 담아만 두고 조회만 할 목적이다.
	 * 컬렉션-> 방대한 데이터들이 빈번하게 추가 ,삭제, 수정이 될 것 같다.
	 * 
	 * 
	 * 컬렉션의 3 가지 분류
	 * 
	 * List 계열 : 1) 담고자하는 값(value)만 저장하는 자료구조 
	 * 			  2) 값을 저장할때 순서가 유지된다.(즉, index개념이 있음)
	 *            3) 중복값을 허용한다.
	 * List계열 자식 클래스 : ArrayList, Vector, LinkedList => ArrayList가 자주 쓰인다.
	 * 
	 * Set  계열 : 1) 담고자하는 값(value)만 저장하는 자료구조
	 *            2) 값을 저장할때 순서를 유지하지 않는다(index개념이 없음)
	 *            3) 중복값을 허용하지 않는다.
	 * Set계열 자식 클래스 : HashSet , TreeSet
	 * 
	 * Map  계열 : 1) 담고자하는 값(value)을 키(key)에다가 저장
	 * 			  2) 값 저장시 순서를 유지하지 않는다(index개념이 없음)
	 * 			  3) value값을 중복을 허용하나, key값은 중복을 허용하지 않는다.
	 * Map계열 자식 클래스 : HashMap, HashTable, Properties
	 * */	
	public static void main(String[] args) {
		
		//List list = new ArrayList(); // 내부적으로 크기 10짜리인 배열이 생성.
		//List list = new ArrayList(3); // 내부적으로 크기 3짜리인 배열이 생성됨.
		List<Music> list = new ArrayList<Music>(3);
		// Object [] // Music []
		/* 
		 * 제네릭 (<E>)
		 * 별도의 제네릭 제시 없이 컬렉션 객체를 생성하면 , 해당 컬렉션에는 다양한 타입의 데이터값들이 담길 수 있음. 
		 *
		 * 별도의 제네릭 설정으로 <Music>으로 하게되면 해당 컬렉션에는 Music객체만 담을수 있음.
		 * 
		 * 제네릭을 설정 하는 이유
		 * 1. 명시한 타입의 객체만 저장가능하도록 타입의 제한을 두기 위해서 --> 안정성 확보 가능
		 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환해야하는 절차를 없애기 위해서
		 * */
		
		// 1. add(E e) : 해당 리스트의 끝에 전달된 e를 추가시켜주는 메서드
		list.add(new Music("ditto","뉴진스"));
		list.add(new Music("ETA","뉴진세"));
		list.add(new Music("hype boy","뮤진스"));
		list.add(new Music("고백","장범준"));
		//list.add("끝");
		//list.add(111);
		
		/*
		 * 순서가 유지 되면서 값이 추가된다.
		 * 크기에 제약이 없음
		 * 제네릭 설정을 하지 않는다면, 다양한 타입의 값 추가 가능.
		 *  */
		System.out.println(list); // 안에 아무것도 없는 상태(비어있음) + toString오버라이딩 된상태.
		
		// 2. add(int index , E e ) : 리스트에 전달되는 index값 위치에 전달되는 e를 추가시켜주는 메소드
		list.add(1 , new Music("this love" , "빅뱅"));// list[1] = new Music("?","?")
		// 중간에 값 추가시 알아서 기존의 값들을 뒤로 땡겨주는 작업이 내부적으로 진행됨.
		
		System.out.println(list);
		
		// 3. set(int index, E e) : 리스트에 해당 인덱스 값을 전달되는 e로 변경시켜주는 메소드
		list.set(1, new Music("바다의 왕자","박명수"));// list[1] = new Music("?","?")
		
		System.out.println(list);
		
		// 4. remove(int index) : 리스트에 해당 인덱스의 값을 삭제시켜주는 메소드
		//list.remove(1);
		// list[1] = null; 
		
		System.out.println(list.remove(1));
		System.out.println(list);
		
		// 5. size() : 리스트에 담겨있는 데이터의 수를 반환해주는 메소드
		System.out.println("리스트에 담긴 데이터 수 : "+list.size());
		System.out.println("리스트에 마지막 인덱스 : "+(list.size() -1 ));
		
		// 6. get(int index) : E => 리스트에 해당 index위치의 데이터를 반환해주는 메소드
		Music m = (Music) list.get(0);
		System.out.println(  ((Music)list.get(0)).getTitle());
		
		////////////////////////////////////////////////////////////////////////
		
		
		ArrayList<Integer> Iarr = new ArrayList<>(3);
		Iarr.add(1);
		Iarr.add(9);
		Iarr.add(900);
		Iarr.add(9000);
		Iarr.add(9000);
		
		// 7. contains(E e) : boolean => 매개변수로 넘어온 값이 현재 컬렉션에 포함되어있는지 확인
		System.out.println(Iarr.contains(90));
		
		// 8. indexOf(E e) : int  => 매개변수로 넘어온 값이 현재 컬렉션에 몇번째 인덱스에 존재하는지 반환.
		//                           없다면 -1을 반환
		System.out.println(Iarr.indexOf(9000));
		
		System.out.println("==============================================================");
		// 베이직 for문
		// 0번인덱스 ~ 마지막 인덱스까지의 데이터 출력
		for(int i =0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==============================================================");
		
		// 향상된 반복문 : for each문
		// for( 값을 받아 줄 변수 : 순차적으로 접근할 배열 또는 컬렉션 )
		
		// 제네릭 설정 전.
//		for(  Object o  : list   ) {
//			
//		}
		// 제네릭 설정 후 
		for( Music o : list) {
			System.out.println(o);
		}
		System.out.println("==================================================");
		// Iterator 반복자 : 컬렉션 내부 인자들을 Iterator에 담아서 관리(String의 StringTokenzier 비슷한녀석)
		Iterator<Music> iter =list.iterator();// 컬렉션을 iterator객체로 변환
		while(iter.hasNext()) {
			Music music = iter.next();
			System.out.println(music);
		}
		
		System.out.println("=================================================="); 
		
		// 9. subList(int index1, int index2) : 해당 리스트로부터 index1에서부터 index2까지의
		//                                      데이터 값들을 추출해서 새로운 List로 반환시켜주는 메소드
		// list.subList(0, 2) ==> 0 <= 인덱스 < 2
		List<Music> sub = list.subList(0, 2);
		System.out.println(sub);
		
		// 10. addAll(Collection c) : 해당 리스트에 다른 컬렉션에 있는 데이터들을 통째로 추가해주는 메소드
		list.addAll(sub);
		System.out.println(list);
		
		System.out.println("==========================================================");
		
		// 11. isEmpty() : 해당 리스트가 비어있는지 묻는 메소드(비어있으면 true/ 비어있지 않으면 false반환)
		System.out.println("리스트가 비어있습니까 ? "+list.isEmpty());
		
		// 12. clear() : 해당 리스트를 싹 비워주는 메소드
		//list.clear();
		System.out.println(list);
		System.out.println("리스트가 비어있습니까 ? "+list.isEmpty());
		
		System.out.println("===================================================");
		
		// 13. sort(List list ) : 컬렉션 내부의 값들을 정렬시켜주는 함수
		List<String> strList = new ArrayList<>();		
		strList.add("다경민");
		strList.add("라경민");
		strList.add("나경민");
		strList.add("가경민");
		
		System.out.println(strList);
		
		// Collections 클래스의 정렬메소드 호출
		Collections.sort(strList); // 사전등록순으로 오름차순 정렬
		
		System.out.println(strList);
		
		// 역순으로 정렬
		Comparator<String> comp = Collections.reverseOrder();
		
		Collections.sort(strList, comp);
		
		System.out.println(strList);
		
		/*
		 *  내가 직접 정의한 객체를 정렬하기 위해서는 "정렬기준"을 새롭게 만들어줘야함.
		 *  
		 *  객체 정렬방법 2가지
		 *  
		 *  1. Comparable인터페이스 구현
		 *     기본정렬(한가지방법만 가능)을 클래스에서 구현.
		 *     정렬시 사용하는 compareTo메소드를 오버라이딩하는 방식.
		 *     -> 정렬기준을 한가지만 세울 수 있다.
		 *     
		 *  2. Compartor인터페이스 
		 *     객체의 기본정렬 외에 추가적으로 여러개의 정렬기준을 제시하고자 할 때 사용.
		 *     ex) 가수이름 오름차순 정렬, 내림차순 정렬, 음악제목 오름차순, 내림차순 정렬을 각각 만들고 싶을때
		 *     별도의 Comparator구현 클래스를 작성하면 된다.
		 *     compare메소드 오버라이딩
		 *  */
		
		// 1번 Compareable 기본정렬 : 가수이름 오름차순
		Collections.sort(list);
		System.out.println(list);
		
		// 가수이름 내림차순
		Collections.sort(list , Collections.reverseOrder() );
		System.out.println(list);
		
		// 추가적인 정렬기준 생성
		// 1. 제목기준 오름차순/내림차순
//		Comparator<Music> comp2 = new MusicTitleAscendingCompartor().reversed();
//		Collections.sort(list, comp2);
		
		System.out.println(list);
		
		//----------------------------------------------------------------------------
		
		//반복문을 통해 컬렉션에 담긴 요소를 체크한후 삭제하기.
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(1);
		list2.add(1);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		System.out.println("==============================================================");
		System.out.println(list2);
		// 컬렉션에담긴 요소가 1이라면 삭제.
		
//		for(Integer s : list2) {
//			// ConcurrentModificationException ==> 향상된 반복문에서 중간에 요소가 삭제가 되거나
//			// 추가가 될때 발생하는 에러. index가 변경되어 반복이 제대로 진행되지 않기때문에 삭제가 제한된다.
//			if(s == 1) {
//				list2.remove(s);
//			}
//		}
		
//		for(int i =0; i<list2.size(); i++) {
//			//[1, 1, 1, 3, 4, 5]
//			if(list2.get(i) == 1) {
//				list2.remove(i); // 삭제되는순간 list의 사이즈가 1작아져서 바로다음에오는 객체를 검사하지 못함.2
//				i--;// 이결로 해결가능하긴함.
//			}
//		}
		// 가장좋은 방법 == Iterator사용
		Iterator<Integer> iter2 = list2.iterator();
		while(iter2.hasNext()) {
			int s = iter2.next();
			if(s == 1) iter2.remove(); // 현재 참조하고있는 collection요소를 제거.
		}
		System.out.println(list2);
		
		
//		while(true) {
//			if(list2.contains(1)) {
//				list2.remove(list2.indexOf(1));
//			}else {
//				break;
//			}
//		}
		
		//System.out.println(list2);
		// 삭제완료후 컬렉션에 저장된 데이터 출력
		
		// 14. Collections.shuffle(List list);
		Collections.shuffle(list2);
		System.out.println(list2);
		System.out.println("=====================================");
		
		//equals메소드 오버라이딩 후 Music객체 비교
		System.out.println(list.get(2));		
		
		// == 연산자를 이용한 비교
		Music sample = new Music("ditto", "뉴진스");
		Music origin = list.get(2);
		System.out.println(sample);
		System.out.println(origin == sample); // 주소값은 다름
		System.out.println(origin.equals(sample)); // 필드에 초기화된 값이 동일할경우 같은 객체로 인식
		
		
		
		
		
		
		
	}
}
