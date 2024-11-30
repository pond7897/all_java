package lab_2;

import java.util.Scanner;

public class Output {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer: ");
		number = input.nextInt();
		
		if (number != 7)
			System.out.print("Welcome");
		if ((number % 5) == 0)
			System.out.println("To Java Programming");
		
			input.close();
	}
}
