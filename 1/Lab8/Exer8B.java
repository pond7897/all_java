import java.util.Scanner;

class Exer8B {
	public static void main(String[] args) {
		int n;
		n = readInt("Enter n : ");
		compute(n);
	}

	public static void compute(int n) {
		int res = 0, sign = -1, i = 1;

		while (i <= n) {
			sign *= (-1);
			res += (sign * i);
			i++;

		}

		System.out.println("result is : " + res);
	}

	public static int readInt(String msg) {
		Scanner kbd = new Scanner(System.in);

		System.out.print(msg);
		int text = kbd.nextInt();

		kbd.close();

		return text;
	}
}
