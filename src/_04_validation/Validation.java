//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for(int i = 0; i <10; i++) {
		Random rm = new Random();
		
		int r = rm.nextInt(6)+1;
		
		System.out.println(r);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (r == 1) {
			JOptionPane.showInputDialog("When does your summer start/has started?");
		} else if (r == 2) {
			JOptionPane.showInputDialog("Are you going anywhere over the summer?");
		} else if (r == 3) {
			JOptionPane.showInputDialog("What are you most exited about?");
		} else if (r == 4) {
			JOptionPane.showInputDialog("What do you want to do over the summer?");
		} else if (r == 5) {
			JOptionPane.showInputDialog("Where would you want to go over the summer?");
		} else if (r==6) {
			JOptionPane.showInputDialog("Where is your favorite place to go?");
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
		}
	}
}
