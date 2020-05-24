package discoDuroDeroer;

import java.util.Scanner;

/**
 * Clase implementa area de figuras geométricas.
 * @author JJauregui
 *
 */
public class Ejercicio03 {
	int lado;
	int base;
	int altura;
	int radio;
	Scanner scan = new Scanner(System.in);
	
	public void Menu() {
		byte opcion;
		
		System.out.println("Seleccionar Figura Geométrica");
		System.out.println("1. Cuadrado");
		System.out.println("2. Triángulo");
		System.out.println("3. Círcuclo");
		System.out.print("Opcion :");
		opcion = scan.nextByte();
		
		CalcularArea(opcion);
		scan.close();
	}
	
	public void CalcularArea(byte opcion) {
		double result;
		
		switch(opcion) {
		case 1:
			System.out.print("\nIngresar Lado :");
			lado = scan.nextInt();
			result = Math.pow(lado, 2);
			System.out.println("Area Cuadrado :" + result);
			break;
		case 2:
			System.out.print("\nIngresar Base :");
			base = scan.nextInt();
			System.out.print("\nIngresar Altura :");
			altura = scan.nextInt();
			result = (base * altura)/2;
			System.out.println("Area Triángulo :" + result);
			break;
		case 3:
			System.out.print("\nIngresar Radio :");
			radio = scan.nextInt();
			result = Math.PI * Math.pow(radio, 2);
			System.out.println("Area Círculo :" + result);
			break;
		default:
			break;
		}
	}
}

