package ch07.sec03.exam02;

public class SmartPhone extends Phone{
	//자식 생성자 선언 
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone(String model, String Color) 생성자 실행됨");
	}
}
