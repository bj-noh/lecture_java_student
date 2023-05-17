package Chap6_Practice03_InClass_answer;

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
		this.RAM_model = RAM_model;
		this.MB_model = MB_model;
		this.monitorNum = monitorNum;
	}
	
	public void showComInfo() {
		// 모든 멤버 변수의 값을 출력
		System.out.println("CPU model: " + this.CPU_model);
		System.out.println("RAM model: " + this.RAM_model);
		System.out.println("MB model: " + this.MB_model);
		System.out.println("Number of monitor: " + this.monitorNum);
	}
	
	// getter(), setter() 만들기
	// 예시
	public String getCPUModel() { return this.CPU_model; }
	public void setCPUModel(String CPU_Model) { this.CPU_model = CPU_model; }
	
	public String getRAMModel() { return this.RAM_model; }
	public void setRAMModel(String RAM_model) { this.RAM_model = RAM_model; }
	
	public String getMBModel() { return this.MB_model; }
	public void setMBModel(String MB_model) { this.MB_model = MB_model; }

	public int getMonitorNum() { return this.monitorNum; }
	public void setMonitorNum(int MonitorNum) { this.monitorNum = monitorNum; }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
