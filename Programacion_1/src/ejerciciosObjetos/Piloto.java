package ejerciciosObjetos;

public class Piloto {

	// Atributos privados de la clase Piloto
	private String nombre;
	private int edad;
	private int campeonatos;
	private Coche cocheAsignado;
	private int dorsal;
	private String escuderia;
	private double sueldo;

	// Constructor de la clase Piloto que recibe todos los valores
	public Piloto(String nombre, int edad, int campeonatos, Coche cocheAsignado, int dorsal, String escuderia,
			double sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.campeonatos = campeonatos;
		this.cocheAsignado = cocheAsignado;
		this.dorsal = dorsal;
		this.escuderia = escuderia;
		this.sueldo = sueldo;
	}

	/*
	 * Todos las funciones get y set de cada atributo privado para que podamos
	 * acceder a ellos desde fuera de la clase Piloto
	 */

	// nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// edad
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// campeonatos
	public int getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(int campeonatos) {
		this.campeonatos = campeonatos;
	}

	// cocheAsignado
	public Coche getCocheAsignado() {
		return cocheAsignado;
	}

	public void setCocheAsignado(Coche cocheAsignado) {
		this.cocheAsignado = cocheAsignado;
	}

	// dorsal
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	// escuderia
	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	// sueldo
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
