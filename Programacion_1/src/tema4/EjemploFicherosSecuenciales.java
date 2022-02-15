package tema4;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFicherosSecuenciales {

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

	}

}
