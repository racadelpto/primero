package tema4;

import java.io.File;
import java.io.IOException;

public class GestionFicheros {

	public static final int OK = 0;
	public static final int FICHERO_NO_ENCONTRADO = -1;
	public static final int ERROR_LECTURA = -2;
	public static final int ERROR_BORRADO = -3;
	public static final int TIPO_ERROR = -4;
	public static final int FICHERO_EXISTE = -5;
	public static final int ERROR_ESCRITURA = -6;

	public static int eliminarFichero(String rutaFichero) {

		// Definimos la variable que guarda el resultado
		int resultado = OK;

		File fichero = new File(rutaFichero);

		if (!fichero.delete()) {
			resultado = ERROR_BORRADO;
		}

		// Devolvemos el resultado de la operación
		return resultado;
	}

	public static int mostrarContenidoDirectorio(String rutaDirectorio) {

		// Definimos la variable que guarda el resultado
		int resultado = OK;

		File fichero = new File(rutaDirectorio);

		if (!fichero.isDirectory()) {
			resultado = TIPO_ERROR;
		} else {
			// Con esta función nos devuelve un array de file
			// Y podemos modificarlos

			String listaFicheros[] = fichero.list();
			for (int i = 0; i < listaFicheros.length; i++) {
				System.out.println(listaFicheros[i]);
			}
		}

		// Devolvemos el resultado de la operación
		return resultado;
	}

