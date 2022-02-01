package ejerciciosFunciones;

import java.util.Scanner;

public class ej1xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podr�a simplemente devolver el valor
		 * de los resultados de cada operaci�n con los datos introducidos en cada funci�n
		 */

		//Declaramos las variables con los datos para cada operaci�n y el Scanner
		int num1=0,num2=0,cantidadArray=0;
		double factor1=0d,factor2=0d,dividendo=0d,divisor=0d;
		Scanner teclado = new Scanner(System.in);

		//Pedimos por teclado dos n�meros para la suma y resta
		System.out.println("Introduce dos n�meros para realizar su suma y resta. Primer n�mero: ");
		num1 = teclado.nextInt();
		System.out.println("Segundo n�mero: ");
		num2 = teclado.nextInt();

		//Expresamos por pantalla la suma y resta con los datos introducidos
		System.out.println("\nSuma de los dos n�meros: " + suma(num1,num2));
		System.out.println("\nResta de los dos n�meros: " + resta(num1,num2));

		//Pedimos por teclado dos n�meros para la multiplicaci�n
		System.out.println("\nIntroduce dos factores para la multiplicaci�n de estos. Primer factor: ");
		factor1 = teclado.nextDouble();
		System.out.println("Segundo factor: ");
		factor2 = teclado.nextDouble();

		//Expresamos por pantalla la multiplicaci�n con los datos introducidos
		System.out.println("\nMultiplicaci�n de los dos factores: " + multiplicacion(factor1,factor2));

		//Pedimos por teclado dos n�meros para la divisi�n
		System.out.println("\nIntroduce el dividendo y divisor para la divisi�n de estos. Dividendo: ");
		dividendo = teclado.nextDouble();
		System.out.println("Divisor: ");
		divisor = teclado.nextDouble();

		//Expresamos por pantalla la divisi�n con los datos introducidos
		System.out.println("\nDivisi�n de los dos factores: " + division(dividendo,divisor));

		//Pedimos una cantidad de n�meros para definir la longitud del array
		System.out.println("\nIntroduce n�meros en un array para sacar su n�mero con el m�nimo valor y la media de sus n�meros. Cantidad de n�meros para el array: ");
		cantidadArray = teclado.nextInt();

		//Declaramos el array
		int[]arrayNumeros = new int[cantidadArray];

		//Usamos un for para ir pidiendo los n�meros que contendr� el array
		for(int i=0; i<cantidadArray; i++) {
			System.out.println("N�mero " + (i+1) + " del array: ");
			arrayNumeros[i]= teclado.nextInt();
		}

		//Expresamos por pantalla el m�nimo y la media del array creado
		System.out.println("\nM�nimo del array: " + min(arrayNumeros));
		System.out.println("\nMedia del array: " + media(arrayNumeros));

		//Cerramos el Scanner
		teclado.close();

	}

	/**
	 * La funci�n suma dos n�meros
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la suma de los n�meros
	 */
	public static int suma(int num1, int num2) {
		//Devolvemos la suma de num1 y num2
		return num1 + num2;
	}

	/**
	 * La funci�n resta dos n�meros
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la resta de los n�meros
	 */
	public static int resta(int num1, int num2) {
		//Devolvemos la resta de num1 y num2
		return num1 - num2;
	}

	/**
	 * La funci�n multiplica dos n�meros
	 * 
	 * @param num1
	 * @param num2
	 * @return un double con la multiplicaci�n de los n�meros
	 */
	public static double multiplicacion(double num1, double num2) {
		//Devolvemos la multiplicaci�n de num1 y num2
		return num1 * num2;
	}

	/**
	 * La funci�n divide dos n�meros
	 * 
	 * @param dividendo
	 * @param divisor
	 * @return un double con la divisi�n de los n�meros
	 */
	public static double division(double dividendo, double divisor) {
		//Inicializamos la variable double resultado que ser� la que se devuelva en caso de que el divisor sea igual a 0
		double resultado=0d;

		//Si num2 es igual a 0
		if (divisor == 0) {
			//Se expresa por pantalla que el divisor no es v�lido
			System.out.println("\nEl divisor no puede ser 0.");
		}
		//Si no
		else {
			//resultado pasa a valer dividendo entre divisor
			resultado=dividendo/divisor;
		}

		//Devolvemos la divisi�n de num1 y num2
		return resultado;
	}

	/**
	 * La funci�n busca el n�mero de menor valor en un array
	 * 
	 * @param listaNumeros un array
	 * @return un entero con el n�mero de menor valor del array
	 */
	public static int min(int listaNumeros[]) {
		//Declaramos la variable int min al m�ximo valor posible
		int min = Integer.MAX_VALUE;

		//Usamos un for para recorrer el array listaNumeros 
		for (int i = 0; i < listaNumeros.length; i++) {
			//Si la posici�n i en el array listaNumeros es menor que min
			if (listaNumeros[i] < min) {
				//min pasa a ser la posici�n i del array listaNumeros
				min = listaNumeros[i];
			}
		}

		//Devolvemos min
		return min;
	}

	/**
	 * La funci�n hace la media de los n�meros de un array
	 * 
	 * @param listaNumeros un array
	 * @return un double con la media de los n�meros de un array
	 */
	public static double media(int listaNumeros[]) {
		//Declaramos la variable double media
		double media = 0d;

		//Usamos un for para recorrer el array listaNumeros
		for (int i = 0; i < listaNumeros.length; i++) {
			//Vamos sumando la posici�n i del array listaNumeros a media
			media = media + listaNumeros[i];
		}

		//media pasa a valer a la divii�n de media entre la longitud del array listaNumeros
		media = media / listaNumeros.length;

		//Devolvemos media
		return media;
	}

}
