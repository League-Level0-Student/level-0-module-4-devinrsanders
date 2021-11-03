package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {
		String answerString = JOptionPane.showInputDialog("How many nickels do you have?");
		int answer = Integer.parseInt(answerString);
		String answer2String = JOptionPane.showInputDialog("How many dimes do you have?");
		int answer2 = Integer.parseInt(answer2String);
		String answer3String = JOptionPane.showInputDialog("How many quarters do you have?");
		int answer3 = Integer.parseInt(answer3String);
		double sum = answer * 0.05 + answer2 * 0.10 + answer3 * 0.25;
		
	
		
		System.out.println("You have $" + sum + "0");

		// Ask the user how many nickels they have

		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 

		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

