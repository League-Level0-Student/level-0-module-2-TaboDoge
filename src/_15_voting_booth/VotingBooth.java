package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		String age;
		age = JOptionPane.showInputDialog("What is your age?");
		int num = Integer.parseInt(age);
		if (num > 18) {
			JOptionPane.showMessageDialog(null, "You can vote");
		}
		else {
			JOptionPane.showMessageDialog(null, "You need to be 18 years or older to vote");
		}
	}
}
