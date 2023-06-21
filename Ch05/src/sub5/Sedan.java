package sub5;

public class Sedan extends Car{

	private int cc; //배기량 
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	public void speedTurbo() {
		this.speed += 20;
	}
	
	public void show() {
		super.show();
		System.out.println("배기량 : " + this.cc);
	}
}