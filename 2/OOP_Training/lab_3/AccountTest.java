package lab_3;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);

		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());

		Scanner input = new Scanner(System.in);
		double withdrawalAmount;
		System.out.print("Enter withdrawal amount for account1: ");
		withdrawalAmount = input.nextDouble();
		System.out.printf("\nsubtracting %.2f from account1 balance\n", withdrawalAmount);

		account1.withdrawal(withdrawalAmount);
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());

		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
		System.out.print("Enter withdrawal amount for account2: ");
		withdrawalAmount = input.nextDouble();
		System.out.printf("\nsubtracting %.2f from account2 balance\n", withdrawalAmount);

		account2.withdrawal(withdrawalAmount);

		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());

		input.close();
	}
}
