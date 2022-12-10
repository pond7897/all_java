package FinalEx;

public class TestExam2 {

	public static void main(String[] args) {
		Student[] student = new Student[3];
		Staff[] staff = new Staff[3];
		Person person = new Person("Titipong pond","KMITL");
		student[0] = new Student("Titipong pond","KMITL","JAVA",18,0.01);
		student[1] =  new Student("Tanachot oat","KMITL","JAVA",18,0.01);
		student[2] = new Student("Natthapat Yang","KMITL","JAVA",18,0.01);
		
		for (Student St : student) {
			System.out.println(St);
		} 

	}

}
