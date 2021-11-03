package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {

	public static void main(String[] args) {
		
		String answerString = JOptionPane.showInputDialog("What score did you get on your test?");
		int answer = Integer.parseInt(answerString);
		double answer;
		Math.round(answer);
		
		System.out.println(answer);	
		

	}

}
