package tema4;

import java.io.File;

public class pruebaskeloke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File directorio = new File("c:\\ejercicio4Ficheros\\");

		File[] archivo = directorio.listFiles();

		System.out.println(archivo[0].getName().lastIndexOf('.') + 1);

	}

}
