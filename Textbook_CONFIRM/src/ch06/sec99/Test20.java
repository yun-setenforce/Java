package ch06.sec99;

import java.util.Scanner;

class Account2{
	private String id;
	private String name;
	private int balance;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

class BankApplication{
	private Account2[] accountList = new Account2[100];
	int lastIndex = 0;
	public void createAccount(String id, String name, int balance) {
		accountList[lastIndex] = new Account2();
		accountList[lastIndex].setId(id);
		accountList[lastIndex].setName(name);
		accountList[lastIndex].setBalance(balance);
		lastIndex++;
	}

	public void deposit(String id, int amount) {
		for(int i=0; i<lastIndex; i++) {
			if(accountList[i].getId().equals(id)) {
				accountList[i].setBalance(accountList[i].getBalance()+amount);
				System.out.println("예금성");
				return;
			}
		}
	}
	public void withDraw(String id, int amount) {
		for(int i=0; i<lastIndex; i++) {
			if(accountList[i].getId().equals(id)) {
				accountList[i].setBalance(accountList[i].getBalance()-amount);
				return;
			}
		}
	}
	public void showAccoutList() {
		
		for(int i=0; i<lastIndex; i++) {
			System.out.print(accountList[i].getId());
			System.out.print("\t");
			System.out.print(accountList[i].getName());
			System.out.print("\t");
			System.out.print(accountList[i].getBalance());
			System.out.println();
		}
	}
}
public class Test20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int answer = 0;
		String id = "",  name = "";
		int balance = 0;
		BankApplication ba = new BankApplication();
		
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("-----------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------");
			
			System.out.print("선택> ");
			answer = Integer.parseInt(sc.nextLine());
			
			switch(answer) {
			case 1 :
				System.out.println("------------");
				System.out.println("계좌생성");
				System.out.println("------------");
				System.out.print("계좌번호: ");
				 id = sc.nextLine();
				System.out.print("계좌주: ");
				 name = sc.nextLine();
				System.out.print("초기입금액: ");
				 balance = Integer.parseInt(sc.nextLine());
				
				ba.createAccount(id, name, balance);
				
				System.out.println("결과 : 계좌가 생성되었습니다.");
				
				break;
			case 2 :
				System.out.println("------------");
				System.out.println("계좌목록");
				System.out.println("------------");
				ba.showAccoutList();
				break;
			case 3 : 
				System.out.println("------------");
				System.out.println("예금");
				System.out.println("------------");
				System.out.print("계좌번호: ");
				 id = sc.nextLine();
				System.out.print("예금액: ");
				 balance = Integer.parseInt(sc.nextLine());
				
				 ba.deposit(id, balance);
				
				
				break;
			case 4 : 
				System.out.println("------------");
				System.out.println("출금");
				System.out.println("------------");
				System.out.print("계좌번호: ");
				 id = sc.nextLine();
				System.out.print("출금액: ");
				 balance = Integer.parseInt(sc.nextLine());
				
				 ba.withDraw(id, balance);
				
				break;
			case 5 : 
			default:
				isRunning = false;
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
