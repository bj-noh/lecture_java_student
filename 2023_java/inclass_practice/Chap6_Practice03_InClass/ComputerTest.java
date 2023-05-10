package Chap6_Practice03_InClass;

public class ComputerTest {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		Computer com2 = new Computer("Intel", "32GB", "Xeon", 3);
	
		SuperComputer supercom1 = new SuperComputer("Intel", "32GB", "Xeon", 3, "RTX4090");
		
		// com1, com2 정보를 출력하세요
		// supercom1의 정보를 출력하세요
	}
}
