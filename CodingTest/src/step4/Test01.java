package step4;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		int cnt = 0;
		for(int x : arr) {
			if(x == v) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
