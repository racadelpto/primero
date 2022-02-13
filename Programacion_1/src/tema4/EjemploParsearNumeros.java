package tema4;

import java.util.Scanner;

public class EjemploParsearNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Leemos un numero
		System.out.println("Introduce un número entero: ");
		String snumero = teclado.next();

		// Convertirmos el numero de String a entero
		int numero = Integer.parseInt(snumero);

		teclado.close();
	}

}
