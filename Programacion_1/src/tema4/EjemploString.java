package tema4;

public class EjemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char nombre[] = { 'p', 'e', 'd', 'r', 'o' };
		char[] nombre5 = { 'p', 'e', 'd', 'r', 'o' };
		char nombre6[];
		nombre6 = new char[10];

		String nombre7 = "";
		for (int i = 0; i < nombre.length; i = i + 2) {
			nombre7 = nombre7 + nombre[i];
		}

		String nombre1 = "Pablo no es no y tambien no en italia, y es un nombre";
		String nombre2 = "Juanito";
		String nombre3 = "Juanjo";

		System.out.println("El tama�o de nombre1 es : " + nombre1.length());

		System.out.println("Los nombres son " + nombre1.concat(nombre2));

		if (nombre1.equals(nombre2)) {

		}

		System.out.println("El primer no est� en la posici�n " + nombre1.indexOf("no"));

		System.out.println("El segundo no est� en la posici�n " + nombre1.indexOf("no", 7));

		int posicion = nombre1.indexOf("no");
		while (posicion != -1) {

			System.out.println("Se ha encontrado un no en la posici�n " + posicion + " y es "
					+ nombre1.substring(posicion, posicion + 2));

			// Buscamos el siguiente no
			posicion = nombre1.indexOf("no", posicion + 1);

		}

		Double pi = Math.PI;

		// Formateo de posiciones float
		String sPi = String.format("con precisi�n de 4 posiciones %.4f", pi);

		System.out.println("El n�mero pi es " + sPi);

		// Compareto nos dice cual va antes ordenado alfab�icamente
		if (nombre2.compareTo(nombre3) < 0) {
			System.out.println(nombre3 + " es posterior alfab�ticamente a " + nombre2);
		} else {
			System.out.println(nombre2 + " es posterior alfab�ticamente a " + nombre3);
		}

		String nombre4 = nombre1.replace("no", "si");

		System.out.println(nombre4);

	}

}
