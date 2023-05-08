package Chap6_Example02_b;

public class Customer {
	public String name;
    public String address;
    public String email;
    public int age;
    public String grade;
    public int bonusPoints;

    public Customer(String name, String address, String email, int age, String grade, int bonusPoints) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
        this.grade = grade;
        this.bonusPoints = bonusPoints;
    }
    
    public Customer(String name, String address, String email, int age) {
        this(name, address, email, age, "SILVER", 0);
    }

    public Customer(String name, String address, String email, int age, String grade) {
        this(name, address, email, age, grade, 0);
    }

    public Customer() {
    	this.name = "Anonymous";
    	this.address = "No address";
    	this.email = "No email";
    	this.age = 0;
    	this.grade = "NORMAL";
    	this.bonusPoints = 0;
    }

    public double getDiscountRatio() {
        if (grade.equals("VIP")) {
            return 0.1;
        } else if (grade.equals("GOLD")) {
            return 0.05;
        } else if (grade.equals("SILVER")) {
            return 0.02;
        } else {
            return 0.0;
        }
    }

    public void showCustomerInfo() {
        System.out.println("Name: " + name + "\nAddress: " + address + "\nEmail: " + email + "\nAge: " + age
            + "\nGrade: " + grade + "\nBonus Points: " + bonusPoints);
        System.out.println();
    }

}
