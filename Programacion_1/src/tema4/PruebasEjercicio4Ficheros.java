package tema4;

public class PruebasEjercicio4Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (GestionFicheros.modificarNombres("c:\\ejercicio4Ficheros\\", "holaquetal") == GestionFicheros.TIPO_ERROR) {
			System.out.println("Ha ocurrido algún error.");
		} else {
			System.out.println("Se han modificado los nombres correctamente.");
		}

		if (GestionFicheros.borrarFicheros("c:\\ejercicio4Ficheros", ".txt") == GestionFicheros.TIPO_ERROR) {
			System.out.println("Ha ocurrido algún error.");
		} else {
			System.out.println("Se han borrado los ficheros correctamente.");
		}

		if (GestionFicheros.borrarFicherosSize("c:\\ejercicio4Ficheros", 0) == GestionFicheros.TIPO_ERROR) {
			System.out.println("Ha ocurrido algún error.");
		} else {
			System.out.println("Se han borrado los ficheros correctamente.");
		}

		if (GestionFicheros.mostrarFicherosRecientes("c:\\logs", 1) == GestionFicheros.TIPO_ERROR) {
			System.out.println("Ha ocurrido algún error.");
		} else {

		}

		if (GestionFicheros.directorioVacio("c:\\directorioVacio\\")) {
			System.out.println("El directorio se encuentra vacío.");
		} else {
			System.out.println("El directorio no se encuentra vacío.");
		}
	}

}
