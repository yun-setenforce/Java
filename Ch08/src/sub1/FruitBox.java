package sub1;

public class FruitBox<T> { ///Generic 타입을 박스를 생성할 때 결
	/*
	///Apple밖에 넣지 못함. 범용성이 없다.
	private Apple fruit;
	
	public Apple getFruit() {
		return fruit;
	}
	public void setFruit(Apple fruit) {
		this.fruit = fruit;
	}
	*/
	///Apple밖에 넣지 못함. 범용성이 없다.
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
