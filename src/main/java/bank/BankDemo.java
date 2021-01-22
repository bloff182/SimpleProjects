package bank;

public class BankDemo {

	public static void main(String[] args) {

		BankTransferImpl bank = new BankTransferImpl();
		
		BankAccount account1 = bank.openAccount(5000);
		BankAccount account2 = bank.openAccount(1000);
		
		account1.setBalance(5002);
		
		
		System.out.println(account1);
		System.out.println(account2);
	}

}
