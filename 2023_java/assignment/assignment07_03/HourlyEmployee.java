package assignment07_03;

public class HourlyEmployee extends Employee {
	/*
	 * HourlyEmployee 클래스는 Employee 추상 클래스를 상속받으며,
	 * 멤버 변수와 메소드는 다음과 같이 구성된다.
	 * 
	 * - hourlyRate: double
	 * 		HourlyEmployee의 시급
	 * 
	 * - hoursWorked: double
	 * 		HourlyEmployee의 근무 시간 
	 * 
	 * + HourlyEmployee(String firstName, String lastName, int employeeId, double hourlyRate, double hoursWorked, String department)
	 * 		입력받은 각 파라미터를 상위 클래스와 현재클래스의 각 변수에 할당하는 생성자 
	 *  
	 * + getSalary(): double
	 * 		HourlyEmployee의 월 급여액을 반환하는 메소드 (시급과 근무 시간의 곱)
	 * 
	 * + setHourlyRate(double hourlyRate): void
	 * 		HourlyEmployee의 시급을 설정(변경)하는 메소드
	 * 
	 * + getHourlyRate(): void
	 * 		HourlyEmployee의 시급을 반환하는 메소드
	 * 
	 *  + setHoursWorked(double hourlyRate): void
	 * 		HourlyEmployee의 근무 시간을 설정(변경)하는 메소드
	 * 
	 * + getHoursWorked(): double
	 * 		HourlyEmployee의 근무 시간을 반환하는 메소드
	 */
}