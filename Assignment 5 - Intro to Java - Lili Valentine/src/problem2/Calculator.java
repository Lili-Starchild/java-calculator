package problem2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/****************************************************************************
 * This class mainly deals with setting up the interface of the             *
 * 		calculator. It also creates all the action listners for             *
 * 		the buttons and input fields.                                       *
 * If desired, multiple calculators could be implented at once.             *
 ****************************************************************************/

public class Calculator {
	//This is the main frame which will hold all the panels created later
	JFrame cal = new JFrame("Calculator");
	
	//This text field was declared globally for use with the actionlisteners
	//It is the main field of text entry for the calculator
	JTextField text = new JTextField(24);
	
	//This method sets everything up and runs it by invoking other methods
	void runCalculator() {
		//Set up main frame
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal.setLayout(new BorderLayout());
		
		//Create main panel
		JPanel primaryCal = new JPanel();
		primaryCal.setPreferredSize(new Dimension(350, 450));
		primaryCal.setBackground(Color.PINK);
		cal.getContentPane().add(primaryCal);
		cal.pack();
		
		//This method adds the buttons and text field
		makePanels();
		
		//This insures that all panels are visible after being created
		cal.setVisible(true);
		
	}

	public void makePanels() {
		//Makes a character counter to alter the insertion point in the text field
		Counter place = new Counter();
		//Makes a String object to hold JTextField input
		StringObject input = new StringObject();
		//Makes a math object, but math is not done here
		MathDoneHere math = new MathDoneHere();
		
		//Makes a panel to hold the input field
		JPanel inputField = new JPanel();
		inputField.setPreferredSize(new Dimension(250, 30));
		inputField.setBackground(Color.PINK);
		
		//Makes a clear button
		JButton clear = new JButton("Clear");
		
		//Prevents user typing in unwanted characters
		text.setEditable(false);
		
		//Adds the components to the panel
		inputField.add(text);
		inputField.add(clear);

		//Adds the input panels to the main frame
		cal.getContentPane().add(inputField, BorderLayout.NORTH);
		
		//Makes a panel to hold buttons
		JPanel numbers = new JPanel();
		numbers.setPreferredSize(new Dimension(250, 350));
		numbers.setBackground(Color.PINK);
		numbers.setLayout(new GridLayout(4, 4, 5, 10));
		
		//Makes buttons
		JButton zero = new JButton("0"); JButton modulus = new JButton("%");
		JButton one = new JButton("1"); JButton two = new JButton("2");
		JButton three = new JButton("3"); JButton four = new JButton("4");
		JButton five = new JButton("5"); JButton six = new JButton("6");
		JButton seven = new JButton("7"); JButton eight = new JButton("8");
		JButton nine = new JButton("9"); JButton add = new JButton("+");
		JButton subtract = new JButton("-"); JButton multiply = new JButton("*");
		JButton divide = new JButton("/"); JButton equals = new JButton("=");
		
		//Sets button colors
		Color purple = new Color(225,77,255);
		Color lightRed = new Color(255,33,92);
		zero.setBackground(purple); one.setBackground(purple);
		two.setBackground(purple); three.setBackground(purple);
		four.setBackground(purple); five.setBackground(purple);
		six.setBackground(purple); seven.setBackground(purple);
		eight.setBackground(purple); nine.setBackground(purple);
		add.setBackground(lightRed); subtract.setBackground(lightRed);
		multiply.setBackground(lightRed); divide.setBackground(lightRed);
		modulus.setBackground(lightRed); equals.setBackground(Color.YELLOW);
		
		//Sets button font sizes
		Font f = new Font("consolas", Font.PLAIN, 60);
		zero.setFont(f); one.setFont(f); two.setFont(f); three.setFont(f); four.setFont(f);
		five.setFont(f); six.setFont(f); seven.setFont(f); eight.setFont(f); nine.setFont(f);
		add.setFont(f); subtract.setFont(f); multiply.setFont(f); divide.setFont(f);
		modulus.setFont(f); equals.setFont(f);
		
		//Adds buttons to panel in order
		numbers.add(one); numbers.add(two); numbers.add(three); numbers.add(add);
		numbers.add(four); numbers.add(five); numbers.add(six); numbers.add(subtract);
		numbers.add(seven); numbers.add(eight); numbers.add(nine); numbers.add(multiply);
		numbers.add(equals); numbers.add(zero); numbers.add(modulus); numbers.add(divide); 
		
		//Creates actionListeners for each button
		zero.addActionListener(new ActionListener() {
			//When pressed adds number to text field
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				try {
					doc.insertString(place.getCount(), "0", null);
					place.increment();
				} catch (BadLocationException e1) {
					e1.printStackTrace();
					System.exit(1);
					}}});
		one.addActionListener(new ActionListener() {
			//When pressed adds number to text field
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				try {
					doc.insertString(place.getCount(), "1", null);
					place.increment();
				} catch (BadLocationException e1) {
					e1.printStackTrace();
					System.exit(1);
					}}});
		two.addActionListener(new ActionListener() {
			//When pressed adds number to text field
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				try {
					doc.insertString(place.getCount(), "2", null);
					place.increment();
				} catch (BadLocationException e1) {
					e1.printStackTrace();
					System.exit(1);
					}}});
		three.addActionListener(new ActionListener() {
			//When pressed adds number to text field
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				try {
					doc.insertString(place.getCount(), "3", null);
					place.increment();
				} catch (BadLocationException e1) {
					e1.printStackTrace();
					System.exit(1);
					}}});
		four.addActionListener(new ActionListener() {
			//When pressed adds number to text field
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				try {
					doc.insertString(place.getCount(), "4", null);
					place.increment();
				} catch (BadLocationException e1) {
					e1.printStackTrace();
					System.exit(1);
					}}});
		five.addActionListener(new ActionListener() {
			//When pressed adds number to text field
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				try {
					doc.insertString(place.getCount(), "5", null);
					place.increment();
				} catch (BadLocationException e1) {
					e1.printStackTrace();
					System.exit(1);
					}}});
		six.addActionListener(new ActionListener() {
			//When pressed adds number to text field
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				try {
					doc.insertString(place.getCount(), "6", null);
					place.increment();
				} catch (BadLocationException e1) {
					e1.printStackTrace();
					System.exit(1);
					}}});
		seven.addActionListener(new ActionListener() {
			//When pressed adds number to text field
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				try {
					doc.insertString(place.getCount(), "7", null);
					place.increment();
				} catch (BadLocationException e1) {
					e1.printStackTrace();
					System.exit(1);
					}}});
		eight.addActionListener(new ActionListener() {
			//When pressed adds number to text field
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				try {
					doc.insertString(place.getCount(), "8", null);
					place.increment();
				} catch (BadLocationException e1) {
					e1.printStackTrace();
					System.exit(1);
					}}});
		nine.addActionListener(new ActionListener() {
			//When pressed adds number to text field
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				try {
					doc.insertString(place.getCount(), "9", null);
					place.increment();
				} catch (BadLocationException e1) {
					e1.printStackTrace();
					System.exit(1);
					}}});
		add.addActionListener(new ActionListener() {
			//When pressed adds sign to text field
			//Only allows one sign per equation
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				if(text.getText().contains("+") || text.getText().contains("-") ||
						text.getText().contains("*") || text.getText().contains("/") ||
						text.getText().contains("%")) {
					System.err.println("Only one operation is allowed at a time.");
				}else {
					try {
						doc.insertString(place.getCount(), "+", null);
						place.increment();
					} catch (BadLocationException e1) {
						e1.printStackTrace();
						System.exit(1);
					}}}});
		subtract.addActionListener(new ActionListener() {
			//When pressed adds sign to text field
			//Only allows one sign per equation
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				if(text.getText().contains("+") || text.getText().contains("-") ||
						text.getText().contains("*") || text.getText().contains("/") ||
						text.getText().contains("%")) {
					System.err.println("Only one operation is allowed at a time.");
				}else {
					try {
						doc.insertString(place.getCount(), "-", null);
						place.increment();
					} catch (BadLocationException e1) {
						e1.printStackTrace();
						System.exit(1);
					}}}});
		multiply.addActionListener(new ActionListener() {
			//When pressed adds sign to text field
			//Only allows one sign per equation
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				if(text.getText().contains("+") || text.getText().contains("-") ||
						text.getText().contains("*") || text.getText().contains("/") ||
						text.getText().contains("%")) {
					System.err.println("Only one operation is allowed at a time.");
				}else {
					try {
						doc.insertString(place.getCount(), "*", null);
						place.increment();
					} catch (BadLocationException e1) {
						e1.printStackTrace();
						System.exit(1);
					}}}});
		divide.addActionListener(new ActionListener() {
			//When pressed adds sign to text field
			//Only allows one sign per equation
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				if(text.getText().contains("+") || text.getText().contains("-") ||
						text.getText().contains("*") || text.getText().contains("/") ||
						text.getText().contains("%")) {
					System.err.println("Only one operation is allowed at a time.");
				}else {
					try {
						doc.insertString(place.getCount(), "/", null);
						place.increment();
					} catch (BadLocationException e1) {
						e1.printStackTrace();
						System.exit(1);
					}}}});
		modulus.addActionListener(new ActionListener() {
			//When pressed adds sign to text field
			//Only allows one sign per equation
			public void actionPerformed(ActionEvent e) {
				Document doc = text.getDocument();
				if(text.getText().contains("+") || text.getText().contains("-") ||
						text.getText().contains("*") || text.getText().contains("/") ||
						text.getText().contains("%")) {
					System.err.println("Only one operation is allowed at a time.");
				}else {
					try {
						doc.insertString(place.getCount(), "%", null);
						place.increment();
					} catch (BadLocationException e1) {
						e1.printStackTrace();
						System.exit(1);
					}}}});
		equals.addActionListener(new ActionListener() {
			//When pressed, all input in the text field is sent to
			//	the math object's doMath method, which will
			//	determine what to do with the input
			//Objects are used to avoid conflicts with variables
			//Resets objects in case of conflict
			public void actionPerformed(ActionEvent e) {
				input.setText(text.getText());
				text.setText(math.doMath(input.getText()));
				input.reset();
				place.reset();
					}});
		clear.addActionListener(new ActionListener() {
			//When pressed, will clear the text field of any input
			//Also resets objects in case of conflict
			public void actionPerformed(ActionEvent e) {
				text.setText("");
				input.reset();
				place.reset();
					}});
		
		//Adds button panel to main Frame
		cal.getContentPane().add(numbers, BorderLayout.SOUTH);
	}
	
}
