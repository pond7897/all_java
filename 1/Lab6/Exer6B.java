import java.util.Scanner;

class Exer6B {
	public static double getDouble(String msg) {
		Scanner kbd = new Scanner(System.in);
		
		System.out.print(msg);
		double d = kbd.nextDouble();

		kbd.close();

		return d;
	}

	public static double funcX(double x) {
		double f = 0.0;

		if (x > 0) {
			f = (Math.pow(x, 2) + 2.0) / (x + 1.0);
		} else if (x == 0) {
			f = 2.0;
		} else if (x < 0) {
			f = 2 * x + Math.sin(x);
		}
		return f;
	}

	public static void main(String[] args) {
		double x, y;
		x = getDouble("Enter X-value : ");
		y = funcX(x);
		
		System.out.println(" Result is : " + y);
	}
}
