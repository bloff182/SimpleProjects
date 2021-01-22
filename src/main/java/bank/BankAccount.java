package bank;

public class BankAccount implements Account {

	private int balance;
	
	public BankAccount() {
		balance = 0;
	}
	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getAmount() {
		return balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(int amount) {
		if (amount <= 0)
			throw new IllegalArgumentException("Amount is negative");
		
		balance += amount;
	}

	@Override
	public void withdraw(int amount) {
		if (amount <= 0)
			throw new IllegalArgumentException("Amount is negative");
		
		balance -= amount;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
	

}
