package ch02.sec01;
/*
 * 날짜 : 2023/06/12
 * 이름 : 정채윤
 * 내용 : 교재 p. 37
 * */
public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60)+minute;
		System.out.println("총 " + totalMinute + "분");
	}
}
