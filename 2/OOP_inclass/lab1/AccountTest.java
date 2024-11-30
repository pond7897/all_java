package lab1;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account(50.0);
		Account account2 = new Account(-7.53);
		
		System.out.printf("account 1 balance: $%.2f%n",account1.getBalance());
		System.out.printf("account 2 balance: $%.2f%n",account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter withdrawal amount for account1: ");
		double withdrawalAmount = input.nextDouble();
		System.out.printf("subtracting %.2f from account1 balance%n",withdrawalAmount);
		account1.debit(withdrawalAmount);
		
		System.out.printf("account 1 balance: $%.2f%n",account1.getBalance());
		System.out.printf("account 2 balance: $%.2f%n",account2.getBalance());
		
		System.out.print("Enter withdrawal amount for account2: ");
		withdrawalAmount = input.nextDouble();
		System.out.printf("subtracting %.2f from account2 balance%n",withdrawalAmount);
		account2.debit(withdrawalAmount);
		
		System.out.printf("account 1 balance: $%.2f%n",account1.getBalance());
		System.out.printf("account 2 balance: $%.2f%n",account2.getBalance());

		input.close();
	}
}
