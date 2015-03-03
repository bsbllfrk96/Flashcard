import javax.swing.*;

import java.util.Arrays.*;
public class Flash {

	public static void main(String[] args) {
		int num_definitions, n, t;
		String[] words, definitions;
		
		num_definitions = Integer.parseInt(((JOptionPane.showInputDialog("How many words do you have?"))));
		words = new String[num_definitions + 1];
		definitions = new String[num_definitions];
		n = 0;
		t = 1;
		
		words[n] = JOptionPane.showInputDialog("Please enter word " + t + " or type quit to finish.");
		while (!words[n].equals("quit")) {
			definitions[n] = JOptionPane.showInputDialog("Please enter the definition for word" + t + ".");
			n++;
			t++;
			words[n] = JOptionPane.showInputDialog("Please enter word " + t + " or type quit to finish.");
		}
	
		if (t == n){
		
		}
		
	}
}

