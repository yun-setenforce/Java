package sub2_2;

public class Count {
	private int num;

	public int getNum() {
		return num;
	}

	public synchronized void setNum(int num) {
		/// synchronized :오직 하나의 스레드만 사용할 수 있도록 처리 
		this.num += num;
	}
}
