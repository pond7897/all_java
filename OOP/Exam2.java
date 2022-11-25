import java.util.*;
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String day;
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter number: "); num = kbd.nextInt();
		if (num == 1) day = "Monday";
		else if (num == 2) day = "Tuesday";
		else if (num == 3) day = "Wednesday";
		else if (num == 4) day = "Thursday";
		else if (num == 5) day = "Friday";
		else if (num == 6) day = "Saturday";
		else if (num == 7) day = "Sunday";
		else day = null;
		System.out.println("Day is : "+day);
		kbd.close();
	}

}
