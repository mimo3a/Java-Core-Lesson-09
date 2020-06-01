package ua.lviv.lgs.calculator;

public class Methods {
	private double first;
	private double second;
	
	public Methods(double first, double second) throws MyException {
		this. first = first;
		this.second = second;
		if(first < 0 & second < 0) {
			String message = " IllegalArgumentException";
			throw new MyException(message);						
		} else if ((first == 0 & second != 0) || (first !=0 & second == 0)) {
			String message = " ArithmeticException";
			throw new MyException(message);				
		} else if (first == 0 & second == 0) {
			String message = "IllegalAccessException";
			throw new MyException(message);	
		}
		else if (first > 0 & second > 0){
			String message = "MyException";
			System.out.println(message);
			throw new MyException(message);	
		}
	}
	
	public void add() {

		System.out.println(first + " + " + second + " = " + (first + second));	
	}
	
	public void minus() {
		
		System.out.println(first + " - " + second + " = " + (first - second));
	}
	
	public void multy () {
		
		System.out.println(first + " * " + second + " = " + (first * second));
		
	}
	
	public void divid() {
		
		System.out.println(first + " / " + second + " = " + (first / second));
		
	}
		

}
