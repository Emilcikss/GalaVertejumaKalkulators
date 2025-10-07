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
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Opcijas, izvele);
		
		switch (izvele) {
		case 0:
			Metodes.Audzēkņuskaitaievade();
			break;
			
		case 1:
			Metodes.Audzēkņuskaitaievade();
			break;
			

		}
		
	}
}
