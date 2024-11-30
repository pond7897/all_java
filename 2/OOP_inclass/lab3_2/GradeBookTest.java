package lab3_2;
import java.util.Scanner;
public class GradeBookTest {

	public static void main(String[] args) {
		GradeBook gradeBook1 = new GradeBook("CS101 Introduction to java Programming","Sam Smith");
		gradeBook1.displayMessage();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\n\nChanging instructor name to "); String change = scan.nextLine();
		for (int i = 1; i<=2 ; i++) System.out.println();
		gradeBook1.setIntructor(change);
		gradeBook1.displayMessage();

		scan.close();
	}
}
