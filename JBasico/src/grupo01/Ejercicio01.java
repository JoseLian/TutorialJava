package grupo01;

/**
 * Clase define los tipo de datos en Java. 
 * @author JJauregui
 *
 */
public class Ejercicio01 {
//	Tipo Entero
	byte TipoByte = 127;
	short TipoShort = 230;
	int TipoInt = 2353;
	long TipoLong = 43985734L;
	char TipoChar = 'A';
	
//	Tipo Flotante
	float TipoFloat = 3500.50f;
	double TipoDouble = 5000.36;
	
//	Tipo Boolean
	boolean TipoBoolean = true;
	
	public void Mostrar() {
		System.out.print("TipoByte :" + TipoByte + "\t" + byte.class + "\n");
		System.out.print("TipoShort :" + TipoShort + "\t" + short.class + "\n");
		System.out.print("TipoInt :" + TipoInt + "\t" + int.class + "\n");
		System.out.print("TipoLong :" + TipoLong + "\t" + long.class + "\n");
		System.out.print("TipoChar :" + TipoChar + "\t" + char.class + "\n");
		System.out.print("TipoFloat :" + TipoFloat + "\t" + float.class + "\n");
		System.out.print("TipoDouble :" + TipoDouble + "\t" + double.class + "\n");
	}
}
