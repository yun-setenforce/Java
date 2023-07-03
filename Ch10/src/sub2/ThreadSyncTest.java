package sub2;
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
		/// 동기 처리가 안 되어있기 떄문에 15150이 아닌 다른 값이 나오기도한다.
		System.out.println("count 값 : " + count.getNum());
		
	}
}
