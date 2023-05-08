package Chap7_Example04;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void work() {
        System.out.println("The manager manages the department.");
    }
}