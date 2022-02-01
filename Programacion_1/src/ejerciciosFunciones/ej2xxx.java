package ejerciciosFunciones;

import java.util.Scanner;

public class ej2xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podr�a simplemente devolver el valor
		 * de las �reas de los datos introducidos de cada figura en la funci�n
		 */

		//Declaramos las variables String figura, double parametro1 y parametro2 y el Scanner
		String figura="";
		double parametro1=0d, parametro2=0d;
		Scanner teclado = new Scanner(System.in);

		//Leemos por pantalla la figura de la que calcularemos el �rea
		System.out.println("Introduce la figura de la que quieres calcular el �rea (cuadrado, circulo, triangulo, rectangulo): ");
		figura = teclado.next();

		//Usamos un switch con figura.toLowerCase() como dato de referencia
		switch(figura.toLowerCase()) {

		//En el caso de cuadrado
		case "cuadrado":
			//Leemos por teclado los datos de la figura
			System.out.println("\nIntroduce la medida del lado del cuadrado (en cm): ");
			parametro1 = teclado.nextDouble();
			//Comunicamos el �rea de la figura haciendo uso de la funci�n calcularArea
			System.out.println("\nEl �rea del cuadrado es de " + calcularArea(figura,parametro1) + " cm cuadrados.");
			break;

		//En el caso de circulo
		case "circulo":
			//Leemos por teclado los datos de la figura
			System.out.println("\nIntroduce la medida del radio del c�rculo (en cm): ");
			parametro1 = teclado.nextDouble();
			//Comunicamos el �rea de la figura haciendo uso de la funci�n calcularArea
			System.out.println("\nEl �rea del c�rculo es de " + calcularArea(figura,parametro1) + " cm cuadrados.");
			break;

		//En el caso de rectangulo
		case "rectangulo":
			//Leemos por teclado los datos de la figura
			System.out.println("\nIntroduce la medida del primer lado del rect�ngulo (en cm): ");
			parametro1 = teclado.nextDouble();
			System.out.println("\nIntroduce la medida del segundo lado del rect�ngulo (en cm): ");
			parametro2 = teclado.nextDouble();
			//Comunicamos el �rea de la figura haciendo uso de la funci�n calcularArea
			System.out.println("\nEl �rea del rect�ngulo es de " + calcularArea(figura,parametro1,parametro2) + " cm cuadrados.");
			break;

		//En el caso de triangulo
		case "triangulo":
			//Leemos por teclado los datos de la figura
			System.out.println("\nIntroduce la medida de la base del tri�ngulo (en cm): ");
			parametro1 = teclado.nextDouble();
			System.out.println("\nIntroduce la medida de la altura del tri�ngulo (en cm): ");
			parametro2 = teclado.nextDouble();
			//Comunicamos el �rea de la figura haciendo uso de la funci�n calcularArea
			System.out.println("\nEl �rea del tri�ngulo es de " + calcularArea(figura,parametro1,parametro2) + " cm cuadrados.");
			break;

		//Si no es ninguna figura v�lida
		default:
			//Se comunica por pantalla
			System.out.println("La figura introducida no es v�lida.");
			break;
		}

		//Cerramos el Scanner
		teclado.close();
	}

	/**
	 * La funci�n calcula el �rea de la figura introducida con su par�metro introducido
	 * 
	 * @param figura
	 * @param parametro
	 * @return un double con el �rea de la figura introducida y su par�metro
	 */
	public static double calcularArea(String figura, double parametro) {
		//Creamos un double para el resultado de la operaci�n dependiendo de la figura ingresada
		double resultado=0d;

		//Si el parametro ingresado es menor o igual a 0 devuelve -1 (en el enunciado 
		//pone n�mero negativo pero he a�adido el 0 ya que al multiplicar por este da 0 siempre)
		if(parametro<=0) {
			//Devolvemos -1
			return -1;
		}

		//Usamos un switch con figura pasada a min�sculas como referencia
		switch(figura.toLowerCase()) {
		//En el caso de que sea cuadrado
		case "cuadrado":
			//resultado pasa a valer parametro*parametro
			resultado= parametro*parametro;
			break;
			//En el caso de que sea circulo
		case "circulo":
			//resultado pasa a valer el n�mero pi multiplicado por parametro*parametro
			resultado= Math.PI*(parametro*parametro);
			break;
		}

		//Devolvemos resultado
		return resultado;
	}

	/**
	 * La funci�n calcula el �rea de la figura introducida con sus par�metros introducidos
	 * 
	 * @param figura
	 * @param parametro1
	 * @param parametro2
	 * @return un double con el �rea de la figura introducida y sus par�metros
	 */
	public static double calcularArea(String figura, double parametro1, double parametro2) {
		//Creamos un double para el resultado de la operaci�n dependiendo de la figura ingresada
		double resultado=0d;

		//Si parametro1 o parametro2 es menor o igual a 0 devuelve -1 (en el enunciado 
		//pone n�mero negativo pero he a�adido el 0 ya que al multiplicar por este da 0 siempre)
		if(parametro1<=0 || parametro2<=0) {
			//Devolvemos -1
			return -1;
		}

		//Usamos un switch con figura pasada a min�sculas como referencia
		switch(figura.toLowerCase()) {
		//En el caso de que sea rectangulo
		case "rectangulo":
			//resultado pasa a valer parametro1*parametro2
			resultado= parametro1*parametro2;
			break;
			//En el caso de que sea triangulo
		case "triangulo":
			//resultado pasa a valer parametro1*parametro2 y esto lo dividimos entre 2
			resultado= (parametro1*parametro2)/2;
			break;
		}

		//Devolvemos resultado
		return resultado;
	}
}
