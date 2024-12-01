import java.util.Scanner;

class Exer6D {
	public static double getDouble(String msg) {
		Scanner kbd = new Scanner(System.in);

		System.out.print(msg);
		double num = kbd.nextDouble();

		kbd.close();

		return num;
	}

	public static void quadSlove(double a, double b, double c) {
		double r, x1, x2;
		if (a != 0) {
			r = Math.pow(b, 2) - (4.0 * a * c);
			if (r >= 0) {
				x1 = (-b + Math.sqrt(r)) / 2.0 * a;
				x2 = (-b - Math.sqrt(r)) / 2.0 * a;
				System.out.println("root 1 :" + x1);
				System.out.println("root 2 :" + x2);
			} else
				System.out.println("no real root");
		} else
			System.out.println("The equation does not quadratic");
	}

	public static void main(String[] args) {
		double a, b, c;
		a = getDouble("Enter a : ");
		b = getDouble("Enter b : ");
		c = getDouble("Enter c : ");

		quadSlove(a, b, c);

	}
}
