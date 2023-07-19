package ch05.sec99;

public class Test08 {
	public static void main(String[] args) {
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length;j++) {
				cnt++;
				sum +=array[i][j];
			}
		}
		avg = (double) sum/cnt;
		System.out.println("합계 : " + sum + ", 평균 : " + avg );
		
	}
}
