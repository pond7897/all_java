package lab7;

public class Code_2 {

	public static void main(String[] args) {
		char sentence[] = { 'H', 'o', 'w', ' ', 'a', 'r', 'e', ' ', 'y', 'o', 'u' };
		String output = "The sentence is : ";

		System.out.printf("%s", output);

		for (int i = 0; i < sentence.length; i++)
			System.out.printf("%c", sentence[i]);
	}
}
