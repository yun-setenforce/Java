package sub1;

public class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		String result = "원산지 : " + country + "\n가격 : " + price;
		return result;
	}
}
