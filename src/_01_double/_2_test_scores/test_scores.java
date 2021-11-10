package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {

	public static void main(String[] args) {
		
		String answerString = JOptionPane.showInputDialog("What score did you get on your test?");
		double answer = Double.parseDouble(answerString);
		if (answer > 80) {
			JOptionPane.showMessageDialog(null, "Good Job!");
		} else if (answer < 80) {
			JOptionPane.showMessageDialog(null, "You need to work a little more.");
		}
		System.out.println(answer);	
		

	}

}
