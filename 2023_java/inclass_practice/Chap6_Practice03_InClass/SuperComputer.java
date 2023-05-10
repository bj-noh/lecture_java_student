package Chap6_Practice03_InClass;

public class SuperComputer extends Computer {
	private String GPU_model;
		
	public SuperComputer(String CPU_model, String RAM_model, String MB_model, int monitorNum, String GPU_model) {
		super(CPU_model, RAM_model, MB_model, monitorNum);
		this.GPU_model = GPU_model;
	}
	
	// GPU_model의 getter(), setter()
	
	// 현재 변수의 정보를 출력하는 함수 만들기
	

}
