package final_exam_11_14;

public class Cat extends Animal {
	private String catColor;
	
	public Cat() {
		super("Kitti", 3);
		catColor = "Black";
		System.out.println("Cat() constructor");
	}
	
	public Cat(String catColor) {
		this.catColor = catColor;
		System.out.println("Cat(String) constructor");
	}
	
	public String getColor() { return catColor; }
	public void setColor(String catColor) { this.catColor = catColor; }

	public void sleep() {
		System.out.println("Cat can sleep");
	}
	
	public void showInfo() {
		System.out.println("Cat info: " + getName() + ", " + getAge() + ", " + catColor);
	}
	

}
