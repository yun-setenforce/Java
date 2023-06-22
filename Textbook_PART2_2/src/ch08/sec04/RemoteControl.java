package ch08.sec04;

public interface RemoteControl {
	//상수 선언 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 선언 
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
