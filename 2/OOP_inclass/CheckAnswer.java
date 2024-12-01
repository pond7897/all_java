public class CheckAnswer {
	public static void main(String[] args) {
		int x, xLimit;
		x = 5;
		xLimit = 10;
		
		while (x <= xLimit) {
			x++;
			
			if (x % 2 == 0)
				System.out.printf("%d is even.\n", x);
			else
				System.out.printf("%d is odd.\n", x);
		}
	}// end main
}// end class
