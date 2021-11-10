package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		String weekend = JOptionPane.showInputDialog("What day of the week is it?");
		
		if (weekend.equals("monday")) {
			JOptionPane.showInputDialog("Get ready for school!");
		} else if (weekend.equals("tuesday")) {
			JOptionPane.showInputDialog("Get ready for school");
		} else if (weekend.equals("wednesday")) {
			JOptionPane.showInputDialog("Get ready for school!");
		} else if (weekend.equals("thursday")) {
			JOptionPane.showInputDialog("Get ready for school!");
		} else if (weekend.equals("friday")) {
			JOptionPane.showInputDialog("Get ready for school!");
		} else if (weekend.equals("saturday")) {
			JOptionPane.showInputDialog("You can sleep in.");
		} else if (weekend.equals("sunday")) {
			JOptionPane.showInputDialog("You can sleep in.");
		}
	
		
	
		// Write code to ask the user what day it is.
        
		// Set the boolean isWeekend based on the value they enter
		
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		String examString = JOptionPane.showInputDialog("What did you score on your exam?");
        String exam = Integer.parseInt(examString);
		if (exam > 70) {
			JOptionPane.showMessageDialog(null, "You have passed");
		} else if (exam < 70) {
			JOptionPane.showMessageDialog(null, "Better luck next time.");
		}
		
		// Write code to ask the user what percentage they scored in their last exam

		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String redString = JOptionPane.showInputDialog("What color would you like to draw with?");
		
		boolean isSquare;
		String squareString = JOptionPane.showInputDialog("What shape do you want to draw?");
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}	
}
