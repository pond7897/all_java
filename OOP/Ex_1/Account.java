package Ex_1;

public class Account {
	private double balance;
	public Account(double initialBalance) {
		// TODO Auto-generated constructor stub
		if (initialBalance > 0.0) balance = initialBalance;
	}

	//credit(add)
	public void credit (double amount) {
		balance += amount;
	}
	//debit(subtract)
	public void debit(double amount) {
		if (balance < amount) System.out.println("Debit amount exceeded account balance");
		else balance -= amount;
	}
	
	
	public double getBalance() {
		return balance;
	}

}
