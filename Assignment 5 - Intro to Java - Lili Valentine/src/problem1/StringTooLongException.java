package problem1;

public class StringTooLongException extends IndexOutOfBoundsException {
	/**
	 * Catches exception created by excess String length
	 */
	private static final long serialVersionUID = -6272884895877789989L;
	
	String error;
	
	StringTooLongException(String er) {
		error = er;
	}
	
	void printError() {
		System.err.println(error);
	}
}
