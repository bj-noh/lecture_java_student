package assignment07_03;

import assignment07_03_answer.HourlyEmployee;
import assignment07_03_answer.SalariedEmployee;

public class EmployeeTest {
    public static void main(String[] args) {
    	/*
    	 * 본 프로그램은 Employee 추상 클래스로부터 상속받아 구현한 HourlyEmployee 클래스와 SalariedEmployee 클래스를 테스트하는 프로그램이다.
    	 * 아래 내용이 잘 동작할 수 있도록 Employee, HourlyEmployee, SalariedEmployee 클래스를 구현하고, 다음과 같은 결과를 출력하도록 main 메소드를 완성하여라.
    	 * 
    	 * 결과>
    	 * 
    	 *	Hourly Employee: John Doe, Employee ID: 1001, Department: IT, Hourly Rate: $15.0, Hours Worked: 40.0, Weekly Salary: $600.0
			Salaried Employee: Jane Smith, Employee ID: 1002, Department: HR, Monthly Salary: $5000.0, Yearly Salary: $60000.0
			=== After change John's hourly rate and hours worked into 18 and 50, respectively ===
			=== After change Jane's yearly salary into $ 65000 ===
			Hourly Employee after raise: John Doe, Employee ID: 1001, Department: IT, Hourly Rate: $18.0, Hours Worked: 50.0, Weekly Salary: $900.0
			Salaried Employee after raise: Jane Smith, Employee ID: 1002, Department: HR, Monthly Salary: $5416.666666666667, Yearly Salary: $65000.0
    	 */
    	
        HourlyEmployee hourlyEmployee = new HourlyEmployee("John", "Doe", 1001, 15.0, 40.0, "IT");
        SalariedEmployee salariedEmployee = new SalariedEmployee("Jane", "Smith", 1002, 60000.0, "HR");
        
        System.out.println("Hourly Employee: " + hourlyEmployee.getFullName() + ", Employee ID: " +
                hourlyEmployee.getEmployeeId() + ", Department: " + hourlyEmployee.getDepartment() +
                ", Hourly Rate: $" + hourlyEmployee.getHourlyRate() + ", Hours Worked: " +
                hourlyEmployee.getHoursWorked() + ", Weekly Salary: $" + hourlyEmployee.getSalary());

        System.out.println("Salaried Employee: " + salariedEmployee.getFullName() + ", Employee ID: " +
                salariedEmployee.getEmployeeId() + ", Department: " + salariedEmployee.getDepartment() +
                ", Monthly Salary: $" + salariedEmployee.getMonthlySalary() + ", Yearly Salary: $" +
                salariedEmployee.getSalary());
        
        System.out.println("=== After change John's hourly rate and hours worked into 18 and 50, respectively ===");
        hourlyEmployee.setHourlyRate(18.0);
        hourlyEmployee.setHoursWorked(50.0);
        
        System.out.println("=== After change Jane's yearly salary into $ 65000 ===");
        salariedEmployee.setMonthlySalary(65000.0);
        
        System.out.println("Hourly Employee after raise: " + hourlyEmployee.getFullName() + ", Employee ID: " +
                hourlyEmployee.getEmployeeId() + ", Department: " + hourlyEmployee.getDepartment() +
                ", Hourly Rate: $" + hourlyEmployee.getHourlyRate() + ", Hours Worked: " +
                hourlyEmployee.getHoursWorked() + ", Weekly Salary: $" + hourlyEmployee.getSalary());
        
        System.out.println("Salaried Employee after raise: " + salariedEmployee.getFullName() + ", Employee ID: " +
                salariedEmployee.getEmployeeId() + ", Department: " + salariedEmployee.getDepartment() +
                ", Monthly Salary: $" + salariedEmployee.getMonthlySalary() + ", Yearly Salary: $" +
                salariedEmployee.getSalary());
    }
}