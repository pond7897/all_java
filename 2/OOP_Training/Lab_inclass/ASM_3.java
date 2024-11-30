package lab_inclass;

import java.util.Scanner;

public class ASM_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight,sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Weight : "); weight = input.nextInt();
		while (weight >= 0) {
			sum += weight;
			System.out.print("Enter Weight : "); weight = input.nextInt();
		}
		System.out.println("Summary of weights : "+sum);
		input.close();
	}
}
