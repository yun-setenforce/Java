package sub3;

public class AddThread extends Add implements Runnable{ ///Add를 상속받았으므로 Thread클래스상속받을 수 없음. Runnable 인터페이스를 구현하여 자식 스레드로 실행. 

	private int start;
	private int end;
	
	public AddThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	///동기화 처리 필요 x. >> 
	@Override
	public void run() {
		for(int k=start; k<= end; k++) {
			setNum(k);
		}
	}

}
