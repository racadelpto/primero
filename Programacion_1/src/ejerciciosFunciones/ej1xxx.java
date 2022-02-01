package ejerciciosFunciones;

import java.util.Scanner;

public class ej1xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podría simplemente devolver el valor
		 * de los resultados de cada operación con los datos introducidos en cada función
		 */

		//Declaramos las variables con los datos para cada operación y el Scanner
		int num1=0,num2=0,cantidadArray=0;
		double factor1=0d,factor2=0d,dividendo=0d,divisor=0d;
		Scanner teclado = new Scanner(System.in);

		//Pedimos por teclado dos números para la suma y resta
		System.out.println("Introduce dos números para realizar su suma y resta. Primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Segundo número: ");
		num2 = teclado.nextInt();

		//Expresamos por pantalla la suma y resta con los datos introducidos
		System.out.println("\nSuma de los dos números: " + suma(num1,num2));
		System.out.println("\nResta de los dos números: " + resta(num1,num2));

		//Pedimos por teclado dos números para la multiplicación
		System.out.println("\nIntroduce dos factores para la multiplicación de estos. Primer factor: ");
		factor1 = teclado.nextDouble();
		System.out.println("Segundo factor: ");
		factor2 = teclado.nextDouble();

		//Expresamos por pantalla la multiplicación con los datos introducidos
		System.out.println("\nMultiplicación de los dos factores: " + multiplicacion(factor1,factor2));

		//Pedimos por teclado dos números para la división
		System.out.println("\nIntroduce el dividendo y divisor para la división de estos. Dividendo: ");
		dividendo = teclado.nextDouble();
		System.out.println("Divisor: ");
		divisor = teclado.nextDouble();

		//Expresamos por pantalla la división con los datos introducidos
		System.out.println("\nDivisión de los dos factores: " + division(dividendo,divisor));

		//Pedimos una cantidad de números para definir la longitud del array
		System.out.println("\nIntroduce números en un array para sacar su número con el mínimo valor y la media de sus números. Cantidad de números para el array: ");
		cantidadArray = teclado.nextInt();

		//Declaramos el array
		int[]arrayNumeros = new int[cantidadArray];

		//Usamos un for para ir pidiendo los números que contendrá el array
		for(int i=0; i<cantidadArray; i++) {
			System.out.println("Número " + (i+1) + " del array: ");
			arrayNumeros[i]= teclado.nextInt();
		}

		//Expresamos por pantalla el mínimo y la media del array creado
		System.out.println("\nMínimo del array: " + min(arrayNumeros));
		System.out.println("\nMedia del array: " + media(arrayNumeros));

		//Cerramos el Scanner
		teclado.close();

	}

	/**
	 * La función suma dos números
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la suma de los números
	 */
	public static int suma(int num1, int num2) {
		//Devolvemos la suma de num1 y num2
		return num1 + num2;
	}

	/**
	 * La función resta dos números
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la resta de los números
	 */
	public static int resta(int num1, int num2) {
		//Devolvemos la resta de num1 y num2
		return num1 - num2;
	}

	/**
	 * La función multiplica dos números
	 * 
	 * @param num1
	 * @param num2
	 * @return un double con la multiplicación de los números
	 */
	public static double multiplicacion(double num1, double num2) {
		//Devolvemos la multiplicación de num1 y num2
		return num1 * num2;
	}

	/**
	 * La función divide dos números
	 * 
	 * @param dividendo
	 * @param divisor
	 * @return un double con la división de los números
	 */
	public static double division(double dividendo, double divisor) {
		//Inicializamos la variable double resultado que será la que se devuelva en caso de que el divisor sea igual a 0
		double resultado=0d;

		//Si num2 es igual a 0
		if (divisor == 0) {
			//Se expresa por pantalla que el divisor no es válido
			System.out.println("\nEl divisor no puede ser 0.");
		}
		//Si no
		else {
			//resultado pasa a valer dividendo entre divisor
			resultado=dividendo/divisor;
		}

		//Devolvemos la división de num1 y num2
		return resultado;
	}

	/**
	 * La función busca el número de menor valor en un array
	 * 
	 * @param listaNumeros un array
	 * @return un entero con el número de menor valor del array
	 */
	public static int min(int listaNumeros[]) {
		//Declaramos la variable int min al máximo valor posible
		int min = Integer.MAX_VALUE;

		//Usamos un for para recorrer el array listaNumeros 
		for (int i = 0; i < listaNumeros.length; i++) {
			//Si la posición i en el array listaNumeros es menor que min
			if (listaNumeros[i] < min) {
				//min pasa a ser la posición i del array listaNumeros
				min = listaNumeros[i];
			}
		}

		//Devolvemos min
		return min;
	}

	/**
	 * La función hace la media de los números de un array
	 * 
	 * @param listaNumeros un array
	 * @return un double con la media de los números de un array
	 */
	public static double media(int listaNumeros[]) {
		//Declaramos la variable double media
		double media = 0d;

		//Usamos un for para recorrer el array listaNumeros
		for (int i = 0; i < listaNumeros.length; i++) {
			//Vamos sumando la posición i del array listaNumeros a media
			media = media + listaNumeros[i];
		}

		//media pasa a valer a la diviión de media entre la longitud del array listaNumeros
		media = media / listaNumeros.length;

		//Devolvemos media
		return media;
	}

}
