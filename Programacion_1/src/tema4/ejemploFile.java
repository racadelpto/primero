package tema4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Tronan.Libros;

public class ejemploFile {

	public static final String RUTA = "c:\\logs\\";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/***************************************
		 * LECTURA DE FICHEROS DE TEXTO
		 *****************************************/

		// Definimos el fichero a leer
		File fich = new File(RUTA + "salidaFichero.java");

		try {
			FileReader fr = new FileReader(fich);
			BufferedReader br = new BufferedReader(fr);

			// Leemos una línea
			String linea = br.readLine();
			int i = 1;

			while (linea != null) {

				// Mostramos por pantalla la línea leída del fichero
				System.out.println("Línea " + i + ": " + linea);

				// Leemos la siguiente línea
				linea = br.readLine();

				i++;
			}

			// Cerramos los streams de lectura
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		/***************************************
		 * ESCRITURA DE FICHEROS DE TEXTO
		 *****************************************/

		Libros arrayLibros[] = new Libros[100];

		for (int i = 0; i < 100; i++) {
			int categoria = (int) (Math.random() * 4);
			int anio = 1900 + (int) (Math.random() * 120);
			arrayLibros[i] = new Libros("Libro" + (i + 1), "Margarett", categoria, 120000, 367, true, 23, anio,
					"asdfasf-234");
		}

		try {
			// Creamos el fichero con FileWriter y utilizamos PrintWriter para escribir en
			// él
			FileWriter fw = new FileWriter(RUTA + "libros.txt", false);
			PrintWriter pw = new PrintWriter(fw);

			// Recorremos el array y escribimos el libro en el fichero
			for (int i = 0; i < arrayLibros.length; i++) {
				String linea = "Titulo: " + arrayLibros[i].getNombre() + ", Autor: " + arrayLibros[i].getAutor()
						+ ", ventas: " + arrayLibros[i].getEjemplaresVendidos();
				pw.println(linea);
			}

			// Cerramos los manejadores de texto
			fw.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
