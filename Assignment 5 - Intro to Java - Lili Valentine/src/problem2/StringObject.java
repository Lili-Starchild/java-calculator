package problem2;

/*******************************************************************************
 * Creates a class for string objects to make their use in                     *
 *                   actionlisteners easier                                    * 
 *******************************************************************************/

public class StringObject {
	//Creates a String variable
	private String text = "";
	
	//Sets String
	public void setText(String t) {
		text = t;
	}
	
	//Returns String
	public String getText() {
		return text;
	}
	
	//Resets the value of String
	public void reset() {
		text = "";
	}
}
