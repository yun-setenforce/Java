package ch03.sec99;

public class Test01 {
	public static void main(String[] args) {
		int x = 10; 
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
	}
}
