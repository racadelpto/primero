package ejerciciosFunciones;

import java.util.Scanner;

public class ej7xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podr�a simplemente devolver el valor
		 * del sumatorio que devuelve la funci�n
		 */
		
		//Declaramos variable y Scanner
		int num;
		Scanner teclado = new Scanner(System.in);
		
		//Leemos un n�mero por teclado
		System.out.println("Introduce un entero positivo: ");
		num = teclado.nextInt();
		
		//Expresamos por pantalla el resultado de la funci�n con el dato introducido
		System.out.println("\nEl sumatorio del n�mero introducido es: " + sumatorioRecursivo(num));
		
		//Cerramos el Scanner
		teclado.close();
	}

	/**
	 * La funci�n va sumando de manera recursiva el sumatorio del n�mero introducido
	 * 
	 * @param num
	 * @return el n�mero introducido m�s la funci�n rest�ndole 1 al n�mero de su interior, terminar� devolviendo 1 para que se puedan realizar todos los c�lculos
	 */
	public static int sumatorioRecursivo(int num) {
		//Si num es igual a 1
		if (num == 1) {
			//Devolvemos 1
			return 1;
		} 
		//Si no
		else {
			//Devolvemos el n�mero introducido m�s la funci�n sumatorioRecursivo rest�ndole 1 al n�mero de su interior
			return num + sumatorioRecursivo(num - 1);
		}
	}
}
