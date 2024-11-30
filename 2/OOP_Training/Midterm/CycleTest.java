package midterm;

import java.util.Scanner;

public class CycleTest {

	public static void main(String[] args) {
		Cycle cycle = new Cycle();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int r = input.nextInt();
		
		cycle.setRadius(r);
		double a = cycle.getDiameter(r);
		
		System.out.printf("Output of %d is %.2f", r, a);
	}
}
