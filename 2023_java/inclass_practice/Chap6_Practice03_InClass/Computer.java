package Chap6_Practice03_InClass;

public class Computer {
	private String CPU_model;
	private String RAM_model;
	private String MB_model;
	private int monitorNum;
	
	public Computer() {
		this.CPU_model = "N/A";
		this.RAM_model = "N/A";
		this.MB_model = "N/A"; 
		this.monitorNum = 1;
	}
	
	public Computer(String CPU_model, String RAM_model, String MB_model, int monitorNum) {
		this.CPU_model = CPU_model;
		// 나머지 파라미터 3개를 멤버 변수에 할당
	}
	
	public void showComInfo() {
		// 모든 멤버 변수의 값을 출력
		System.out.println("CPU model: " + this.CPU_model);
	}
	
	// getter(), setter() 만들기
	// 예시
	public String getCPUModel() { return this.CPU_model; }
	public void setCPUModel(String CPU_Model) { this.CPU_model = CPU_model; }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
