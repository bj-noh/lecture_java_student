package Chap6_Practice_InClass;

public class Student {
	private int id;
	private int Kor;
	private int Math;
	private int Eng;
	private int Sci;
	public Student (int id) {
		this(id, id%3*(id+5)%8*16, id%3*(id+7)%4*13, id%2*(id+6)%19*18, id%3*(id+15)%9*18);
	}
	
	public Student (int id,	int Kor, int Math, int Eng,int Sci) {
		// CODE HERE
		
	}
	// create methods for getter setter HERE //
	
	//////////////////////////////////////////
		
	public double getAvg() {
		// CODE HERE
	}
	
	public void showStudentInfo() {
		// CODE HERE
		System.out.println("ID: " + this.id + 
				"Scores: " + this.Kor + ", " +
				+ this.Math + ", " + + this.Eng + ", " +
				+ this.Sci + ", Avg: " + getAvg());
	}
	
	
	
	
}
