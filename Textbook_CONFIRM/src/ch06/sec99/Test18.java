package ch06.sec99;

class Account {
	private int balance;
	static int MIN_BALANCE = 0;
	static int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance > MAX_BALANCE ||balance < MIN_BALANCE) {
			return;
		}
		this.balance = balance;
		
	}
	
	
}

public class Test18 {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		
	}
}
