package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {


public static void main(String[] args) {
	String r;
	r = JOptionPane.showInputDialog( "What is your height (in inches)?");
	
	int num = Integer.parseInt(r);
	 if (num > 48) {
	JOptionPane.showMessageDialog(null, "You can ride");
	}
	 else {
		JOptionPane.showMessageDialog(null, "You aren't tall enough"); 
	 }
	 }
	}
	
