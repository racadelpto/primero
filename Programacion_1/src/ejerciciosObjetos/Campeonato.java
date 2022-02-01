package ejerciciosObjetos;

public class Campeonato {

	// Variables estáticas constantes de la clase Campeonato
	public static final int MAX_PILOTOS = 10;
	public static final int PRESION_MAXIMA = 100;
	public static final int PESO_MINIMO = 620;
	public static final int POTENCIA_MAXIMA = 600;

	// Atributos privados de la clase Campeonato
	private Circuito[] circuitos;
	private Piloto[] pilotos;
	private String categoría;
	private String nombre;

	// Constructor de la clase Campeonato que recibe todos los valores
	public Campeonato(Circuito[] circuitos, Piloto[] pilotos, String categoría, String nombre) {
		super();
		this.circuitos = circuitos;
		this.pilotos = pilotos;
		this.categoría = categoría;
		this.nombre = nombre;
	}

	/**
	 * Función que recorre el array circuitos de la clase Campeonato hasta encontrar
	 * el circuito más largo y lo almacena en una variable
	 * 
	 * @return un objeto de la clase Circuito que contiene el circuito más largo
	 */
	public Circuito circuitoMasLargo() {
		// Creamos un objeto de la clase Circuito vacío
		Circuito circuitoMasLargo = new Circuito();

		// Usamos un for para recorrer el array circuitos
		for (int i = 0; i < circuitos.length; i++) {
			// Si la longitud del objeto circuitos[i] es mayor que la longitud de la
			// variable circuitoMasLargo
			if (circuitos[i].getLongitud() > circuitoMasLargo.getLongitud()) {
				// Vamos almacenando el objeto circuitos[i] en la variable circuitoMasLargo
				circuitoMasLargo = circuitos[i];
			}
		}
		// Devolvemos la variable circuitoMasLargo
		return circuitoMasLargo;
	}

	/**
	 * Función que recibe un String con el nombre de una escudería y recorre el
	 * array pilotos hasta encontrar los objetos pilotos[i] con la escuderia igual
	 * al String introducido
	 * 
	 * @param nombreEscuderia
	 */
	public void mostrarEscuderia(String nombreEscuderia) {
		// Expresa por pantalla el nombreEscuderia introducido como parametro
		System.out.println("\n" + nombreEscuderia.toUpperCase() + ":");

		// Recorremos el array pilotos
		for (int i = 0; i < pilotos.length; i++) {
			// Si la escuderia del objeto pilotos[i] es igual a nombreEscuderia introducido
			if (pilotos[i].getEscuderia().equals(nombreEscuderia)) {
				// Expresamos por pantalla el nombre del objeto pilotos[i]
				System.out.println(pilotos[i].getNombre());
			}
		}
	}

	/**
	 * Función que comprueba la presión de las ruedas de los coches de los pilotos y
	 * también el peso y potencia de los coches de estas
	 */
	public void comprobarCoches() {
		// Recorremos el array pilotos
		for (int i = 0; i < pilotos.length; i++) {
			// Inicializamos la variable comprobador a 0
			int comprobador = 0;

			// Expresamos por pantalla el nombre del pilotos[i]
			System.out.print("\n" + pilotos[i].getNombre());

			// Array que recorre del 0 al 3 simulando las posiciones del array ruedas de
			// cada coche
			for (int j = 0; j < pilotos[i].getCocheAsignado().getRuedas().length; j++) {
				// Si la presión de la rueda en la posición j del array ruedas del cocheAsignado
				// del pilotos[i] menos la PRESION_MAXIMA
				// es mayor al 5% de PRESION_MAXIMA
				if (this.pilotos[i].getCocheAsignado().getRuedas()[j].getPresion() - PRESION_MAXIMA > 0.05
						* PRESION_MAXIMA) {
					// Expresamos por pantalla el lugarRueda de la rueda en la posición j del array
					// ruedas del cocheAsignado del pilotos[i]
					// más un mensaje establecido
					System.out.print(" Rueda " + pilotos[i].getCocheAsignado().getRuedas()[j].getlugarRueda()
							+ " presion mayor a la estipulada");
				} // Si no
				else {
					// Vamos sumando 1 a comprobador
					comprobador++;
				}
			}

			// Si la potencia del
			// cocheAsignado del pilotos[i] menos la POTENCIA_MAXIMA
			// es mayor al 5 por ciento de POTENCIA_MAXIMA
			if (pilotos[i].getCocheAsignado().getPotencia() - POTENCIA_MAXIMA > 0.05 * POTENCIA_MAXIMA) {
				// Expresamos por pantalla el mensaje
				System.out.print(" Potencia mayor a la estipulada");
			} // Si no
			else {
				// Vamos sumando 1 a comprobador
				comprobador++;
			}

			// Si el PESO_MINIMO menos el peso del cocheAsignado del pilotos[i] es mayor al
			// 10% de PESO_MINIMO
			if (PESO_MINIMO - pilotos[i].getCocheAsignado().getPeso() > 0.1 * PESO_MINIMO) {
				// Expresamos por pantalla un mensaje
				System.out.print(" Peso inferior al estipulado");
			} // Si no
			else {
				// Vamos sumando 1 a comprobador
				comprobador++;
			}

			// Si comprobador es igual a 9
			if (comprobador == 6) {
				// Expresamos OK
				System.out.print(" OK");
			}
		}
	}

	/*
	 * Todos las funciones get y set de cada atributo privado para que podamos
	 * acceder a ellos desde fuera de la clase Campeonato
	 */

	// circuitos
	public Circuito[] getCircuitos() {
		return circuitos;
	}

	public void setCircuitos(Circuito[] circuitos) {
		this.circuitos = circuitos;
	}

	// pilotos
	public Piloto[] getPilotos() {
		return pilotos;
	}

	public void setPilotos(Piloto[] pilotos) {
		this.pilotos = pilotos;
	}

	// categoria
	public String getCategoría() {
		return categoría;
	}

	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}

	// nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
