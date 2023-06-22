package ch07.sec10.exam02;

public class AbstractMethodExample {

	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다형성  > 자동 타입 변환 
		animalSound(new Dog());
		animalSound(new Cat());
	}

}
