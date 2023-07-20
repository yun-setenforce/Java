package ch07.sec99;

class Parent{
	public String name;
	public Parent(String name) {
		this.name=name;
	}
}

public class Test06 extends Parent {
	public Test06(String name, int studentNo) {
		super(name); ///
		this.studentNo = studentNo;
	}

	public int studentNo;
}
