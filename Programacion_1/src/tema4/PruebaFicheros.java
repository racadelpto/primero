package tema4;

public class PruebaFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Borramos un fichero
		int resultado = GestionFicheros.eliminarFichero("c:\\logs\\tests.log");

		if (resultado == GestionFicheros.OK) {
			System.out.println("El fichero se borró correctamente.");
		} else {
			System.out.println("El fichero no se borró correctamente");
		}

		// Mostramos el contenido del directorio raíz C
		resultado = GestionFicheros.mostrarContenidoDirectorio("c:\\");

		// Creación de ficheros
		resultado = GestionFicheros.crearFichero("c:\\logs\\nuevo.txt");

		resultado = GestionFicheros.crearDirectorio("c:\\logs", "keloke");
	}

}
