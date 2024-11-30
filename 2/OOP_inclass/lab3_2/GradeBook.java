package lab3_2;

public class GradeBook {
	private String courseName;
	private String IntructorName;
	
	public GradeBook(String name,String Intructor) {
		courseName = name;
		IntructorName = Intructor;
	}
	
	public void setCourseName(String name) {
		courseName = name;
	}
	
	public void setIntructor(String name) {
		IntructorName = name;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String getIntructorName() {
		return IntructorName;
	}
	
	public void displayMessage() {
		System.out.printf("Welcome to the grade book for\n%s!\n",getCourseName());
		System.out.printf("This course is presented by: %s\n",getIntructorName());
	}
}
