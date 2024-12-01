import java.util.Scanner;

class Exer7B {
	public static double readDouble(String msg) {
		Scanner kbd = new Scanner(System.in);

		System.out.print(msg);
		double text = kbd.nextDouble();

		kbd.close();
		return text;
	}

	public static String main(double sc) {
		String grade;
		if (sc >= 85.0) {
			grade = "A";
		} else if (sc >= 70.0 && sc < 85.0) {
			grade = "B";
		} else if (sc >= 50.0 && sc < 70.0) {
			grade = "C";
		} else if (sc >= 40.0 && sc < 50.0) {
			grade = "D";
		} else
			grade = "F";
		return grade;
	}

	public static void main(String[] args) {
		String gr;
		double score;

		score = readDouble("Enter score : ");
		gr = main(score);
		
		System.out.println("grade is : " + gr);
	}
}
// Titpong Kaewkhum 64050407