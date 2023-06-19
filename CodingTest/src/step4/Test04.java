package step4;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max= 0;
		int cnt = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j] > max) {
				max = arr[j];
				 cnt = j+1;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
	}

}
