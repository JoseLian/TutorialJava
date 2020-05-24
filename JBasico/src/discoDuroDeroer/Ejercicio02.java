package discoDuroDeroer;

import java.util.Scanner;

/**
 * Clase compara dos numero (mayo, menos, igual).
 * @author JJauregui
 *
 */
public class Ejercicio02 {
	int Numero1 = 123;
	int Numero2 = 25;
	
	public void IngresarDatos() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingresar Numero1: ");
		Numero1 = scan.nextInt();
		System.out.print("Ingresar Numero2: ");
		Numero2 = scan.nextInt();
		scan.close();
	}
	
	public void Comparar() {
		IngresarDatos();
		
		if(Numero1 > Numero2) {
			System.out.println(Numero1 + " > " + Numero2 + "\tmayor!");
		}
		
		if(Numero1 < Numero2) {
			System.out.println(Numero1 + " < " + Numero2 + "\tmenos!");
		}
		
		if(Numero1 == Numero2) {
			System.out.println(Numero1 + " = " + Numero2 + "\tigual!");
		}
	}
}
