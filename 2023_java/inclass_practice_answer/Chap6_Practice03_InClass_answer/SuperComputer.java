package Chap6_Practice03_InClass_answer;

public class SuperComputer extends Computer {
	private String GPU_model;
		
	public SuperComputer(String CPU_model, String RAM_model, String MB_model, int monitorNum, String GPU_model) {
		super(CPU_model, RAM_model, MB_model, monitorNum);
		this.GPU_model = GPU_model;
	}
	
	// GPU_model의 getter(), setter()
	public String getGPUModel() { return this.GPU_model; }
	public void setGPUModel(String GPU_Model) { this.GPU_model = GPU_model; }
	
	// 현재 변수의 정보를 출력하는 함수 만들기
	public void showComInfo2() {
		// 모든 멤버 변수의 값을 출력
		System.out.println("CPU model: " + getCPUModel());
		System.out.println("RAM model: " + getRAMModel());
		System.out.println("MB model: " + getMBModel());
		System.out.println("Number of monitor: " + getMonitorNum());
		System.out.println("GPU model: " + this.GPU_model);
	}
}
