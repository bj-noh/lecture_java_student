package final_exam_15_16;


// 15 객체 배열
// 16 객체 배열 활용 (멤버 method 내 연산 활용)

public class StudentTest {
	
	public static void main(String[] args) {
		Student[] students = new Student[3];
		
		students[0] = new Student(1, "Korean", new double[] {3.5, 3.7, 3.1, 3.8});
		students[1] = new Student(2, "Computer", new double[] {2.8, 2.2, 2.5, 2.3});
		students[2] = new Student(3, "AI", new double[] {4.4, 4.1, 4.5, 4.2});
		
		// Num 15 O
		students[1].showSpecificGrade(3);
		
		// Num 16 X
		for (int i = 0; i < students.length; i++) {
			if(students[i].PassOrFail(i+2)) {
				System.out.println("Student " + i + ": Passed");
			}
			else {
				System.out.println("Student " + i + ": Failed");
			}
		}		
	}
}
