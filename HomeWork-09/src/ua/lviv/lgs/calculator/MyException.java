package ua.lviv.lgs.calculator;

public class MyException extends Exception{
	String message;
	
	public MyException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
