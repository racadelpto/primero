package ejerciciosObjetos;

public class Circuito {

	// Atributos privados de la clase Circuito
	private String nombre;
	private String pais;
	private String ciudad;
	private int longitud;
	private long vueltaRapida;
	private String nombrePilotoVueltaRapida;

	// Constructor de la clase Circuito que recibe todos los valores
	public Circuito(String nombre, String pais, String ciudad, int longitud, long vueltaRapida,
			String nombrePilotoVueltaRapida) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.ciudad = ciudad;
		this.longitud = longitud;
		this.vueltaRapida = vueltaRapida;
		this.nombrePilotoVueltaRapida = nombrePilotoVueltaRapida;
	}

	// Constructor que no recibe nada, tan solo crea un objeto de la clase Circuito
	// (para usarlo en algunas funciones de la clase Campeonato)
	public Circuito() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Función que actualiza vueltaRapida y nombrePilotoVueltaRapida en función del
	 * tiempo y nombrePiloto introducidos en ella
	 * 
	 * @param nombrePiloto
	 * @param tiempo
	 * @return nada simplemente para comprobar que funciona
	 */
	public int vueltaRapida(String nombrePiloto, long tiempo) {
		// Si el valor de tiempo es menor que el de this.vueltaRapida
		if (tiempo < this.vueltaRapida) {
			// this.vueltaRapida pasa a ser tiempo
			this.vueltaRapida = tiempo;
			// this.nombrePilotoVueltaRapida pasa a ser nombrePiloto
			this.nombrePilotoVueltaRapida = nombrePiloto;
		}
		// Devuelve 0 para comprobar que funciona correctamente
		return 0;
	}

	/*
	 * Todos las funciones get y set de cada atributo privado para que podamos
	 * acceder a ellos desde fuera de la clase Circuito
	 */

	// nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// pais
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	// ciudad
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	// longitud
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	// vuetaRapida
	public long getVueltaRapida() {
		return vueltaRapida;
	}

	public void setVueltaRapida(long vueltaRapida) {
		this.vueltaRapida = vueltaRapida;
	}

	// nombrePilotoVueltaRapida
	public String getNombrePilotoVueltaRapida() {
		return nombrePilotoVueltaRapida;
	}

	public void setNombrePilotoVueltaRapida(String nombrePilotoVueltaRapida) {
		this.nombrePilotoVueltaRapida = nombrePilotoVueltaRapida;
	}

}
