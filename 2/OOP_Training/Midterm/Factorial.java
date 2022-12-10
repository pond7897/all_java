package Midterm;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n : "); int num = scan.nextInt();
		int fact = factorial(num);
		System.out.printf("Factorial %d is %d%n",num,fact);
		
	}
	public static int factorial(int n) {
		return n <= 0 || n == 1 ? 1:n*factorial(n-1);
	}

}
