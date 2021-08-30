package exceptionlabs;

public class IllegalArgumentException extends Exception {
	
	String message;

	public IllegalArgumentException(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage()
	{
		
		return message;
		
	}

}
