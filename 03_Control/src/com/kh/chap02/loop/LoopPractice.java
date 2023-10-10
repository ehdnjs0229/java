package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다. 만일, 1 미만의 숫자가 입력됐다면
		// “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		System.out.print("1이상의 숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i+ " ");
			}
			
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
			practice1();
		}

	}
	public void practice2() {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다. 만일 , 1 미만의 숫자가 입력됐다면
		// “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		System.out.print("1이상의 숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=num; i>=1; i--) {
				System.out.print(i + " ");
			}
			
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
			practice2();
		}
		
	}
	
	public void practice3() {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		System.out.print("정수를 하나 입력하세요 : ");
		
		int num = sc.nextInt();
		
		int sum = 0;
		String result = "";
		
		for(int i = 1; i<=num; i++) {
			sum += i;
			result += i;
			if (i < num) {
                result += " + ";
            }
		}
		System.out.println(result + " = " + sum);
	}
	
	public void practice4() {
		// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일, 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		int num1;
		int num2;
		
		if (input1 < 1 || input2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice4();
			return;
		}
		else {
			if (input1 < input2) {
				num1 = input1;
				num2 = input2;
			} else {
				num1 = input2;
				num2 = input1;
			}
			
			for (int i = num1; i <= num2; i++)
				System.out.print(i + " ");
		}
		
		
	}
	public void practice5() {
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.단 , 9를 초과하는 숫자가 입력됐다면
		// “9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if (num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			practice5();
			return;
		}	
		else {
			for (int i = num; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");
				for (int j = 0; j < 9; j++)
					System.out.println(i + " * " + (j + 1) + " = " + i * (j + 1));
				System.out.println();
			}
		}
	}
	
	public void practice6() {
		// 사용자로부터 시작 숫자와 공차를 입력 받아
		// 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		// 단, 출력되는 숫자는 총 10개입니다.
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) { // 10회 출력
			System.out.print(num + " ");
			num += gong;
		}	
		
	}
	public void practice7() {
		// 
		while(true) {
			System.out.print("연산자(+,-,*,/,%) : ");
			String command = sc.nextLine();
			if(command.equals("exit")) {
				break;
			}
			
			char ch = sc.nextLine().charAt(0);
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			int result = 0;
			
			switch(ch) {
			case '+' : result = num1+num2; break;
			case '-' : result = num1-num2; break;
			case '*' : result = num1*num2; break;
			case '/' : 
				if(num2 ==0) {
					System.out.println("0으로 나눌 수 없습니다.");
					continue;
				}
				result = num1/num2; 
				break;
			case '%' : 
				if(num2 ==0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
					continue;
				}
				result = num1%num2; 
				break;
			default :
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				practice7();
				return;
			}
			System.out.printf("%d %c %d = %d", num1,ch,num2,result);
		
		
		}	
		
		
		
	}
	public void practice8() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i+1; j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	public void practice9() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--)
				System.out.print("*");
			System.out.println();
			
		
			
		}
	}
	
	public void practice13() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다");
			return;
		}
		
		for (int i = 2; i < num ; i++ ) {
			if(num % i == 0) { // 2이상 n-1이하의 값에서 나누어 떨어지는 숫자가 있는 경우 ==> 소수X
				System.out.println("소수가 아닙니다.");
				return;
			}
		}
		System.out.println("소수입니다");
	}
	
	public void practice14() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다");
			return;
		}
		int count = 0;
		for(int i = 2; i<num ; i++) {
			boolean isPrime = true;
			// 각 i의 값이 소수인지 아닌지 검사를 진행
			for(int j = 2; j < i; j++) {
				
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			// i의 값이 소수인경우 출력 후 count 값 1증가
			if(isPrime) {
				System.out.print(i+" ");
				count++;
			}
			
		}
		
		System.out.printf("\n 2부터 %d까지의 소수의 개수는 %d개 입니다.", num,count);
		
	}
	public void practice15() {
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 2; i<=num; i++) {
			if( i % 2 == 0 || i % 3 == 0) {
				System.out.print(i+" ");
			}
			if( i % 3 == 0 && i % 3 == 0) {
				count++;
			}
		}
		System.out.println("\ncount : " + count);
	}
	public void practice16() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = num-1; i > 0; i--) {
			for(int j = 0; j < i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public void practice17() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                // 첫 번째 행, 마지막 행, 첫 번째 열, 마지막 열에 별 출력
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // 한 행 출력 후 줄 바꿈
        }
	}
	
	public void practice18() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 삼각형 출력
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
		
	}
	
	public void practice19() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 위쪽 삼각형 출력
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 삼각형 출력
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
