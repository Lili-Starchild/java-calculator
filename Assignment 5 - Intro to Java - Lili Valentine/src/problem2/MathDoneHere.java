package problem2;

/**************************************************************************
 * This class handles all the math procedures done by the calculator.     *
 * All return values should be shown on the text field of the calculator  *
 **************************************************************************/

public class MathDoneHere {

	//These variables will be used to work the math
	private int number1 = 0;
	private int number2 = 0;
	
	//This String will help decide what function to use
	private String sign = "";
	
	public String doMath(String s) {
		//Holds final input
		double answer = 0.0;
		
		//Get ints and sign from the String input
		translate(s);
		
		//Use sign to find the function to use
		switch(sign) {
		case "+":
			answer = add();
			break;
		case "-":
			answer = subtract();
			break;
		case "*":
			answer = multiply();
			break;
		case "/":
			answer = divide();
			break;
		case "%":
			answer = modulus();
			break;
		default:
			answer = number1;
		}
			
		//Final answer
		return String.valueOf(answer);
	}
	
	private void translate(String t) {
		//resets values each call
		number1 = 0;
		number2 = 0;
		sign = "";
		
		//Values to hold strings of numbers from input once seperated
		String num1 = "";
		String num2 = "";
		
		//Identifies which sign case will use
		//Also finds the point we will seperate the string
		int i = 0;
		int index[] = new int[5];
		index[i] = t.indexOf("+");
		i++;
		index[i] = t.indexOf("-");
		i++;
		index[i] = t.indexOf("*");
		i++;
		index[i] = t.indexOf("/");
		i++;
		index[i] = t.indexOf("%");
		
		try {
			for(i = 0; index[i] == -1; i++) {
				;}//For loop shuffles through until index with sign is found
			
			//Holds sign for switch case
			sign += t.charAt(index[i]);
			
			//Consolidates all the numbers in front of the sign and
			// stores them in num1
			for(int j = 0; j < index[i]; j++)
				num1 += t.charAt(j);
			
			//Consolidates all the numbers after the sign and
			// stores them in num2, keeping them in the same 
			// position user intended to use them
			for(int j = t.length() - 1; j > index[i]; j--)
				num2 = t.charAt(j) + num2;
			
			try {
				//Transfers the strings into ints
				number1 = Integer.parseInt(num1);
				number2 = Integer.parseInt(num2);
			}catch(NumberFormatException e3) {
				try {
					//Here, program catches when user hits equals after answer
					// was returned, resulting in a float
					number1 = (int) Float.parseFloat(t);
					number2 = 0;
				}catch(NumberFormatException e4) {
					number1 = 0;
					number2 = 2;
					System.err.println("!! Innapropriate data entry !!");
				}
			}
		}catch(ArrayIndexOutOfBoundsException e1){
			try {
				//Catches an ArrayIndex Exception and retries the value
				//Occurs when user does not include a sign
				number1 = Integer.parseInt(t);
				number2 = 0;
			}catch(NumberFormatException e2) {
				number1 = (int) Float.parseFloat(t);
				number2 = 0;
			}
		}
		
		//resets the index
		for(i = 0; i < 5; i++)
			index[i] = 0;
	}
	
	private int add() { //Does the "add" feature
		int added = 0;
		
		added = number1 + number2;
		
		return added;
	}
	
	private int subtract() { //Does the "subtract" feature
		int subtracted = 0;
		
		subtracted = number1 - number2;
		
		return subtracted;
	}
	
	private int multiply() { //Does the "multiply" feature
		int multiplied = 0;
		
		multiplied = number1 * number2;
		
		return multiplied;
	}
	
	private double divide() { //Does the "divide" feature
		double divided = 0.0;
		
		divided = (double) number1 / number2;
		
		return divided;
	}
	
	private int modulus() { //Does the "modulus" feature
		int modulated = 0;
		
		modulated = number1 % number2;
		
		return modulated;
	}
}
