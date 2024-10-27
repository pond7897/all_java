import java.util.Scanner;

class Exer5D {
	private static double getDouble(String msg) {
		Scanner kbd = new Scanner(System.in);

		System.out.print(msg);
		double num = kbd.nextDouble();
		kbd.close();
		return num;
	}

	public static double funcF(double x, double y) {
		double f, num_up, num_down;

		num_up = Math.pow(x, 2) + Math.pow(y, 5);
		num_down = x + y + 1.0;
		f = num_up / num_down;

		return f;
	}

	public static void main(String[] args) {
		double a, b, z;

		a = getDouble("Enter -A value :");
		b = getDouble("Enter -B value :");
		z = funcF(a, b);

		System.out.println("F value is : " + z);
	}
}
// Titpong Keawkhum 64050407
