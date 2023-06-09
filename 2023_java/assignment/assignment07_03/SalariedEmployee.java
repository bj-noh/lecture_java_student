package assignment07_03;

public class SalariedEmployee extends Employee {
	/*
	 * SalariedEmployee 클래스는 Employee 추상 클래스를 상속받으며,
	 * 멤버 변수와 메소드는 다음과 같이 구성된다.
	 * 
	 * - monthlySalary: double
	 * 		SalariedEmployee의 월급
	 *  
	 * + SalariedEmployee(String firstName, String lastName, int employeeId, double yearlySalary, String department)
	 * 		입력받은 각 파라미터를 상위 클래스와 현재 클래스의 각 변수에 할당하는 생성자 
	 *      참고) 연봉을 파라미터로 입력받고, 월급으로 저장함 (월급 = 연봉 나누기 12개월)
	 *  
	 * + getSalary(): double
	 * 		SalariedEmployee의 연봉을 반환하는 메소드 (월급 곱하기 12개월) 
	 * 
	 * + setMonthlySalary(double yearlySalary): void
	 * 		SalariedEmployee의 연봉을 입력받아 월급을 설정(변경)하는 메소드 (연봉 나누기 12개월)
	 * 
	 * + getMonthlySalary(): void
	 * 		SalariedEmployee의 월급을 반환하는 메소드
	 * 
	 */
}