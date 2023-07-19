package ch06.sec99;

class Printer2 {
	public static void println(int val) {
		System.out.println(val);
	}
	public static void println(boolean val) {
		System.out.println(val);
	}
	public static void println(double val) {
		System.out.println(val);
	}
	public static void println(String val) {
		System.out.println(val);
	}
}

public class Test16 {
	public static void main(String[] args) {
		
		
		Printer2.println(10);
		Printer2.println(true);
		Printer2.println(5.7);
		Printer2.println("홍길동");
		
	}
}
