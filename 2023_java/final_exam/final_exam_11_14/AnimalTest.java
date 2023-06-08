package final_exam_11_14;

// 11 상속 시 생성자 호출/실행 순서 + super()
// 12 getter, setter, 상속의 기본 특징
// 13 메소드 오버라이딩
// 14 casting

public class AnimalTest {
	public static void main(String[] args) {
		// Num 11 O
		Animal Yolo = new Animal("Yolo", 5);
		Yolo.eat();
		Yolo.speak();
		System.out.println();
		
		// Num 12 X
		Animal Happy = new Animal("Happy", 1);
		Happy.setAge(Yolo.getAge());
		Happy.showInfo();
		System.out.println();
				
		// Num 13 X
		Cat cat = new Cat("Red");
		cat.speak();
		cat.sleep();		
		System.out.println();
		
		// Num 14 X
		Animal Kitti = new Cat();
		Kitti.showInfo();
	}
}
