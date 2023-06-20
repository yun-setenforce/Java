package sub3;

public class Calc {
	
	/////////////////////
	
	// 싱글톤 객체 
	/// 싱글톤 : 메모리상에 오작 하나의 인스턴스로 생성되는 객체 
	private static Calc instance = new Calc();
	
	///private 접근권한인 참조변수 instance를 외부에서 참조할 수 있게 하는 getter 
	public static Calc getInstance() {
		return instance;
	}
	
	///새 인스턴스를 선언하지 못하도록 생성자를 private으로!
	private Calc() {}
	
	/////////////////////
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
	
}
