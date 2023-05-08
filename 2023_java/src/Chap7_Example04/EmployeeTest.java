package Chap7_Example04;

public class EmployeeTest {
	
	public static void main(String[] args) {
        Employee myEmployee = new Employee("John Smith", 50000.0);
        System.out.println("My employee's name is " + myEmployee.getName());
        System.out.println("My employee's salary is " + myEmployee.getSalary());

        Manager myManager = new Manager("Jane Doe", 75000.0, "Sales");
        System.out.println("My manager's name is " + myManager.getName());
        System.out.println("My manager's salary is " + myManager.getSalary());
        System.out.println("My manager's department is " + myManager.getDepartment());

        Developer myDeveloper = new Developer("Bob Johnson", 60000.0, "Java");
        System.out.println("My developer's name is " + myDeveloper.getName());
        System.out.println("My developer's salary is " + myDeveloper.getSalary());
        System.out.println("My developer's programming language is " + myDeveloper.getProgrammingLanguage());
    }

}
