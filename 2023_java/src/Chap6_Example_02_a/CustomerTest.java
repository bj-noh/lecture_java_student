package Chap6_Example_02_a;

public class CustomerTest {
	
	public static void main(String[] args) {
        Customer customer1 = new Customer("John Smith", "123 Main Street", "john.smith@example.com", 30, "B", 100);
        System.out.println("Original Customer Information:");
        customer1.showCustomerInfo();        
    }
}
