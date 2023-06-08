package final_exam_15_16;

public class Student {
	private int id;
	private String major;
	private double grade[] = new double[4];
	
	public Student(int id, String major, double grade[]) {
		this.id = id;
		this.major = major;
		for (int i = 0; i < grade.length; i++) {
			this.grade[i] = grade[i];
		}
	}
	
	public double getAvgGrade() {
		double sum = 0;
		for (int i = 0; i < this.grade.length; i++) {
			sum += this.grade[i];
		}
		
		return sum / this.grade.length;
	}
	
	public void showSpecificGrade(int index) {
		System.out.println(this.grade[index]);
	}
	
	public boolean PassOrFail(double threshold) {
		if (getAvgGrade() < threshold) {
			return false;
		}
		else {
			return true;
		}
	}
}
