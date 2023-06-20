package sub3;

public class Car {
	// 필드(속성)
	/// Heap에 저장
	private String name;
	private String color;
	private int speed;
	
	// 클래스 변수 (정적변수)
	/// Method Area에 저장 
	/// 인스턴스(객체)로 참조하는 변수가 아니기 때문에 public 으로 선언. 
	public static int count;
	
	// 생성자 
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	// 메서드(기능)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	// 클래스 메서드(정적 메서드)
	///클래스 변수를 다루고 있으므로 문법적으로 클래스 메서드가 되는 게 맞음. static선언 
	public static int getCount() {
		///static메서드는 static변수만 참조 가능하다.
		///static변수,메서드는 메모리에 우선적으로 적재되나, 그 시점에서 필드 변수는 존재하지 xxx
		return count;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color );
		System.out.println("현재속도 : " + this.speed);
	}
	
	
}
