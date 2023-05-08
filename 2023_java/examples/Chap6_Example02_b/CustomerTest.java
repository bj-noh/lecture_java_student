package Chap6_Example02_b;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1 = new Customer();
		
		// 생성자
		Customer customer2 = new Customer("BJ", "Sejong-city", "bj.noh@example.com", 30, "VIP");
		Customer customer3 = new Customer("DJ", "Osan-city", "dj.kim@example.com", 22);
		
		System.out.println("Object customer1 information");
		customer1.showCustomerInfo();

		System.out.println("Object customer2 information");
		customer2.showCustomerInfo();
		
		System.out.println("Object customer3 information");
		customer3.showCustomerInfo();

	}

}
