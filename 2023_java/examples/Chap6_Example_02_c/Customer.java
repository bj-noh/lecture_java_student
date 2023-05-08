package Chap6_Example_02_c;

public class Customer {
	private String name;
	private String address;
	private String email;
    private int age;
    private String grade;
    private int bonusPoints;

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
    
    public String getName() { return this.name; }
    public String getAddress() { return this.address; }
    public String getEmail() { return this.email; }
    public int getAge() { return this.age; }
    public String getGrade() { return this.grade; }
    public int getBonusPoints() { return this.bonusPoints; }
    
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setEmail(String email) { this.email = email; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(String grade) { this.grade = grade; }
    public void setBonusPoints(int bonusPoints) { this.bonusPoints = bonusPoints; }    

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
