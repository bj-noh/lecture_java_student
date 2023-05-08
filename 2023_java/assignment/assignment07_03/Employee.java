package assignment07_03;

public abstract class Employee {
	
	/*
	 * Employee 클래스는 추상 클래스이며,
	 * 멤버 변수와 메소드는 다음과 같이 구성된다.
	 * 
	 * - firstName: String
	 * 		직원의 first name
	 * 
	 * - lastName: String
	 * 		직원의 last name
	 * 
	 * - employeeId: int
	 * 		직원의 사번
	 * 
	 * - salary: double
	 * 		직원의 연봉
	 * 
	 * - department: String
	 * 		직원의 부서
	 * 
	 * + Employee(String firstName, String lastName, int employeeId, double salary, String department)
	 * 		입력받은 각 값을 멤버 변수에 할당하는 생성자 
	 *  
	 * + <<abstract>> getSalary(): double
	 * 		Employee의 월급을 반환하는 메소드
	 * 
	 * + getFullName(): String
	 * 		Employee의 풀 네임(first name + last name)을 반환하는 메소드
	 * 
	 * + setDepartment(double radius): void
	 * 		Employee의 부서를 설정(변경)하는 메소드
	 * 
	 * + getDepartment(): String
	 * 		Employee의 부서를 반환하는 메소드
	 * 
	 * + getEmployeeId(): int
	 * 		Employee의 사번을 반환하는 메소드 
	 * 
	 */
}