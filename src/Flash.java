import javax.swing.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Arrays.*;
public class Flash {

	public static void main(String[] args) {
		int num_definitions, n, t, rand;
		String guess, number;
		String[] words, definitions;
		final String Sentinel;
		
		guess = number = null;
		Sentinel = "quit";
		num_definitions = n = rand = 0;
		t = 1;
		
		number = JOptionPane.showInputDialog("How many words do you have?");
		num_definitions = Integer.parseInt(number);
		
		words = new String[num_definitions + 1];
		definitions = new String[num_definitions];
				
		words[n] = JOptionPane.showInputDialog("Please enter word " + t + " or type \"quit\" to finish.");
		while (!words[n].equals(Sentinel)) {
			definitions[n] = JOptionPane.showInputDialog("Please enter the definition for word " + t + ".");
			n++;
			t++;
			words[n] = JOptionPane.showInputDialog("Please enter word " + t + " or type \"quit\" to finish.");
		}
	
		guess = JOptionPane.showInputDialog("Please enter the word for \"" + definitions[rand] +"\".");
		while (!guess.equals(words[rand])) {
			guess = JOptionPane.showInputDialog("Incorrect. Please try again or type \"quit\". \n Definition: " + definitions[rand] + " .");
			if (guess.equals(Sentinel)) {
				break;
			}
		}
		while (guess.equals(words[rand])) {
			JOptionPane.showMessageDialog(null, "Correct!");
			rand = (int) (Math.random() * 100);
			while (rand >= num_definitions) {
				rand = (int) (Math.random() * 100);
			}
			guess = JOptionPane.showInputDialog("Please enter the word for \"" + definitions[rand] + "\" or type \"quit\" to exit.");
			if (guess.equals(Sentinel)) {
				break;
			}
			while (!guess.equals(words[rand])) {
				guess = JOptionPane.showInputDialog("Incorrect. Please try again or type \"quit\". \n Definition: " + definitions[rand] + " .");
				if (guess.equals(Sentinel)) {
					break;
				}
			}	
		}
		JOptionPane.showMessageDialog(null, "Good luck studying!");
		
	}
}

