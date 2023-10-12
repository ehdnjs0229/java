package com.kh.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int [] arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice2() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		for(int i = 0; i<num; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice3() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		int [] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}	
	}
	
	public void practice4() {
		// “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		// 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		String [] str = new String[] {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if (!(num >= 0 && num <= 6)) {
			System.out.println("잘못 입력하셨습니다.");
            return;
        } 
		System.out.println(str[num]);
		
	}
	public void practice5() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int sum = 0;
		int [] arr = new int[num];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n총 합 : "+ sum);
	}
	public void practice6() {
		// 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		// 문자의 개수와 함께 출력하세요.
		System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();
        
        for(int i = 0; i<str.length();i++) {
        	
        	char ch = str.charAt(i);
        	boolean isDuplicated = false;
        	
        	for(int j = 0;j<i; j++) {
        		if(ch == str.charAt(j)) {
        			isDuplicated = true;
        			break;
        		}
        	}
        	if(isDuplicated) {
        		continue;
        	}
        	System.out.print(ch + (i == (str.length() -1) ? " " : ", "));
        	
        }

        
		
				
	}
	
	public void practice7() {
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] charArr = new char[str.length()];
		for(int i = 0; i <charArr.length; i++) {
			charArr[i] = str.charAt(i);
		}
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",str,ch);
		for(int i = 0; i<charArr.length; i++) {
			if(charArr[i] == ch) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.printf("\n%c 개수 : %d",ch,count);
		
	}
	
	public void practice8() {
		System.out.print("주민등록번호(-포함) : ");
		String resNo = sc.nextLine();
		
		char[] originResNo = resNo.toCharArray();
		char[] copyResNo = originResNo.clone();
		
		for(int i = 8; i < copyResNo.length; i++) {
			copyResNo[i] = '*';
		}
		for(int i = 0; i<copyResNo.length; i++) {
			System.out.print(copyResNo[i]);
		}
	}
	
	public void practice9() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		int [] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
		// 배열을 정렬할 수 있는 메서드
		// Arrays.sort(배열)
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println("최대값 : "+arr[arr.length-1]);
//		System.out.println("최소값 : "+arr[0]);
		
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	
	public void practice10() {
		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		
		int [] arr = new int[10]; // 0 0 0 0 0 0 0 0 0 0 
		
		for(int i=0; i<arr.length; i++) { // 1 1 
			int random = (int)(Math.random()*10+1);
			arr[i] = random;
			
			for(int j =0; j<i; j++) {
				if(arr[j] == random) { // 중복값이 있는 케이스
					i --;
					break;
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void practice11() {
		// 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//다시 정수를 받도록 하세요.
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(!(num >=3 && num % 2 == 1)) {
			System.out.println("다시 입력하세요.");
			practice11();
			return;
		}
		int [] arr = new int[num];
		
		int count = 1;
		int mid = num / 2;
		
		for(int i = 0; i <arr.length; i++) {
			if(i < mid) {
				arr[i] = count++;
			}
			else {
				arr[i] = count--;
			}
			System.out.print(arr[i]+(i == arr.length-1 ? "" : ", "));
		}
	}
	
	public void practice12() {
		// 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		// 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		// 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		// 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		// 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		String [] arr = new String[size];
		
		sc.nextLine();
		
		for(int i =0 ; i<arr.length; i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'y') {
				// 더 입력하고 싶은 문자열 개수를 입력 후, 추가로 입력
				System.out.print("더 입력하고 싶은 개수 : ");
				int num = sc.nextInt();
				
				sc.nextLine();
				
				String [] newArr = new String[arr.length+num];
				for(int i=0; i<newArr.length; i++) {
					if(i < arr.length) {
						newArr[i] = arr[i]; // 원본배열 복사
					}
					else {
						System.out.print((i+1)+"번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				arr = newArr;
			}
			else {
				// n 입력시 문자열 입력 종료 후 배열에 저장된 데이터 출력
				System.out.print(Arrays.toString(arr));
				break;
			}
		}
	}

}
