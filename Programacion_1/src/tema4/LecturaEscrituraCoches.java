package tema4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class LecturaEscrituraCoches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Pruebas para los 3 ejercicios de ficheros sobre la clase Coche
		 */
		
		// Creamos un array de Coche de tamaño 5
		Coche[] arrayCoches = new Coche[5];

		// Usamos un for para recorrer el arrayCoches
		for (int i = 0; i < arrayCoches.length; i++) {
			// Para cada objeto arrayCoches[i], creamos un objeto Coche con los siguientes
			// datos como parámetros
			// En algunos casos se generarán aleatoriamente y en otros vendrán predefinidos
			arrayCoches[i] = new Coche((int) (Math.random() * 100 + 1), "Coche" + (i + 1), "Corvette", "Mercedes",
					(int) (Math.random() * 1000 + 1), Coche.AMARILLO, (int) (Math.random() * 100 + 1), new Rueda[4],
					new Suspension[4]);
		}

		// Probamos la primera función guardarCoches. Debemos usar un objeto de la clase
		// Coche (en mi caso arrayCoches[0]), para poder
		// usar la función
		// Dentro de la función especificamos los parámetros: el array de Coche y el
		// fichero destino
		// Usamos un switch para los casos en los que de error poder comunicarlo
		// Se generará un fichero con los datos de los coches contenidos en ese array
		// Se incluye la captura del fichero de texto en el que se generan los datos aunque en la tercera función se usara ese fichero
		// para leer los datos y almacenarlos en un
		// array Coche

		switch (arrayCoches[0].guardarCoches(arrayCoches, "c:\\ejercicioFicherosCoche\\arrayCoches.txt")) {
		case 0:
			System.out.println("Los datos se han guardado en el fichero correctamente");
			break;
		case Coche.ERROR_FICHERO:
			System.out.println("El fichero no se ha encontrado o no tenemos permisos");
			break;
		case Coche.ERROR_ESCRITURA:
			System.out.println("Ha habido un problema al escribir o leer del fichero");
			break;
		}

		// Usamos un if para expresar por pantalla la cantidad de líneas que ha leído la
		// segunda función
		// contarLineas, si hay errores lo comunica
		// Usamos el fichero creado con la primera función como referencia

		if (arrayCoches[0].contarLineas("c:\\ejercicioFicherosCoche\\arrayCoches.txt") > -1) {
			System.out.println("\nLa cantidad de líneas que tiene el fichero creado en la primera función es: "
					+ arrayCoches[0].contarLineas("c:\\ejercicioFicherosCoche\\arrayCoches.txt"));
		} else if (arrayCoches[0].contarLineas("c:\\ejercicioFicherosCoche\\arrayCoches.txt") == Coche.ERROR_FICHERO) {
			System.out.println("\nEl fichero no se ha encontrado o no tenemos permisos");
		} else {
			System.out.println("\nHa habido un problema al escribir o leer del fichero");
		}

		// Finalmente probamos la tercera función
		// Creamos un array de Coche para guardar el array generado por la función con
		// el fichero creado con la primera función como referencia
		Coche[] cochesLeidos = arrayCoches[0].cargarCoches("c:\\ejercicioFicherosCoche\\arrayCoches.txt");

		// Expresamos por pantalla los datos del array cochesLeidos gracias a
		// Arrays.toString
		// Con un if para comunicar un posible error
		if (cochesLeidos != null) {
			System.out.println("\nLos datos de los coches leídos son los siguientes: " + Arrays.toString(cochesLeidos));
		} else {
			System.out.println("\nHa habido un error a la hora de encontrar o escribir en el fichero.");
		}
	}

}
