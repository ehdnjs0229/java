package com.kh.practice.comp.func;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	
	Scanner sc = new Scanner(System.in);
	
	public void upDown() {
		Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // 1부터 100까지의 난수 생성
        int num;
        int count = 0;
        
        System.out.println("1~100 사이의 임의의 난수를 맞춰보세요 : ");

        while (true) {
            System.out.print("1~100 사이의 숫자를 입력해주세요. ");
            num = sc.nextInt();
            count++;

            if (num < randomNumber) {
                System.out.println("DOWN !");
            } else if (num > randomNumber) {
                System.out.println("UP !");
            } else {
                System.out.println("정답입니다 !!");
                System.out.println("난수를 " + count + "번 만에 맞췄습니다.");
                break;
            }
        }

		
	}

}
