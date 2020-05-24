package discoDuroDeroer;

/**
 * Clase implementa operaciones básicas.
 * @author JJauregui
 *
 */
public class Ejercicio01 {
	int Numero1 = 234;
	int Numero2 = 11;
	
	public void Operacion() {
		int Suma = Numero1 + Numero2;
		int Resta = Numero1 - Numero2;
		int Producto = Numero1 * Numero2;
		float Division = (float)Numero1 / Numero2;
		float Resto = Numero1 % Numero2;
		
		System.out.println("Suma :" + Suma);
		System.out.println("Resta :" + Resta);
		System.out.println("Producto :" + Producto);
		System.out.println("Division :" + Division);
		System.out.println("Resto :" + Resto);
	}
}
