package tema4;

public class PruebaFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Borramos un fichero
		int resultado = GestionFicheros.eliminarFichero("c:\\logs\\tests.log");

		if (resultado == GestionFicheros.OK) {
			System.out.println("El fichero se borr� correctamente.");
		} else {
			System.out.println("El fichero no se borr� correctamente");
		}

		// Mostramos el contenido del directorio ra�z C
		resultado = GestionFicheros.mostrarContenidoDirectorio("c:\\");

		// Creaci�n de ficheros
		resultado = GestionFicheros.crearFichero("c:\\logs\\nuevo.txt");

		resultado = GestionFicheros.crearDirectorio("c:\\logs", "keloke");
	}

}
