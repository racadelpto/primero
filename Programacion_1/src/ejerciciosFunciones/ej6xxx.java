package ejerciciosFunciones;

import java.util.Scanner;

public class ej6xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podr�a simplemente devolver el valor
		 * del binario en texto que devuelve la funci�n
		 */

		//Declaramos la variable int numero y el Scanner
		int numero=0;
		Scanner teclado = new Scanner(System.in);

		//Leemos por teclado un n�meros
		System.out.println("Introduce un n�mero y lo pasaremos a binario: ");
		numero = teclado.nextInt();

		//Expresamos por pantalla el n�mero introducido transformado en binario
		System.out.println("\nEl n�mero introducido en binario es el siguiente: " + binarioEnTexto(numero));

		//Se cierra el Scanner
		teclado.close();
	}

	/**
	 * La funci�n transforma un entero a binario y lo devuelve en texto
	 * 
	 * @param entero
	 * @return un String con el binario transformado a partir del entero introducido
	 */
	public static String binarioEnTexto(int entero) {

		//Declaramos la variable String binario
		String binario="";

		//Si el entero introducido es igual a 0
		if(entero==0) {
			//binario pasa a valer 0 obviamente
			binario="0";

			//Devolvemos binario
			return binario;
		}

		//Usamos un while, se ejecuta mientras la divisi�n de entero entre 2 sea mayor de 0
		while(entero/2>0) {
			//Vamos introduciendo el resto de la divisi�n de entero entre 2 a binario
			binario = binario + entero%2;

			//entero pasa a valer entero entre 2
			entero = entero/2;
		}

		//Al final sumamos "1" a binario ya que todos los n�meros binarios empiezan por 1 
		binario = binario + "1";

		//Usamos un for, inicializamos int i a la longitud de binario menos 1, mientras i sea mayor o igual a 0, restamos 1 a i
		for(int i=binario.length()-1; i>=0; i--) {

			//Vamos sumando a binario la posici�n i del String binario
			binario += binario.charAt(i);
		}

		//Finalmente binario pasa a ser la segunda mitad de �l mismo, ya que esta mitad contiene el n�mero binario ordenado correctamente
		binario = binario.substring(binario.length()/2,binario.length());

		//Devolvemos binario
		return binario;
	}
}
