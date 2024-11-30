package lab_3;

public class GradeBook {
	private String courseName;
	private String peopleName;

	public GradeBook(String name, String con) {
		courseName = name;
		peopleName = con;
	}

	public void setCourseName(String con) {
		System.out.printf("Changing instructor name to %s\n\n", con);
		peopleName = con;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getpeople() {
		return peopleName;
	}

	public void displayMessage() {
		System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
		System.out.printf("This course is presented by : %s\n\n", getpeople());
	}
}
