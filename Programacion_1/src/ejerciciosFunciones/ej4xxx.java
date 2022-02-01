package ejerciciosFunciones;

import java.util.Scanner;

public class ej4xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podría simplemente devolver el valor
		 * de la cantidad de veces que se encuentra el caracter introducido en la cadena introducida en la función 
		 */

		//Declaramos el String cadena, char caracter y el Scanner
		String cadena="";
		char caracter=' ';
		Scanner teclado = new Scanner(System.in);

		//Leemos por teclado la cadena y el caracter
		System.out.println("Introduce una palabra: ");
		cadena = teclado.next();
		System.out.println("\nIntroduce un carácter: ");
		caracter = teclado.next().charAt(0);

		//Comunicamos por pantalla la cantidad de veces que el caracter introducido se encuentra en la cadena introducida en la función cantidadVecesCaracter()
		System.out.println("\nEl carácter introducido (" + caracter + ") se encuentra un total de " + cantidadVecesCaracter(cadena,caracter) + " veces en la cadena introducida (" + cadena + ").");

		//Cerramos el Scanner
		teclado.close();
	}

	/**
	 * La función calcula la cantidad de veces que el char introducido se encuentra en la String introducida
	 * 
	 * @param cadena
	 * @param caracter
	 * @return un int con la cantidad de veces que el char introducido se encuentre en la String introducida
	 */
	public static int cantidadVecesCaracter(String cadena, char caracter) {

		//Creamos un int cantidad
		int cantidad=0;

		//Creamos un for: inicializamos int i a 0, mientras i sea menor que cadena.length, sumamos 1 a i
		for(int i=0; i<cadena.length(); i++) {
			//Si el caracter en la posición i de cadena es igual a caracter
			if(cadena.charAt(i)==caracter) {
				//Sumamos 1 a cantidad
				cantidad++;
			}
		}

		//Devolvemos cantidad
		return cantidad;
	}
}
