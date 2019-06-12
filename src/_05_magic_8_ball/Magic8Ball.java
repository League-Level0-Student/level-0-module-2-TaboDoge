//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	
		
	
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int r = 0;
	int e=3;
	r = new Random(e).nextInt(4);
	// 3. Print out this variable
//JOptionPane.showMessageDialog(null, r);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("What?");
	// 5. If the random number is 0
if (r == (0)){
	JOptionPane.showMessageDialog(null, "Yes");
}

	// -- tell the user "Yes"

	// 6. If the random number is 1
else if (r == (1)) {
	// -- tell the user "No"
	JOptionPane.showMessageDialog(null, "No");
}
	// 7. If the random number is 2
else if (r == (2)) {
    JOptionPane.showMessageDialog(null, "Maybe you should ask Google becuase they are smart and made my smartphone, the Google Pixel 2 XL and it is good like the awnser you may be given if you ask Google.");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

	}
}

