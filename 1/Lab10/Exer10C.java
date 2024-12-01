import java.util.*;
class Exer10C
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//System.out.print("input word : "); 
		String word = sc.next();
		while (word != null)
		{
			if (palindrome(word)) System.out.println("Yes, It is palindrome");
			else System.out.println("NO");
			
			//System.out.print("input word : ");
			word = sc.next();
		}
		
		sc.close();
	}
	public static boolean palindrome(String wd){//wd = original st = reverse
		String st = "";
		//wd = "";
		for (int i = wd.length()-1;i>=0;i--)
		st += wd.charAt(i);
		if (wd.equals(st)) return true;
		else return false;
	}
}