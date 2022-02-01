package ejerciciosFunciones;

import java.util.Scanner;

public class ej2xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podría simplemente devolver el valor
		 * de las áreas de los datos introducidos de cada figura en la función
		 */

		//Declaramos las variables String figura, double parametro1 y parametro2 y el Scanner
		String figura="";
		double parametro1=0d, parametro2=0d;
		Scanner teclado = new Scanner(System.in);

		//Leemos por pantalla la figura de la que calcularemos el área
		System.out.println("Introduce la figura de la que quieres calcular el área (cuadrado, circulo, triangulo, rectangulo): ");
		figura = teclado.next();

		//Usamos un switch con figura.toLowerCase() como dato de referencia
		switch(figura.toLowerCase()) {

		//En el caso de cuadrado
		case "cuadrado":
			//Leemos por teclado los datos de la figura
			System.out.println("\nIntroduce la medida del lado del cuadrado (en cm): ");
			parametro1 = teclado.nextDouble();
			//Comunicamos el área de la figura haciendo uso de la función calcularArea
			System.out.println("\nEl área del cuadrado es de " + calcularArea(figura,parametro1) + " cm cuadrados.");
			break;

		//En el caso de circulo
		case "circulo":
			//Leemos por teclado los datos de la figura
			System.out.println("\nIntroduce la medida del radio del círculo (en cm): ");
			parametro1 = teclado.nextDouble();
			//Comunicamos el área de la figura haciendo uso de la función calcularArea
			System.out.println("\nEl área del círculo es de " + calcularArea(figura,parametro1) + " cm cuadrados.");
			break;

		//En el caso de rectangulo
		case "rectangulo":
			//Leemos por teclado los datos de la figura
			System.out.println("\nIntroduce la medida del primer lado del rectángulo (en cm): ");
			parametro1 = teclado.nextDouble();
			System.out.println("\nIntroduce la medida del segundo lado del rectángulo (en cm): ");
			parametro2 = teclado.nextDouble();
			//Comunicamos el área de la figura haciendo uso de la función calcularArea
			System.out.println("\nEl área del rectángulo es de " + calcularArea(figura,parametro1,parametro2) + " cm cuadrados.");
			break;

		//En el caso de triangulo
		case "triangulo":
			//Leemos por teclado los datos de la figura
			System.out.println("\nIntroduce la medida de la base del triángulo (en cm): ");
			parametro1 = teclado.nextDouble();
			System.out.println("\nIntroduce la medida de la altura del triángulo (en cm): ");
			parametro2 = teclado.nextDouble();
			//Comunicamos el área de la figura haciendo uso de la función calcularArea
			System.out.println("\nEl área del triángulo es de " + calcularArea(figura,parametro1,parametro2) + " cm cuadrados.");
			break;

		//Si no es ninguna figura válida
		default:
			//Se comunica por pantalla
			System.out.println("La figura introducida no es válida.");
			break;
		}

		//Cerramos el Scanner
		teclado.close();
	}

	/**
	 * La función calcula el área de la figura introducida con su parámetro introducido
	 * 
	 * @param figura
	 * @param parametro
	 * @return un double con el área de la figura introducida y su parámetro
	 */
	public static double calcularArea(String figura, double parametro) {
		//Creamos un double para el resultado de la operación dependiendo de la figura ingresada
		double resultado=0d;

		//Si el parametro ingresado es menor o igual a 0 devuelve -1 (en el enunciado 
		//pone número negativo pero he añadido el 0 ya que al multiplicar por este da 0 siempre)
		if(parametro<=0) {
			//Devolvemos -1
			return -1;
		}

		//Usamos un switch con figura pasada a minúsculas como referencia
		switch(figura.toLowerCase()) {
		//En el caso de que sea cuadrado
		case "cuadrado":
			//resultado pasa a valer parametro*parametro
			resultado= parametro*parametro;
			break;
			//En el caso de que sea circulo
		case "circulo":
			//resultado pasa a valer el número pi multiplicado por parametro*parametro
			resultado= Math.PI*(parametro*parametro);
			break;
		}

		//Devolvemos resultado
		return resultado;
	}

	/**
	 * La función calcula el área de la figura introducida con sus parámetros introducidos
	 * 
	 * @param figura
	 * @param parametro1
	 * @param parametro2
	 * @return un double con el área de la figura introducida y sus parámetros
	 */
	public static double calcularArea(String figura, double parametro1, double parametro2) {
		//Creamos un double para el resultado de la operación dependiendo de la figura ingresada
		double resultado=0d;

		//Si parametro1 o parametro2 es menor o igual a 0 devuelve -1 (en el enunciado 
		//pone número negativo pero he añadido el 0 ya que al multiplicar por este da 0 siempre)
		if(parametro1<=0 || parametro2<=0) {
			//Devolvemos -1
			return -1;
		}

		//Usamos un switch con figura pasada a minúsculas como referencia
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
