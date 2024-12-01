import java.util.*;
class Exer10A
{
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		System.out.print("input n : "); int n = kbd.nextInt();
		triBox(n); //call triBox method

		kbd.close();
}
	public static void triBox(int n){
		for (int i = 1; i<=n ; i++ )
		{
			for (int j = 0; j<=i-1 ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
