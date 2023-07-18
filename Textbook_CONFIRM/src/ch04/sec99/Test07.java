package ch04.sec99;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "";
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------");
			System.out.print("선택> ");
			answer = sc.nextLine();
			switch(answer) {
			case "1":
				System.out.print("예금액>");
				sc.nextLine();
				break;
			case "2":
				System.out.print("출금액>");
				sc.nextLine();
				break;
			case "3":
				System.out.print("잔고>");
				sc.nextLine();
				break;
			case "4":
				isRunning = false;
				break;
			default:
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
