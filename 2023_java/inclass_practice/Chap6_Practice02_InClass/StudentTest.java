package Chap6_Practice02_InClass;

public class StudentTest {
    public static void main(String[] args) {
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