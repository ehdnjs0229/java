package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		// 정수를 입력 받아 양수일 때만 1부터 입력 받은 수까지 홀수/짝수를 나눠서
		// 홀수면 ‘박’, 짝수면 ‘수’를 출력하도록 하세요.
		// 단, 입력 받은 수가 양수가 아니면 “양수가 아닙니다”를 출력하세요.
		
		System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("양수가 아닙니다");
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 1) {
                    System.out.print("박");
                } else {
                    System.out.print("수");
                }
            }
        }
		
	}
	
	public void practice2() {
		// 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면 
		//“양수가 아닙니다.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
        int num;

        while (true) {
            System.out.print("정수를 입력하세요: ");
            num = sc.nextInt();

            if (num >= 1) {
                break; // 입력이 양수일 경우 반복문 종료
            } else {
                System.out.println("양수가 아닙니다. 다시 입력하세요.");
            }
        }

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                System.out.print("박");
            } else {
                System.out.print("수");
            }
        }
	}
	
	public void practice3() {
		// 사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가
		// 몇 개 있는지 개수를 출력하세요.
		
		System.out.print("문자열 : ");
		String inputString = sc.next();
		
		System.out.print("문자 : ");
		String searchChar= sc.next();
		
		int charCount = 0;
		
		for(int i = 0; i<inputString.length(); i++) {
			if( inputString.charAt(i) == searchChar.charAt(0)) {
				charCount++;
			}
		}
		System.out.printf("%s안에 포함된 %s 개수 : %d",inputString,searchChar,charCount);	
	}
	
	public void practice4() {
		// 위 문제와 모든 것이 동일하고, “더 하시겠습니까?”라고 추가로 물어보도록 하세요.
		// 이 때, N이나 n이 나오면 프로그램을 끝내고 Y나 y면 계속 진행하도록 하되 Y, y, N, n이 아닌 
		// 다른 문자를 입력했을 경우 “잘못된 대답입니다. 다시 입력해주세요.”를 출력하고 
		// 더 하겠냐는 물음을 반복하세요.
		
		while (true) {
            System.out.print("문자열 : ");
            String inputString = sc.nextLine();

            System.out.print("문자 : ");
            char searchChar = sc.next().charAt(0);

            int charCount = 0;

            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == searchChar) {
                    charCount++;
                }
            }

            System.out.println("문자열 \"" + inputString + "\"에서 문자 '" + searchChar + "'의 개수: " + charCount);

            boolean validAnswer = false;
            while (!validAnswer) {
                System.out.print("더 하시겠습니까? (Y/N): ");
                String continueChoice = sc.next();

                if (continueChoice.equalsIgnoreCase("N")) {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                } else if (continueChoice.equalsIgnoreCase("Y")) {
                    validAnswer = true;
                } else {
                    System.out.println("잘못된 대답입니다.");
                }
            }

            sc.nextLine(); // 개행 문자 소비
        }
	}
	
	public void rsp() { 
		// 
		
		// 1 : 가위, 2 : 바위, 3 : 보
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		while(true) {
			System.out.print("가위바위보 : ");
			String rsp = sc.nextLine();
			int c_rsp = (int)(Math.random()*3 + 1); // 1, 2, 3
			int result = 0;
			
			switch(rsp) {
			case "가위":
				if(c_rsp == 1) {
					draw++;
					result = 0;
				}else if(c_rsp == 2) {
					lose++;
					result = -1;
				}else  {
					win++;
					result = 1;
				}
			case "바위":
				if(c_rsp == 1) {
					lose++;
					result = -1;
				}else if(c_rsp == 2) {
					draw++;
					result = 0;
				}else  {
					win++;
					result = 1;
				}
				
			case "보":
				if(c_rsp == 1) {
					lose++;
					result = -1;
				}else if(c_rsp == 2) {
					win++;
					result = 1;
				}else  {
					draw++;
					result = 0;
				}
				break;
			case "exit":
				System.out.printf("%d전 %d승 %d무 %d패",(win+lose+draw),win,draw,lose);
				return;
			default:
				System.out.println("잘못 입력 하셨습니다.");
				continue;
			}
			
			System.out.println("컴퓨터 : " + (c_rsp == 1? "가위": c_rsp == 2 ? "바위" : "보"));
			System.out.println("민경민 : "+ rsp);
			System.out.println(result > 0 ? "이겼습니다!" : result == 0 ? "비겼습니다." : "졌습니다 ㅠㅠ");
		}
		
	}

}
