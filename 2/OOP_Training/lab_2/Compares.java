package lab_2;

import java.util.Scanner;

public class Compares {

	public static void main(String[] args) {
		int integer;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		integer = input.nextInt();
		
		if ((integer % 6) == 0)
			System.out.println("Hello");
		else
			System.out.println("Good Bye");
		
			input.close();
	}
}
