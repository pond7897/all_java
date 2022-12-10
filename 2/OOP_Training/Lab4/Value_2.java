package Lab4;

public class Value_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,xLimit;
		
		/*assign values to x and xLimit here*/
		
		x = 1;
		xLimit = 5;
		
		while ( x <= xLimit) {
			x++;
			if ( x % 2 == 0) System.out.printf("%d is even\n",x);
			else System.out.printf("%d is odd\n",x);
			
		} // end while
	}

}
