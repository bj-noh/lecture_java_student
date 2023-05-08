package Chap7_Example01;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal_1 = new Animal("Kitti1", 4);
		
		Cat cat_1 = new Cat("Kitti2", 3);		
		
		Dog dog_1 = new Dog("Merry", 2);
		
		System.out.println("=== Animal infomration ===");
		System.out.println("Animal name: " + animal_1.getName());
		System.out.println("Animal age: " + animal_1.getAge());
		animal_1.makeSound();
		
		System.out.println("=== Cat infomration ===");
		System.out.println("Cat name: " + cat_1.getName());
		System.out.println("Cat age: " + cat_1.getAge());
		cat_1.makeSound();

		System.out.println("=== Dog infomration ===");
		System.out.println("Dog name: " + dog_1.getName());
		System.out.println("Dog age" + dog_1.getAge());
		dog_1.makeSound();
	}
}
