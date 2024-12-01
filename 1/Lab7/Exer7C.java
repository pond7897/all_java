import java.util.Scanner;

class Exer7C {
	public static String readString(String msg) {
		Scanner kbd = new Scanner(System.in);
		
		System.out.print(msg);
		String text = kbd.next();

		kbd.close();
		
		return text;
	}

	public static double score(String gr) {
		double sc;

		if (gr.equals("A"))
			sc = 4.0;
		else if (gr.equals("B+"))
			sc = 3.5;
		else if (gr.equals("B"))
			sc = 3.0;
		else if (gr.equals("C+"))
			sc = 2.5;
		else if (gr.equals("C"))
			sc = 2.0;
		else if (gr.equals("D+"))
			sc = 1.5;
		else if (gr.equals("D"))
			sc = 1.0;
		else
			sc = 0.0;

		return sc;
	}

	public static void main(String[] args) {
		String gr;
		double sc;
		
		gr = readString("Enter grade : ");
		sc = score(gr);
		
		System.out.println("score is : " + sc);
	}
}
// Titipong Keawkhum 64050407