import java.util.Scanner;
class forloop
{
	public static int getInt(String msg){
		Scanner kbd = new Scanner(System.in);
		System.out.print(msg); int num = kbd.nextInt();

		kbd.close();
		return num;
	}
	public static int loop(int i){
		for(i = 0; i<10 ; i++ )
		{
			System.out.print(i);
		}
		return i;
	}
	public static void main(String[] args){
		int i,f;
		i = getInt("input number : ");
		f = loop(i);
		System.out.println(f);
	}
}
