import java.util.*;
public class CheckAnswer 
{
	public static void main(String[] args) 
	{
	/*Scanner input = new Scanner(System.in);
	int number1;
	
	System.out.println("Enter an integer: ");
	number1 = input.nextInt();
	number1 = number1 +3;
	if(number1 %2 == 0) 
		System.out.printf("%d is even\n",number1);
	else 
		System.out.printf("%d is odd\n",number1);*/
		
	/*int grade1 = 65;
	int grade2 = 50;
	
	System.out.println(grade1 >= 60 ? "Passed" : "Failed");
	System.out.println(grade2 >= 60 ? "Passed" : "Failed");'*/
		
	/*int x,xLimit;
	x= 10;
	xLimit = 5;
	while(x<=xLimit) {
		x++;
		System.out.printf("The value of x is %d\n",x);
	}//end while
	
	System.out.printf("The final of x is %d\n",x);*/
	
	int x,xLimit;
	x = 5;
	xLimit = 10;
	while (x<=xLimit) {
		x++;
		if (x%2 == 0) System.out.printf("%d is even.\n",x);
		else System.out.printf("%d is odd.\n",x);
	}
	}//end main
}//end class
