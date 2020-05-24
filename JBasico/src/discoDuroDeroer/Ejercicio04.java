package discoDuroDeroer;

/**
 * Clase muestra los 100 primeros números naturales.
 * @author JJauregui
 *
 */
public class Ejercicio04 {
	final int contador = 100;
	
	public void MostrarSerie()
	{
		for(int i = 1; i <= contador; i++) {
			String format = null;
			
			if(i % 5 == 0) {
				format = "\n";
			}
			else {
				format = "\t";
			}
			
			System.out.print(i + format);
		}
	}
}
