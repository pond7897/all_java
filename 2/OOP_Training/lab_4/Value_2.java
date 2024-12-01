package lab_4;

public class Value_2 {

	public static void main(String[] args) {
		int x, xLimit;

		x = 1;
		xLimit = 5;

		while (x <= xLimit) {
			x++;
			if (x % 2 == 0)
				System.out.printf("%d is even\n", x);
			else
				System.out.printf("%d is odd\n", x);

		} // end while
	}
}
