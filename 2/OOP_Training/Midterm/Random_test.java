package midterm;

import java.util.Random;

public class Random_test {
	public static void main(String[] args) {
		Random random = new Random();
		int ran = random.nextInt(5);

		System.out.println(ran);
	}
}
