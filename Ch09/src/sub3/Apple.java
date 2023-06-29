package sub3;

import java.io.Serializable;

public class Apple implements Serializable {
	private static final long serialVersionUID = 1L; ///객체들간의 식별할 수 있는 번호...안해도 무방. 
	private String country;
	private int price;
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show(){
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + price	);
	}
}
