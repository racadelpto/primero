package tema4;

public class PruebasEjercicio4Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * A continuación se prueban todas las funciones relativas al ejercicio 4 de la clase GestionFicheros
		 * 
		 * Se pueden probar por separado para que no sea un descontrol e indicar los parámetros que se deseen
		 */
		
		//FUNCIÓN MODIFICARNOMBRES
		
		//Si la función modificarNombres con esos parámetros devuelve TIPO_ERROR
		if (GestionFicheros.modificarNombres("c:\\ejercicio4Ficheros\\", "holaquetal") == GestionFicheros.TIPO_ERROR) {
			
			//Expresamos que el parámetro introducido no es un directorio
			System.out.println("\nEl parámetro introducido no es un directorio.");
			
		}//Si no 
		else {
			
			//Expresamos que se han modificado los nombres de los ficheros correctamente
			System.out.println("\nSe han modificado los nombres de los ficheros correctamente.");
		}

		
		
		//FUNCIÓN BORRARFICHEROS
		
		//Si la función borrarFicheros con esos parámetros devuelve TIPO_ERROR
		if (GestionFicheros.borrarFicheros("c:\\ejercicio4Ficheros", ".txt") == GestionFicheros.TIPO_ERROR) {
			
			//Expresamos que el parámetro introducido no es un directorio
			System.out.println("\nEl parámetro introducido no es un directorio.");
		}//Si no  
		else {
			
			//Expresamos que se han borrado los ficheros con la extensión indicada correctamente
			System.out.println("\nSe han borrado los ficheros con la extensión indicada correctamente.");
		}

		
		
		//FUNCIÓN BORRARFICHEROSSIZE
		
		//Si la función borrarFicherosSize con esos parámetros devuelve TIPO_ERROR
		if (GestionFicheros.borrarFicherosSize("c:\\ejercicio4Ficheros", 0) == GestionFicheros.TIPO_ERROR) {
			
			//Expresamos que el parámetro introducido no es un directorio
			System.out.println("\nEl parámetro introducido no es un directorio.");
		}//Si no  
		else {
			
			//Expresamos que se han borrado los ficheros con un tamaño mayor al indicado correctamente
			System.out.println("\nSe han borrado los ficheros con un tamaño mayor al indicado correctamente.");
		}

		
		
		//FUNCIÓN MOSTRARFICHEROSRECIENTES
		
		//Expresamos por pantalla el siguiente mensaje
		System.out.println("\nEstos son los ficheros con una fecha de modificación más moderna que hace los días introducidos por parámetro: ");
		
		//Si la función mostrarFicherosRecientes con esos parámetros devuelve TIPO_ERROR
		if (GestionFicheros.mostrarFicherosRecientes("c:\\ejercicio4Ficheros", 3) == GestionFicheros.TIPO_ERROR) {
			
			//Expresamos que el parámetro introducido no es un directorio
			System.out.println("\nEl parámetro introducido no es un directorio.");
		}

		
		
		//FUNCIÓN DIRECTORIOVACIO
		
		//Comprobamos que directorioVacio devuelva NO_ES_DIRECTORIO
		if(GestionFicheros.directorioVacio("c:\\ejercicio4Ficheros")==GestionFicheros.NO_ES_DIRECTORIO) {
			
			//Expresamos que el parámetro introducido no es un directorio
			System.out.println("\nEl parámetro introducido no es un directorio.");
		}//Si no
		else {
			
			//Si la función directorioVacio con esos parametros devuelve true
			if (GestionFicheros.directorioVacio("c:\\ejercicio4Ficheros")) {
				
				//Expresamos que el directorio está vacío
				System.out.println("\nEl directorio se encuentra vacío.");
			}//Si no
			else {
				
				//Expresamos que el directorio no se encuentra vacío
				System.out.println("\nEl directorio no se encuentra vacío.");
			}
		}
	}

}
