package sub1;

public class Account {
	
	// 속성
	String bank;	//은행 
	String id;		//계좌번호
	String name; 	//계좌주 
	int balance; 	//잔액 
	
	// 기능 
	// 입금 
	public void deposit(int money) {
		// 전역변수,지역변수
		this.balance += money;
	}
	//출금 
	public void withdraw(int money) {
		this.balance -= money;
	}
	//잔액 조회 
	public void show() {
		System.out.println("-----------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " +this.id);
		System.out.println("입금주 : " +this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("-----------------------");
	}
}
