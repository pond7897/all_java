import java.util.Scanner;
import java.lang.Math;
class Exer8D
{
	public static void main(String[] args){
		int n;
		int s;
		n = InputInt("Enter Number : ");
		while (n > 0)
		{
			s = SumN(n);
			System.out.println("Sum = "+s);
			n = InputInt("Enter Number : ");
		}
	}
	public static int SumN(int N){
		int s = 0 , sign = -1;
		int i = 1;
		while (i<=N)
		{
			sign = sign*(-1);
			//s = s+((int)Math.pow((-1),i+1)*i*(i+1));
			s = s+sign*(i*(i+1));
			i = (i+1);
		}	
		return s;
	}
	public static int InputInt(String msg){
		Scanner kbd = new Scanner(System.in);
		System.out.print(msg); int text = kbd.nextInt();
		return text;
	}
}
