package ejerciciosFunciones;

public class ej9xxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Toda la parte del main es simplemente para desarrollar un ejemplo, se podr�a
		 * simplemente devolver el valor de la posici�n del n�mero introducido en el
		 * array introducido
		 */

		// Creamos un array con n�meros ordenados de menor a mayor
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 };

		// Expresamos por pantalla un ejemplo de la funci�n busquedaIterativa()
		System.out.println(
				"*B�squeda iterativa*\nLa posici�n del n�mero introducido en el array introducido en la funci�n es: "
						+ busquedaIterativa(5, array));

		// Expresamos por pantalla un ejemplo de la funci�n busquedaRecursiva()
		System.out.println(
				"\n*B�squeda recursiva*\nLa posici�n del n�mero introducido en el array introducido en la funci�n es: "
						+ busquedaRecursiva(14, array, 0, array.length));

	}

	/**
	 * Una funci�n iterativa que utiliza la b�squeda binaria para encontrar un
	 * n�mero dentro de un array
	 * 
	 * @param num
	 * @param array
	 * @return devuelve la posici�n del n�mero a buscar en el array introducido
	 */
	public static int busquedaIterativa(int num, int[] array) {
		// Si num es mayor que array[array.length/2]
		if (num > array[array.length / 2]) {

			// Hacemos un for que recorre la parte derecha del array
			for (int i = array.length / 2; i < array.length; i++) {

				// Si num es igual al n�mero de la posici�n i de array
				if (num == array[i]) {
					// Devolvemos i
					return i;
				}
			}
		} // Si no
		else {
			// Hacemos un for que recorre la parte izquierda del array
			for (int i = array.length / 2; i >= 0; i--) {

				// Si num es igual al n�mero de la posici�n i de array
				if (num == array[i]) {
					// Devolvemos i
					return i;
				}
			}
		}

		// Devolvemos -1 ya que quiere decir que no ha funcionado la funci�n
		return -1;
	}

	/**
	 * Una funci�n recursiva que utiliza la b�squeda binaria para encontrar un
	 * n�mero dentro de un array
	 * 
	 * Los par�metros inicio y fin los he incluido a pesar de que en el ejercicio
	 * solo piden 2, ya que era imposible (o muy complicado) sacar la posici�n del
	 * array original sin estos par�metros
	 * 
	 * @param num
	 * @param array
	 * @param inicio
	 * @param fin
	 * @return devuelve la posici�n del n�mero a buscar en el array introducido
	 */
	public static int busquedaRecursiva(int num, int[] array, int inicio, int fin) {
		// Inicializamos int centro a la mitad de la suma de inicio y fin
		int centro = (inicio + fin) / 2;

		// Si fin es menor que inicio
		if (fin < inicio) {
			// Devolvemos -1 ya que estar�an mal los par�metros
			return -1;
		}

		// Si num es menor que array[centro]
		if (num < array[centro]) {
			// Devolvemos la funci�n busquedaRecursiva, asignando centro-1 como el par�metro
			// de fin
			return busquedaRecursiva(num, array, inicio, centro - 1);
		}

		// Si num es mayor que array[centro]
		if (num > array[centro]) {
			// Devolvemos la funci�n busquedaRecursiva, signando centro+1 como el par�metro
			// inicio
			return busquedaRecursiva(num, array, centro + 1, fin);
		}

		// Si num es igual a array[centro]
		if (num == array[centro]) {
			// Devolvemos centro
			return centro;
		}

		// Devolvemos -1 si la funci�n llega hasta aqu� ya que querr�a decir que no ha
		// encontrado el num introducido en el array introducido
		return -1;
	}

}
