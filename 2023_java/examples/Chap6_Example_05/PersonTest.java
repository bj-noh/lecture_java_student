package Chap6_Example_05;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Phone[] phones = new Phone[2];
        phones[0] = new Phone("iPhone 13", "Apple");
        phones[1] = new Phone("Galaxy S21", "Samsung");

        Person person = new Person("Alice", phones);

        System.out.println(person.getName() + "'s phones:");
        for (Phone phone : person.getPhones()) {
            System.out.println(phone.getModel() + " by " + phone.getBrand());
        }

	}

}
