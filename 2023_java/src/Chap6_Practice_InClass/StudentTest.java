package Chap6_Practice_InClass;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] students = new Student[5];
		
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(i+1);
		}
		
		for (int i = 0; i < students.length; i++) {
			students[i].showStudentInfo();
		}		

	}

}
