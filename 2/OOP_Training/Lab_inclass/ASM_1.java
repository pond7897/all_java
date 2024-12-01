package lab_inclass;

public class ASM_1 {
	public static void main(String[] args) {
		int x = 0, m = 0;

		while (x < 15) {
			x++;
			m = 5 * x;

			System.out.printf(" 5*%d : %d%n", x, m);
		}
	}
}
