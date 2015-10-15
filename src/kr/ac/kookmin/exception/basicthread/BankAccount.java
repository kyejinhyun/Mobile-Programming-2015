package kr.ac.kookmin.exception.basicthread;
public class BankAccount {
	private int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	public void withDraw(int amount) {
		balance -= amount;
	}
	
	public void add(int money) {
		balance += money;
		System.out.println("총합 : " + balance + " " + money + " 만큼 입금");
	}
	public void delete(int money) {
		balance -= money;
		System.out.println("총합 : " +balance + " " + money + " 만큼 출금");
	}
}
