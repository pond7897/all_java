import java.util.Scanner;
class Exer8B
{
	public static void main(String[] args){
		int n;
		n = readInt("Enter n : ");
		compute(n);
	}
	public static void compute(int n){
		int res = 0,sign = -1,i= 1;
		while (i<=n)
		{
			sign = sign*(-1);
			res = res+(sign*i); 
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
