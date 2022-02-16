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

}
