package ejerciciosObjetos;

public class pruebasCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos un objeto miCoche de la clase Coche
		Coche miCoche = new Coche();

		// Definimos la velocidad, el color y el nombre de miCoche a diferentes
		// términos. No he asignado valores a todos los atributos posibles de miCoche
		// porque el ejercicio no lo requería
		miCoche.setVelocidad(35);
		miCoche.setColor(Coche.AZUL);
		miCoche.setNombre("Mercedes");

		// Expresamos por pantalla el valor de esas variables para comprobar que
		// funcionan
		System.out.println("La velocidad de miCoche es de: " + miCoche.getVelocidad());
		System.out.println("El color de miCoche es: " + miCoche.getColor());
		System.out.println("El nombre de miCoche es: " + miCoche.getNombre());

		// Hacemos uso de la función acelerar
		miCoche.acelerar(300);

		// Expresamos por pantalla el nuevo valor de velocidad
		System.out.println("\nLa nueva velocidad de miCoche es de: " + miCoche.getVelocidad());

		// Hacemos uso de la función pintar
		miCoche.pintar(Coche.MORADO);

		// Expresamos por pantalla el nuevo valor de color y nombre
		System.out.println("El nuevo color de miCoche es: " + miCoche.getColor());
		System.out.println("El nuevo nombre de miCoche es: " + miCoche.getNombre());

	}

}
