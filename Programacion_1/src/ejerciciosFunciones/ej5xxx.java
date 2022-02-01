package ejerciciosFunciones;

import java.util.Scanner;

public class ej5xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podr�a simplemente devolver el valor
		 * de la cada funci�n al introducir ciertos datos en ella.
		 */

		//Declaramos las variables y el Scanner
		int dividendo=0, divisor=0, numero=0;
		Scanner teclado = new Scanner(System.in);

		//Pedimos por teclado los datos de la primera funci�n
		System.out.println("*Primera funci�n*\nIntroduce un n�mero: ");
		numero = teclado.nextInt();

		//Expresamos por pantalla si el n�mero introducido es primo o no
		System.out.println("�El n�mero introducido es primo?:");

		//Si la funci�n devuelve un true
		if(esPrimo(numero)==true) {
			//S�
			System.out.println("S�.");
		}
		//Si es false
		else {
			//No
			System.out.println("No.");
		}

		//Leemos por teclado los datos de la segunda funci�n 
		System.out.println("\n*Segunda funci�n*\nIntroduce un dividendo: ");
		dividendo = teclado.nextInt();
		System.out.println("\nIntroduce un divisor: ");
		divisor = teclado.nextInt();

		//Expresamos por pantalla si el dividendo introducido es divisible por el divisor introducido
		System.out.println("\n�Es divisible el dividendo introducido por el divisor introducido?: ");

		//Si la funci�n devuelve true
		if(esDivisible(dividendo,divisor)==true) {
			//S�
			System.out.println("S�.");
		}
		//Si es false
		else {
			//No
			System.out.println("No.");
		}

		//Leemos por teclado los datos de la tercera funci�n
		System.out.println("\n*Tercera funci�n*\nIntroduce un n�mero: ");
		numero = teclado.nextInt();

		//Expresamos por pantalla los divisores del n�mero introducido
		System.out.println("\nA continuaci�n se muestran los divisores del n�mero introducido: ");

		//Creamos un array y lo definimos con la funci�n y el n�mero en su interior
		int[] divisores= arrayDivisores(numero);

		//Usamos un for para recorrer el array divisores
		for(int i=0;i<divisores.length;i++) {
			//Si la posici�n i del array divisores es diferente de 0 (los 0 no se escogen debido a que no pueden ser divisores; se generan al no rellenar el array al completo)
			if(divisores[i]!=0) {
				//Vamos expresando por pantalla los n�meros
				System.out.println(divisores[i]);
			}
		}

		//Cerramos el Scanner
		teclado.close();
	}

	/**
	 * La funci�n comprueba si el n�mero introducido es primo
	 * 
	 * @param num
	 * @return un boolean dependiendo de si la comprobaci�n es verdadera o falsa
	 */
	public static boolean esPrimo(int num) {
		//Si num es igual a 0 o a 1, si o si son primos
		if(num==0 || num==1) {
			//Devolvemos false
			return false;
		}
		//Con un for recorremos desde el 2 hasta la mitad del numero introducido
		for(int i=2; i<=num/2; i++) {
			//Si el resto de dividir el numero introducido entre i es igual a 0
			if(num%i==0) {
				//Devolvemos false
				return false;
			}
		}
		//Devolvemos true si el c�digo llega hasta aqu�
		return true;
	}

	/**
	 * La funci�n comprueba si el dividendo introducido es divisible entre el divisor introducido
	 * 
	 * @param dividendo
	 * @param divisor
	 * @return un boolean dependiendo de si la comprobaci�n es verdadera o falsa
	 */
	public static boolean esDivisible(int dividendo, int divisor) {

		//Si el resto de dividir dividendo entre divisor es diferente de 0
		if(dividendo%divisor!=0) {
			//Devolvemos false
			return false;
		}

		//Devolvemos true
		return true;
	}

	/**
	 * La funci�n calcula los divisores que tiene un n�mero introducido
	 * 
	 * @param num
	 * @return un array que contiene los divisores del n�mero introducido
	 */
	public static int[] arrayDivisores(int num) {

		//Creamos un array de int divisores con num como referencia y un int cantidadArray 
		int[]divisores = new int[num];
		int cantidadArray=0;

		//Creamos un for: inicializamos int i a 1, mientras i sea menor o igual a la mitad de num (recorremos solo hasta la mitad del n�mero ya que no hace falta m�s), sumamos 1 a i
		for(int i=1; i<=num/2; i++) {
			//Si el resto de dividir num entre i es igual a 0
			if(num%i==0) {
				//La posici�n cantidadArray del array divisores pasa a ser i
				divisores[cantidadArray]=i;
				//Sumamos 1 a cantidadArray
				cantidadArray++;
			}
		}

		//A�adimos finalmente al array divisores el num introducido obviamente al ser divisor de s� mismo
		divisores[cantidadArray]= num;

		//Devolvemos el array divisores
		return divisores;
	}
}
