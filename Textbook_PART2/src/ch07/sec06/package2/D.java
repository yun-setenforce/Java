package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
	
	//생성자 선언 
	public D() {
		//A() 생성자 호출
		super();			//o
	}
	
	//메소드 선언 
	public void method1() {
		//A필드값 변경 
		this.field = "value";
		//A메소드 호출 
		this.method();
	}
	
	
	/*
	 *protected 접근제한자는 다른 패키지일 때 상속을 통해서만 접근 가능. 
	 *직접 객체 생성해서 사용하는 것은 안됨
	
	//메소드 선언
	public void method() {
		A a = new A(); 		//x
		a.field = "value"; 	//x
		a.method();  		//x
	}
	*/
	

}
