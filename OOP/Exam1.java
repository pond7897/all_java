import java.util.Scanner;
public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,result;
		String choice;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number1 : "); num1 = scan.nextInt();
		System.out.print("Enter number2 : "); num2 = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Enter choice : "); choice = scan.next();
		
		if (choice.equals("A") || choice.equals("a")) {
			result = num1 + num2;
			System.out.printf("result : %d",result);
			} 
		else if (choice.equals("S") || choice.equals("s")) {
			result = num1 - num2;
			System.out.printf("result : %d",result);
			}
		else if (choice.equals("M") || choice.equals("m")) {
			result = num1 * num2;
			System.out.printf("result : %d",result);
			}
		
		scan.close();
		scan2.close();
		
	}

}
