package tema4;

public class PruebasEjercicio4Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * A continuaci�n se prueban todas las funciones relativas al ejercicio 4 de la clase GestionFicheros
		 * 
		 * Se pueden probar por separado para que no sea un descontrol e indicar los par�metros que se deseen
		 */
		
		//FUNCI�N MODIFICARNOMBRES
		
		//Si la funci�n modificarNombres con esos par�metros devuelve TIPO_ERROR
		if (GestionFicheros.modificarNombres("c:\\ejercicio4Ficheros\\", "holaquetal") == GestionFicheros.TIPO_ERROR) {
			
			//Expresamos que el par�metro introducido no es un directorio
			System.out.println("\nEl par�metro introducido no es un directorio.");
			
		}//Si no 
		else {
			
			//Expresamos que se han modificado los nombres de los ficheros correctamente
			System.out.println("\nSe han modificado los nombres de los ficheros correctamente.");
		}

		
		
		//FUNCI�N BORRARFICHEROS
		
		//Si la funci�n borrarFicheros con esos par�metros devuelve TIPO_ERROR
		if (GestionFicheros.borrarFicheros("c:\\ejercicio4Ficheros", ".txt") == GestionFicheros.TIPO_ERROR) {
			
			//Expresamos que el par�metro introducido no es un directorio
			System.out.println("\nEl par�metro introducido no es un directorio.");
		}//Si no  
		else {
			
			//Expresamos que se han borrado los ficheros con la extensi�n indicada correctamente
			System.out.println("\nSe han borrado los ficheros con la extensi�n indicada correctamente.");
		}

		
		
		//FUNCI�N BORRARFICHEROSSIZE
		
		//Si la funci�n borrarFicherosSize con esos par�metros devuelve TIPO_ERROR
		if (GestionFicheros.borrarFicherosSize("c:\\ejercicio4Ficheros", 0) == GestionFicheros.TIPO_ERROR) {
			
			//Expresamos que el par�metro introducido no es un directorio
			System.out.println("\nEl par�metro introducido no es un directorio.");
		}//Si no  
		else {
			
			//Expresamos que se han borrado los ficheros con un tama�o mayor al indicado correctamente
			System.out.println("\nSe han borrado los ficheros con un tama�o mayor al indicado correctamente.");
		}

		
		
		//FUNCI�N MOSTRARFICHEROSRECIENTES
		
		//Expresamos por pantalla el siguiente mensaje
		System.out.println("\nEstos son los ficheros con una fecha de modificaci�n m�s moderna que hace los d�as introducidos por par�metro: ");
		
		//Si la funci�n mostrarFicherosRecientes con esos par�metros devuelve TIPO_ERROR
		if (GestionFicheros.mostrarFicherosRecientes("c:\\ejercicio4Ficheros", 3) == GestionFicheros.TIPO_ERROR) {
			
			//Expresamos que el par�metro introducido no es un directorio
			System.out.println("\nEl par�metro introducido no es un directorio.");
		}

		
		
		//FUNCI�N DIRECTORIOVACIO
		
		//Comprobamos que directorioVacio devuelva NO_ES_DIRECTORIO
		if(GestionFicheros.directorioVacio("c:\\ejercicio4Ficheros")==GestionFicheros.NO_ES_DIRECTORIO) {
			
			//Expresamos que el par�metro introducido no es un directorio
			System.out.println("\nEl par�metro introducido no es un directorio.");
		}//Si no
		else {
			
			//Si la funci�n directorioVacio con esos parametros devuelve true
			if (GestionFicheros.directorioVacio("c:\\ejercicio4Ficheros")) {
				
				//Expresamos que el directorio est� vac�o
				System.out.println("\nEl directorio se encuentra vac�o.");
			}//Si no
			else {
				
				//Expresamos que el directorio no se encuentra vac�o
				System.out.println("\nEl directorio no se encuentra vac�o.");
			}
		}
	}

}
