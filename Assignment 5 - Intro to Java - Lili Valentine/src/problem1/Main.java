package problem1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws StringTooLongException {
		String userEntry = "";
		String finalEntry = "";
		final int MAX = 20;
		
		Scanner input = new Scanner(System.in);
		
		while (!userEntry.equalsIgnoreCase("DONE")){
			System.out.println("Enter a word. When finished, enter 'DONE'.");
			
			try {
				userEntry = input.nextLine();
				if(userEntry.length() > MAX)
					throw new StringTooLongException("Max character length is: " + MAX);
			}catch(StringTooLongException problem) {
				problem.printError();
				userEntry = input.nextLine();
			}
			
			if(!userEntry.equalsIgnoreCase("DONE")) {
				finalEntry += userEntry + " ";
			}
		}
		
		System.out.println(finalEntry);
	}

}
