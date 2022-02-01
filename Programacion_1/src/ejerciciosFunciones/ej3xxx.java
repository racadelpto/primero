package ejerciciosFunciones;

import java.util.Scanner;

public class ej3xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podría simplemente devolver el valor
		 * (true o false) que devuelve la función cuando introducimos un array en ella
		 */

		//Se declara el int cantidadArray y el Scanner
		int cantidadArray=0;
		Scanner teclado = new Scanner(System.in);

		//Leemos por teclado una cantidad de números para el array
		System.out.println("Introduce la cantidad de números que quieres introducir en el array: ");
		cantidadArray = teclado.nextInt();

		//Declaramos y definimos el tamaño del array int arrayNumeros
		int[] arrayNumeros = new int[cantidadArray];

		//Usamos un for: inicializamos int i a 0, mientras i sea menor que la longitud de arrayNumeros, sumamos 1 a i
		for(int i=0; i<arrayNumeros.length; i++) {
			//Leemos por teclado un número para la posición i del arrayNumeros
			System.out.println("\nIntroduce un número para la posición " + i + " de tu array: ");
			arrayNumeros[i] = teclado.nextInt();
		}

		//Comunicamos por pantalla al usuario si los números de su array están ordenados de menor a mayor
		System.out.println("\n¿Están los números de tu array ordenados de menor a mayor?: ");

		//Si la función estaOrdenadoDeMenorAMayor(arrayNumeros) es igual a true
		if(estaOrdenadoDeMenorAMayor(arrayNumeros)==true) {
			//Comunicamos que si
			System.out.println("La respuesta es sí.");
		}
		//En cualquier otro caso quiere decir que la función estaOrdenadoDeMenorAMayor(arrayNumeros) es igual a false
		else {
			//Comunicamos que no
			System.out.println("La respuesta es no.");
		}

		//Cerramos el Scanner
		teclado.close();
	}

	/**
	 * La función comprueba si los números del array introducido están ordenados de menor a mayor
	 * 
	 * @param array
	 * @return un boolean dependiendo de si es verdad o no la comprobación
	 */
	public static boolean estaOrdenadoDeMenorAMayor(int array[]) {

		//Creamos un for: inicializamos int i a 1, mientras i sea menor que array.length, sumamos 1 a i
		for(int i=1; i<array.length; i++) {
			//Si la posición i de array es igual a la posición i-1 de array
			if(array[i]<array[i-1]) {
				//Devolvemos false
				return false;
			}
		}

		//Devolvemos true
		return true;
	}
}
