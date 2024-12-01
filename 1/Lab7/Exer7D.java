import java.util.Scanner;

class Exer7D {
	public static int readInteger(String msg) {
		Scanner kbd = new Scanner(System.in);

		System.out.print(msg);
		int text = kbd.nextInt();

		kbd.close();

		return text;
	}

	public static boolean isLeafyear(int yr) {
		boolean leaf;
		if (yr % 4 == 0) {
			if (yr % 100 == 0) {
				if (yr % 400 == 0) {
					leaf = true;
				} else
					leaf = false;
			} else
				leaf = true;
		} else
			leaf = false;
		return leaf;
	}

	public static void main(String[] msg) {
		int yr;

		yr = readInteger("Enter year (A.C.) : ");
		
		if (isLeafyear(yr)) {
			System.out.println("The year " + yr + " is leaf year");
		} else
			System.out.println("The year " + yr + " is not leaf year");
	}
}
// Titpong Keawkhum 64050407