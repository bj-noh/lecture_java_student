package Chap6_Practice02_InClass;

public class StudentTest {
    public static void main(String[] args) {
    	/*
    	 *  결과: 
    	 *  Freshman Information:
			Name: John Doe
			Age: 18
			Major: Computer Science
			Average Grade: 81.66666666666667
			
			Freshman Information:
			Name: Jane Smith
			Age: 19
			Major: Mathematics
			Average Grade: 88.33333333333333
			Student ID: 1234
			
			Freshman Information:
			Name: Alex Johnson
			Age: 20
			Major: Physics
			Average Grade: 80.0
			Student ID: 5678
			Club: Chess Club
			
			Freshman Information:
			Name: Emily Davis
			Age: 21
			Major: Biology
			Average Grade: 91.66666666666667
			Student ID: 9012
			Club: Debate Club
			Graduation Year: 2023
    	 */
        // Creating objects of each class
        Freshman freshman = new Freshman("John Doe", 18, "Computer Science", new int[]{80, 75, 90});
        Sophomore sophomore = new Sophomore("Jane Smith", 19, "Mathematics", new int[]{85, 92, 88}, 1234);
        Junior junior = new Junior("Alex Johnson", 20, "Physics", new int[]{78, 80, 82}, 5678, "Chess Club");
        Senior senior = new Senior("Emily Davis", 21, "Biology", new int[]{92, 88, 95}, 9012, "Debate Club", "2023");

        // Creating an array of students
        Student[] students = {freshman, sophomore, junior, senior};

        // Displaying student information and average grades
        for (Student student : students) {
            if (student instanceof Freshman) {
                System.out.println("Freshman Information:");
            } else if (student instanceof Sophomore) {
            	System.out.println("Sophomore Information:");
            } else if (student instanceof Junior) {
            	System.out.println("Junior Information:");
            } else if (student instanceof Senior) {
            	System.out.println("Senior Information:");
            }
            
            student.displayInfo();
            System.out.println();
        }
    }
}