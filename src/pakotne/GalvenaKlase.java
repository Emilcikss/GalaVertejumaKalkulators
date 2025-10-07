package pakotne;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GalvenaKlase {
	
	public static void main(String[] args) {
		
		String[] Opcijas = {"Ievadīt audzēkņus", "Ievadīt kritērijus", "Ievadīt kritēriju svarus",
				"Ievadīt vērtējumus", "Labot kritēriju", "Labot kritērija svaru", "Labot iegūto vērtējumu",
				"Aprēķināt gala vērtējumu", "Saglabāt rezultātus failā",  "Nolasīt rezultātus no faila" };
		
		int izvele;
		JOptionPane.showOptionDialog(null, "Izvēlejaties darbību", "Darbibas izvele",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, izvele, izvele[0]);
		
		switch (izvele) {
		case 0:
			JOptionPane.showMessageDialog(null, );
		case 1:
			JOptionPane.showMessageDialog(null, );
		case 2:
			JOptionPane.showMessageDialog(null, );
		case 3:
			JOptionPane.showMessageDialog(null, );
		case 4:
			JOptionPane.showMessageDialog(null, );
		case 5:
			JOptionPane.showMessageDialog(null, );
		case 6:
			JOptionPane.showMessageDialog(null, );
		case 7:
			JOptionPane.showMessageDialog(null, );
		case 8:
			JOptionPane.showMessageDialog(null, );
		case 9:
			JOptionPane.showMessageDialog(null, );
		case 10:
			JOptionPane.showMessageDialog(null, );
		}
		}
		
	}
