package ejerciciosFunciones;

import java.util.Scanner;

public class ej7xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podría simplemente devolver el valor
		 * del sumatorio que devuelve la función
		 */
		
		//Declaramos variable y Scanner
		int num;
		Scanner teclado = new Scanner(System.in);
		
		//Leemos un número por teclado
		System.out.println("Introduce un entero positivo: ");
		num = teclado.nextInt();
		
		//Expresamos por pantalla el resultado de la función con el dato introducido
		System.out.println("\nEl sumatorio del número introducido es: " + sumatorioRecursivo(num));
		
		//Cerramos el Scanner
		teclado.close();
	}

	/**
	 * La función va sumando de manera recursiva el sumatorio del número introducido
	 * 
	 * @param num
	 * @return el número introducido más la función restándole 1 al número de su interior, terminará devolviendo 1 para que se puedan realizar todos los cálculos
	 */
	public static int sumatorioRecursivo(int num) {
		//Si num es igual a 1
		if (num == 1) {
			//Devolvemos 1
			return 1;
		} 
		//Si no
		else {
			//Devolvemos el número introducido más la función sumatorioRecursivo restándole 1 al número de su interior
			return num + sumatorioRecursivo(num - 1);
		}
	}
}
