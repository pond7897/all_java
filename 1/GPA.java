import java.util.Scanner;

class GPA {
	public static void main(String[] args) {
		double gThai, gMath, gEng, gSocial, gSum;
		Scanner subject = new Scanner(System.in);

		System.out.print("input grade thai");
		gThai = subject.nextDouble();

		System.out.print("input grade math");
		gMath = subject.nextDouble();
		
		System.out.print("input grade english");
		gEng = subject.nextDouble();
		
		System.out.print("input grade social");
		gSocial = subject.nextDouble();

		gSum = (gThai + gMath + gEng + gSocial) / 4;
		System.out.println("GPA is " + gSum);

		subject.close();
	}
}
