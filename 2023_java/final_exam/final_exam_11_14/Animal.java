package final_exam_11_14;

public class Animal {
	private String name;
	private int age;
	
	public Animal() {
		this("Empty", 0);
		System.out.println("Animal() constructor");
	}
	
	public Animal(String name) {
		this(name, 0);
		System.out.println("Animal(String) constructor");
	}
	
	public Animal(String name, int age) {
		System.out.println("Animal(String, int) constructor");
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; } 
	public void setAge(int age) { this.age = age; } 
		
	public void speak() {
		System.out.println("Animal can speak");
	}
	
	public void eat() {
		System.out.println("Animal can eat");
	}

	public void showInfo() {
		System.out.println("Animal info: " + getName() + ", " + getAge());
	}
}
