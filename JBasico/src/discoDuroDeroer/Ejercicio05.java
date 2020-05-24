package discoDuroDeroer;

import javax.swing.JOptionPane;

/**
 * Clase que evalúa si el número es primo.
 * @author JJauregui
 *
 */
public class Ejercicio05 {
	int Numero;
	
	public void EsPrimo() {
		String input;
		boolean esPrimo = true;
		
		input = JOptionPane.showInputDialog(null, "Ingresar Número", "Es Primo?", JOptionPane.INFORMATION_MESSAGE);
		Numero = Integer.parseInt(input);
		
		for(int i = 2; i < Numero; i++) {
			if(Numero % i == 0) {
				esPrimo = false;
			}
		}
		
		JOptionPane.showConfirmDialog(null, Numero + ((esPrimo)? " es":" no es") + " primo.", "Resultado", JOptionPane.WARNING_MESSAGE);
		
	}
}
