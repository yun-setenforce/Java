package ch06.sec99;

class Printer {
	public void println(int val) {
		System.out.println(val);
	}
	public void println(boolean val) {
		System.out.println(val);
	}
	public void println(double val) {
		System.out.println(val);
	}
	public void println(String val) {
		System.out.println(val);
	}
}

public class Test17 {
	public static void main(String[] args) {
		
		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
	}
}
