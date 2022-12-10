import java.util.*;
public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice;
		Scanner scan = new Scanner(System.in);
		System.out.print("Do you like C_language(Y/N) ? : "); choice = scan.nextLine();
		while (!choice.equals("Y") || !choice.equals("N")) {
			if (choice.equals("Y")) break;
			if (choice.equals("N")) break;
			else {
			System.out.println("Please enter only Y or N ");
			System.out.print("Do you like C_language(Y/N) ? : ");
			choice = scan.nextLine();
			}
		}
		scan.close();
		
	}

}
