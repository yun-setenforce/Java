package ch04.sec05;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/14
 * 이름 : 정채윤
 * 내용 : 교재 p.131
 */
public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0; 
		while(run) {
			System.out.println("---------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 증료");
			System.out.println("---------------------");
			System.out.print("선택 : ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			}else if(strNum.equals("3")) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

}
