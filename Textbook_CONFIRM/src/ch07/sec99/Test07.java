package ch07.sec99;

class Parent2{
	public String nation;
	public Parent2() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	public Parent2(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
class Child2 extends Parent2{
	public String name;
	public Child2() {
		this("홍길동");
		System.out.println("Child() call");
	}
	public Child2(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}

public class Test07 {
	public static void main(String[] args) {
		Child2 child = new Child2();
		System.out.println(child.name + child.nation);
	}
}
