import javax.swing.JOptionPane;
import java.util.Random;
public class Lottery {
public static void main(String[] args) {

	String number= "Lucky Numbers:  ";
	 Random random = new Random();
	
	for (int i = 0; i <5; i++) {
		int num= 0;
	  num = random.nextInt(1000);
	number = number + num + "  ";
}
	JOptionPane.showMessageDialog(null,  number,"Lottery Ticket", 1 );
	
}
}