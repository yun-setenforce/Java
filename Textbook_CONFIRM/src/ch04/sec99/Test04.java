package ch04.sec99;

public class Test04 {
	public static void main(String[] args) {
		
		int sum = 0;
		int dice1 = 0, dice2 = 0;
		while(sum != 5) {
			dice1 = (int) (Math.ceil(Math.random()*6));
			dice2 = (int) (Math.ceil(Math.random()*6));
			sum = dice1 + dice2;
			System.out.println("(" + dice1 + ", " +dice2 +")");
		}
	}
}
