package lab_6;
import java.util.Scanner;
public class Min {

	public void findMinnimum() {
		Scanner input = new Scanner(System.in);
		double one ;
		double two ;
		double three ;
		  System.out.printf("%s\n%s\n%s\n","Type the end-of-file indicator to terminate",
				  "On UNIX/Linux/Mac OS X type <ctel> d then press Enter","On Windows type <ctrl> z then press Enter");
		  System.out.printf("Or enter first number : ");
	    while(input.hasNext()) {
	    	one = input.nextDouble();
	    	System.out.print("Enter second number : ");
	    	two = input.nextDouble();
	    	System.out.print("Enter third number : ");
	    	three = input.nextDouble();
	    	double min = Minimum(one,two,three);
	    	System.out.printf("Minimum is %.6f",min);
	    	
	    	
	    	System.out.printf("\n%s\n%s\n%s\n","Type the end-of-file indicator to terminate",
	    			"On UNIX/Linux/Mac OS X type <ctel> d then press Enter","On Windows type <ctrl> z then press Enter");	
	    	System.out.printf("Or enter first number : ");
	    }  
	}
	public double Minimum(double one , double two ,double three) {
		return Math.min(Math.min(one , two),three);
	}
}