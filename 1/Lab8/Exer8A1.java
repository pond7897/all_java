import java.util.Scanner;
class Exer8A1
{
	public static void main(String[] args){
		double x; int n;
		x = readInt("Enter x : ");
		n = readInt("Enter n : ");
		compute(x,n);
	}
	public static void compute(double x,int n){
		double res = 1.0;
		int i = 1;
		while (i<=n)
		{
			res = res*x; 
			i = i+1; 

		}
		System.out.println("result is : "+res);
	}
	public static int readInt(String msg){
		Scanner kbd = new Scanner(System.in);
		System.out.print(msg); int text = kbd.nextInt();
		return text;
	}
}
//Titipong Keawkhum 64050407