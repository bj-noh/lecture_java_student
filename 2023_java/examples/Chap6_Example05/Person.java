package Chap6_Example05;

public class Person {
    private String name;
    private Phone[] phones;

    public Person(String name, Phone[] phones) {
        this.name = name;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public Phone[] getPhones() {
        return phones;
    }

}
