package assignment06_02_answer;

public class NewCalculator {
	private double firstNumber;
	private double secondNumber;
	private char operation;
	
	public NewCalculator(String input) {		
		inputParser(input);		
	}

	private void inputParser(String input) {
        String[] parts = input.split("[-+*/]");
        
        if (parts.length != 2) {
            return ;
        }
        
        try {
        	this.firstNumber = Double.parseDouble(parts[0]);
        	this.secondNumber = Double.parseDouble(parts[1]);
        } catch (NumberFormatException e) {
        	return ;
        }
        
        this.operation = input.charAt(parts[0].length());
    }	
	
	public double getFirstNumber() { return this.firstNumber; }
	public double getSecondNumber() { return this.secondNumber; }
	public char getOperation() { return this.operation; }
		
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

}
