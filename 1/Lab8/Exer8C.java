import java.util.Scanner;
import java.lang.Math;
class Exer8C
{
	public static void main(String[] args){
		int a,b,sum;
		a = InputInt("Enter a : ");
		b = InputInt("Enter b : ");
		sum = SumPower3(a,b);
		System.out.println("Sum : "+sum);
		while (a>0 && b>0)
		{
			a = InputInt("Enter a : ");
			b = InputInt("Enter b : ");
			sum = SumPower3(a,b);
			System.out.println("Sum : "+sum);
		}
	}
	public static int SumPower3(int a,int b){
		int s = 0;
		while (a<=b)
		{
			s = s+(a*a*a);
			a = a+1;
			
		}
		return s;
	}
	public static int InputInt(String msg){
		Scanner kbd = new Scanner(System.in);
		System.out.print(msg); int text = kbd.nextInt();
		return text;
	}
}
