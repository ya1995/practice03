package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account( String accountNo) {
		
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int save( int saveMoney) {
		balance = saveMoney + balance;
		return balance;
	}
	public int deposit( int depositMoney ) {
		balance = balance - depositMoney;
		return balance;
	}
	
}
