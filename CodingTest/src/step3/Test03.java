package step3;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int sum = 0;
		for(int i = 1;i <= x; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