	public static int crearFichero(String rutaFichero) {

		// Definimos la variable que guarda el resultado
		int resultado = OK;

		File fichero = new File(rutaFichero);

		if (fichero.exists()) {
			resultado = FICHERO_EXISTE;
		} else {
			try {
				fichero.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		// File directorio = new File(fichero.getAbsolutePath());

		// Devolvemos el resultado de la operación
		return resultado;
	}

	public static int crearDirectorio(String rutaDirectorio, String nombre) {

		// Definimos la variable que guarda el resultado
		int resultado = OK;

		File directorioRaiz = new File(rutaDirectorio);
		File directorio = new File(rutaDirectorio + "\\" + nombre);

		// Compruebo si es un directorio
		if (!directorioRaiz.isDirectory()) {
			resultado = TIPO_ERROR;
		} else {
			if (!directorioRaiz.canWrite()) {
				resultado = ERROR_ESCRITURA;
			} else {
				directorio.mkdir();
			}
		}

		// File directorio = new File(fichero.getAbsolutePath());

		// Devolvemos el resultado de la operación
		return resultado;
	}

	/**
	 * Función que modifica el nombre de sólo los ficheros de un directorio
	 * introducido con un nombreModificado más un contador
	 * 
	 * @param directorio
	 * @param nombreModificado
	 * @return un entero en función de si ha funcionado o no la función
	 */
	public static int modificarNombres(String directorio, String nombreModificado) {

		// Creamos fichero de tipo File con directorio como referencia
		File fichero = new File(directorio);

		// Si fichero no es un directorio
		if (!fichero.isDirectory()) {

			// Devolvemos TIPO_ERROR
			return TIPO_ERROR;
		} // Si sí
		else {

			// Creamos un array de tipo File que almacena los ficheros de fichero
			File[] listaFicheros = fichero.listFiles();

			// Con un for recorremos el array listaFicheros
			for (int i = 0; i < listaFicheros.length; i++) {

				// Creamos un String nombreFichero con el nombre de listaFicheros[i]
				String nombreFichero = listaFicheros[i].getName();

				// Creamos ficheroModificado de tipo File con (directorio + nombreModificado +
				// "."
				// + el substring de nombreFichero desde . hasta el final) como referencia
				File ficheroModificado = new File(directorio + nombreModificado + (i + 1) + "."
						+ nombreFichero.substring(nombreFichero.lastIndexOf('.') + 1));

				// Renombramos listaFicheros[i] a fichero Modificado
				listaFicheros[i].renameTo(ficheroModificado);
			}
		}

		// Devolvemos 0
		return 0;
	}

	/**
	 * Función que borra todos los ficheros con la extension introducida de
	 * directorio
	 * 
	 * @param directorio
	 * @param extension
	 * @return un entero en función de si ha funcionado o no la función
	 */
	public static int borrarFicheros(String directorio, String extension) {

		// Creamos fichero de tipo File con directorio como referencia
		File fichero = new File(directorio);

		// Si fichero no es un directorio
		if (!fichero.isDirectory()) {
			// Devolvemos TIPO_ERROR
			return TIPO_ERROR;
		} // Si sí
		else {

			// Creamos un array listaFicheros de tipo File que contiene únicamente los
			// ficheros de fichero
			File[] listaFicheros = fichero.listFiles();

			// Con un for recorremos el array listaFicheros
			for (int i = 0; i < listaFicheros.length; i++) {

				// Si el nombre de listaFicheros[i] termina con extension
				if (listaFicheros[i].getName().endsWith(extension)) {

					// Borramos el listaFicheros[i]
					listaFicheros[i].delete();
				}
			}
		}

		// Devolvemos 0
		return 0;
	}

	/**
	 * Función que únicamente los ficheros cuyo tamaño sea mayor al introducido en
	 * size
	 * 
	 * @param directorio
	 * @param size
	 * @return un entero en función de si ha funcionado o no la función
	 */
	public static int borrarFicherosSize(String directorio, int size) {

		// Creamos fichero de tipo File con directorio como referencia
		File fichero = new File(directorio);

		// Si fichero no es un directorio
		if (!fichero.isDirectory()) {
			// Devolvemos TIPO_ERROR
			return TIPO_ERROR;
		} // Si no
		else {

			// Creamos un array listaFicheros con los ficheros que contiene fichero
			File[] listaFicheros = fichero.listFiles();

			// Con un for recorremos listaFicheros
			for (int i = 0; i < listaFicheros.length; i++) {

				// Si el tamaño de listaFicheros[i] es mayor que size
				if (listaFicheros[i].getTotalSpace() > size) {

					// Borramos listaFicheros[i]
					listaFicheros[i].delete();
				}
			}
		}

		// Devolvemos 0
		return 0;
	}

	/**
	 * Función que muestra los ficheros de directorio cuya última fecha de
	 * modificación sea más moderna que hace los días introducidos como parámetro
	 * 
	 * @param directorio
	 * @param dias
	 * @return un entero en función de si ha funcionado o no la función
	 */
	public static int mostrarFicherosRecientes(String directorio, int dias) {

		// Creamos un fichero de tipo File con directorio como referencia
		File fichero = new File(directorio);

		// Si fichero no es un directorio
		if (!fichero.isDirectory()) {
			// Devolvemos TIPO_ERROR
			return TIPO_ERROR;
		} // Si sí
		else {

			// Creamos un array listaFicheros de tipo File que almacena los ficheros de
			// fichero
			File[] listaFicheros = fichero.listFiles();

			// Con un for recorremos el array listaFicheros
			for (int i = 0; i < listaFicheros.length; i++) {

				// Si el tiempo actual en milisegundos menos el tiempo de la última modificación
				// de listaFicheros[i] es menor que dias * 86400000 (milisegundos a los que
				// equivale dias)
				if (System.currentTimeMillis() - listaFicheros[i].lastModified() < (dias * 86400000)) {

					// Expresamos por pantalla listaFicheros[i]
					System.out.println(listaFicheros[i]);
				}
			}
		}

		// Devolvemos 0
		return 0;
	}

	/**
	 * Función que indica si el directorio introducido está vacío o no
	 * 
	 * @param rutaDirectorio
	 * @return un boolean dependiendo de si está vacío o no
	 */
	public static boolean directorioVacio(String rutaDirectorio) {

		// Creamos directorio de tipo File con rutaDirectorio como parámetro
		File directorio = new File(rutaDirectorio);

		// Creamos un array listaFicheros con la lista de ficheros de directorio como
		// contenido
		String[] listaFicheros = directorio.list();

		// Si la longitud de listaFicheros es igual a 0
		if (listaFicheros.length == 0) {
			// Devolvemos true
			return true;
		} // Si no
		else {
			// Devolvemos false
			return false;
		}
	}

}
