package ejerciciosFunciones;

import java.util.Scanner;

public class ej3xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podr�a simplemente devolver el valor
		 * (true o false) que devuelve la funci�n cuando introducimos un array en ella
		 */

		//Se declara el int cantidadArray y el Scanner
		int cantidadArray=0;
		Scanner teclado = new Scanner(System.in);

		//Leemos por teclado una cantidad de n�meros para el array
		System.out.println("Introduce la cantidad de n�meros que quieres introducir en el array: ");
		cantidadArray = teclado.nextInt();

		//Declaramos y definimos el tama�o del array int arrayNumeros
		int[] arrayNumeros = new int[cantidadArray];

		//Usamos un for: inicializamos int i a 0, mientras i sea menor que la longitud de arrayNumeros, sumamos 1 a i
		for(int i=0; i<arrayNumeros.length; i++) {
			//Leemos por teclado un n�mero para la posici�n i del arrayNumeros
			System.out.println("\nIntroduce un n�mero para la posici�n " + i + " de tu array: ");
			arrayNumeros[i] = teclado.nextInt();
		}

		//Comunicamos por pantalla al usuario si los n�meros de su array est�n ordenados de menor a mayor
		System.out.println("\n�Est�n los n�meros de tu array ordenados de menor a mayor?: ");

		//Si la funci�n estaOrdenadoDeMenorAMayor(arrayNumeros) es igual a true
		if(estaOrdenadoDeMenorAMayor(arrayNumeros)==true) {
			//Comunicamos que si
			System.out.println("La respuesta es s�.");
		}
		//En cualquier otro caso quiere decir que la funci�n estaOrdenadoDeMenorAMayor(arrayNumeros) es igual a false
		else {
			//Comunicamos que no
			System.out.println("La respuesta es no.");
		}

		//Cerramos el Scanner
		teclado.close();
	}

	/**
	 * La funci�n comprueba si los n�meros del array introducido est�n ordenados de menor a mayor
	 * 
	 * @param array
	 * @return un boolean dependiendo de si es verdad o no la comprobaci�n
	 */
	public static boolean estaOrdenadoDeMenorAMayor(int array[]) {

		//Creamos un for: inicializamos int i a 1, mientras i sea menor que array.length, sumamos 1 a i
		for(int i=1; i<array.length; i++) {
			//Si la posici�n i de array es igual a la posici�n i-1 de array
			if(array[i]<array[i-1]) {
				//Devolvemos false
				return false;
			}
		}

		//Devolvemos true
		return true;
	}
}
