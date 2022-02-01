package ejerciciosFunciones;

import java.util.Scanner;

public class ej8xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podría simplemente devolver el valor
		 * del número invertido en la función
		 */
		
		//Declaramos la variable y el Scanner
		int num;
		Scanner teclado = new Scanner(System.in);
		
		//Leemos un entero por teclado
		System.out.println("Introduce un entero: ");
		num = teclado.nextInt();
		
		//Expresamos por pantalla el valor del número introducido a la inversa
		System.out.println("\nEl entero introducido a la inversa es: " + invertirEntero(num));
		
		//Cerramos el Scanner
		teclado.close();
	}

	/**
	 * La función invierte el orden de un entero introducido
	 * 
	 * @param num
	 * @return el número introducido a la inversa
	 */
	public static String invertirEntero(int num) {
		//Si num es menor de 10
		if (num < 10) {
			//Devolvemos num en String
			return String.valueOf(num);
		} 
		//Si no
		else {
			//Devolvemos el resto de num entre 10 (en String) y le sumamos la función invertirEntero dividiendo el número de su interior entre 10
			return String.valueOf(num%10) + invertirEntero(num / 10);
		}
	}
}
