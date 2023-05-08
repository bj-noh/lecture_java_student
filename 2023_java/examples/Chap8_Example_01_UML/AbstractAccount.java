package Chap8_Example_01_UML;

public abstract class AbstractAccount {

	private int accountNumber;
	private double balance;
	private String owner;	
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);	
	public abstract double getBalance();
	
}
