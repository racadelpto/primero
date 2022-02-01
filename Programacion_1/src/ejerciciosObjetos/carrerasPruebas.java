package ejerciciosObjetos;

public class carrerasPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos los arrays de ruedas y suspensiones para el objeto de la clase Coche
		// (de momento est�n vac�os)
		Rueda ruedasCoche[] = new Rueda[4];
		Suspension suspensionesCoche[] = new Suspension[4];

		// Creamos el objeto miCoche de la clase Coche con el constructor que recibe
		// todos los valores
		Coche miCoche = new Coche(300, "Mercedes", "Benz", "B150", 1000, Coche.MORADO, 300, ruedasCoche,
				suspensionesCoche);

		// Creamos el objeto miRueda de la clase Rueda con el constructor que inicializa
		// todos los valores y le asignamos un valor a su atributo lugarRueda para poder
		// identificarla
		Rueda miRuedaDelanteraDerecha = new Rueda();
		miRuedaDelanteraDerecha.setlugarRueda(" delantera derecha");
		Rueda miRuedaDelanteraIzquierda = new Rueda();
		miRuedaDelanteraIzquierda.setlugarRueda(" delantera izquierda");
		Rueda miRuedaTraseraDerecha = new Rueda();
		miRuedaTraseraDerecha.setlugarRueda(" trasera derecha");
		Rueda miRuedaTraseraIzquierda = new Rueda();
		miRuedaTraseraIzquierda.setlugarRueda(" trasera izquierda");

		// Creamos el objeto miSuspension de la clase Suspension con el constructor que
		// inicializa todos los valores y le asignamos un valor a su atributo
		// lugarSuspension para poder identificarla
		Suspension miSuspensionDelanteraDerecha = new Suspension();
		miSuspensionDelanteraDerecha.setlugarSuspension(" delantera derecha");
		Suspension miSuspensionDelanteraIzquierda = new Suspension();
		miSuspensionDelanteraIzquierda.setlugarSuspension(" delantera izquierda");
		Suspension miSuspensionTraseraDerecha = new Suspension();
		miSuspensionTraseraDerecha.setlugarSuspension(" trasera derecha");
		Suspension miSuspensionTraseraIzquierda = new Suspension();
		miSuspensionTraseraIzquierda.setlugarSuspension(" trasera izquierda");

		// Antes de ejecutar las funciones podemos observar los valores de los datos que
		// vamos a cambiar y observarlos tambi�n
		// despu�s de modificarlos

		System.out.println("La presi�n de miRuedaDelanteraDerecha es: " + miRuedaDelanteraDerecha.getPresion());
		System.out.println("La presi�n de miRuedaDelanteraIzquierda es: " + miRuedaDelanteraIzquierda.getPresion());
		System.out.println("La presi�n de miRuedaTraseraDerecha es: " + miRuedaTraseraDerecha.getPresion());
		System.out.println("La presi�n de miRuedaTraseraIzquierda es: " + miRuedaTraseraIzquierda.getPresion());

		/*
		 * Incluimos todas las funciones en un sysout para comprobar que dan true
		 * (funcionan correctamente) o false (no funcionan)
		 */

		// Usamos la funci�n cambiarRueda para cambiar la posici�n de la rueda
		// en el coche y posicionarla en la que introducimos ahora
		// Comprobamos que da true
		System.out.println("\nLa funci�n cambiarRueda ha dado: "
				+ miCoche.cambiarRueda(Coche.DELANTERA_DERECHA, miRuedaDelanteraDerecha));
		System.out.println("La funci�n cambiarRueda ha dado: "
				+ miCoche.cambiarRueda(Coche.DELANTERA_IZQUIERDA, miRuedaDelanteraIzquierda));
		System.out.println("La funci�n cambiarRueda ha dado: "
				+ miCoche.cambiarRueda(Coche.TRASERA_DERECHA, miRuedaTraseraDerecha));
		System.out.println("La funci�n cambiarRueda ha dado: "
				+ miCoche.cambiarRueda(Coche.TRASERA_IZQUIERDA, miRuedaTraseraIzquierda));

		// Usamos la funci�n cambiarSuspension para cambiar la posici�n de la suspensi�n
		// en el coche y posicionarla en la que introducimos ahora
		System.out.println("\nLa funci�n cambiarSuspension ha dado: "
				+ miCoche.cambiarSuspension(Coche.DELANTERA_DERECHA, miSuspensionDelanteraDerecha));
		System.out.println("La funci�n cambiarSuspension ha dado: "
				+ miCoche.cambiarSuspension(Coche.DELANTERA_IZQUIERDA, miSuspensionDelanteraIzquierda));
		System.out.println("La funci�n cambiarSuspension ha dado: "
				+ miCoche.cambiarSuspension(Coche.TRASERA_DERECHA, miSuspensionTraseraDerecha));
		System.out.println("La funci�n cambiarSuspension ha dado: "
				+ miCoche.cambiarSuspension(Coche.TRASERA_IZQUIERDA, miSuspensionTraseraIzquierda));

		// Usamos la funci�n ajustarPresi�n para ajustar la presi�n de la rueda en la
		// posici�n introducida con la presi�n introducida
		System.out
				.println("\nLa funci�n ajustarPresion ha dado: " + miCoche.ajustarPresion(Coche.DELANTERA_DERECHA, 50));
		System.out
				.println("La funci�n ajustarPresion ha dado: " + miCoche.ajustarPresion(Coche.DELANTERA_IZQUIERDA, 50));
		System.out.println("La funci�n ajustarPresion ha dado: " + miCoche.ajustarPresion(Coche.TRASERA_DERECHA, 50));
		System.out.println("La funci�n ajustarPresion ha dado: " + miCoche.ajustarPresion(Coche.TRASERA_IZQUIERDA, 50));

		// Comprobamos los nuevos valores por sysout para observar que se han modificado
		// correctamente

		// Hacemos un toString a nuestro objeto miCoche y comprobamos que este contiene
		// las 4 ruedas creadas y las suspensiones
		System.out.println("\n" + miCoche.toString());

		// Comprobamos la nueva presi�n de las ruedas
		System.out.println("\nLa nueva presi�n de miRueda es: " + ruedasCoche[Coche.DELANTERA_DERECHA].getPresion());
		System.out.println("La nueva presi�n de miRueda es: " + ruedasCoche[Coche.DELANTERA_IZQUIERDA].getPresion());
		System.out.println("La nueva presi�n de miRueda es: " + ruedasCoche[Coche.TRASERA_DERECHA].getPresion());
		System.out.println("La nueva presi�n de miRueda es: " + ruedasCoche[Coche.TRASERA_IZQUIERDA].getPresion());

	}

}
