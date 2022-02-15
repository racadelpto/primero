package tema4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class EjemploFicherosSecuenciales {

	public static void lecturaSecuencial(String rutaFichero) {

		// Definimos los objetos para la lectura
		try {
			FileInputStream fin = new FileInputStream(rutaFichero);
			DataInputStream din = new DataInputStream(fin);

			Libros libroLectura = new Libros();

			// Leemos los datos del fichero en el mismo orden en el que se escribieron
			libroLectura.setNombre(din.readUTF());
			libroLectura.setAutor(din.readUTF());
			libroLectura.setCategoria(din.read());
			libroLectura.setEjemplaresVendidos(din.read());
			libroLectura.setNumPaginas(din.read());
			libroLectura.setPrestado(din.readBoolean());
			libroLectura.setDiaPrestamo(din.read());
			libroLectura.setAnioPublicacion(din.read());
			libroLectura.setIsbn(din.readUTF());

			System.out.println("Libro leído: " + libroLectura.toString());

			// Cerramos los stream de los ficheros
			din.close();
			fin.close();
			// Controlamos las excepciones con los posibles fallos que podemos tener al leer
			// ficheros
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException ioe) {

			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libros arrayLibros[] = new Libros[100];

		for (int i = 0; i < 100; i++) {
			int categoria = (int) (Math.random() * 4);
			int anio = 1900 + (int) (Math.random() * 120);
			arrayLibros[i] = new Libros("Libro" + (i + 1), "Margarett", categoria, 120000, 367, true, 23, anio,
					"asdfasf-234");
		}

		try {
			// Abro el fichero
			FileOutputStream fos = new FileOutputStream("c:\\logs\\ficheroSecuencial.dat");
			DataOutputStream dos = new DataOutputStream(fos);

			for (int i = 0; i < arrayLibros.length; i++) {
				// Para cada libro escribimos los datos en el fichero
				// dependiendo del tipo de dato lo escribimos de un tipo u otro
				dos.writeUTF(arrayLibros[i].getNombre());
				dos.writeUTF(arrayLibros[i].getAutor());
				dos.write(arrayLibros[i].getCategoria());
				dos.write(arrayLibros[i].getEjemplaresVendidos());
				dos.write(arrayLibros[i].getNumPaginas());
				dos.writeBoolean(arrayLibros[i].isPrestado());
				dos.write(arrayLibros[i].getDiaPrestamo());
				dos.write(arrayLibros[i].getAnioPublicacion());
				dos.writeUTF(arrayLibros[i].getIsbn());
			}

			// Cerramos el controlador de fichero
			fos.close();
			dos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		lecturaSecuencial("c:\\logs\\ficheroSecuencial.dat");

	}

}
