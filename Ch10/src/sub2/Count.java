package sub2;

public class Count {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		/// 2. Thread의 순서 없이 3개의 스레드가 병행실행. 
		///나의 스레드가 접근할 수 있도록 동기화 필요.(순서를 정해 한 스레드가접근중일경우 다른 스레드는 접근하지 못하게 막아야 함.)
		/// 그렇지않으면 동시 실행될 수 있고 연산 결과가 부정확해질 수 있
		this.num += num;
	}
}
