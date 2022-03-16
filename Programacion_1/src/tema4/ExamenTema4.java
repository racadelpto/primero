package tema4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExamenTema4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos un objeto prueba de ExamenTema4 para probar las funciones
		ExamenTema4 prueba = new ExamenTema4();

		// Probamos la primera función creando un fichero en esa ruta
		// Si prueba.guardarDatos() es igual a -1
		if (prueba.guardarDatos("c:\\logs\\examentema4\\examen.txt") == -1) {

			// Expresamos mensaje por pantalla
			System.out.println("Se ha producido algún tipo de error.");
		}

		// Probamos la segunda función indicando el fichero recién creado
		// Si prueba.leerDatos() es igual a -1
		if (prueba.leerDatos("c:\\logs\\examentema4\\examen.txt") == -1) {

			// Expresamos mensaje por pantalla
			System.out.println("Se ha producido algún tipo de error.");
		}
	}

	/**
	 * Función que lee datos por teclado y los va guardando en un fichero mientras
	 * el usuario quiera
	 * 
	 * @param fichero
	 * @return un int en función de si ha habido o no algún error
	 */
	public int guardarDatos(String fichero) {

		// Se declaran las variables de los componentes y el Scanner
		String nombre = "", marca = "", modelo = "", tipo = "";
		double precio = 0d;
		int stock = 0;
		Scanner teclado = new Scanner(System.in);

		// Se declaran la variable seguirMetiendoDatos para determinar si se siguen
		// leyendo datos o no
		// Y la de contadorComponente para poner el numero del componente del que
		// estamos leyendo datos
		String seguirMetiendoDatos = "si";
		int contadorComponente = 0;

		// Intentamos el siguiente código
		try {
			// Creamos un objeto FileWriter con fichero como referencia de fichero
			FileWriter fw = new FileWriter(fichero);

			// Creamos un objeto PrintWriter con fw como referencia
			PrintWriter pw = new PrintWriter(fw);

			// Mientras seguirMetiendoDatos en minúsculas sea igual a si
			while (seguirMetiendoDatos.toLowerCase().equals("si")) {

				// Sumamos 1 a contadorComponente cada vez que se ejecuta el while
				contadorComponente++;

				// Se leen los datos de los componentes por teclado
				System.out.println("\nIntroduce el tipo del componente " + contadorComponente + ":");
				tipo = teclado.next();

				System.out.println("\nIntroduce el nombre del componente " + contadorComponente + ":");
				nombre = teclado.next();

				System.out.println("\nIntroduce la marca del componente " + contadorComponente + ":");
				marca = teclado.next();

				System.out.println("\nIntroduce el modelo del componente " + contadorComponente + ":");
				modelo = teclado.next();

				System.out.println("\nIntroduce el precio del componente " + contadorComponente + ":");
				precio = teclado.nextDouble();

				System.out.println("\nIntroduce el stock del componente " + contadorComponente + ":");
				stock = teclado.nextInt();

				// Se crea un String linea con todos los datos separados por :
				String linea = nombre + ":" + marca + ":" + modelo + ":" + tipo + ":" + precio + ":" + stock;

				// Se escribe el String linea en el fichero con pw
				pw.println(linea);

				// Le preguntamos al usuario si quiere seguir introduciendo datos
				System.out.println("\n¿Quieres seguir introduciendo datos de más componentes? (Si/No):");
				seguirMetiendoDatos = teclado.next();
			}

			// Cerramos el teclado, pw y fw
			teclado.close();
			pw.close();
			fw.close();

		} // Si da error FileNotFoundException
		catch (FileNotFoundException e) {

			// Se imprime el error
			e.printStackTrace();

			// Devolvemos -1
			return -1;

		} // Si da error IOException
		catch (IOException ioe) {

			// Se imprime el error
			ioe.printStackTrace();

			// Devolvemos -1
			return -1;
		}

		// Devolvemos 0
		return 0;
	}

	/**
	 * Función que lee datos de un fichero y los va mostrando por pantalla
	 * 
	 * @param fichero
	 * @return un int en función de si ha habido o no algún error
	 */
	public int leerDatos(String fichero) {

		// Declaramos un objeto File con fichero como referencia
		File ficheroALeer = new File(fichero);

		// Declaramos int numeroLinea a 1
		int numeroLinea = 1;

		// Intentamos el siguiente código
		try {

			// Se crea un objeto FileReader con ficheroALeer como referencia
			FileReader fr = new FileReader(ficheroALeer);

			// Se crea un objeto BufferedReader con fr como referencia
			BufferedReader br = new BufferedReader(fr);

			// Se crea un String linea con la linea leida por br
			String linea = br.readLine();

			// Mientras linea sea diferente de null
			while (linea != null) {

				// Se crea un StringTokenizer con linea como referencia de texto y : como
				// separador
				StringTokenizer st = new StringTokenizer(linea, ":");

				// Se expresa la barrita
				System.out.println("\n-----------------------------------");

				// Se expresan los datos de los componentes tal y como se indica
				System.out.println("Componente " + numeroLinea + ": " + st.nextToken() + " " + st.nextToken() + " "
						+ st.nextToken() + " " + st.nextToken());

				System.out.println("Precio: " + st.nextToken());

				System.out.println("Stock: " + st.nextToken());

				// Se expresa la barrita
				System.out.println("-----------------------------------");

				// linea pasa a ser la siguiente linea leida por br
				linea = br.readLine();

				// Sumamos 1 a numeroLinea
				numeroLinea++;
			}

			// Se cierran br y fr
			br.close();
			fr.close();

		} // Si da un error FileNotFoundException
		catch (FileNotFoundException e) {

			// Se imprime el error
			e.printStackTrace();

			// Devolvemos -1
			return -1;
		} // Si da un error IOException
		catch (IOException ioe) {

			// Se imprime el error
			ioe.printStackTrace();

			// Devolvemos -1
			return -1;
		}

		// Devolvemos 0
		return 0;
	}

}
