package lab_4;

public class Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,xLimit;
		
		/*assign values to x and xLimit here*/
		
		x = 1;
		xLimit = 5;
		
		while ( x <= xLimit) {
			x++;
			System.out.printf("The value of x is %d\n",x);
		} // end while
		
		System.out.printf("The final value of x is %d\n",x);
	}

}
