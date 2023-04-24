package Chap6_Example_02_c;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer("BJ", "Sejong-city", "bj.noh@example.com", 30, "VIP");
		Customer customer2 = new Customer("DJ", "Osan-city", "dj.kim@example.com", 22);
		
		System.out.println("Object customer1 information");
		customer1.showCustomerInfo();
		
		customer1.setName("BJ, Noh");
		customer1.setEmail("bj.noh1234@example.com");
		
		// customer1.setAge(31);
		int curAge = customer1.getAge();
		customer1.setAge(curAge++);
		
		customer1.setGrade("SILVER");
		
		System.out.println("After update");
		System.out.println("Object customer1 information");
		customer1.showCustomerInfo();
	}
}
