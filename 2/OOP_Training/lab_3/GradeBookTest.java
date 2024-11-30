package lab_3;

public class GradeBookTest {

	public static void main(String[] args) {
		GradeBook gradebook1 = new GradeBook("CS101 Introduction to java Programming", "Sam Smith");

		gradebook1.displayMessage();
		gradebook1.setCourseName("Judy Jones");
		gradebook1.displayMessage();
	}
}
