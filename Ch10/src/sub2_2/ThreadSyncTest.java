package sub2_2;
/*
 * 날짜 : 2023/07/03
 * 이름 : 정채윤
 * 내용 : Java Thread 동기화 실습하기 
 */
public class ThreadSyncTest {
	
	public static void main(String[] args) throws InterruptedException {
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start();
		ct2.start();
		ct3.start();

		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("count 값 : " + count.getNum());
		
	}
}
