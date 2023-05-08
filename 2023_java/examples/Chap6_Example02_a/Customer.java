package Chap6_Example02_a;

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
    
    public double getDiscountRatio() {
        if (grade.equals("A")) {
            return 0.1;
        } else if (grade.equals("B")) {
            return 0.05;
        } else if (grade.equals("C")) {
            return 0.02;
        } else {
            return 0.0;
        }
    }

    public void showCustomerInfo(String name) {
        System.out.println("Name: " + this.name + "\nAddress: " + address + "\nEmail: " + email + "\nAge: " + age
            + "\nGrade: " + grade + "\nBonus Points: " + bonusPoints);
    }
}