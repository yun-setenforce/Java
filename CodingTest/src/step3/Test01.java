package step3;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		for(int j=1;j<10;j++) {
			System.out.println(a + " * " + j + " = " + a*j);
		}
		
		/**
		for(int i=1;i<a+1;i++) {
			for(int j=1;j<10;j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		**/

	}

}
