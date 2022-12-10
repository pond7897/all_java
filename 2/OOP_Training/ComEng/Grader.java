package ComEng;

import java.util.ArrayList;

public class Grader {
	private String courseName;
	private ArrayList<Double> scores;
	public Grader(String name) {
		// TODO Auto-generated constructor stub
		this.courseName = name;
	}
	public void addScore(double score) {
		scores.add(score);
	}
	public int countStudents() {
		
	}
	public double mean() {
		
	}
	public int belowMean() {
		
	}
	public int aboveMean() {
		
	}
	public void showGrade() {
		
	}
	public String getCourseName() {
		return courseName;
	}

}
