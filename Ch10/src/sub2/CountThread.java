package sub2;

public class CountThread extends Thread {

	private Count count;

	public CountThread(Count count) {
		this.count =count;
	}

	@Override
	public void run() {		
		for(int i=1; i<=100; i++) {
			///1. 3개의 CountThread 스레드가 비동기 방식으로 병행 실행 
			count.setNum(i);
		}
	}
}
