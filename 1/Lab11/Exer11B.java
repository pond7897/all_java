import java.util.Scanner;
class Exer11B
{
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);

		System.out.print("input a : "); int a = kbd.nextInt();
		System.out.print("input b : "); int b = kbd.nextInt();
		
		long []x = new long[50];
		x[0]=a; x[1]=b;
		
		for (int i = 2;i<50 ;i++ ){
			x[i]=x[i-1]+x[i-2]; //fibonacci
		}
		
		dispArray(x,4);
		kbd.close();
	}
	public static void dispArray(long[] x, int n){
		int k = 1;
		for (int i = 0 ;i < 50 ;i++ ){
			System.out.printf("%25d",x[i]);
			k++;
			if (k==n+1){
				System.out.printf("%n");
				k=k%n;
			}
		}
		System.out.println();
	}
}
