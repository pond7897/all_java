package lab1;

public class Account {
	private double balance;

	public Account(double initialBalance) {
		if (initialBalance > 0.0) balance = initialBalance;
	}

	public void credit (double amount) {
		balance += amount;
	}

	public void debit(double amount) {
		if (balance < amount) System.out.println("Debit amount exceeded account balance");
		else balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
}
