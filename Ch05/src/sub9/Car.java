package sub9;

public interface Car {
	
	///인터페이스는 오직 메소드만!속성을 선언하지 않는다. 
	
	public abstract void speedUp(int speed);
	public abstract void speedDown(int speed);
	public void show(); // abstract 생략 가능 - 추상 클래스에선 불가능!!!

}
